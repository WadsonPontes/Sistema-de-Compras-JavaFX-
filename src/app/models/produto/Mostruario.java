package app.models.produto;

import java.util.Objects;

import app.models.Base;
import app.utils.Serial;

public class Mostruario extends Base implements IMostruario {
	public String codigo;
	public String nome;
	public double preco;
	public int quantidade;
	
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

	public Mostruario() {
		
	}
	
	public Mostruario(String codigo, String nome, double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = 1;
		Serial.gerarIdUnico(this); // Polimorfismo
	}
	
	public Mostruario(String codigo, String nome, double preco, int quantidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		Serial.gerarIdUnico(this); // Polimorfismo
	}
	
	public double precoTotal() {
		return this.preco * this.quantidade;
	}
	
	public boolean verificarEstoque(int quantidade) {
		return this.quantidade >= quantidade;
	}
	
	public boolean equals(Mostruario obj) {
		return this.codigo.equals(obj.codigo);
	}
    
    public int hashCode() {
    	return Objects.hash(super.hashCode(), this.codigo);
    }
    
    public String toString() {
    	return "Codigo: " + this.codigo + "     Nome: " + this.nome + "     Preco: " + this.preco;
    }
}
