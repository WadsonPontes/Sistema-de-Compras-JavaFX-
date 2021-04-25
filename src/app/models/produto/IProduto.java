package app.models.produto;

public interface IProduto {
	public double precoTotal();
	public boolean verificarEstoque(int quantidade);
}
