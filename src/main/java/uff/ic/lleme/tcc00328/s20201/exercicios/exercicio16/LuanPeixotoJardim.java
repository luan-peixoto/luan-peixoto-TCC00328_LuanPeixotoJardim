package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio16;
import java.util.Scanner;

public class LuanPeixotoJardim {
    
    public static int num;
    public static int[][] matriz;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de times: ");
        num = input.nextInt();
        matriz = new int[num][5];
        System.out.println("Digite a pontuação dos times em ordem: ");
        for (int i = 0; i < num; i ++) {
            for (int j = 0; j < 5; j ++) {
                matriz[i][j] = input.nextInt();
            }
        }
        int lider = lider(matriz, num);
        System.out.println("O vencedor é o time " + lider + ".");
        
    }
    
    public static int lider(int[][] matriz, int n) {
        int times[] = new int[n];
        for (int i = 0; i < 5; i ++) {
            int maior = -1;
            for (int j = 0; j < n; j ++) {
                if ((matriz[j][i] > maior) && (times[j] == 0)) {
                    maior = matriz[j][i];
                }
            }
            for (int j = 0; j < n; j ++) {
                if (matriz[j][i] < maior)  {
                    times[j] = -1;
                }
            }
        }
        for (int i = 0; i < n; i ++) {
            if (times[i] == 0) {
                return i;
            }
        }
        return 1;
    }
}
