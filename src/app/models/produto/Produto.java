package app.models.produto;

import app.utils.Serial;

public class Produto extends Mostruario {
	public Produto(Mostruario m, int quantidade) {
		super();
		this.id = m.id;
		this.codigo = m.codigo;
		this.nome = m.nome;
		this.preco = m.preco;
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
}
