package uff.ic.lleme.tcc00328.s20202.exercicio.pilha.pilhaGenerica;

public class Main {
    
    public static void main(String[] args) {
        Pilha2<Integer> pilha = new Pilha2<Integer>();
        pilha.push(new Integer(5));
        pilha.push(new Integer(4));
        pilha.push(new Integer(2));
        int a = pilha.top();
        pilha.pop();
        System.out.println(a);
        a = pilha.top();
        pilha.pop();
        System.out.println(a);
        pilha.push(new Integer(72));
        a = pilha.top();
        pilha.pop();
        System.out.println(a);
    }
}
