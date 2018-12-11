package classes;

public enum Energia {

    GASTO_LOCOMOVER(10),
    COMIDA(50),
    INICIAL(200);
    
    private final int valor;

    private Energia(int valorAdd) {
        this.valor = valorAdd;
    }
    
    public int getValor() {
        return valor;
    }  
    
}
