package uff.ic.lleme.tcc00328.s20202.exercicios.tutorialOO.LuanPeixotoJardim;


public class Aluno extends Pessoa {
    
    public String matricula;
    public String unidade;
    public Inscricao[] inscricoes = new Inscricao[10];
    
    public Aluno(String _nome, String _cpf, String _matricula, String _unidade) {
        super(_nome, _cpf);
        this.matricula = _matricula;
        this.unidade = _unidade;
    }
}
