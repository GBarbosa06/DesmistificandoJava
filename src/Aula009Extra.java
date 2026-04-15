import java.util.Random;
import java.util.Scanner;

public class Aula009Extra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numeroSecreto = rand.nextInt(100) + 1; // 1 a 100
        int tentativa = 0;
        boolean acertou = false;

        while (!acertou) {
            System.out.print("Digite um número entre 1 e 100: ");
            tentativa = sc.nextInt();

            if (tentativa < numeroSecreto) {
                System.out.println("Mais alto!");
            } else if (tentativa > numeroSecreto) {
                System.out.println("Mais baixo!");
            } else {
                System.out.println("Parabéns! Você acertou!");
                acertou = true;
            }
        }

        sc.close();
    }
}
