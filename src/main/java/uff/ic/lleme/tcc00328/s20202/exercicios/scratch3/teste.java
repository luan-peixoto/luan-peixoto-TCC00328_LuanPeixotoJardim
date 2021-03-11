package uff.ic.lleme.tcc00328.s20202.exercicios.scratch3;
import java.io.Serializable;

public class teste implements Serializable {
    
    private int um = 3;
    
    public teste(int _um) {
        this.um = _um;
    }

    /**
     * @return the um
     */
    public int getUm() {
        return um;
    }

    /**
     * @param um the um to set
     */
    public void setUm(int um) {
        this.um = um;
    }
    
}

