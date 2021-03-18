package uff.ic.lleme.tcc00328.s20202.exercicios.exercicio20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.*;

public class LuanPeixotoJardim {
    
    public static String quartos_texto = "src/main/java/uff/ic/lleme/tcc00328/s20202/exercicios/"
            + "exercicio20/quartos.txt";
    public static String reservas_texto = "src/main/java/uff/ic/lleme/tcc00328/s20202/exercicios/"
            + "exercicio20/reservas.txt";
    public static String hospedagens_com_reserva_texto = "src/main/java/uff/ic/lleme/tcc00328/s20202/exercicios/"
            + "exercicio20/hospedagens_com_reserva.txt";
    public static String hospedagens_sem_reserva_texto = "src/main/java/uff/ic/lleme/tcc00328/s20202/exercicios/"
            + "exercicio20/hospedagens_sem_reserva.txt";
    
    
    
    public static Registro reg = new Registro();
    
    public static void main(String[] args) {
        carregarQuartos(quartos_texto, reg);
        carregarReservas(reservas_texto, reg);
        carregarHospedagens(hospedagens_com_reserva_texto, reg);
        carregarHospedagensSemReserva(hospedagens_sem_reserva_texto, reg);
        encerrarHospedagem(reg, "1", "12/03/21-20/03/21", "Luan Peixoto Jardim");
        
    }
    
    
    public static void carregarQuartos(String nome_arq, Registro reg) {
        int atual = 0;
        try {
            File quartotxt = new File(nome_arq);
            Scanner leitor = new Scanner(quartotxt);
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] atributos = linha.split("#");
                Quarto quarto = new Quarto(atributos[0], atributos[1], Integer.parseInt(atributos[2]));
                reg.getQuartos()[atual] = quarto;
                atual++;
            }
            leitor.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static int compararPeriodos(String p1, String p2) {
        String[] data1 = p1.split("-");
        String[] data2 = p2.split("-");
        String[] inicio1 = data1[0].split("/");
        String[] fim1 = data1[1].split("/");
        String[] inicio2 = data2[0].split("/");
        String[] fim2 = data2[1].split("/");
        if (Integer.parseInt(inicio2[2]) > Integer.parseInt(fim1[2])) {
            return 0;
        }
        else if (Integer.parseInt(inicio2[2]) == Integer.parseInt(fim1[2])) {
            if (Integer.parseInt(inicio2[1]) > Integer.parseInt(fim1[1])) {
                return 0;
            }
            else if (Integer.parseInt(inicio2[1]) == Integer.parseInt(fim1[1])) {
                if (Integer.parseInt(inicio2[0]) >= Integer.parseInt(fim1[0])) {
                return 0;
                }
            }
        }
        if (Integer.parseInt(fim2[2]) < Integer.parseInt(inicio1[2])) {
            return 0;
        }
        else if (Integer.parseInt(fim2[2]) < Integer.parseInt(inicio1[2])) {
            if (Integer.parseInt(fim2[1]) < Integer.parseInt(inicio1[1])) {
                return 0;
            }
            else if (Integer.parseInt(fim2[1]) == Integer.parseInt(inicio1[1])) {
                if (Integer.parseInt(fim2[0]) <= Integer.parseInt(inicio1[0])) {
                return 0;
                }
            }
        }
        return 1;
    }
    
    public static int checarVagas(Registro reg, Reserva reserva, int i) {
        int pessoas = 0;
        for (int j = 0; reg.getReservas()[j] != null; j++) {
            if (reg.getReservas()[j].getQuarto_numero().equals(reg.getQuartos()[i].getNumero())) {
                if (compararPeriodos(reg.getReservas()[j].getPeriodo(), reserva.getPeriodo()) == 1) {
                    pessoas += reg.getReservas()[j].getQtd_hospedes();
                }
            }
        }
        if (pessoas + reserva.getQtd_hospedes() <= reg.getQuartos()[i].getCapacidade_max()) {
            return 1;
        }
        else {
            return 0;
        }
    }
            
