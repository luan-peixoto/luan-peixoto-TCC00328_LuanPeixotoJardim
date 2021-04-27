package uff.ic.lleme.tcc00328.s20202.exercicio.exercicio12;

import java.util.Scanner;

public class LuanPeixotoJardim {

    public static int num;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        System.out.print("Divisores de " + num + ": ");
        for (int i = 1; i < num; i++)
            if (num % i == 0)
                System.out.print(i + ", ");
        System.out.println(num + ".");
    }
}
