package uff.ic.lleme.tcc00328.s20202.provas.p2.LuanPeixotoJardim.Q1;

public class Palavra {
    
    private String fonetica;
    private String grafia;

    public Palavra(String _fonetica, String _grafia) {
        this.fonetica = _fonetica;
        this.grafia = _grafia;
    }
    
    public String getFonetica() {
        return fonetica;
    }

    /**
     * @param fonetica the fonetica to set
     */
    public void setFonetica(String fonetica) {
        this.fonetica = fonetica;
    }

    /**
     * @return the grafia
     */
    public String getGrafia() {
        return grafia;
    }

    /**
     * @param grafia the grafia to set
     */
    public void setGrafia(String grafia) {
        this.grafia = grafia;
    }
    
}
