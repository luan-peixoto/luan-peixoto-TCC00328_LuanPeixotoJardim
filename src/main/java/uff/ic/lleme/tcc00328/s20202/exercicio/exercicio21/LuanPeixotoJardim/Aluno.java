package uff.ic.lleme.tcc00328.s20202.exercicio.exercicio21.LuanPeixotoJardim;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    
    private String nome;
    private String cpf;
    private String matricula;
    private String curso;
    private List<Matricula> preferenciais = new ArrayList<>();
    private List<Matricula> alternativas = new ArrayList<>();
    
    public Aluno(String _nome, String _cpf, String _matricula, String _curso) {
        this.nome = _nome;
        this.cpf = _cpf;
        this.matricula = _matricula;
        this.curso = _curso;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void addMatricula1(Matricula _matricula) {
        preferenciais.add(_matricula);
    }
    
    public void addMatricula2(Matricula _matricula) {
        alternativas.add(_matricula);
    }
    
    public Matricula getMatricula(int i, String _turma_sigla, String _disciplina) {
        if (i == 1) {
            for (Matricula matricula : preferenciais) {
                if ((matricula.getTurma().getSigla().equals(_turma_sigla)) && 
                        matricula.getTurma().getOferta().getDisciplina().getNome().equals(_disciplina)) {
                    return matricula;
                
                }
            }
        }
        else {
            for (Matricula matricula : alternativas) {
                if ((matricula.getTurma().getSigla().equals(_turma_sigla)) && 
                        matricula.getTurma().getOferta().getDisciplina().getNome().equals(_disciplina)) {
                    return matricula;
                
                }
            }
        }
        return null;
    }
    
    public void removeMatricula(int i, Matricula matricula) {
        if (i == 1) {
            preferenciais.remove(matricula);
        }
        else {
            alternativas.remove(matricula);
        }
    }
}
