package uff.ic.lleme.tcc00328.s20202.exercicio.pilha;
import java.lang.Math.*;

public class Main {
    
    public static void main(String[] args) {
        
        
       
        
        
        Pilha pilha = new Pilha();
        pilha.push(3);
        pilha.push(1);
        pilha.push(4);
        int c = pilha.pop();
        pilha.push(5);
        int d = pilha.pop();
        System.out.println(c);
        System.out.println(d);
    }
    
    
}
