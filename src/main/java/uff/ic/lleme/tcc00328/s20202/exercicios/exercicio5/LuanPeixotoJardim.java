package uff.ic.lleme.tcc00328.s20202.exercicios.exercicio5;

import java.util.Scanner;

public class LuanPeixotoJardim {

    public static int num;
    public static int ndois;
    public static int ntres;
    public static int nquatro;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        ndois = 0;
        ntres = 1;
        if (num == 0) {
            System.out.println("0");
            System.exit(0);
        } else if (num == 1) {
            System.out.println("1");
            System.exit(0);
        } else {
            while (num > 1) {
                nquatro = ndois + ntres;
                ndois = ntres;
                ntres = nquatro;
                num -= 1;
            }
            System.out.println("Fibonacci = " + nquatro);
            System.exit(0);
        }
    }

}
