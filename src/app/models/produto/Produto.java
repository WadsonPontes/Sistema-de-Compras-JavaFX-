package app.models.produto;

public class Produto extends Mostruario {
	public Produto(Mostruario m, int quantidade) {
		super();
		this.id = m.id;
		this.codigo = m.codigo;
		this.nome = m.nome;
		this.preco = m.preco;
		this.quantidade = quantidade;
	}
}
