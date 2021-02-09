/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio9.LuanPeixotoJardim;
import java.util.Scanner;
/**
 *
 * @author luan
 */
public class Fibonacci {
    
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
        }
        else if (num == 1) {
            System.out.println("1");
            System.exit(0);
        }
        else {
            for (int i = 1; i < num; i++) {
                nquatro = ndois + ntres;
                ndois = ntres;
                ntres = nquatro;
            }
            System.out.println("Fibonacci = " + nquatro);
            System.exit(0);
        }
    }
    
}
