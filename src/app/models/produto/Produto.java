package app.models.produto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import app.utils.Serial;

public class Produto extends Mostruario {
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
