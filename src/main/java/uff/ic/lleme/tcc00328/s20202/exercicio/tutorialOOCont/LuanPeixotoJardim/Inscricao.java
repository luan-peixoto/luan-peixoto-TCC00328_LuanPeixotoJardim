package uff.ic.lleme.tcc00328.s20202.exercicio.tutorialOOCont.LuanPeixotoJardim;

public class Inscricao {
    
    private Aluno aluno;
    private Turma turma;
    private String data_matricula;
    private String data_cancelamento;
    private float[] notas = new float[3];
    
    public Inscricao(Aluno _aluno, Turma _turma, String _data_matricula, 
            String _data_cancelamento) {
        
        this.aluno = _aluno;
        this.turma = _turma;
        this.data_matricula = _data_matricula;
        this.data_cancelamento = _data_cancelamento;
        
    }
    
    public Aluno getAluno() {
        return aluno;
    }
    
    public void setAluno(Aluno _aluno) {
        this.aluno = _aluno;
    }
    
    public Turma getTurma() {
        return turma;
    }
    
    public void setTurma (Turma _turma) {
        this.turma = _turma;
    }
    
    public String getDataMatricula() {
        return data_matricula;
    }
    
    public void setDataMatricula(String _data_matricula) {
        this.data_matricula = _data_matricula;
    }
    
    public String getDataCancelamento() {
        return data_cancelamento;
    }
    
     public void setDataCancelamento(String _data_cancelamento) {
        this.data_matricula = _data_cancelamento;
    }
     
     public float[] getNotas() {
        return notas;
    }
    
     public void setNotas(float[] _notas) {
        this.notas = _notas;
    }
    
}
