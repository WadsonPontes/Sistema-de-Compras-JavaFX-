package app.models.pessoa;

import app.models.Base;
import app.utils.Serial;

public class Pessoa extends Base {
	public String nome;
	public double saldo;
	
	public Pessoa(String nome) {
		this.nome = nome;
		this.saldo = 0;
		Serial.gerarIdUnico(this);
	}
	
	public Pessoa(String nome, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
		Serial.gerarIdUnico(this);
	}
}
