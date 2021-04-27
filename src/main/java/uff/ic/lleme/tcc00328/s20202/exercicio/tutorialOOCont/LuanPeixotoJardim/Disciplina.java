
package uff.ic.lleme.tcc00328.s20202.exercicio.tutorialOOCont.LuanPeixotoJardim;


public class Disciplina {
    
    private String codigo;
    private String nome;
    private String sigla;
    
    public Disciplina(String _codigo, String _nome, String _sigla) {
        this.codigo = _codigo;
        this.nome = _nome;
        this.sigla = _sigla;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String _codigo) {
        this.codigo = _codigo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String _nome) {
        this.nome = _nome;
    }
    
    public String getSigla() {
        return sigla;
    }
    
    public void setSigla(String _sigla) {
        this.sigla = _sigla;
    }
    
}
