package uff.ic.lleme.tcc00328.s20202.exercicio.exercicio20.LuanPeixotoJardim;

public class Cliente {
    
    private String nome;
    private String identidade;
    private String telefone;
    
    public Cliente(String _nome, String _identidade, String _telefone) {
        this.nome = _nome;
        this.identidade = _identidade;
        this.telefone = _telefone;
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
     * @return the identidade
     */
    public String getIdentidade() {
        return identidade;
    }

    /**
     * @param identidade the identidade to set
     */
    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
