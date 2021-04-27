/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20202.exercicio.exercicio21.LuanPeixotoJardim;

import java.util.HashSet;
import java.util.Set;

public class Curso {
    
    private String nome;
    private String sigla;
    private Set<Oferta> disciplinas = new HashSet<Oferta>();
    
    public Curso(String _nome, String _sigla) {
        this.nome = _nome;
        this.sigla = _sigla;
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
        return disciplinas;
    }

   
    public void addDisciplina(Oferta _oferta) {
        this.disciplinas.add(_oferta);
    }
    
}
