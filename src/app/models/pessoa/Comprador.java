package app.models.pessoa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import app.enums.TipoFormaPagamento;
import app.models.produto.Mostruario;
// import app.views.Erro;
import app.models.compra.*;
import app.models.produto.Produto;

public class Comprador extends Pessoa {
	public String cpf;
	public double a_pagar;
	public List<Compra> compras;
	public Set<Produto> sacola;
	
	public Comprador(String nome, String cpf) {
		super(nome);
        this.nome = nome;
        this.cpf = cpf;
        this.a_pagar = 0;
        this.compras = new ArrayList<Compra>();
        this.sacola = new HashSet<Produto>();
    }
	
	public Comprador(String nome, String cpf, double saldo) {
		super(nome, saldo);
        this.nome = nome;
        this.cpf = cpf;
        this.a_pagar = 0;
        this.compras = new ArrayList<Compra>();
        this.sacola = new HashSet<Produto>();
    }
	
	public Comprador(String nome, String cpf, double saldo, Set<Produto> sacola) {
		super(nome, saldo);
        this.nome = nome;
        this.cpf = cpf;
        this.a_pagar = 0;
        this.compras = new ArrayList<Compra>();
        this.sacola = sacola;
    }
	
	public Comprador(String nome, String cpf, double saldo, List<Compra> compras, Set<Produto> sacola) {
		super(nome, saldo);
        this.nome = nome;
        this.cpf = cpf;
        this.a_pagar = 0;
        this.compras = compras;
        this.sacola = sacola;
    }
	
	public void adicionarNaSacola(Vendedor vendedor, Mostruario produto, int quantidade) {
		if (vendedor.verificarEstoque(produto, quantidade)) {
			this.sacola.add(new Produto(produto, quantidade));
			vendedor.removerDaPrateleira(produto, quantidade);
		}
	}
	
	public void comprar(Vendedor vendedor, TipoFormaPagamento forma) {
		switch (forma) {
			case PIX:
				this.comprarPorPIX(vendedor, forma);
				break;
			case BOLETO:
				break;
			case DEBITO:
				break;
			case CREDITO:
				break;
			default:
				// BOLETO
		}
	}
	
	private void comprarPorPIX(Vendedor vendedor, TipoFormaPagamento forma) {
		if (this.validarCompra(vendedor)) {
			this.compras.add(new Compra(this.cpf, vendedor.cnpj, forma, this.sacola));
			// vendedor.vender(this, forma);
			this.pagarPorPIX(vendedor);
			this.sacola = null;
		}
	}
	
	private void pagarPorPIX(Vendedor vendedor) {
		double valor = this.calcularSacola();
		
		this.saldo -= valor;
		vendedor.receberPorPIX(valor);
	}
	
	private boolean validarCompra(Vendedor vendedor) {
		double total = this.calcularSacola();
		
		if (total > this.saldo) {
			// Erro.imprimir_erro("Saldo insuficiente");
			return false;
		}
		return true;
	}
	
	private double calcularSacola() {
		double total = 0;
		
		for (Produto item : this.sacola) {
			total += item.precoTotal();
		}
		
		return total;
	}
	
	public boolean equals(Comprador obj) {
		return this.cpf.equals(obj.cpf);
	}
    
    public int hashCode() {
    	return Objects.hash(super.hashCode(), this.cpf);
    }
    
    public String toString() {
    	return "(" + this.cpf + ") " + this.nome;
    }
    
    public String toStringAll() {
    	return "ID: " + this.id + "\nNome: " + this.nome + "\nCPF: " + this.cpf + "\nSaldo: R$ " + this.saldo + "\nValores a Pagar: " + this.a_pagar;
    }
}
