package uff.ic.lleme.tcc00328.s20202.exercicio.exercicio10;

import java.util.Scanner;

public class LuanPeixotoJardim {

    public static int num;
    public static float soma;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        soma = 0;
        for (int i = 0; i <= num; i++)
            soma += Math.pow(-1, i) / (2 * i + 1);
        System.out.println("Somatório = " + soma);
    }
}
