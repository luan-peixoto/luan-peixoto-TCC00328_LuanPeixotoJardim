package uff.ic.lleme.tcc00328.s20202.prova.p2.LuanPeixotoJardim.Q1;


public class Substantivo extends Sinonimo {
    
    private Palavra palavra;
    
    public Substantivo(String _grafia, String _fonetica, String _significado) {
        super(_significado);
        this.palavra = new Palavra(_grafia, _fonetica);
        super.setPalavras(palavra);
    }

    /**
     * @return the palavra
     */
    public Palavra getPalavra() {
        return palavra;
    }

    /**
     * @param palavra the palavra to set
     */
    public void setPalavra(Palavra palavra) {
        this.palavra = palavra;
    }
    
    
}