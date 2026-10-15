package aula026;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Ordenação em Collections
public class Main {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Carlos", 8.5));
        alunos.add(new Aluno("Ana", 9.5));
        alunos.add(new Aluno("Bruno", 5.5));
        alunos.add(new Aluno("Daniel", 5.5));

//        Collections.sort(alunos);

        alunos.sort(
                Comparator.comparing(Aluno::getNota)
                        .thenComparing(Aluno::getNome)
//                        .reversed()
               // Comparator.comparing(aluno -> aluno.getNome())
        );

        System.out.println(alunos);
    }
}


//        List<Integer> notas = new ArrayList<>();
//
//        notas.add(3);
//        notas.add(10);
//        notas.add(8);
//        notas.add(7);
//
//        //Collections.sort(notas);
//
//        // notas.sort(Comparator.reverseOrder());
//        // .naturalOrder()
//
//        System.out.println(notas);


// Comparable - Define ordem natural - é implementado na classe comparada - compareTo()
// Comparator - Define critério de comparação externo - criado fora da classe - compare()