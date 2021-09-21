package uff.ic.lleme.tcc00328.s20202.exercicio.scratch;


public class main {
    
    public static void main(String[] args) {
        
        int a = Aluno.calc_idade();
        System.out.println(a);
        
        
        System.out.println(Aluno.idade);
        Aluno aluno1 = new Aluno(3);
        Aluno aluno2 = new Aluno(4);
        Aluno aluno3 = new Aluno(5);
        
        aluno1.nome = "arroz";
        aluno2.nome = "parede";
        aluno3.pais = "Brazil";
        
        System.out.println(aluno1.nota);
        aluno1.funcao();
        System.out.println(aluno1.nota);
        
        System.out.println(aluno3.pais);
        
        Pessoa joao = new Pessoa();
    }
    
    
}
