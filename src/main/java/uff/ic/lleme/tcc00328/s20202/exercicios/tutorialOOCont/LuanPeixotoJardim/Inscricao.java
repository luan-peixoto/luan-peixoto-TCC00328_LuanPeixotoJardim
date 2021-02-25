package uff.ic.lleme.tcc00328.s20202.exercicios.tutorialOOCont.LuanPeixotoJardim;

import uff.ic.lleme.tcc00328.s20202.exercicios.tutorialOO.LuanPeixotoJardim.*;

public class Inscricao {
    
    public String aluno;
    public Turma turma;
    public String data_matricula;
    public String data_cancelamento;
    public float[] notas = new float[3];
    
    public Inscricao(String _aluno, Turma _turma, String _data_matricula, 
            String _data_cancelamento) {
        
        this.aluno = _aluno;
        this.turma = _turma;
        this.data_matricula = _data_matricula;
        this.data_cancelamento = _data_cancelamento;
        
    }
}
