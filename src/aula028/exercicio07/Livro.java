package aula028.exercicio07;

import java.util.Objects;

public class Livro implements Emprestavel {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean emprestado;
    private Usuario emprestadoPara;
    private boolean descontinuado;

    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.emprestado = false;
        this.emprestadoPara = null;
        this.descontinuado = false;
    }

    public Livro(String titulo, String autor, String isbn, boolean descontinuado) {
        this(titulo, autor, isbn);
        this.descontinuado = descontinuado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Usuario getEmprestadoPara() {
        return emprestadoPara;
    }

    public boolean isDescontinuado() {
        return descontinuado;
    }

    public void setDescontinuado(boolean descontinuado) {
        this.descontinuado = descontinuado;
    }

    @Override
    public boolean isEmprestado() {
        return emprestado;
    }

    @Override
    public void emprestar(Usuario usuario) {
        if (descontinuado) {
            System.out.println("Não é possível emprestar o livro '" + titulo + "' pois ele está descontinuado.");
            return;
        }
        if (emprestado) {
            System.out.println("O livro '" + titulo + "' já está emprestado para " + emprestadoPara.getNome() + ".");
            return;
        }
        this.emprestado = true;
        this.emprestadoPara = usuario;
        System.out.println("Livro '" + titulo + "' emprestado com sucesso para " + usuario.getNome() + " (" + usuario.getTipo() + ").");
    }

    @Override
    public void devolver() {
        if (!emprestado) {
            System.out.println("O livro '" + titulo + "' não está emprestado no momento.");
            return;
        }
        System.out.println("Livro '" + titulo + "' devolvido por " + emprestadoPara.getNome() + " com sucesso.");
        this.emprestado = false;
        this.emprestadoPara = null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(isbn, livro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public String toString() {
        String status = emprestado ? "Emprestado para " + emprestadoPara.getNome() : "Disponível";
        String statusDescontinuado = descontinuado ? " [DESCONTINUADO]" : "";
        return String.format("'%s' por %s (ISBN: %s) - Status: %s%s", titulo, autor, isbn, status, statusDescontinuado);
    }
}
