package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio11;
import java.util.Scanner;

public class LuanPeixotoJardim {
    public static int num;
    public static long soma;
    public static int flag;
    public static void main(String[] args) {
        num = 50;
        soma = 1;
        flag = 0;
        for (int i = 2; i < 51; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                soma += soma * i;
            }
            else {
                flag = 0;
            }
        }
        System.out.println("Multiplicação dos primos de 1 à 50: " + soma);
    }
}
