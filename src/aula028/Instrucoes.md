# Curso Desmistificando Java — Aula 028: Exercícios Práticos

Este módulo consolida os conceitos fundamentais de Orientação a Objetos (POO) e a API de Collections da linguagem Java
através de 7 exercícios práticos, organizados em pacotes individuais de `exercicio01` a `exercicio07`.

---

## Sumário dos Exercícios

1. [Exercício 1 — Funcionários de uma Empresa (`exercicio01`)](#exercício-1--funcionários-de-uma-empresa)
2. [Exercício 2 — Sistema de Pagamentos (`exercicio02`)](#exercício-2--sistema-de-pagamentos)
3. [Exercício 3 — Cadastro de Livros (`exercicio03`)](#exercício-3--cadastro-de-livros)
4. [Exercício 4 — Controle de Estoque (`exercicio04`)](#exercício-4--controle-de-estoque)
5. [Exercício 5 — Ordenando Alunos (`exercicio05`)](#exercício-5--ordenando-alunos)
6. [Exercício 6 — Removendo Elementos com Iterator (`exercicio06`)](#exercício-6--removendo-elementos-com-iterator)
7. [Exercício 7 — Sistema de Biblioteca (Desafio Final) (`exercicio07`)](#exercício-7--sistema-de-biblioteca)

---

### Exercício 1 — Funcionários de uma empresa
- **Dificuldade:** Fácil
- **Conteúdos:** Encapsulamento, herança, sobrescrita e polimorfismo.
- **Enunciado:**
  Crie uma classe `Funcionario` com os atributos `nome` e `salario`. Depois, crie as classes `Desenvolvedor` e `Gerente`, que herdam de `Funcionario`.
  
  Cada tipo de funcionário deve implementar o método `calcularBonus()` de maneira diferente:
  - **Desenvolvedor:** bônus de 10% do salário.
  - **Gerente:** bônus de 20% do salário.
  
  No `main`, crie funcionários dos dois tipos e exiba seus bônus.

---

### Exercício 2 — Sistema de pagamentos
- **Dificuldade:** Fácil
- **Conteúdos:** Interfaces e polimorfismo.
- **Enunciado:**
  Crie uma interface `FormaPagamento` com o método `pagar(double valor)`.
  
  Implemente essa interface nas classes `Pix` e `Cartao`, exibindo uma mensagem que informe a forma de pagamento e o valor.
  
  No `main`, execute pagamentos usando as duas implementações.

---

### Exercício 3 — Cadastro de livros
- **Dificuldade:** Intermediário
- **Conteúdos:** Classes, `ArrayList`, `toString()`, `equals()` e `hashCode()`.
- **Enunciado:**
  Crie uma classe `Livro` com os atributos `titulo`, `autor` e `isbn`.
  
  1. Armazene cinco livros em uma `ArrayList`.
  2. Exiba os livros usando `toString()`.
  3. Implemente `equals()` e `hashCode()` considerando o ISBN.
  4. Crie um `HashSet` e tente adicionar livros com ISBN repetido.
  5. Exiba a quantidade de livros na lista e no conjunto.

---

### Exercício 4 — Controle de estoque
- **Dificuldade:** Intermediário
- **Conteúdos:** `HashMap` e operações de consulta e atualização.
- **Enunciado:**
  Crie uma classe `Produto` com `nome`, `preco` e `quantidade`.
  
  Implemente um estoque usando `HashMap<String, Produto>`, em que a chave seja o código do produto.
  
  O programa deve permitir:
  1. Cadastrar produtos.
  2. Consultar um produto pelo código.
  3. Atualizar sua quantidade.
  4. Exibir todos os produtos cadastrados.
  5. Informar quando um código não existir.

---

### Exercício 5 — Ordenando alunos
- **Dificuldade:** Intermediário
- **Conteúdos:** `ArrayList`, `Comparator` e `sort()`.
- **Enunciado:**
  Crie uma classe `Aluno` com `nome` e `nota`.
  
  Armazene pelo menos cinco alunos em uma lista e implemente duas ordenações:
  - Por nota, da maior para a menor.
  - Por nome, em ordem alfabética.
  
  Exiba o resultado de cada ordenação.

---

### Exercício 6 — Removendo elementos com Iterator
- **Dificuldade:** Intermediário
- **Conteúdos:** `Iterator` e Collections.
- **Enunciado:**
  Crie uma lista de números inteiros, incluindo números pares e ímpares.
  
  Percorra a lista utilizando um `Iterator` e remova todos os números pares.
  
  Ao final, exiba a lista resultante.
  
  *Objetivo:* Praticar a remoção durante a iteração sem modificar a coleção diretamente dentro de um `for-each` (evitando `ConcurrentModificationException`).

---

### Exercício 7 — Sistema de biblioteca
- **Dificuldade:** Desafio final
- **Conteúdos:** Integração de POO e Collections.
- **Enunciado:**
  Crie um pequeno sistema de biblioteca com as seguintes funcionalidades:
  - Uma classe abstrata `Usuario`, com subclasses `Aluno` e `Professor`.
  - Uma interface `Emprestavel`, implementada pela classe `Livro`.
  - Uma `ArrayList<Livro>` para armazenar os livros.
  - Um `HashMap<String, Livro>` para consultar livros pelo ISBN.
  - Métodos para emprestar e devolver livros.
  - Ordenação dos livros por título.
  - Remoção de livros descontinuados usando `Iterator`.
  - Sobrescrita de `toString()`, `equals()` e `hashCode()` na classe `Livro`, considerando o ISBN para igualdade.
  
  No `main`, cadastre livros, faça consultas, execute empréstimos e devoluções, ordene a lista e remova pelo menos um livro descontinuado.
  
  *Nota:* Não é necessário implementar menus complexos, banco de dados ou interface gráfica.
