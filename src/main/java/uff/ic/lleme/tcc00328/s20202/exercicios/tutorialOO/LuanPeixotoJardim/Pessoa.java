package uff.ic.lleme.tcc00328.s20202.exercicios.tutorialOO.LuanPeixotoJardim;


public class Pessoa {
    
    private String nome;
    private String cpf;
    
    public Pessoa(String _nome, String _cpf) {
        this.nome = _nome;
        this.cpf = _cpf;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String _nome) {
        this.nome = _nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String _cpf) {
        this.cpf = _cpf;
    }
    
}
