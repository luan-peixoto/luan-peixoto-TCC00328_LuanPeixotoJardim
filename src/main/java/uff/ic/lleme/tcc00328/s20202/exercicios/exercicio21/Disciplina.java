package uff.ic.lleme.tcc00328.s20202.exercicios.exercicio21;

import java.util.HashSet;
import java.util.Set;

public class Disciplina {
    
    private String codigo;
    private String nome;
    private String sigla;
    private Set<Oferta> cursos = new HashSet<Oferta>();
    
    public Disciplina(String _codigo, String _nome, String _sigla) {
        this.codigo = _codigo;
        this.nome = _nome;
        this.sigla = _sigla;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
     * @return the sigla
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * @param sigla the sigla to set
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    /**
     * @return the disciplinas
     */
    public Set<Oferta> getDisciplinas() {
        return cursos;
    }

    public void addCurso(Oferta _oferta) {
        this.cursos.add(_oferta);
    }
    
}
