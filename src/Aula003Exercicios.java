/*
 *
 * EX01:
 *  Crie 3 variáveis, escolhendo o melhor tipo: nome, idade e altura
 *  Imprima: "Meu nome é [nome], tenho [idade] anos e [altura]m/cm de altura."
 *  Use os 3 tipos diferentes de print para exibir uma única linha
 *
 *
 *
 * EX02:
 * Cria duas variáveis:
 *
 *   int a = 10;
 *   int b = 20;
 *   Agora imprima o resultado da soma e a concatenação como texto
 *
 *
 * EX03:
 * Use o StringBuilder para montar a frase: "Estou feliz aprendendo Java"
 * Palavra por palavra com o .append()
 *
 *
 * https://www.w3schools.blog/java-stringbuilder
 */

public class Aula003Exercicios {
    public static void main(String[] args) {
//        String nome = "Guilherme";
//        int idade = 20;
//        int altura = 175;
//
//        System.out.print("Meu nome é " + nome);
//        System.out.printf(", tenho %d anos e ", idade);
//        System.out.println(altura + "cm de altura");

//        int a = 10;
//        int b = 20;
//        System.out.println("Soma: " + (a + b));
//        System.out.println("Concatenação: " + a + b);

        StringBuilder sb = new StringBuilder();
        sb.append("Estou");
        sb.append(" feliz");
        sb.append(" aprendendo");
        sb.append(" Java");
        System.out.println(sb);
    }
}
