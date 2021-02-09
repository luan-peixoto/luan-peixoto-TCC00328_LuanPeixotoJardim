package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio7;
import java.util.Scanner;

public class LuanPeixotoJardim {
    public static int num;
    public static int ndois;
    public static int ntres;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        ndois = input.nextInt();
        if (num < ndois) {
            ntres = ndois;
            ndois = num;
            num = ntres;
        }
        ntres = num % ndois;
        for(; ntres > 0; ntres = num % ndois) {
            num = ndois;
            ndois = ntres;
        }
        System.out.println("MDC: " + ndois);
    }
}
