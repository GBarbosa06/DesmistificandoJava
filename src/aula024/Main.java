package aula024;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Set e HashSet
public class Main {
    public static void main(String[] args) {
//        List<String> nomes = new ArrayList<>();
//
//        nomes.add("Guilherme");
////        nomes.add("Guilherme");
//        nomes.add("Qualquer nome...");

        Set<String> nomes = new HashSet<>();
        nomes.add("Guilherme");
        nomes.add("João");
        nomes.add("Maria");

        System.out.println(nomes.add("Qualquer"));
        System.out.println(nomes.add("Guilherme"));


        nomes.remove("Guilherme");
        System.out.println(nomes.contains("Guilherme"));

        System.out.println(nomes.size());
        System.out.println(nomes.isEmpty());

        //System.out.println(nomes);

        for(String nome : nomes) {
            System.out.println(nome);
        }

    }
}

// ArrayList -> Permite duplicados, Possui indice, add(), remove(), contains(), size()
// HashSet -> Não permite duplicados, Não possui indice, add(), remove(), contains(), size()
// Set NÃO mantém a ordem de inserção
// LinkedHashSet e TreeSet também existem