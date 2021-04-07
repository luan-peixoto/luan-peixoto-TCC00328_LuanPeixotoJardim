package uff.ic.lleme.tcc00328.s20202.exercicios.exercicio23.variados_2;

public class LuanPeixotoJardim {
    
    public static void main(String[] args) {
        Vetor<Integer> vetor = new Vetor<Integer>();
        vetor.incluir(9);
        Object c = vetor.recuperar(0);
        System.out.println(c);
        vetor.incluir(10);
        vetor.incluir(11);
        vetor.incluir(12);
        Object d = vetor.recuperar(1);
        Object e = vetor.recuperar(2);
        Object f = vetor.recuperar(3);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        vetor.remover(0);
        Object g = vetor.recuperar(0);
        System.out.println(g);
    }
    
}
