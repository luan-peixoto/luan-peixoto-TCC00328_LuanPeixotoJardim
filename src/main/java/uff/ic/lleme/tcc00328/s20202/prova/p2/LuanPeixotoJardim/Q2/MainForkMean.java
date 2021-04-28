package uff.ic.lleme.tcc00328.s20202.prova.p2.LuanPeixotoJardim.Q2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class MainForkMean {
    
    public static void main(String[] args) throws InterruptedException {
        
        Valor valor = new Valor();
        List<Double> valores = new ArrayList<>();
        //
        for (int i = 0; i < 1000000; i++) {
            valores.add(Math.random() * (20 - 1) + 1);
        }

        ForkMean fb = new ForkMean(valores, valor);
        
        ForkJoinPool pool = new ForkJoinPool();

        pool.invoke(fb);
        
        System.out.println(valor.getN());
        System.out.println(valor.getTotal() / valor.getN());

            
        
    }
    
    
    
}
