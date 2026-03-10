import java.util.Scanner;

public class Aula008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma nota de 1 a 5: ");
        int nota = sc.nextInt();
        System.out.println("");

        switch (nota) {
            case 1 -> System.out.println("Péssimo");
            case 2 -> System.out.println("Ruim");
            case 3 -> System.out.println("Regular");
            case 4 -> System.out.println("Bom");
            case 5 -> System.out.println("Excelente");
            default -> System.out.println("Nota inválida");
        }
    }
}


/*
* switch (variavel){
* case "X":
*  bloco de codigo...
* break;
* case "Y":
*   bloco...
* break;
*
* default:
*   bloco padrão...
* break;
* }
*
*
* Programa que receba uma nota de 1-5 e imprima:
* 1 -> Péssimo
* 2 -> Ruim
* 3 -> Regular
* 4 -> Bom
* 5 -> Excelente
*
*
*
*
*
*
*
*
*
*
* */