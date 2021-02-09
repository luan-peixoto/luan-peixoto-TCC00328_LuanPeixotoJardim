/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio10.LuanPeixotoJardim;
import java.util.Scanner;
import  java.lang.Math;

/**
 *
 * @author luan
 */
public class Series {
    public static int num;
    public static float soma;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        soma = 0;
        for (int i = 0; i <= num; i++) {
            soma += Math.pow(-1,i) / (2*i + 1);
        }
        System.out.println("Somatório = " + soma);
    }
}
