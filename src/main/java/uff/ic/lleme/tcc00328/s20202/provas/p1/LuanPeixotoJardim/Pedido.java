/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20202.provas.p1.LuanPeixotoJardim;

public class Pedido {

    private Item[] itens = new Item[10];
    
    public Pedido(Item[] _itens) {
        this.itens = _itens;
    }

    public Item[] getItens() {
        return itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }
    
}
