package app.enums;

public enum Estado {
	MENU_PRINCIPAL(1),
    CADASTRO_COMPRADOR(2),
    CADASTRO_VENDEDOR(3),
    CADASTRO_PRODUTO(4),
    LISTA_COMPRADORES(5),
    LISTA_VENDEDORES(6),
    SAIR(9);
    
    private int value;
    
    private Estado(int value) {
        this.value = value;
    }
    
    public int get() {
        return this.value;
    }
}
