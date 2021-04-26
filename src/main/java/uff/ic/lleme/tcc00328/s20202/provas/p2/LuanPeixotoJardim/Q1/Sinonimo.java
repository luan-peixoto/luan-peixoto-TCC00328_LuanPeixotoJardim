package uff.ic.lleme.tcc00328.s20202.provas.p2.LuanPeixotoJardim.Q1;

public class Sinonimo {
    
    private String significado;
    private Palavra[] palavras = new Palavra[10];
    
    public Sinonimo(String _significado) {
        this.significado = _significado;
    }

    public String getSignificado() {
        return significado;
    }

    public void setSignificado(String significado) {
        this.significado = significado;
    }
    
    public Palavra[] getPalavras() {
        return palavras;
    }

    public void setPalavras(Palavra _palavra) {
        int i;
        for(i = 0; this.palavras[i] != null; i++ ) {
        }
        this.palavras[i] = _palavra;
    }
    
}
