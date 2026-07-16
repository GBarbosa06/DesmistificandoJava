package aula017.funcionarios;

public class Main {
    public static void main(String[] args) {

        Funcionario[] funcionarios = {
                new Designer(),
                new Programador(),
                new Funcionario(),
                new Programador(),
                new Programador(),
                new Designer()
        };

        for (Funcionario funcionario : funcionarios) {
            funcionario.trabalhar();
        }
    }
}
