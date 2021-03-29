package uff.ic.lleme.tcc00328.s20202.exercicios.exercicio21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LuanPeixotoJardim {
    
    public static String cursos_texto = "src/main/java/uff/ic/lleme/tcc00328/s20202/exercicios/"
            + "exercicio21/cursos.txt";
    public static String disciplinas_texto = "src/main/java/uff/ic/lleme/tcc00328/s20202/exercicios/"
            + "exercicio21/disciplinas.txt";
    public static String ofertas_texto = "src/main/java/uff/ic/lleme/tcc00328/s20202/exercicios/"
            + "exercicio21/ofertas.txt";
    public static String turmas_texto = "src/main/java/uff/ic/lleme/tcc00328/s20202/exercicios/"
            + "exercicio21/turmas.txt";
   public static String alunos_texto = "src/main/java/uff/ic/lleme/tcc00328/s20202/exercicios/"
            + "exercicio21/alunos.txt";
   public static String matriculas_texto = "src/main/java/uff/ic/lleme/tcc00328/s20202/exercicios/"
            + "exercicio21/matriculas.txt";
   
   
    public static SRA Sistema = new SRA();
    
    public static void main(String[] args) {
        
        carregarCursos(cursos_texto, Sistema);
        carregarDisciplinas(disciplinas_texto, Sistema);
        carregarOfertas(ofertas_texto, Sistema);
        carregarTurmas(turmas_texto, Sistema);
        carregarAlunos(alunos_texto, Sistema);
        carregarMatriculas(matriculas_texto, Sistema);
        
        realizarMatricula(Sistema);
        alterarMatricula(Sistema);
        consultarAlunos(Sistema);
        
    }
    
    
    public static void carregarCursos(String nome_arq, SRA sis) {
        System.out.println("Carregando cursos...\n");
        try {
            File cursotxt = new File(nome_arq);
            Scanner leitor = new Scanner(cursotxt);
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] atributos = linha.split("#");
                Curso curso = new Curso(atributos[0], atributos[1]);
                sis.addCurso(curso);
                System.out.println("Curso " + curso.getNome() + " adicionado.");
            }
            leitor.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("--------------------------------------------\n");
    }
    
    public static void carregarDisciplinas(String nome_arq, SRA sis) {
        System.out.println("Carregando disciplinas...\n");
        try {
            File disciplinatxt = new File(nome_arq);
            Scanner leitor = new Scanner(disciplinatxt);
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] atributos = linha.split("#");
                Disciplina disciplina = new Disciplina(atributos[0], atributos[1], atributos[2]);
                sis.addDisciplina(disciplina);
                System.out.println("Disciplina " + disciplina.getNome() + " adicionada.");
            }
            leitor.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("--------------------------------------------\n");
    }
    
    public static void carregarOfertas(String nome_arq, SRA sis) {
        System.out.println("Carregando ofertas...\n");
        try {
            File disciplinatxt = new File(nome_arq);
            Scanner leitor = new Scanner(disciplinatxt);
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] atributos = linha.split("#");
                Oferta oferta = new Oferta(atributos[0]);
                oferta.setCurso(sis.getCurso(atributos[1]));
                oferta.setDisciplina(sis.getDisciplina(atributos[2]));
                sis.getCurso(atributos[1]).addDisciplina(oferta);
                sis.getDisciplina(atributos[2]).addCurso(oferta);
                sis.addOferta(oferta);
            }
            leitor.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        System.out.println("Ofertas carregadas.");
        System.out.println("--------------------------------------------\n");
    }
    
    public static void carregarTurmas(String nome_arq, SRA sis) {
        System.out.println("Carregando turmas...\n");
        try {
            File cursotxt = new File(nome_arq);
            Scanner leitor = new Scanner(cursotxt);
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] atributos = linha.split("#");
                Turma turma = new Turma(atributos[0], atributos[1]);
                turma.setOferta(sis.getOferta(atributos[2], atributos[3]));
                sis.addTurma(turma);
                System.out.println("Turma " + turma.getSigla() + " - " + 
                        turma.getOferta().getDisciplina().getNome() + " adicionada.");
            }
            leitor.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("--------------------------------------------\n");
    }
    
    public static void carregarAlunos(String nome_arq, SRA sis) {
        System.out.println("Carregando alunos...\n");
        try {
            File cursotxt = new File(nome_arq);
            Scanner leitor = new Scanner(cursotxt);
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] atributos = linha.split("#");
                Aluno aluno = new Aluno(atributos[0], atributos[1], atributos[2], atributos[3]);
                sis.addAluno(aluno);
                System.out.println("Aluno " + aluno.getNome() + " registrado.");
            }
            leitor.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("--------------------------------------------\n");
    }
    
    public static void carregarMatriculas(String nome_arq, SRA sis) {
        System.out.println("Carregando matriculas...\n");
        try {
            File cursotxt = new File(nome_arq);
            Scanner leitor = new Scanner(cursotxt);
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] atributos = linha.split("#");
                Matricula matricula = new Matricula();
                matricula.setAluno(sis.getAluno(atributos[0]));
                matricula.setTurma(sis.getTurma(atributos[1], atributos[2], atributos[3]));
                
                if ("preferencial".equals(atributos[4])) {
                    sis.getAluno(atributos[0]).addMatricula1(matricula);
                }
                else {
                    sis.getAluno(atributos[0]).addMatricula2(matricula);
                }
                sis.getTurma(atributos[1], atributos[2], atributos[3]).addMatricula(matricula);
                sis.addMatricula(matricula);
            }
            leitor.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Matriculas carregadas.");
        System.out.println("--------------------------------------------\n");
    }
    
    public static void realizarMatricula(SRA sis) {
        String linha;
        String sigla;
        String curso;
        String disciplina;
        Scanner input = new Scanner(System.in);
        Aluno aluno;
        Turma turma;
        System.out.println("Deseja realizar matricula? S/N");
        linha = input.nextLine();
        if ("S".equals(linha)) {
            System.out.println("Digite o nome do aluno:");
            linha = input.nextLine();
            aluno = sis.getAluno(linha);
            System.out.println("Digite a sigla da turma:");
            sigla = input.nextLine();
            System.out.println("Digite o nome do curso:");
            curso = input.nextLine();
            System.out.println("Digite o nome da disciplina:");
            disciplina = input.nextLine();
            turma = sis.getTurma(sigla, curso, disciplina);
            Matricula matricula = new Matricula();
            matricula.setAluno(aluno);
            matricula.setTurma(turma);
            System.out.println("Disciplina e preferencial? S/N");
            linha = input.nextLine();
            if ("S".equals(linha)) {
                aluno.addMatricula1(matricula);
            }
            else {
                aluno.addMatricula2(matricula);
            }
            turma.addMatricula(matricula);
            System.out.println("Matricula realizada.");
            System.out.println("--------------------------------------\n");
        }
      
    }
    
    
    public static void alterarMatricula(SRA sis) {
        String linha;
        String sigla;
        String disciplina;
        Scanner input = new Scanner(System.in);
        Aluno aluno;
        String pref;
        Turma turma;
        Matricula matricula;
        System.out.println("Deseja alterar matricula? S/N");
        linha = input.nextLine();
        if ("S".equals(linha)) {
            System.out.println("Digite o nome do aluno:");
            linha = input.nextLine();
            aluno = sis.getAluno(linha);
            System.out.println("Digite a sigla da turma:");
            sigla = input.nextLine();
            System.out.println("Digite o nome da disciplina:");
            disciplina = input.nextLine();
            System.out.println("Matricula e preferencial? S/N");
            pref = input.nextLine();
            if ("S".equals(pref)) {
                matricula = aluno.getMatricula(1, sigla, disciplina);
            }
            else {
                matricula = aluno.getMatricula(0, sigla, disciplina);
            }
            System.out.println("Deseja encerrar matricula? S/N");
            linha = input.nextLine();
            if ("S".equals(linha)) {
                if ("S".equals(pref)) {
                    aluno.removeMatricula(1, matricula);
                }
                else {
                    aluno.removeMatricula(0, matricula);
                }
            }
        }
             
    }
    
    public static void consultarAlunos(SRA sis){
        Scanner input = new Scanner(System.in);
        String linha;
        String disciplina;
        String curso;
        System.out.println("Deseja consultar alunos? S/N");
        linha = input.nextLine();
        if ("S".equals(linha)) {
            System.out.println("Digite o nome da disciplina:");
            disciplina = input.nextLine();
            System.out.println("Digite o nome do curso:");
            curso = input.nextLine();
            System.out.println("\nAlunos matriculados em " + disciplina + ":");
            
            for (Matricula matricula : sis.getMatriculas() ) {
                if ((matricula.getTurma().getOferta().getCurso().getNome().equals(curso)) &&
                      (matricula.getTurma().getOferta().getDisciplina().getNome().equals(disciplina))  ) {
                    System.out.println(matricula.getAluno().getNome());
                }
            }
            
            System.out.println("----------------------------------------------\n");
            
        }
    }
    
    
    
    
}
