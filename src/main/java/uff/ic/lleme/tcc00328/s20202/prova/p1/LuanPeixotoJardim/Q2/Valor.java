package uff.ic.lleme.tcc00328.s20202.prova.p1.LuanPeixotoJardim.Q2;

public class Valor {
    
    private double total;
    private long n;
    
    
    public Valor() {
        this.total = 0;
        this.n = 0;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total += total;
    }

    /**
     * @return the n
     */
    public long getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(long n) {
        this.n += n;
    }
    
}
