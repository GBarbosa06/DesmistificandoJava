package aula028.exercicio07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        // Livros pré-cadastrados para facilitar os testes iniciais
        biblioteca.adicionarLivro(new Livro("Estruturas de Dados e Algoritmos", "Michael Goodrich", "101"));
        biblioteca.adicionarLivro(new Livro("Java: Como Programar", "Paul Deitel", "102"));
        biblioteca.adicionarLivro(new Livro("Padrões de Projetos", "Erich Gamma", "103"));
        biblioteca.adicionarLivro(new Livro("Manual Antigo de Java 1.1", "Autor Legado", "999", true));

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n========== SISTEMA DE BIBLIOTECA ==========");
            System.out.println("1. Cadastrar novo livro");
            System.out.println("2. Consultar livro por ISBN");
            System.out.println("3. Emprestar livro");
            System.out.println("4. Devolver livro");
            System.out.println("5. Listar todos os livros");
            System.out.println("6. Ordenar livros por título");
            System.out.println("7. Remover livros descontinuados (Iterator)");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida! Digite apenas números.");
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Cadastrar Novo Livro ---");
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();

                    System.out.print("ISBN: ");
                    String isbn = scanner.nextLine();

                    System.out.print("Livro descontinuado? (s/n): ");
                    boolean descontinuado = scanner.nextLine().trim().equalsIgnoreCase("s");

                    Livro novoLivro = new Livro(titulo, autor, isbn, descontinuado);
                    biblioteca.adicionarLivro(novoLivro);
                    break;

                case 2:
                    System.out.println("\n--- Consultar Livro por ISBN ---");
                    System.out.print("Digite o ISBN: ");
                    String isbnConsulta = scanner.nextLine().trim();

                    Livro encontrado = biblioteca.consultarPorIsbn(isbnConsulta);
                    if (encontrado != null) {
                        System.out.println("Livro encontrado: " + encontrado);
                    } else {
                        System.out.println("Nenhum livro encontrado com o ISBN '" + isbnConsulta + "'.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Emprestar Livro ---");
                    System.out.print("ISBN do livro: ");
                    String isbnEmprestimo = scanner.nextLine().trim();

                    System.out.print("Tipo de usuário (1 - Aluno | 2 - Professor): ");
                    int tipoUsuario;
                    try {
                        tipoUsuario = Integer.parseInt(scanner.nextLine().trim());
                    } catch (NumberFormatException e) {
                        System.out.println("Tipo inválido!");
                        break;
                    }

                    System.out.print("Nome do usuário: ");
                    String nomeUsuario = scanner.nextLine();

                    System.out.print("Matrícula: ");
                    String matricula = scanner.nextLine();

                    Usuario usuario;
                    if (tipoUsuario == 2) {
                        usuario = new Professor(nomeUsuario, matricula);
                    } else {
                        usuario = new Aluno(nomeUsuario, matricula);
                    }

                    biblioteca.emprestarLivro(isbnEmprestimo, usuario);
                    break;

                case 4:
                    System.out.println("\n--- Devolver Livro ---");
                    System.out.print("ISBN do livro a ser devolvido: ");
                    String isbnDevolucao = scanner.nextLine().trim();

                    biblioteca.devolverLivro(isbnDevolucao);
                    break;

                case 5:
                    System.out.println("\n--- Catálogo de Livros da Biblioteca ---");
                    biblioteca.exibirLivros();
                    break;

                case 6:
                    System.out.println("\n--- Ordenando Livros por Título ---");
                    biblioteca.ordenarPorTitulo();
                    biblioteca.exibirLivros();
                    break;

                case 7:
                    biblioteca.removerDescontinuados();
                    break;

                case 0:
                    System.out.println("\nEncerrando o sistema da biblioteca. Até logo!");
                    break;

                default:
                    System.out.println("Opção inexistente. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
