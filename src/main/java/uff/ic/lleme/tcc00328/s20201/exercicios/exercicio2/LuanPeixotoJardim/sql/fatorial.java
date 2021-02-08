/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio2.LuanPeixotoJardim.sql;
import java.util.Scanner;

/**
 *
 * @author luan
 */
public class fatorial {
    
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
