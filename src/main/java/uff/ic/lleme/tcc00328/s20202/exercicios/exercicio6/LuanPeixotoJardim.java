package uff.ic.lleme.tcc00328.s20202.exercicios.exercicio6;

import java.util.Scanner;

public class LuanPeixotoJardim {

    public static int num;
    public static float soma;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        soma = 0;
        while (num > -1) {
            soma += Math.pow(-1, num) / (2 * num + 1);
            num -= 1;
        }
        System.out.println("Somatório = " + soma);
    }
}
