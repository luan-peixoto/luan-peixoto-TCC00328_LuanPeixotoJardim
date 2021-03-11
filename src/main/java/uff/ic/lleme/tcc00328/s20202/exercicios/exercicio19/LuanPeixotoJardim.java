package uff.ic.lleme.tcc00328.s20202.exercicios.exercicio19;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
        
public class LuanPeixotoJardim {
    public static String nomes_texto = "src/main/java/uff/ic/lleme/tcc00328/s20202/exercicios/"
            + "exercicio19/nomes.txt";
    
    
    public static Lancador[] vencedores = new Lancador[10];
    public static Lancador[] perdedores = new Lancador[10];
    public static Resultado resultado = new Resultado();
    
    
    public static void main(String[] args) {
        carregarLancadores(nomes_texto);
        carregarResultado(resultado, vencedores, perdedores);
        imprimirResultado(resultado);
    }
    
    public static void carregarLancadores(String arquivo) {
        int vencedor = 0;
        int perdedor = 0;
        try {
            File lanctxt = new File(arquivo);
            Scanner leitor = new Scanner(lanctxt);
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                Lancador lancador = new Lancador(linha);
                int d = 0;
                Dado jogo = new Dado(0,0,0);
                carregarJogada(jogo);
                lancador.getJogadas()[d] = jogo;
                int ponto = jogo.getSoma();
                if (ponto == 7 || ponto == 11 ) {
                    vencedores[vencedor] = lancador;
                    vencedor += 1;
                }
                else if (ponto == 2 || ponto == 3 || ponto == 12) {
                        perdedores[perdedor] = lancador;
                        perdedor += 1;
                }
                else {
                    d += 1;
                    carregarJogada(jogo);
                    while(jogo.getSoma() != ponto && jogo.getSoma() != 7 && d < 10) {
                        carregarJogada(jogo);
                        lancador.getJogadas()[d] = jogo;
                        d += 1;
                    }
                    if (jogo.getSoma() == ponto) {
                        vencedores[vencedor] = lancador;
                        vencedor += 1;
                    }
                    else {
                        perdedores[perdedor] = lancador;
                        perdedor += 1;
                    }
                    
                }
                
            }
            leitor.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        
    }
    
    public static int randint(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
    
    public static void carregarJogada(Dado jogo) {
        jogo.setLancamento_1(randint(1,7));
        jogo.setLancamento_2(randint(1,7));
        jogo.setSoma(jogo.getLancamento_1() + jogo.getLancamento_2());
    }
    
    public static void carregarResultado(Resultado resultado, Lancador[] 
            vencedores, Lancador[] perdedores) {
        resultado.setVencedores(vencedores);
        resultado.setPerdedores(perdedores);
    }
    
    public static void imprimirResultado(Resultado resultado) {
        System.out.println("--------------------------------\n");
        System.out.println("Vencedores:\n");
        for (int i = 0 ; resultado.getVencedores()[i] != null; i ++) {
            System.out.println("Nome: " + resultado.getVencedores()[i].getNome() + 
                    "\nPonto: " + resultado.getVencedores()[i].getJogadas()[0].getSoma() 
                    + "\n------------------------------------");
        }
        System.out.println("\nPerdedores:\n");
        for (int i = 0 ; resultado.getPerdedores()[i] != null; i ++) {
            System.out.println("Nome: " + resultado.getPerdedores()[i].getNome() + 
                    "\nPonto: " + resultado.getPerdedores()[i].getJogadas()[0].getSoma() 
                    + "\n------------------------------------");
        }
    }
    
    
}
