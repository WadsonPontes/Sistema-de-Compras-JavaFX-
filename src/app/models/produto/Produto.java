package app.models.produto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import app.models.Base;
import app.utils.Serial;

public class Produto extends Base implements IProduto {
	public String codigo;
	public String nome;
	public double preco;
	public int quantidade;
	
	public Produto(Produto produto) {
		super();
		this.id = produto.id;
		this.codigo = produto.codigo;
		this.nome = produto.nome;
		this.preco = produto.preco;
		this.quantidade = 1;
	}
	
	public Produto(Produto produto, int quantidade) {
		super();
		this.id = produto.id;
		this.codigo = produto.codigo;
		this.nome = produto.nome;
		this.preco = produto.preco;
		this.quantidade = quantidade;
	}
	
	public Produto(String codigo, String nome, double preco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = 1;
		Serial.gerarIdUnico(this);
	}
	
	public Produto(String codigo, String nome, double preco, int quantidade) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		Serial.gerarIdUnico(this);
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double precoTotal() {
		return this.preco * this.quantidade;
	}
	
	public boolean verificarEstoque(int quantidade) {
		return this.quantidade >= quantidade;
	}
	
	public boolean equals(Produto obj) {
		return this.codigo.equals(obj.codigo);
	}
    
    public int hashCode() {
    	return Objects.hash(super.hashCode(), this.codigo);
    }
    
    public String toString() {
    	return "Codigo: " + this.codigo + "     Nome: " + this.nome + "     Preco: " + this.preco;
    }
	
	public static List<Produto> copiar(List<Produto> produtos) {
		List<Produto> copias = new ArrayList<Produto>();
		
		if (produtos != null) {
			for (Produto produto : produtos) {
				Produto copia = new Produto(produto, produto.quantidade);
				copias.add(copia);
			}
		}
		
		return copias;
	}
	
	public static Set<Produto> copiar(Set<Produto> produtos) {
		Set<Produto> copias = new HashSet<Produto>();
		
		if (produtos != null) {
			for (Produto produto : produtos) {
				Produto copia = new Produto(produto, produto.quantidade);
				copias.add(copia);
			}
		}
		
		return copias;
	}
}
