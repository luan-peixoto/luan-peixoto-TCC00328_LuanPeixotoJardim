package uff.ic.lleme.tcc00328.s20202.prova.p2.LuanPeixotoJardim.Q1;

public class Dicionario {
    
    private Verbo[] verbos = new Verbo[10];
    private Substantivo[] substantivos = new Substantivo[10];
    
    public Dicionario(){
    }

    public Verbo[] getVerbos() {
        return verbos;
    }

    public void setVerbos(Verbo _verbo) {
        int i;
        for(i = 0; this.verbos[i] != null; i++ ) {
        }
        this.verbos[i] = _verbo;
    }

    public Substantivo[] getSubstantivos() {
        return substantivos;
    }

    public void setSubstantivos(Substantivo _substantivo) {
        int i;
        for(i = 0; this.substantivos[i] != null; i++ ) {
        }
        this.substantivos[i] = _substantivo;
    }
   
    public void organizarDicionario() {
        if (verbos != null) {
            int i;
            for (i = 0; verbos[i] != null; i++) {
                int j;
                for (j = i+1; verbos[j] != null; j++) {
                    if (verbos[i].getSignificado().equals(verbos[j].getSignificado())) {
                        verbos[i].setPalavras(verbos[j].getPalavra());
                        verbos[j].setPalavras(verbos[i].getPalavra());
                    }
                }
            }
        }
        if (substantivos != null) {
            int i;
            for (i = 0; substantivos[i] != null; i++) {
                int j;
                for (j = i+1; substantivos[j] != null; j++) {
                    if (substantivos[i].getSignificado().equals(substantivos[j].getSignificado())) {
                        substantivos[i].setPalavras(substantivos[j].getPalavra());
                        substantivos[j].setPalavras(substantivos[i].getPalavra());
                    }
                }
            }
        }
    }
            
    
    
}
