package aula022;

public class Main {
    public static void main(String[] args) {
        int[] idades = {34, 65, 12, 85, 10};
        String[] nomes = {"Guilherme", "João", "Marcos"};
        // 0, 1, 2, 3, 4



        //System.out.println(idades[idades.length - 1]);
//        for(int i = 0; i < idades.length; i++){
//            System.out.println(idades[i]);
//        }

        for (int idade : idades) {
            System.out.println(idade);
        }

        for(String nome : nomes) {
            System.out.println(nome);
        }


    }
}
