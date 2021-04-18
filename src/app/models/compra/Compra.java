package app.models.compra;

import java.util.Set;

import app.enums.TipoFormaPagamento;
import app.models.Base;
import app.models.produto.Produto;
import app.utils.Serial;

public class Compra extends Base {
	private String cpf;
	private String cnpj;
	private TipoFormaPagamento forma;
	private Set<Produto> produtos;
	
	public Compra(String cpf, String cnpj, TipoFormaPagamento forma, Set<Produto> produtos) {
		this.cpf = cpf;
		this.cnpj = cnpj;
		this.forma = forma;
		this.produtos = produtos;
		Serial.gerarIdUnico(this);
	}
}
