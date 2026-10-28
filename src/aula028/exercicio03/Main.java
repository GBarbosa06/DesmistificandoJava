package aula028.exercicio03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // 1. Armazenar cinco livros em uma ArrayList
        List<Livro> listaLivros = new ArrayList<>();

        Livro l1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "978-8595084759");
        Livro l2 = new Livro("1984", "George Orwell", "978-8535914849");
        Livro l3 = new Livro("Dom Casmurro", "Machado de Assis", "978-8594318602");
        Livro l4 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", "978-8522005239");
        Livro l5 = new Livro("Clean Code", "Robert C. Martin", "978-8576082675");

        listaLivros.add(l1);
        listaLivros.add(l2);
        listaLivros.add(l3);
        listaLivros.add(l4);
        listaLivros.add(l5);

        // 2. Exibir os livros usando toString()
        System.out.println("=== 2. Livros na Lista (ArrayList) ===");
        for (Livro livro : listaLivros) {
            System.out.println(livro);
        }

        // 3. equals() e hashCode() foram implementados na classe Livro considerando o ISBN.

        // 4. Criar um HashSet e tentar adicionar livros com ISBN repetido
        System.out.println("\n=== 4. Testando HashSet com ISBN repetido ===");
        Set<Livro> conjuntoLivros = new HashSet<>();

        // Adicionando os livros originais no HashSet
        for (Livro livro : listaLivros) {
            conjuntoLivros.add(livro);
        }

        // Criando um livro com mesmo ISBN de 'Clean Code', porém com título/autor diferentes para teste
        Livro l6Repetido = new Livro("Código Limpo (Edição Especial)", "Uncle Bob", "978-8576082675");
        
        boolean adicionouOriginal = conjuntoLivros.add(l5);
        boolean adicionouRepetido = conjuntoLivros.add(l6Repetido);

        System.out.println("Tentou readicionar l5 (já existente): " + adicionouOriginal);
        System.out.println("Tentou adicionar l6Repetido (mesmo ISBN): " + adicionouRepetido);

        // Também podemos adicionar o repetido na lista para comparar
        listaLivros.add(l6Repetido);

        // 5. Exibir a quantidade de livros na lista e no conjunto
        System.out.println("\n=== 5. Quantidade de livros ===");
        System.out.println("Quantidade na lista (ArrayList): " + listaLivros.size());
        System.out.println("Quantidade no conjunto (HashSet): " + conjuntoLivros.size());
    }
}
