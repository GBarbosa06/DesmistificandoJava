import java.util.Scanner;

public class Aula004 {
    public static void main(String[] args) {
        // Leia o nome e idade da pessoa e imprima: "[nome] tem [idade] anos"

        //Leia 3 números double e calcule a média

        Scanner sc = new Scanner(System.in);


        System.out.print("Digite um número: ");
        double n1 = sc.nextDouble();

        System.out.println("---------------------------");

        System.out.print("Digite mais um número: ");
        double n2 = sc.nextDouble();

        System.out.println("---------------------------");

        System.out.print("Digite mais um número: ");
        double n3 = sc.nextDouble();

        double soma = n1 + n2 + n3;
        System.out.println("A média é: " + (soma/3));

        sc.close();
    }

}
