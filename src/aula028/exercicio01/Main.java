package aula028.exercicio01;

public class Main {
    public static void main(String[] args) {
        Funcionario dev = new Desenvolvedor("Lucas", 5000.00);
        Funcionario gerente = new Gerente("Mariana", 12000.00);

        System.out.println("=== Funcionários e Bônus ===");
        System.out.println("Funcionário: " + dev.getNome());
        System.out.println("Salário: R$ " + dev.getSalario());
        System.out.println("Bônus (10%): R$ " + dev.calcularBonus());

        System.out.println("-----------------------------");

        System.out.println("Funcionário: " + gerente.getNome());
        System.out.println("Salário: R$ " + gerente.getSalario());
        System.out.println("Bônus (20%): R$ " + gerente.calcularBonus());
    }
}
