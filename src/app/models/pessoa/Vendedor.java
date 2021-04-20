package app.models.pessoa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import app.enums.TipoFormaPagamento;
// import app.views.Erro;
import app.models.compra.*;
import app.models.produto.Mostruario;

public class Vendedor extends Pessoa {
	public String cnpj;
	public double a_receber;
	public Set<Mostruario> produtos;
	public List<Compra> vendas;
	
	public Vendedor(String nome, String cnpj) {
		super(nome);
		this.cnpj = cnpj;
		this.a_receber = 0;
		this.produtos = new HashSet<Mostruario>();
		this.vendas = new ArrayList<Compra>();
	}
	
	public void adicionarAPrateleira() {
		
	}
	
	public void vender(Comprador comprador, TipoFormaPagamento forma) {
		this.vendas.add(new Compra(comprador.cpf, this.cnpj, forma, comprador.sacola));
		
		for (Mostruario item : comprador.sacola) {
			this.get(item).quantidade -= item.quantidade;
		}
	}
	
	public void receberPorPIX(double valor) {
		this.saldo += valor;
	}
	
	public Mostruario get(Mostruario produto) {
		for (Mostruario p : this.produtos) {
			if (p.equals(produto))  {
				 return p;
			}
		}
		return null;
	}
	
	public boolean verificarEstoque(Mostruario produto, int quantidade) {
		Mostruario p = this.get(produto);
		
		if (p == null) {
			// Erro.imprimir_erro("O vendedor " + this.nome + " não vende esse produto");
			return false;
		}
		
		if (p.verificarEstoque(quantidade)) {
			return true;
		}
		else {
			// Erro.imprimir_erro("O vendedor " + this.nome + " não tem " + quantidade + " de " + p.nome + " para vender");
			 return false;
		}
	}
	
	public void removerDaPrateleira(Mostruario produto, int quantidade) {
		this.get(produto).quantidade -= quantidade;
	}
	
	public boolean equals(Vendedor obj) {
		return this.cnpj.equals(obj.cnpj);
	}
    
    public int hashCode() {
    	return Objects.hash(super.hashCode(), this.cnpj);
    }
    
    public String toString() {
    	return "(" + this.cnpj + ") " + this.nome;
    }
    
    public String toStringAll() {
    	String t = "ID: " + this.id + "\nNome: " + this.nome + "\nCNPJ: " + this.cnpj + "\nSaldo: R$ " + this.saldo + "\nValores a Receber: " + this.a_receber + "\n\nCATALAGO DE PRODUTOS";
    	
    	for (Mostruario m : this.produtos) {
    		t += "\n" + m.toString();
    	}
    	
    	return t;
    }

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public double getA_receber() {
		return a_receber;
	}

	public void setA_receber(double a_receber) {
		this.a_receber = a_receber;
	}

	public Set<Mostruario> getProdutos() {
		return produtos;
	}

	public void setProdutos(Set<Mostruario> produtos) {
		this.produtos = produtos;
	}

	public List<Compra> getVendas() {
		return vendas;
	}

	public void setVendas(List<Compra> vendas) {
		this.vendas = vendas;
	}
}