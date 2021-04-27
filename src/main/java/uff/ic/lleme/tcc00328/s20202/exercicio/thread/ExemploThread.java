package uff.ic.lleme.tcc00328.s20202.exercicio.thread;

public class ExemploThread extends Thread {
    
    private String texto;
    
    public ExemploThread(String _texto) {
        this.texto = _texto;
    }
    
    public void run() {
        System.out.println(texto);
    }
}
