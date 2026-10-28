package aula028.exercicio07;

public class Aluno extends Usuario {

    public Aluno(String nome, String matricula) {
        super(nome, matricula);
    }

    @Override
    public String getTipo() {
        return "Aluno";
    }
}
