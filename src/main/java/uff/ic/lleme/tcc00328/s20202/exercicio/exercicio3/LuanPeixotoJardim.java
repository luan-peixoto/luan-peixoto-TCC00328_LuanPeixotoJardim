package uff.ic.lleme.tcc00328.s20202.exercicio.exercicio3;

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
        while (ntres > 0) {
            num = ndois;
            ndois = ntres;
            ntres = num % ndois;
        }
        System.out.println("MDC: " + ndois);
    }
}
