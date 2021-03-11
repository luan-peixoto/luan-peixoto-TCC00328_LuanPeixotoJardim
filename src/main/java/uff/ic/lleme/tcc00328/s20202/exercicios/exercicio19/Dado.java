package uff.ic.lleme.tcc00328.s20202.exercicios.exercicio19;

public class Dado {
    
    private int lancamento_1;
    private int lancamento_2;
    private int soma;
    
    public Dado(int _lancamento_1, int _lancamento_2, int _soma) {
        this.lancamento_1 = _lancamento_1;
        this.lancamento_2 = _lancamento_2;
        this.soma = _soma;
    }

    /**
     * @return the lancamento_1
     */
    public int getLancamento_1() {
        return lancamento_1;
    }

    /**
     * @param lancamento_1 the lancamento_1 to set
     */
    public void setLancamento_1(int lancamento_1) {
        this.lancamento_1 = lancamento_1;
    }

    /**
     * @return the lancamento_2
     */
    public int getLancamento_2() {
        return lancamento_2;
    }

    /**
     * @param lancamento_2 the lancamento_2 to set
     */
    public void setLancamento_2(int lancamento_2) {
        this.lancamento_2 = lancamento_2;
    }

    /**
     * @return the soma
     */
    public int getSoma() {
        return soma;
    }

    /**
     * @param soma the soma to set
     */
    public void setSoma(int soma) {
        this.soma = soma;
    }
    
}
