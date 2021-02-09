package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio13;
import java.util.Scanner;

public class LuanPeixotoJardim {
    public static int num;
    public static float ndois;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        ndois = 0;
        for (int i = 0; i < num; i++) {
            ndois += input.nextInt();
        }
        ndois = ndois / num;
        System.out.println("Média dos valores: " + ndois);
    }
    
}
