package app.controllers;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import app.enums.Estado;
import app.models.pessoa.Comprador;
import app.models.pessoa.Vendedor;
import app.models.produto.Mostruario;
import app.views.Menu;

public class Sistema {
	public static Scanner scan = new Scanner(System.in);
	public Estado estado = Estado.MENU_PRINCIPAL;
	private Set<Comprador> compradores;
	private Set<Vendedor> vendedores;
	private Set<Mostruario> produtos;
	
	public Sistema() {
		this.compradores = new HashSet();
		this.vendedores = new HashSet();
		this.produtos = new HashSet();
	}
	
	public void iniciar() {
        while (estado != Estado.SAIR) {
            switch (estado) {
                case MENU_PRINCIPAL:
                    this.menuPrincipal();
                    break;
                case CADASTRO_COMPRADOR:
                	this.cadastroComprador();
                	break;
                case CADASTRO_VENDEDOR:
                	this.cadastroVendedor();
                	break;
                case CADASTRO_PRODUTO:
                	this.cadastroProduto();
                	break;
                case LISTA_COMPRADORES:
                	this.listarCompradores();
                	break;
                case LISTA_VENDEDORES:
                	this.listarVendedores();
                	break;
            }
        }
	}
	
	public void menuPrincipal() {
		Menu.imprimir_menu_principal();
		this.setEstado(scan.nextInt());
		scan.nextLine();
	}
	
	public void setEstado(int valor) {
		switch (valor) {
			case 1:
				this.estado = Estado.MENU_PRINCIPAL;
				break;
			case 2:
				this.estado = Estado.CADASTRO_COMPRADOR;
				break;
			case 3:
				this.estado = Estado.CADASTRO_VENDEDOR;
				break;
			case 4:
				this.estado = Estado.CADASTRO_PRODUTO;
				break;
			case 5:
				this.estado = Estado.LISTA_COMPRADORES;
				break;
			case 6:
				this.estado = Estado.LISTA_VENDEDORES;
				break;
			case 9:
				this.estado = Estado.SAIR;
				break;
			default:
				this.estado = Estado.MENU_PRINCIPAL;
		}
	}
	
	public void cadastroComprador() {
		String nome;
		String cpf;
		double saldo;
		
		Menu.imprimirPedirNomeComprador();
		nome = scan.nextLine();
		Menu.imprimirPedirCpfComprador();
		cpf = scan.nextLine();
		Menu.imprimirPedirSaldoComprador();
		saldo = scan.nextFloat();
		
		this.compradores.add(new Comprador(nome, cpf, saldo));
		this.estado = Estado.MENU_PRINCIPAL;
	}
	
	public void cadastroVendedor() {
		String nome;
		String cnpj;
		
		Menu.imprimirPedirNomeVendedor();
		nome = scan.nextLine();
		Menu.imprimirPedirCnpjVendedor();
		cnpj = scan.nextLine();
		
		this.vendedores.add(new Vendedor(nome, cnpj));
		this.estado = Estado.MENU_PRINCIPAL;
	}
	
	public void cadastroProduto() {
		String codigo;
		String nome;
		double preco;
		
		Menu.imprimirPedirCodigoProduto();
		codigo = scan.nextLine();
		Menu.imprimirPedirNomeProduto();
		nome = scan.nextLine();
		Menu.imprimirPedirPrecoProduto();
		preco = scan.nextFloat();
		
		this.produtos.add(new Mostruario(codigo, nome, preco));
		this.estado = Estado.MENU_PRINCIPAL;
	}
	
	public void listarCompradores() {
		String cpf;
		Comprador comprador;
		
		Menu.imprimirListaCompradores(this.compradores);
		cpf = scan.nextLine();
		comprador = this.buscarComprador(cpf);
		Menu.imprimirDadosComprador(comprador);
		scan.nextLine();
		estado = Estado.MENU_PRINCIPAL;
	}
	
	public void listarVendedores() {
		String cnpj;
		Vendedor vendedor;
		
		Menu.imprimirListaVendedores(this.vendedores);
		cnpj = scan.nextLine();
		vendedor = this.buscarVendedor(cnpj);
		Menu.imprimirDadosVendedor(vendedor);
		scan.nextLine();
		estado = Estado.MENU_PRINCIPAL;
	}
	
	public Comprador buscarComprador(String cpf) {System.out.println(cpf);
		for (Comprador c : this.compradores) {
			if (c.cpf.equals(cpf))  {
				return c;
			}
		}
		return null;
	}
	
	public Vendedor buscarVendedor(String cnpj) {
		for (Vendedor v : this.vendedores) {
			if (v.cnpj.equals(cnpj))  {
				return v;
			}
		}
		return null;
	}
}
