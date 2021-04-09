package uff.ic.lleme.tcc00328.s20202.exercicios.exercicio23.LuanPeixotoJardim.variados_2;

import java.util.Arrays;

public class Vetor<T> {
    
    private Object[] elementos = new Object[1];
    private int max = 0;
    private int atual = 0;
   
    public void incluir(Object obj) {
        if (atual > max) {
            elementos = Arrays.copyOf(elementos, max + 6);
            max += 5;
        }
        elementos[atual] = obj;
        atual ++;
    }
    
    public void remover(int posicao) {
        for (int i = posicao; elementos[i] != null; i++) {
            elementos[i] = elementos[i+1];
        }
    }
    
    public Object recuperar(int posicao) {
        return elementos[posicao];
    }
    
}
