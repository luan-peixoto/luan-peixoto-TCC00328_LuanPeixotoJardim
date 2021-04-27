package uff.ic.lleme.tcc00328.s20202.exercicio.scratch4_collection;
import java.util.*;
import uff.ic.lleme.tcc00328.s20202.exercicio.tutorialOO.LuanPeixotoJardim.Aluno;

public class Main {
    
    
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(433434);
        lista.add(2);
        lista.add(3);
        int c = lista.get(0);
        for (Integer integer : lista) {
            System.out.println(integer);
        }
        System.out.println(c);
        Aluno aluno = new Aluno(null,null,null,null);
        aluno.setCpf("sssss");
        Map<String, Aluno> alunos = new HashMap<>();
        alunos.put(aluno.getCpf(), aluno);
        Aluno aluno2 = alunos.get(aluno.getCpf()); /// iniciar nova variavel 
        // aluno 2 com o cpf de aluno que esta dentro do Map alunos
        System.out.println(aluno2.getCpf());
        for (Aluno aluno3 : alunos.values()) { // pra cada obj Aluno em Map alunos:
            System.out.println(aluno3.getCpf());
        }
        
        generic_class<String> t = new generic_class();
        t.arry[0] = "\n\nccc";
        t.CC = "string";
        System.out.println(t.arry[0] + "  " + c);
        
    }
}
