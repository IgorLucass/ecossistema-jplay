package classes;

/**
 *
 * @author x0n4d0
 */

public enum Energia {

    GASTO_LOCOMOVER(10),
    COMIDA(50),
    INICIAL(200),
    MAX(1000),
    NULL(-1),
    MIN(0);
    
    private final int valor;

    private Energia(int valorAdd) {
        this.valor = valorAdd;
    }
    
    public int getValor() {
        return valor;
    }
    
    
}
