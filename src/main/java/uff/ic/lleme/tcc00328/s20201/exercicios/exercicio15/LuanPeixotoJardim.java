package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio15;
import java.util.Scanner;

public class LuanPeixotoJardim {
    public static int num;
    public static int ndois;
    public static float numeros[];
    public static float categorias[];
    public static float histograma[];
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de números:");
        num = input.nextInt(); 
        numeros = new float[num];
        System.out.println("Digite a quantidade de categorias:");
        ndois = input.nextInt(); 
        categorias = new float[ndois+1];
        histograma = new float[ndois];
 
        System.out.println("Digite os números:");
        for (int i = 0; i < num; i ++) {
            numeros[i] = input.nextFloat();
        }
        System.out.println("Digite as categorias em ordem:");
        for (int i = 0; i < ndois+1; i ++) {
            categorias[i] = input.nextFloat();
        }
        
        histograma = histograma(numeros, categorias);
        for (int i = 0; i < ndois; i ++) {
            System.out.println("Porcentagem de " + categorias[i] + " à " + 
                    categorias[i + 1] + ": " + histograma[i]);
        }
    }
    
    public static float[] histograma(float[] numeros, float[] categorias) {
        int len = categorias.length - 1;
        int len2 = numeros.length;
        float hist[] = new float[len];
        for (int i = 0; i < len; i++) {
            hist[i] = 0;
        }
        for (int i = 0; i < len2; i++) {
            int cat = categoria(numeros[i], categorias);
            if (cat != -1) {
                hist[cat] += 1;
            }
        }
        for (int i = 0; i < len; i++) {
            hist[i] = hist[i] * 100 / len2;
        }
        return hist;
    }
    
    public static int categoria(float numero, float[] categorias) {
        int len = categorias.length;
        for (int i = 0; i < len-1; i++) {
            if ((numero >= categorias[i]) && (numero < categorias[i+1]) ) {
                return i;
            }
        }
        return -1;
    }
}
