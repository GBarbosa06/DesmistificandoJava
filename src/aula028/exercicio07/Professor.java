package aula028.exercicio07;

public class Professor extends Usuario {

    public Professor(String nome, String matricula) {
        super(nome, matricula);
    }

    @Override
    public String getTipo() {
        return "Professor";
    }
}
