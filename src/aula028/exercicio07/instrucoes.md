# Exercício 7 — Sistema de biblioteca (Desafio Final)

- **Dificuldade:** Desafio final
- **Conteúdos:** Integração de POO e Collections.

## Enunciado
Crie um pequeno sistema de biblioteca com as seguintes funcionalidades:

- Uma classe abstrata `Usuario`, com subclasses `Aluno` e `Professor`.
- Uma interface `Emprestavel`, implementada pela classe `Livro`.
- Uma `ArrayList<Livro>` para armazenar os livros.
- Um `HashMap<String, Livro>` para consultar livros pelo ISBN.
- Um método para emprestar e devolver livros.
- Ordenação dos livros por título.
- Remoção de livros descontinuados usando `Iterator`.
- Sobrescrita de `toString()`, `equals()` e `hashCode()` na classe `Livro`, considerando o ISBN para igualdade.

No `main`, cadastre livros, faça consultas, execute empréstimos e devoluções, ordene a lista e remova pelo menos um livro descontinuado.

*Nota:* Não é necessário implementar menus, banco de dados ou interface gráfica.
