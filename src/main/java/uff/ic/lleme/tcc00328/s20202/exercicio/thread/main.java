package uff.ic.lleme.tcc00328.s20202.exercicio.thread;

public class main {
    
    public static void main(String[] args) {
        new ExemploThread("te").start();
        new ExemploThread("tex").start();
        new ExemploThread("text").start();
    }
    
}
