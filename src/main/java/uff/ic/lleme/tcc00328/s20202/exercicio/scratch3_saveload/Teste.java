package uff.ic.lleme.tcc00328.s20202.exercicio.scratch3_saveload;
import java.io.Serializable;

public class Teste implements Serializable {
    
    private int valor = 3;
    
    public Teste(int _valor) {
        this.valor = _valor;
    }

    /**
     * @return the um
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param um the um to set
     */
    public void setValor(int _valor) {
        this.valor = _valor;
    }
    
}

