package uff.ic.lleme.tcc00328.s20202.exercicios.tutorialOOCont.LuanPeixotoJardim;


public class Turma {
    
    public String codigo;
    public Disciplina disciplina;
    public String semestre;
    public String horario;
    
    public Turma(String _codigo, Disciplina _disciplina, String _semestre, String _horario) {
        this.codigo = _codigo;
        this.disciplina = _disciplina;
        this.semestre = _semestre;
        this.horario = _horario;
    }
}