    public static void carregarReservas(String nome_arq, Registro reg) {
        System.out.println("Carregando reservas...\n");
        int f = 0;
        int atual;
        for (atual = 0; reg.getReservas()[atual] != null; atual ++);
        int i;
        try {
            File reservatxt = new File(nome_arq);
            Scanner leitor = new Scanner(reservatxt);
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] atributos = linha.split("#");
                Cliente cliente = new Cliente(atributos[4], atributos[5], atributos[6]);
                Reserva reserva = new Reserva(atributos[0], atributos[1], atributos[2], 
                        Integer.parseInt(atributos[3]), cliente);
                for (i = 0; reg.getQuartos()[i] != null; i ++) {
                    if ((reg.getQuartos()[i].getTipo().equals(reserva.getQuarto_tipo()))
                            && (reg.getQuartos()[i].getCapacidade_max() >= reserva.getQtd_hospedes())) {
                        
                        if (checarVagas(reg, reserva, i) == 1) {
                            reserva.setQuarto_numero(reg.getQuartos()[i].getNumero());
                            reg.getReservas()[atual] = reserva;
                            atual++;
                            f = 1;
                            break;
                        }
                    }
                }
                if (f == 1) {
                    System.out.println("Reserva " + reserva.getReserva_numero() + " realizada.");
                    f = 0;
                }
                else {
                    System.out.println("Não há espaço para a reserva número " + reserva.getReserva_numero());
                }
            }
            leitor.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("--------------------------------------------\n");
    }
    
    public static void carregarHospedagens(String nome_arq, Registro reg) {
        System.out.println("Carregando hospedagens reservadas...\n");
        int atual;
        for (atual = 0; reg.getHospedagens()[atual] != null; atual ++);
        int i;
        try {
            File hospedagemtxt = new File(nome_arq);
            Scanner leitor = new Scanner(hospedagemtxt);
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] atributos = linha.split("#");
                Hospedagem hospedagem = new Hospedagem(atributos[4], 
                        atributos[5], atributos[6], atributos[7]);
                for (i = 0; reg.getReservas()[i] != null; i ++) {
                    if (reg.getReservas()[i].getReserva_numero().equals(atributos[0])) {
                        hospedagem.setPeriodo(reg.getReservas()[i].getPeriodo());
                        hospedagem.setQuarto(reg.getReservas()[i].getQuarto_numero());
                        hospedagem.setQtd_hospedes(reg.getReservas()[i].getQtd_hospedes());
                        hospedagem.setCliente(reg.getReservas()[i].getCliente());
                        reg.getHospedagens()[atual] = hospedagem;
                        System.out.println("Hospedagem reservada de " + hospedagem.getCliente().getNome() + " realizada.");
                        atual ++;
                        break;
                    }
                }
            }
            leitor.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("--------------------------------------------\n");
    }
    
    public static int checarVagasH(Registro reg, Hospedagem hospedagem, int i) {
        int pessoas = 0;
        for (int j = 0; reg.getHospedagens()[j] != null; j++) {
            if (reg.getHospedagens()[j].getQuarto().equals(reg.getQuartos()[i].getNumero())) {
                if (compararPeriodos(reg.getHospedagens()[j].getPeriodo(), hospedagem.getPeriodo()) == 1) {
                    pessoas += reg.getHospedagens()[j].getQtd_hospedes();
                }
            }
        }
        if (pessoas + hospedagem.getQtd_hospedes() <= reg.getQuartos()[i].getCapacidade_max()) {
            return 1;
        }
        else {
            return 0;
        }
    }
    
    
    public static void carregarHospedagensSemReserva(String nome_arq, Registro reg) {
        System.out.println("Carregando hospedagens sem reservas...\n");
        int f = 0;
        int atual;
        for (atual = 0; reg.getHospedagens()[atual] != null; atual ++);
        int i;
        try {
            File hosptxt = new File(nome_arq);
            Scanner leitor = new Scanner(hosptxt);
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] atributos = linha.split("#");
                Cliente cliente = new Cliente(atributos[3], atributos[4], atributos[5]);
                Hospedagem hospedagem = new Hospedagem(atributos[6], atributos[7], 
                        atributos[8], atributos[9]);
                hospedagem.setPeriodo(atributos[0]);
                hospedagem.setQuarto_tipo(atributos[1]);
                hospedagem.setQtd_hospedes(Integer.parseInt(atributos[2]));
                hospedagem.setCliente(cliente);
                
                for (i = 0; reg.getQuartos()[i] != null; i ++) {
                    if ((reg.getQuartos()[i].getTipo().equals(hospedagem.getQuarto_tipo()))
                            && (reg.getQuartos()[i].getCapacidade_max() >= hospedagem.getQtd_hospedes())) {
                        if (checarVagasH(reg, hospedagem, i) == 1) {
                            hospedagem.setQuarto(reg.getQuartos()[i].getNumero());
                            reg.getHospedagens()[atual] = hospedagem;
                            atual++;
                            f = 1;
                            break;
                        }
                    }
                }
                if (f == 1) {
                    System.out.println("Hospedagem sem reserva de " + hospedagem.getCliente().getNome() + " realizada.");
                    f = 0;
                }
                else {
                    System.out.println("Não há vagas para hospedagem sem reserva de " + hospedagem.getCliente().getNome() + ".");
                }
            }
            leitor.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("--------------------------------------------\n");
    }
    
    public static void encerrarHospedagem(Registro reg, String quarto, String periodo, String nome) {
        System.out.println("Hospedagem de " + nome + " no quarto " + quarto + " em " + periodo + " encerrada.\n");
        int i, f = 0;
        for (i = 0; reg.getHospedagens()[i] != null; i++) {
            if ((reg.getHospedagens()[i].getPeriodo().equals(periodo)) && 
                    (reg.getHospedagens()[i].getQuarto().equals(quarto)) && 
                    (reg.getHospedagens()[i].getCliente().getNome().equals(nome))) {
                f = 1;
            }
            if (f == 1) {
                reg.getHospedagens()[i] = reg.getHospedagens()[i+1];
            }
        }
    }
    
}
