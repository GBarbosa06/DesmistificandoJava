package aula028.exercicio05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Carlos", 7.5));
        alunos.add(new Aluno("Beatriz", 9.8));
        alunos.add(new Aluno("Eduardo", 6.0));
        alunos.add(new Aluno("Ana", 8.4));
        alunos.add(new Aluno("Daniel", 9.0));

        System.out.println("=== Lista Original ===");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

        // 1. Ordenação por nota, da maior para a menor (decrescente)
        alunos.sort(Comparator.comparing(Aluno::getNota).reversed());

        System.out.println("\n=== Ordenação por Nota (Maior para Menor) ===");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

        // 2. Ordenação por nome, em ordem alfabética
        alunos.sort(Comparator.comparing(Aluno::getNome));

        System.out.println("\n=== Ordenação por Nome (Ordem Alfabética) ===");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
