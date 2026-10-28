package aula028.exercicio04;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void cadastrarProduto(Map<String, Produto> estoque, String codigo, Produto produto) {
        estoque.put(codigo, produto);
        System.out.println("Produto cadastrado com sucesso: [" + codigo + "] " + produto.getNome());
    }

    public static void consultarProduto(Map<String, Produto> estoque, String codigo) {
        Produto produto = estoque.get(codigo);
        if (produto != null) {
            System.out.println("Consulta [" + codigo + "]: " + produto);
        } else {
            System.out.println("Aviso: O código '" + codigo + "' não existe no estoque.");
        }
    }

    public static void atualizarQuantidade(Map<String, Produto> estoque, String codigo, int novaQuantidade) {
        Produto produto = estoque.get(codigo);
        if (produto != null) {
            int qtdAnterior = produto.getQuantidade();
            produto.setQuantidade(novaQuantidade);
            System.out.println("Quantidade do produto [" + codigo + "] atualizada de " + qtdAnterior + " para " + novaQuantidade + ".");
        } else {
            System.out.println("Aviso: Não foi possível atualizar. O código '" + codigo + "' não existe.");
        }
    }

    public static void exibirTodos(Map<String, Produto> estoque) {
        System.out.println("\n--- Lista de Produtos no Estoque ---");
        if (estoque.isEmpty()) {
            System.out.println("O estoque está vazio.");
            return;
        }
        for (Map.Entry<String, Produto> entrada : estoque.entrySet()) {
            System.out.println("Código: " + entrada.getKey() + " -> " + entrada.getValue());
        }
    }

    public static void main(String[] args) {
        Map<String, Produto> estoque = new HashMap<>();

        // 1. Cadastrar produtos
        System.out.println("=== 1. Cadastrando Produtos ===");
        cadastrarProduto(estoque, "P001", new Produto("Teclado Mecânico", 250.00, 15));
        cadastrarProduto(estoque, "P002", new Produto("Mouse Gamer", 120.00, 30));
        cadastrarProduto(estoque, "P003", new Produto("Monitor 24pol", 899.90, 8));

        // 4. Exibir todos os produtos cadastrados
        System.out.println("\n=== 4. Exibindo Todos os Produtos ===");
        exibirTodos(estoque);

        // 2. Consultar um produto pelo código
        System.out.println("\n=== 2. Consultando Produto por Código ===");
        consultarProduto(estoque, "P002");

        // 3. Atualizar sua quantidade
        System.out.println("\n=== 3. Atualizando Quantidade ===");
        atualizarQuantidade(estoque, "P002", 45);
        consultarProduto(estoque, "P002");

        // 5. Informar quando um código não existir
        System.out.println("\n=== 5. Tentando Consultar e Atualizar Código Inexistente ===");
        consultarProduto(estoque, "P999");
        atualizarQuantidade(estoque, "P999", 10);
    }
}
