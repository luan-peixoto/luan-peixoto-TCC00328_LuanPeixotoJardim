/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio13.LuanPeixotoJardim;
import java.util.Scanner;
/**
 *
 * @author luan
 */
public class MediaDeValores {
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
