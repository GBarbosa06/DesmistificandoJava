public class Aula002Exercicios {

    public static void main(String[] args) {
        double salarioBase = 2500.00;
        double bonus = 0.10;
        double desconto = 0.05;

        double salarioComBonus = salarioBase + (salarioBase * bonus);
        double salarioComDescontoAplicadoSobreBonus = salarioComBonus - (salarioComBonus * desconto);
        System.out.println("Salario base: " + salarioBase);
        System.out.println("Salario com bonus: " + salarioComBonus);
        System.out.println("Salario com desconto: " + salarioComDescontoAplicadoSobreBonus);
    }
/* double salarioBase = 2500.00;
 *  double bonus = 0.10; (10%)
 *  double desconto = 0.05; (5%)
 *
 *  Calcule e mostre:
 *  O salário com bônus
 *  O salário com desconto aplicado depois do bônus
 *
 *  Exemplo de saída:
 *  Salário final: 2612.5*/


    /*
     *            -- BLOCO 1 --
     *  Declare uma variável int idade e inicialize com o valor 20.
     *
     *  Declare uma variável double altura e inicialize com 1.75.
     *
     *  Declare uma variável String nome e inicialize com seu nome.
     *
     *  Exiba na tela uma frase no formato:
     *  "Meu nome é [nome], tenho [idade] anos e minha altura é [altura] metros."
     *
     *
     *  int idade = 20;
        double altura = 1.75;
        String nome = "Guilherme";
        System.out.println("Meu nome é " +
                nome + ", tenho " +
                idade +
                " anos e minha altura é " +
                altura +
                " metros.");
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
     *
     *
     *
     *
     *
     *
     * Declare três variáveis do tipo double: nota1, nota2 e nota3.
     * Inicialize com valores à sua escolha e calcule a média das notas.
     * Exiba o resultado formatado assim:
     * "Média final: X.X"
     *
     *  double nota1 = 8.3, nota2 = 6.6, nota3 = 10;
        double soma = nota1 + nota2 + nota3;
        double media = soma/3;
        System.out.println("Média final: " + media);
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
     *
     *
     * Crie variáveis para armazenar:
     *
     *  O número de habitantes de uma cidade;
     *
     *  O nome da cidade;
     *
     *  A temperatura média do dia;
     *
     *  Se está chovendo (verdadeiro/falso).
     *
     *
     * long numeroHabitantes;
        String nomeCidade;
        double temperaturaMedia;
        boolean chovendo;
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
     *
     *
     *
     *
     *
     * Crie variáveis para armazenar:
     *
     *  double salarioBase = 2500.00;
     *  double bonus = 0.10; (10%)
     *  double desconto = 0.05; (5%)
     *
     *  Calcule e mostre:
     *  O salário com bônus
     *  O salário com desconto aplicado depois do bônus
     *
     *  Exemplo de saída:
     *  Salário final: 2612.5
     */














}
