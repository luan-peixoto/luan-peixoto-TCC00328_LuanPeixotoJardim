package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio4;
import java.util.Scanner;

public class LuanPeixotoJardim {
    
    public static int primo;
    public static int aux;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        primo = input.nextInt();
        aux = primo - 1;
        if (primo <= 1) {
            System.out.println(primo + " não é primo.");
            System.exit(0);
        }
        else {
            while (aux > 2) {
                if (primo % aux == 0) {
                    System.out.println(primo + " não é primo.");
                    System.exit(0);
                }
                aux -= 1;
            }
            System.out.println(primo + " é primo.");
        }
        
    }
    
}
