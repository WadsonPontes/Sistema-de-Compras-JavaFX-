package app.enums;

public enum TipoFormaPagamento {
	PIX(1),
    BOLETO(2),
    DEBITO(3),
    CREDITO(4);
    
    private int value;
    
    private TipoFormaPagamento(int value) {
        this.value = value;
    }
    
    public int get() {
        return this.value;
    }
}
