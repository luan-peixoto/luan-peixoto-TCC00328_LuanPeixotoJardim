package uff.ic.lleme.tcc00328.s20202.exercicio.scratch;


public class main {
    
    public static void main(String[] args) {
        aluno aluno1 = new aluno(3);
        aluno aluno2 = new aluno(4);
        aluno aluno3 = new aluno(5);
        
        aluno1.nome = "arroz";
        aluno2.nome = "parede";
        aluno3.pais = "Brazil";
        
        System.out.println(aluno1.nota);
        aluno1.funcao();
        System.out.println(aluno1.nota);
        
        System.out.println(aluno3.pais);
        
        pessoa joao = new pessoa();
        joao.aluno1.cpf = 3;
        joao.disciplina1.disciplina = "popopopo";
    }
    
    
}
