public class Main {

    public static void main(String[] args) {

        // Criando um objeto Produto através do construtor.
        Produto notebook = new Produto("Notebook", 3500.00, 10);

        // Exibindo as informações do produto.
        // Como os atributos são private, utilizamos os getters.
        System.out.println("Produto: " + notebook.getNome());
        System.out.println("Preço: R$ " + notebook.getPreco());
        System.out.println("Estoque: " + notebook.getEstoque());

        // Alterando o preço através do setter.
        // O método verifica se o valor informado é válido.
        notebook.setPreco(3200.00);

        System.out.println("\nNovo preço: R$ " + notebook.getPreco());

        // Realizando uma venda de 3 unidades.
        notebook.vender(3);

        System.out.println("Estoque restante: " + notebook.getEstoque());

        // ==========================
        // Exemplos de validação
        // ==========================

        // Tentando definir um preço inválido.
        notebook.setPreco(-500);

        // Tentando vender mais produtos do que existem em estoque.
        notebook.vender(20);

        // O estoque permanece o mesmo, pois a venda não foi realizada.
        System.out.println("Estoque final: " + notebook.getEstoque());

        /*
         * As linhas abaixo NÃO compilam, pois os atributos são privados.
         * Descomente para testar.
         */

        // notebook.preco = 100;
        // notebook.estoque = 999;
        // notebook.nome = "Outro Notebook";

    }

}
