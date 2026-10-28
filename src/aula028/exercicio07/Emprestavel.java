package aula028.exercicio07;

public interface Emprestavel {
    void emprestar(Usuario usuario);
    void devolver();
    boolean isEmprestado();
}
