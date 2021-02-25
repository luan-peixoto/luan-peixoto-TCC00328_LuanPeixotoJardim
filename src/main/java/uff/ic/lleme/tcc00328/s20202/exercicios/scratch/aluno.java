package uff.ic.lleme.tcc00328.s20202.exercicios.scratch;

public class aluno {
    
    public String nome;
    int nota;
    int cpf;
    int idade;
    static String pais;
    
    private int aux;
    
    public aluno(int nota) {
        nome = null;
        this.nota = nota;
        cpf = 32;
        idade = calc_idade();
    }
    
    void funcao() {
        nota = 7;
    }
    
    public static int calc_idade() {
        return 0;
    }
}

    
// static faz com que todos os objetos do main tenham o mesmo valor em "pais".

// static faz com que a funçao calc_idade() só possa ser usada na classe, enquanto...
// ...funcao() pode ser usada no programa

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