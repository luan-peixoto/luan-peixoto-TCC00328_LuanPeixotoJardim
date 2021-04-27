package uff.ic.lleme.tcc00328.s20202.exercicio.tutorialOOCont.LuanPeixotoJardim;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SistemaAcademico {

    public static Aluno[] alunos = new Aluno[10];
    public static Disciplina[] disciplinas = new Disciplina[10];
    public static Inscricao[] inscricoes = new Inscricao[10];
    public static Turma[] turmas = new Turma[20];
    public static String alunos_texto = "src/main/java/uff/ic/lleme/tcc00328/s20202/exercicios/"
            + "tutorialOOCont/LuanPeixotoJardim/alunos.txt";
    public static String disciplinas_texto = "src/main/java/uff/ic/lleme/tcc00328/s20202/exercicios/"
            + "tutorialOOCont/LuanPeixotoJardim/disciplinas.txt";
    public static String inscricoes_texto = "src/main/java/uff/ic/lleme/tcc00328/s20202/exercicios/"
            + "tutorialOOCont/LuanPeixotoJardim/inscricoes.txt";
    public static String turmas_texto = "src/main/java/uff/ic/lleme/tcc00328/s20202/exercicios/"
            + "tutorialOOCont/LuanPeixotoJardim/turmas.txt";

    public static void main(String[] args) {

        carregarAlunos(alunos_texto);
        carregarDisciplinas(disciplinas_texto);
        carregarTurmas(turmas_texto);
        carregarInscricoes(inscricoes_texto);
        informarNotasDeAlunos();

        for (int i = 0; i < 10; i++) {
            if (alunos[i] == null)
                break;
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

    public static void carregarTurmas(String nomeArquivo) {
        int atual = 0;
        try {
            File disctxt = new File(nomeArquivo);
            Scanner leitor = new Scanner(disctxt);
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] atributos = linha.split("#");
                Disciplina disciplina = null;
                for (int i = 0; i < 10; i++) {
                    if (disciplinas[i] == null) // limite do vetor
                        break;
                    if (disciplinas[i].getCodigo().equals(atributos[1])) {
                        disciplina = disciplinas[i];
                        break;
                    }
                }
                Turma turma = new Turma(atributos[0], disciplina, atributos[2], atributos[3]);
                turmas[atual] = turma;
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
                Aluno nome_aluno = null;
                Turma turma = null;
                for (i = 0; i < 10; i++) {
                    if (alunos[i] == null) // limite do vetor
                        break;
                    if (alunos[i].getMatricula().equals(atributos[1])) {
                        nome_aluno = alunos[i];
                        break;
                    }
                }
                for (i = 0; i < 20; i++) {
                    if (turmas[i] == null) // limite do vetor
                        break;
                    if (turmas[i].getCodigo().equals(atributos[4])
                            && turmas[i].getDisciplina().getCodigo().equals(atributos[0])) {
                        turma = turmas[i];
                        break;
                    }
                }
                Inscricao inscricao = new Inscricao(nome_aluno, turma, atributos[2], atributos[3]);
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
            if (inscricoes[i] == null) // limite do vetor
                break;
            for (j = 0; j < 3; j++)
                inscricoes[i].getNotas()[j] = (float) (0 + Math.random() * (10 - 0));
            for (k = 0; k < 10; k++) {
                if (alunos[k] == null) // limite do vetor
                    break;
                if (alunos[k].getNome().equals(inscricoes[i].getAluno().getNome()))
                    for (l = 0; l < 10; l++)
                        if (alunos[k].getInscricoes()[l] == null) {
                            alunos[k].getInscricoes()[l] = inscricoes[i];
                            break;
                        } // se não tiver espaço não vai botar
            }
        }
    }

    public static float calcularMedias(Inscricao insc) {
        return (insc.getNotas()[0] + insc.getNotas()[1] + insc.getNotas()[2]) / 3;
    }

    public static void imprimirInfoAluno(Aluno alunos) {
        System.out.println("Aluno: " + alunos.getNome());
        System.out.println("CPF: " + alunos.getCpf());
        System.out.println("Matrícula: " + alunos.getMatricula());
        System.out.println("Unidade: " + alunos.getUnidade() + "\n");
        System.out.println("Inscrições: \n");
        
        for (int j = 0; j < 10; j++) {
            if (alunos.getInscricoes()[j] == null)
                break;
            float media = calcularMedias(alunos.getInscricoes()[j]);
            System.out.println(alunos.getInscricoes()[j].getTurma().getDisciplina().getSigla()
                    + " - " + alunos.getInscricoes()[j].getTurma().getDisciplina().getNome()
                    + " - " + alunos.getInscricoes()[j].getTurma().getDisciplina().getCodigo());
            System.out.println("Turma: " + alunos.getInscricoes()[j].getTurma().getCodigo()
                    + " - " + alunos.getInscricoes()[j].getTurma().getHorario() + " - "
                    + alunos.getInscricoes()[j].getTurma().getSemestre());
            System.out.println("Data de matrícula: " + alunos.getInscricoes()[j].getDataMatricula()
                    + "  Data de cancelamento: " + alunos.getInscricoes()[j].getDataCancelamento());
            System.out.println("Notas - P1: " + String.format("%.2f", alunos.getInscricoes()[j].getNotas()[0])
                    + " P2: " + String.format("%.2f", alunos.getInscricoes()[j].getNotas()[1]) + " P3: "
                    + String.format("%.2f", alunos.getInscricoes()[j].getNotas()[2]));
            System.out.println("Media: " + String.format("%.2f", media) + '\n');
        }
        System.out.println("---------------------------------------------------\n");
    }

}
