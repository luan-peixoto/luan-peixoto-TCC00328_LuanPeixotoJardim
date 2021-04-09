package uff.ic.lleme.tcc00328.s20202.exercicios.exercicio23.LuanPeixotoJardim.variados_1;

public class Produto {
    
    private String codigo;
    private String nome;
    private float preco;
    
    public Produto(String _codigo, String _nome, float _preco) {
        this.codigo = _codigo;
        this.nome = _nome;
        this.preco = _preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }
    
    public void setPreco(float preco) {
        this.preco = preco;
    }
    
}
