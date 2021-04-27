package uff.ic.lleme.tcc00328.s20202.exercicio.pilha;

public class Elemento {
    
    private Elemento proximo;
    private int valor;
    
    public Elemento(int _valor) {
        this.valor = _valor;
    }

    /**
     * @return the proximo
     */
    public Elemento getProximo() {
        return proximo;
    }

    /**
     * @param proximo the proximo to set
     */
    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
    
}
