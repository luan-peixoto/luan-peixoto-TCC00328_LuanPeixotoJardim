package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio12.LuanPeixotoJardim;
import java.util.Scanner;

public class Divisores {
    public static int num;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        System.out.print("Divisores de " + num + ": ");
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println(num + ".");
    }
}
