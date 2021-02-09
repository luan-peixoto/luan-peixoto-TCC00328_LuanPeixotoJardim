/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio8.LuanPeixotoJardim;
import java.util.Scanner;
/**
 *
 * @author luan
 */
public class Primo {
    
    public static int primo;
    public static int aux;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        primo = input.nextInt();
        if (primo <= 1) {
            System.out.println(primo + " não é primo.");
            System.exit(0);
        }
        else {
            for (aux = 2; aux < primo; aux ++) {
                if (primo % aux == 0) {
                    System.out.println(primo + " não é primo.");
                    System.exit(0);
                }
            }
            System.out.println(primo + " é primo.");
        }
    }   
}
