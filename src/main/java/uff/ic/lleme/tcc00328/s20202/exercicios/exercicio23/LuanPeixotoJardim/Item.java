package uff.ic.lleme.tcc00328.s20202.exercicios.exercicio23.LuanPeixotoJardim.variados_1;

public class Item {
    
    private int quantidade;
    private Produto produto;
    
    public Item(int _quantidade, Produto _produto) {
        this.quantidade = _quantidade;
        this.produto = _produto;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int _quantidade) {
        this.quantidade = _quantidade;
    }
    
    public Produto getProduto() {
        return produto;
    }
    
    public void setProduto(Produto _produto) {
        this.produto = _produto;
    }
    
    
    
}
