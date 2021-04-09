package uff.ic.lleme.tcc00328.s20202.exercicios.exercicio19.LuanPeixotoJardim;

public class Resultado {
    
    private Lancador[] vencedores = new Lancador[10];
    private Lancador[] perdedores = new Lancador[10];
    
    public Resultado() {
    }

    /**
     * @return the vencedores
     */
    public Lancador[] getVencedores() {
        return vencedores;
    }

    /**
     * @param vencedores the vencedores to set
     */
    public void setVencedores(Lancador[] vencedores) {
        this.vencedores = vencedores;
    }

    /**
     * @return the perdedores
     */
    public Lancador[] getPerdedores() {
        return perdedores;
    }

    /**
     * @param perdedores the perdedores to set
     */
    public void setPerdedores(Lancador[] perdedores) {
        this.perdedores = perdedores;
    }
    
}
