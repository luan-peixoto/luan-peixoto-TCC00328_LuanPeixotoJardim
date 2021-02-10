package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio14;
import java.util.Scanner;
import java.lang.Math;

public class LuanPeixotoJardim {
    public static int n;
    public static float det;
    public static float matriz[][];
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tamanho da matriz quadrada:");
        n = input.nextInt(); 
        matriz = new float[n][n];
        System.out.println("Digite os termos da matriz:");
        for (int i = 0; i < n; i ++) {
           for (int j = 0; j < n; j ++) {
               matriz[i][j] = input.nextFloat();
           } 
        }
        det = determinante(matriz);
        System.out.println("Determinante: " + det);
        
    }
    
    public static float determinante(float[][] A) {
        int len = A.length;
        if (len == 3) {
            return (A[0][0] * A[1][1] * A[2][2]) + (A[0][1] * A[1][2] * A[2][0]) 
                    + (A[0][2] * A[1][0] * A[2][1]) - (A[0][2] * A[1][1] * A[2][0])
                    - (A[0][0] * A[1][2] * A[2][1]) - (A[0][1] * A[1][0] * A[2][2]);  
        }
        else if (len == 2) {
            return (A[0][0] * A[1][1]) - (A[0][1] * A[1][0]);
        }
        float det = 0;
        for (int j = 0; j < len; j++) {
            det += A[0][j] * Math.pow(-1, j) * determinante(submatriz(A, 0, j));
        }
        return det;
    }
    
    public static float[][] submatriz(float[][] A, int i, int j) {
        int len = A.length;
        int a = 0;
        int b = 0;
        float B[][] = new float[len-1][len-1];
        for (int k = 0; k < len; k++) {
           for (int l = 0; l < len; l ++) {
               if (k != i) {
                   if (l != j) {
                       B[a][b] = A[k][l];
                       if (b == len - 2) {
                           a += 1;
                           b = 0;
                       }
                       else {
                           b += 1;
                       }
                       }
               }
           } 
        }
        return B;
    }
}
