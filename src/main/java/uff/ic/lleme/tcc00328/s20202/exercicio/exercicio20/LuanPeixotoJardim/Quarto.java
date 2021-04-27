package uff.ic.lleme.tcc00328.s20202.exercicio.exercicio20.LuanPeixotoJardim;

public class Quarto {
    
    private String numero;
    private String tipo;
    private int capacidade_max;
    
    public Quarto(String _numero, String _tipo, int _capacidade_max) {
        this.numero = _numero;
        this.tipo = _tipo;
        this.capacidade_max = _capacidade_max;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidade_max() {
        return capacidade_max;
    }

    public void setCapacidade_max(int capacidade_max) {
        this.capacidade_max = capacidade_max;
    }
    
    
}
