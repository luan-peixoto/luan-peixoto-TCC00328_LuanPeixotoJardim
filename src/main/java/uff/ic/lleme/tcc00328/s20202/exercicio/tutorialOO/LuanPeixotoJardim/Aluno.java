package uff.ic.lleme.tcc00328.s20202.exercicio.tutorialOO.LuanPeixotoJardim;


public class Aluno extends Pessoa {
    
    private String matricula;
    private String unidade;
    private Inscricao[] inscricoes = new Inscricao[10];
    
    public Aluno(String _nome, String _cpf, String _matricula, String _unidade) {
        super(_nome, _cpf);
        this.matricula = _matricula;
        this.unidade = _unidade;
    }
    
    @Override
    public String getNome() {
        return super.getNome();
    }
    
    @Override
    public void setNome(String _nome) {
        super.setNome(_nome);
    }
    
    @Override
    public String getCpf() {
        return super.getCpf();
    }
    
    @Override
    public void setCpf(String _cpf) {
        super.setCpf(_cpf);
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String _matricula) {
        this.matricula = _matricula;
    }
    
    public String getUnidade() {
        return unidade;
    }
    
    public void setUnidade(String _unidade) {
        this.unidade = _unidade;
    }
    
    public Inscricao[] getInscricoes() {
        return inscricoes;
    }
    
    public void setInscricoes(Inscricao[] _inscricoes) {
        this.inscricoes = _inscricoes;
    }
    
}
