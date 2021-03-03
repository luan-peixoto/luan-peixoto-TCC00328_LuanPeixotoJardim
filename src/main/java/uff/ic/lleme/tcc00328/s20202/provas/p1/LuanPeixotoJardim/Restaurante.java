package uff.ic.lleme.tcc00328.s20202.provas.p1.LuanPeixotoJardim;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.*;

public class Restaurante {
    
    public static Prato[] pratos = new Prato[10];
    public static Pedido[] pedidos = new Pedido[10];
    public static String pratos_texto = "src/main/java/uff/ic/lleme/tcc00328/s20202/provas/"
            + "p1/LuanPeixotoJardim/pratos.txt";
    public static String pedidos_texto = "src/main/java/uff/ic/lleme/tcc00328/s20202/provas/"
            + "p1/LuanPeixotoJardim/pedidos.txt";
    
    public static void main(String[] args) {
        carregarPratos(pratos_texto);
        carregarPedidos(pedidos_texto);
        informarPedidos();
        informarPorcentagem();
        
    }
    
    
    public static void carregarPratos(String nomeArquivo) {
        int atual = 0;
        try {
            File pratos_txt = new File(nomeArquivo);
            Scanner leitor = new Scanner(pratos_txt);
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] atributos = linha.split("#");
                Prato prato = new Prato(atributos[0], Float.parseFloat(atributos[1]));
                pratos[atual] = prato;
                atual += 1;
            }
            leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Deu ruim");
            e.printStackTrace();
        }
    }
    
    public static void carregarPedidos(String nomeArquivo) {
        int atual = 0;
        int atualItens = 0;
        int pedidoNumero = 0;
        int i;
        try {
            File pedidos_txt = new File(nomeArquivo);
            Scanner leitor = new Scanner(pedidos_txt);
            Item itens[] = new Item[10];
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] atributos = linha.split("#");
                if (pedidoNumero == Integer.parseInt(atributos[0])) {
                    Prato nome_prato = null;
                    for (i = 0; i < 10; i++) {
                        if (pratos[i] == null) {// limite do vetor
                            break;
                        }
                        if (pratos[i].getNome().equals(atributos[1])) {
                            nome_prato = pratos[i];
                            break;
                        }
                    }
                    Item item = new Item(nome_prato, Integer.parseInt(atributos[2]));
                    itens[atualItens] = item;
                    atualItens += 1;
                }
                else {
                    Pedido pedido = new Pedido(itens);
                    pedidos[atual] = pedido;
                    atual += 1;
                    atualItens = 0;
                    pedidoNumero += 1;
                    itens = new Item[10];
                    
                    if (pedidoNumero == Integer.parseInt(atributos[0])) {
                        Prato nome_prato = null;
                        for (i = 0; i < 10; i++) {
                            if (pratos[i] == null) {// limite do vetor
                                break;
                            }
                            if (pratos[i].getNome().equals(atributos[1])) {
                                nome_prato = pratos[i];
                                break;
                            }
                        }
                        Item item = new Item(nome_prato, Integer.parseInt(atributos[2]));
                        itens[atualItens] = item;
                        atualItens += 1;
                    }
                    
                }
            }
            Pedido pedido = new Pedido(itens);
            pedidos[atual] = pedido;
            leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Deu ruim");
            e.printStackTrace();
        }
    }
    
    
    public static void informarPedidos() {
        int atual = 1;
        int i, j;
        
        for (i = 0; pedidos[i] != null; i++) {
            System.out.println("Pedido " + atual + ":\n");
            float total = 0;
            for (j= 0; pedidos[i].getItens()[j] != null; j++) {
                total += (pedidos[i].getItens()[j].getQuantidade()
                        * pedidos[i].getItens()[j].getPrato().getPreco());
                System.out.println("Prato: " + pedidos[i].getItens()[j].getPrato().getNome() 
                + " | Quantidade: " + pedidos[i].getItens()[j].getQuantidade() + " | Preço: "
                + pedidos[i].getItens()[j].getPrato().getPreco());
            }
            System.out.println("Total: " + total + "\n");
            atual += 1;
        }
        
        System.out.println("---------------------------------------------------\n");
    
    }
    
    public static void informarPorcentagem() {
        int i, j, k;
        int[] pratosQtd = new int[10];
        int pratosTotal = 0;
        
        for (i = 0; pedidos[i] != null; i++) {
            for (j= 0; pedidos[i].getItens()[j] != null; j++) {
                for (k = 0; pratos[k] != null; k++) {
                    if (pratos[k].getNome().equals(pedidos[i].getItens()[j].getPrato().getNome())) {
                        pratosQtd[k] += 1;
                        pratosTotal += 1;
                    }
                }
            }
        }
        
        System.out.println("Porcentagem de pratos pedidos:\n");
        
        for (i = 0; pratos[i] != null; i++) {
            float qtd = pratosQtd[i] * 100 / pratosTotal;
            System.out.println("Prato: " + pratos[i].getNome() + 
                    " | Porcentagem: " + qtd + "%");
        }
        
    }
}
