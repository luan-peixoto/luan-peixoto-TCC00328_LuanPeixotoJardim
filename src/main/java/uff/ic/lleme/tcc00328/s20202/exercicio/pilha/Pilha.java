
package uff.ic.lleme.tcc00328.s20202.exercicio.pilha;

public class Pilha {
    
    Elemento pi;
    
    public Pilha() {
    }
    
    public void push(int _num) {
        Elemento novo = new Elemento(_num);
        novo.setProximo(pi);
        pi = novo;
    }
    
    public int pop() {
        if (pi != null) {
            int aux = pi.getValor();
            pi = pi.getProximo();
            return aux;
        }
        else {
            return -1;
        }
        
    }
    
}
