package uff.ic.lleme.tcc00328.s20202.exercicios.exercicio23.LuanPeixotoJardim.variados_1;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    
    private List<Item> itens = new ArrayList<>();

    public Carrinho(List<Item> itens) {
        this.itens = itens;
    }
    
    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
    
}
