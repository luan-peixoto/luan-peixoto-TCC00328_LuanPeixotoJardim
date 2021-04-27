package uff.ic.lleme.tcc00328.s20202.exercicio.pilha.pilhaGenerica;

import java.util.*;


public class Pilha2<T> {
    private Object[] elementos = new Object[100];
    private int topo = -1;
    
    public void push(T elemento) {
        elementos[++topo] = elemento;
    }
    
    public void pop() {
        topo --;
    }
    
    public T top() {
        return (T)elementos[topo];
    }
    
    public boolean isEmpty() {
        return topo < 0;
    }
}
