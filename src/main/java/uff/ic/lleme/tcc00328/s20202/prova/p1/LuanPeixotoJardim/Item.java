package uff.ic.lleme.tcc00328.s20202.prova.p1.LuanPeixotoJardim;

public class Item {
    
    private Prato prato;
    private int quantidade;
    
    public Item(Prato _prato, int _quantidade) {
        this.prato = _prato;
        this.quantidade = _quantidade;
    }


    public Prato getPrato() {
        return prato;
    }

    public void setPrato(Prato prato) {
        this.prato = prato;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}
