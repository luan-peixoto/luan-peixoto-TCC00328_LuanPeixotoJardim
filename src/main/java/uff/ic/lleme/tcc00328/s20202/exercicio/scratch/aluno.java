package uff.ic.lleme.tcc00328.s20202.exercicio.scratch;

public class Aluno extends Pessoa {
   
    protected int nota;
    private int cpf;
    public static int idade = 1; // static faz com que todos os objetos da classe tenham o mesmo valor em "pais".
    public static String pais;
    
    private int aux;
    
    public Aluno(int nota) {
        nome = null;
        this.nota = nota;
        cpf = 32;
        idade = calc_idade();
    }
    
    public void funcao() {
        nota = 7;
    }
    
    public void cpsf() {
        cpf = 13;
    }
    
    
    public static int calc_idade() { 
        // static faz com que a funçao calc_idade() possa ser usada sem definir uma classe para ela
        // static é como se fosse uma funçao que altera valores de UMA instancia global da classe
        Aluno.idade = 18;
        return Aluno.idade;
    }
}

   


// private são variaveis q so podem ser usadas na classe, em outros programas não dá
// public deixa publico pra qualquer programa de qualquer pacote usar usando import
// sem nada deixa publica apenas pra programas que estejam no mesmo pacote

// como "pais" não é public, um programa em outro pacote não pode acessa-lo (outro_pacote), enquanto...
// ...o programa main por estar no mesmo pacote, pode

// ao criar uma funcao dentro da classe, o "this." serve para especificar que a variavel...
// ...é a da classe, se houver uma variavel na funcao com mesmo nome da classe, ele vai priorizar...
// ...a da funcao

// o metodo (funcao) criador é um metodo com mesmo nome da classe, ele inicia a classe...
// ...com variaveis pre definidas