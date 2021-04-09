package uff.ic.lleme.tcc00328.s20202.exercicios.exercicio21.LuanPeixotoJardim;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    
    private String sigla;
    private String horario;
    private Oferta oferta;
    private List<Matricula> matriculas = new ArrayList<>();
    
    public Turma(String _sigla, String _horario) {
        this.sigla = _sigla;
        this.horario = _horario;
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
     * @return the horario
     */
    public String getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * @return the oferta
     */
    public Oferta getOferta() {
        return oferta;
    }

    /**
     * @param oferta the oferta to set
     */
    public void setOferta(Oferta oferta) {
        this.oferta = oferta;
    }
    
    public void addMatricula(Matricula _matricula) {
        matriculas.add(_matricula);
    }
}
