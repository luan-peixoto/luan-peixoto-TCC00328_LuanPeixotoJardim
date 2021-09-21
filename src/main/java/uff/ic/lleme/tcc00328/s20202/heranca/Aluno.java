package uff.ic.lleme.tcc00328.s20202.heranca;

public class Aluno extends Pessoa {
    
    private int ano;
    private int turma;
    
    public Aluno(int ano, int turma, String cpf, String nome) {
        super(nome, cpf);
        this.ano = ano;
        this.turma = turma;
    }
}
