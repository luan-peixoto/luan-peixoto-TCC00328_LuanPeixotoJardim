package uff.ic.lleme.tcc00328.s20202.exercicio.exercicio19.LuanPeixotoJardim;

public class Lancador {
    
    private String nome;
    private Dado[] jogadas = new Dado[10];
    
    public Lancador(String _nome) {
        this.nome = _nome;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the jogos
     */
    public Dado[] getJogadas() {
        return jogadas;
    }

    /**
     * @param jogada the jogada to set
     */
    public void setJogadas(Dado[] _jogadas) {
        this.jogadas = _jogadas;
    }
    
}
