package aula028.exercicio06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        // Adicionando números pares e ímpares
        numeros.add(10);
        numeros.add(15);
        numeros.add(22);
        numeros.add(33);
        numeros.add(44);
        numeros.add(55);
        numeros.add(68);
        numeros.add(77);
        numeros.add(90);
        numeros.add(99);

        System.out.println("Lista inicial de números: " + numeros);

        // Percorrendo com Iterator para remover com segurança todos os pares
        // (Modificar diretamente a lista dentro de um for-each causaria ConcurrentModificationException)
        Iterator<Integer> iterator = numeros.iterator();

        while (iterator.hasNext()) {
            Integer numero = iterator.next();
            if (numero % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println("Lista final (apenas números ímpares): " + numeros);
    }
}
