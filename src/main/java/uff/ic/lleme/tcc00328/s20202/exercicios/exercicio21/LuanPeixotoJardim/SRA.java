package uff.ic.lleme.tcc00328.s20202.exercicios.exercicio21.LuanPeixotoJardim;

import java.util.ArrayList;
import java.util.List;

public class SRA {
    
    private List<Curso> cursos = new ArrayList<>();
    private List<Disciplina> disciplinas = new ArrayList<>();
    private List<Oferta> ofertas = new ArrayList<>();
    private List<Turma> turmas = new ArrayList<>();
    private List<Aluno> alunos = new ArrayList<>();
    private List<Matricula> matriculas = new ArrayList<>();
    
    public Curso getCurso(String _nome) {
        for (Curso curso : cursos) {
            if (curso.getNome().equals(_nome)) {
                return curso;
            }
        }
        return null;
    }
    
    public void addCurso(Curso _curso) {
        this.cursos.add(_curso);
    }
    
    public Disciplina getDisciplina(String _nome) {
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getNome().equals(_nome)) {
                return disciplina;
            }
        }
        return null;
    }
    
    public void addDisciplina(Disciplina _disciplina) {
        this.disciplinas.add(_disciplina);
    }
    
    public Oferta getOferta(String _nome_curso, String _nome_disciplina) {
        for (Oferta oferta : ofertas) {
            if ((oferta.getCurso().getNome().equals(_nome_curso)) && 
                    (oferta.getDisciplina().getNome().equals(_nome_disciplina))) {
                return oferta;
            }
        }
        return null;
    }
    
    public void addOferta(Oferta _oferta) {
        this.ofertas.add(_oferta);
    }
    
    
    public void addTurma(Turma _turma) {
        this.turmas.add(_turma);
    }
    
    
    public Turma getTurma(String _sigla, String _nome_curso, String _nome_disciplina) {
        for (Turma turma : turmas) {
            if ((turma.getOferta().getCurso().getNome().equals(_nome_curso)) 
                    && (turma.getOferta().getDisciplina().getNome().equals(_nome_disciplina)) 
                    && (turma.getSigla().equals(_sigla))) {
                return turma;
            }
        }
        return null;
    }
    
    public void addAluno(Aluno _aluno) {
        this.alunos.add(_aluno);
    }
    
    
    public Aluno getAluno(String _nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equals(_nome)) {
                return aluno;
            }
        }
        return null;
    }

    /**
     * @return the matriculas
     */
    public List<Matricula> getMatriculas() {
        return matriculas;
    }
    
    public void addMatricula(Matricula _matricula) {
        this.matriculas.add(_matricula);
    }
   
}
