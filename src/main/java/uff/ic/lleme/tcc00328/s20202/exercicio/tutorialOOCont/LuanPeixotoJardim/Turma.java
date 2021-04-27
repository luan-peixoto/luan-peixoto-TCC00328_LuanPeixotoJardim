package uff.ic.lleme.tcc00328.s20202.exercicio.tutorialOOCont.LuanPeixotoJardim;


public class Turma {
    
    private String codigo;
    private Disciplina disciplina;
    private String semestre;
    private String horario;
    
    public Turma(String _codigo, Disciplina _disciplina, String _semestre, String _horario) {
        this.codigo = _codigo;
        this.disciplina = _disciplina;
        this.semestre = _semestre;
        this.horario = _horario;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String _codigo) {
        this.codigo = _codigo;
    }
    
    public Disciplina getDisciplina() {
        return disciplina;
    }
    
    public void setDisciplina(Disciplina _disciplina) {
        this.disciplina = _disciplina;
    }
    
    public String getSemestre() {
        return semestre;
    }
    
    public void setSemestre(String _semestre) {
        this.semestre = _semestre;
    }
    
    public String getHorario() {
        return horario;
    }
    
    public void setHorario(String _horario) {
        this.horario = _horario;
    }
    
}
