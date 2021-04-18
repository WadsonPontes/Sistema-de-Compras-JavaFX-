package app.views;

import java.util.Set;

import app.models.pessoa.Comprador;
import app.models.pessoa.Vendedor;

public class Menu {
	public static void imprimir_menu_principal() {
		System.out.println("MENU PRINCIPAL");
		System.out.println("(2) CADASTRAR COMPRADOR");
		System.out.println("(3) CADASTRAR VENDEDOR");
		System.out.println("(4) CADASTRAR PRODUTO");
		System.out.println("(5) LISTAR COMPRADORES");
		System.out.println("(6) LISTAR VENDEDORES");
		System.out.println("(9) SAIR");
		System.out.print(">");
	}
	
	public static void imprimirPedirNomeComprador() {
		System.out.println("CADASTRO COMPRADOR");
		System.out.println("Insira um NOME para o comprador:");
		// System.out.println("(1) VOLTAR");
	}
	
	public static void imprimirPedirCpfComprador() {
		System.out.println("CADASTRO COMPRADOR");
		System.out.println("Insira um CPF para o comprador:");
		// System.out.println("(1) VOLTAR");
	}
	
	public static void imprimirPedirSaldoComprador() {
		System.out.println("CADASTRO COMPRADOR");
		System.out.println("Insira um SALDO para o comprador:");
		// System.out.println("(1) VOLTAR");
	}
	
	public static void imprimirPedirNomeVendedor() {
		System.out.println("CADASTRO VENDEDOR");
		System.out.println("Insira um NOME para o vendedor:");
		// System.out.println("(1) VOLTAR");
	}
	
	public static void imprimirPedirCnpjVendedor() {
		System.out.println("CADASTRO VENDEDOR");
		System.out.println("Insira um CNPJ para o vendedor:");
		// System.out.println("(1) VOLTAR");
	}
	
	public static void imprimirPedirCodigoProduto() {
		System.out.println("CADASTRO PRODUTO");
		System.out.println("Insira um codigo para o produto:");
		// System.out.println("(1) VOLTAR");
	}
	
	public static void imprimirPedirNomeProduto() {
		System.out.println("CADASTRO PRODUTO");
		System.out.println("Insira um nome para o produto:");
		// System.out.println("(1) VOLTAR");
	}
	
	public static void imprimirPedirPrecoProduto() {
		System.out.println("CADASTRO PRODUTO");
		System.out.println("Insira um preco para o produto:");
		// System.out.println("(1) VOLTAR");
	}
	
	public static void imprimirListaCompradores(Set<Comprador> compradores) {
		System.out.println("LISTA COMPRADORES");
		System.out.println("Insira um cpf para acessar os dados de um comprador:");
		if (compradores != null) {
			for (Comprador comprador : compradores) {
				System.out.println(comprador.toString());
			}
		}
		// System.out.println("(1) VOLTAR");
	}
	
	public static void imprimirListaVendedores(Set<Vendedor> vendedores) {
		System.out.println("LISTA VENDEDORES");
		System.out.println("Insira um cnpj para acessar os dados de um vendedor:");
		
		if (vendedores != null) {
			for (Vendedor vendedor : vendedores) {
				System.out.println(vendedor.toString());
			}
		}
		// System.out.println("(1) VOLTAR");
	}
	
	public static void imprimirDadosComprador(Comprador comprador) {
		if (comprador != null) {
			System.out.println("DADOS COMPRADOR");
			System.out.println("Pressione ENTER para voltar");
			System.out.println(comprador.toStringAll());
		}
	}
	
	public static void imprimirDadosVendedor(Vendedor vendedor) {
		if (vendedor != null) {
			System.out.println("DADOS VENDEDOR");
			System.out.println("Pressione ENTER para voltar");
			System.out.println(vendedor.toStringAll());
		}
	}
}
