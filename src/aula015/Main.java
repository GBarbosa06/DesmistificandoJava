package aula015;

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Guilherme", 20);

        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());

        p.fazerAniversario();


        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());

    }
}
