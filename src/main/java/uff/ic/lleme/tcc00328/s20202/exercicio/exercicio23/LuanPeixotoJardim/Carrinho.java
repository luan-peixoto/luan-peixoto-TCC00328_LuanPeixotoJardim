package uff.ic.lleme.tcc00328.s20202.exercicio.exercicio23.LuanPeixotoJardim;

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
