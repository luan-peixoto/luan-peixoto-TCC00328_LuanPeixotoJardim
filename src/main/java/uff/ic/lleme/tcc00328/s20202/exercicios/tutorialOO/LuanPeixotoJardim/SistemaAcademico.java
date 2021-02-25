package uff.ic.lleme.tcc00328.s20202.exercicios.tutorialOO.LuanPeixotoJardim;

import java.io.File;  
import java.io.FileNotFoundException;
import java.util.Scanner; 
import java.util.concurrent.ThreadLocalRandom;
import java.lang.Math;

public class SistemaAcademico {
    
    public static Aluno[] alunos = new Aluno[10];
    public static Disciplina[] disciplinas = new Disciplina[10];
    public static Inscricao[] inscricoes = new Inscricao[10];
    public static String alunos_texto = "src\\main\\java\\uff\\ic\\lleme\\tcc00328\\s20202\\exercicios\\"
            + "tutorialOO\\LuanPeixotoJardim\\alunos.txt";
    public static String disciplinas_texto = "src\\main\\java\\uff\\ic\\lleme\\tcc00328\\s20202\\exercicios\\"
            + "tutorialOO\\LuanPeixotoJardim\\disciplinas.txt";
    public static String inscricoes_texto = "src\\main\\java\\uff\\ic\\lleme\\tcc00328\\s20202\\exercicios\\"
            + "tutorialOO\\LuanPeixotoJardim\\inscricoes.txt";
    
    public static void main(String[] args) {
        
        carregarAlunos(alunos_texto);
        carregarDisciplinas(disciplinas_texto);    
        carregarInscricoes(inscricoes_texto);
        informarNotasDeAlunos();
        
        
        for (int i = 0; i < 10; i++) {
            if (alunos[i] == null) {
                break;
            }
            imprimirInfoAluno(alunos[i]);
            
        }
        
        
    }
    
    public static void carregarAlunos(String nomeArquivo) {
        int atual = 0;
        try {
            File alunostxt = new File(nomeArquivo);
            Scanner leitor = new Scanner(alunostxt);
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] atributos = linha.split("#");
                Aluno aluno = new Aluno(atributos[3], atributos[0], atributos[1], atributos[2]);
                alunos[atual] = aluno;
                atual += 1;
            }
            leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Deu ruim");
            e.printStackTrace();
        }    
    }
    
    public static void carregarDisciplinas(String nomeArquivo) {
        int atual = 0;
        try {
            File disctxt = new File(nomeArquivo);
            Scanner leitor = new Scanner(disctxt);
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] atributos = linha.split("#");
                Disciplina disciplina = new Disciplina(atributos[0], atributos[2], atributos[1]);
                disciplinas[atual] = disciplina;
                atual += 1;
            }
            leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Deu ruim");
            e.printStackTrace();
        }
    }
    
    public static void carregarInscricoes(String nomeArquivo) {
        int atual = 0;
        int i;
        try {
            File insctxt = new File(nomeArquivo);
            Scanner leitor = new Scanner(insctxt);
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] atributos = linha.split("#");
                String nome_aluno = null;
                Disciplina nome_disciplina = null;
                for (i = 0; i < 10; i++) {
                    if (alunos[i] == null) { // limite do vetor
                        break;
                    }
                    if (alunos[i].matricula.equals(atributos[1])) {
                        nome_aluno = alunos[i].nome;
                        break;
                    } 
                }
                for (i = 0; i < 10; i++) {
                    if (disciplinas[i] == null) { // limite do vetor
                        break;
                    }
                    if (disciplinas[i].codigo.equals(atributos[0])) {
                        nome_disciplina = disciplinas[i];
                        break;
                    }
                }
                Inscricao inscricao = new Inscricao(nome_aluno, nome_disciplina, atributos[2], atributos[3]);
                inscricoes[atual] = inscricao;
                atual += 1;
            }
            leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Deu ruim");
            e.printStackTrace();
        }    
    }
    
    
    public static void informarNotasDeAlunos() {
        int i;
        int j;
        int k;
        int l;
        for (i = 0; i < 10; i++) {
            if (inscricoes[i] == null) { // limite do vetor
                break;
            }
            for (j = 0; j < 3; j++) {
                inscricoes[i].notas[j] = (float)(0 + Math.random() * (10 - 0));
            }
            for (k = 0; k < 10; k++) {
                if (alunos[k] == null) { // limite do vetor
                break;
                }
                if (alunos[k].nome.equals(inscricoes[i].aluno)) {
                   for (l = 0; l < 10; l++) {
                       if (alunos[k].inscricoes[l] == null) {
                           alunos[k].inscricoes[l] = inscricoes[i];
                           break;
                       }    
                       // se não tiver espaço não vai botar
                   } 
                }
            }
        }
    }
    
    public static float calcularMedias(Inscricao insc) {
        return (insc.notas[0] + insc.notas[1] + insc.notas[2]) / 3;
    }
    
    public static void imprimirInfoAluno(Aluno alunos) {
        System.out.println("Aluno: " + alunos.nome);
            System.out.println("CPF: " + alunos.cpf);
            System.out.println("Matrícula: " + alunos.matricula);
            System.out.println("Unidade: " + alunos.unidade + "\n");
            System.out.println("Inscrições: \n");
            for (int j = 0; j < 10; j++) {
                if (alunos.inscricoes[j] == null) {
                    break;
                }
                float media = calcularMedias(inscricoes[j]);
                System.out.println(alunos.inscricoes[j].disciplina.sigla + 
                        " - " + alunos.inscricoes[j].disciplina.nome + 
                        " - " + alunos.inscricoes[j].disciplina.codigo);
                System.out.println("Data de matrícula: " + alunos.inscricoes[j].data_matricula
                + "  Data de cancelamento: " + alunos.inscricoes[j].data_cancelamento);
                System.out.println("Notas - P1: " + String.format("%.2f", alunos.inscricoes[j].notas[0])
                + " P2: " + String.format("%.2f", alunos.inscricoes[j].notas[1]) + " P3: "
                + String.format("%.2f", alunos.inscricoes[j].notas[2]));
                System.out.println("Media: " + String.format("%.2f", media) + '\n');
            }
            System.out.println("---------------------------------------------------\n");
    }
    
}


        
        
        