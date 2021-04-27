package uff.ic.lleme.tcc00328.s20202.prova.p1.LuanPeixotoJardim;

public class Prato {
    
    private String nome;
    private Float preco;
    
    public Prato(String _nome, Float _preco) {
        this.nome = _nome;
        this.preco = _preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }
    
}
