package aula014;

public class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome) {
        this(nome, 0);
    }

    public Produto() {
        this("Produto Genérico", 0);
    }
}
