package aula024;

import java.util.*;

// Map e hashMap
// HashMap tem como grande funcionalidade a busca eficiente

public class aula025 {
    public static void main(String[] args) {
        List<String> nomesList = new ArrayList<>();
        Set<String> nomesSet = new HashSet<>();
        Map<Integer, String> nomesMap= new HashMap<>();

        nomesList.add("Guilherme");
        nomesList.add("João");
        nomesList.add("Maria");

        nomesSet.add("Guilherme");
        nomesSet.add("João");
        nomesSet.add("Maria");

        nomesMap.put(1, "Guilherme");
        nomesMap.put(2, "João");
        nomesMap.put(3, "Maria");

//        System.out.println(nomesList);
//        System.out.println(nomesSet);
//        System.out.println(nomesMap);

        System.out.println(nomesMap.get(2));

        nomesMap.remove(1);

        System.out.println(nomesMap.size());
        System.out.println(nomesMap.isEmpty());

        for (int chave : nomesMap.keySet()){
            System.out.println(chave);
        }

        for(String nome : nomesMap.values()){
            System.out.println(nome);
        }

        for(Map.Entry<Integer, String> entrada : nomesMap.entrySet()){
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }

//        System.out.println(nomesMap.containsKey(5));
//        System.out.println(nomesMap.containsValue("Guilherme"));

    }
}

// List -> Armazena valores ordenados -> Acesso pelo indice
// Set -> Armazena valores únicos e não ordenados -> não tem indice
// Map -> Armazena chave e valor -> Acesso por chave