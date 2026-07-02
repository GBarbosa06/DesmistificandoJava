public class Produto {

    // Atributos privados:
    // Só podem ser acessados diretamente dentro da própria classe.
    private String nome;
    private double preco;
    private int estoque;

    // Construtor responsável por inicializar o objeto.
    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    // Getter do nome.
    // Permite que outras classes consultem o nome do produto.
    public String getNome() {
        return nome;
    }

    // Getter do preço.
    public double getPreco() {
        return preco;
    }

    // Getter do estoque.
    public int getEstoque() {
        return estoque;
    }

    // Setter do preço.
    // Só altera o preço se o valor for maior que zero.
    public void setPreco(double preco) {

        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido!");
        }

    }

    // Método responsável por realizar uma venda.
    // O estoque só é reduzido se houver quantidade suficiente.
    public void vender(int quantidade) {

        if (quantidade <= estoque) {
            estoque -= quantidade;
            System.out.println("Venda realizada!");
        } else {
            System.out.println("Estoque insuficiente.");
        }

    }

}
