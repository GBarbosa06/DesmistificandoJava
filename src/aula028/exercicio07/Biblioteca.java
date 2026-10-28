package aula028.exercicio07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Biblioteca {
    private List<Livro> livros;
    private Map<String, Livro> catalogoIsbn;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.catalogoIsbn = new HashMap<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        catalogoIsbn.put(livro.getIsbn(), livro);
        System.out.println("Livro cadastrado na biblioteca: " + livro.getTitulo());
    }

    public Livro consultarPorIsbn(String isbn) {
        return catalogoIsbn.get(isbn);
    }

    public void emprestarLivro(String isbn, Usuario usuario) {
        Livro livro = consultarPorIsbn(isbn);
        if (livro != null) {
            livro.emprestar(usuario);
        } else {
            System.out.println("Livro com ISBN " + isbn + " não encontrado na biblioteca.");
        }
    }

    public void devolverLivro(String isbn) {
        Livro livro = consultarPorIsbn(isbn);
        if (livro != null) {
            livro.devolver();
        } else {
            System.out.println("Livro com ISBN " + isbn + " não encontrado na biblioteca.");
        }
    }

    public void ordenarPorTitulo() {
        livros.sort(Comparator.comparing(Livro::getTitulo));
    }

    public void removerDescontinuados() {
        System.out.println("\nRemovendo livros descontinuados usando Iterator...");
        Iterator<Livro> iterator = livros.iterator();
        while (iterator.hasNext()) {
            Livro livro = iterator.next();
            if (livro.isDescontinuado()) {
                iterator.remove();
                catalogoIsbn.remove(livro.getIsbn());
                System.out.println("Livro descontinuado removido: " + livro.getTitulo() + " (ISBN: " + livro.getIsbn() + ")");
            }
        }
    }

    public void exibirLivros() {
        if (livros.isEmpty()) {
            System.out.println("A biblioteca não possui livros cadastrados.");
            return;
        }
        for (int i = 0; i < livros.size(); i++) {
            System.out.println((i + 1) + ". " + livros.get(i));
        }
    }
}
