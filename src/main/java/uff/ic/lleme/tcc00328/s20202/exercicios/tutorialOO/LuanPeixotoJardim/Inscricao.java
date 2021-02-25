package uff.ic.lleme.tcc00328.s20202.exercicios.tutorialOO.LuanPeixotoJardim;

public class Inscricao {
    
    public String aluno;
    public Disciplina disciplina;
    public String data_matricula;
    public String data_cancelamento;
    public float[] notas = new float[3];
    
    public Inscricao(String _aluno, Disciplina _disciplina, String _data_matricula, 
            String _data_cancelamento) {
        
        this.aluno = _aluno;
        this.disciplina = _disciplina;
        this.data_matricula = _data_matricula;
        this.data_cancelamento = _data_cancelamento;
        
    }
}
