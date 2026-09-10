package aula023;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Guilherme");
        nomes.add("Pedro");

        nomes.set(1, "João");
        nomes.remove(0);
//        nomes.clear();
        System.out.println(nomes.get(0));
        System.out.println(nomes.size());
        System.out.println(nomes.contains("João"));
        System.out.println(nomes.contains("Guilherme"));

        for(String nome : nomes) {
            System.out.println(nome);
        }

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));

        }
    }
}

// Collections são estruturas da biblioteca do
// Java usadas para armazenar e manipular grupos de objetos.

// Collection
// List - ArrayList | LinkedList
// Set - HashSet | TreeSet
// Queue - LinkedList | PriorityQueue
// Map - HashMap | TreeMap | ...