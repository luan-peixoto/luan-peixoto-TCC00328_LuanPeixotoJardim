/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio3.LuanPeixotoJardim.sql;
import java.util.Scanner;

/**
 *
 * @author luan
 */
public class Mdc {
    public static int num;
    public static int ndois;
    public static int ntres;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        ndois = input.nextInt();
        if (num < ndois) {
            ntres = ndois;
            ndois = num;
            num = ntres;
        }
        ntres = num % ndois;
        while (ntres > 0) {
            num = ndois;
            ndois = ntres;
            ntres = num % ndois;
        }
        System.out.println("MDC: " + ndois);
    }
}
