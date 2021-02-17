package uff.ic.lleme.tcc00328.s20202.exercicios.exercicio2;

import java.util.Scanner;

public class LuanPeixotoJardim {

    public static int num;
    public static int ndois;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        ndois = 1;
        while (num > 0) {
            ndois = ndois * num;
            num -= 1;
        }
        System.out.println("Fatorial: " + ndois);
    }
}
