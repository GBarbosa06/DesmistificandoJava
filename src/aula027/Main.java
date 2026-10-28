package aula027;

import java.util.*;

// Iterator
public class Main {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Bruno");

//        for(String nome : nomes) {
//            if(nome.startsWith("C")){
//                nomes.remove(nome);
//            }
//        }
        // ConcurrentModificationException

        Iterator<String> iterator = nomes.iterator();

        while(iterator.hasNext()){
            String nome = iterator.next();
            if(nome.startsWith("C")){
                iterator.remove();
            }
        }

        // Passando HashMap -> EntrySet
        Map<String,Integer> nomesMap = new HashMap<>();

        nomesMap.put("Guilherme", 20);

        Iterator<Map.Entry<String, Integer>> nomesIterator = nomesMap.
                entrySet().
                iterator();


        System.out.println(nomes);

//        hasNext()
//        next()
//        remove()
    }
}
