package aula021;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Guilherme", 20);
        Pessoa p2 = new Pessoa("Guilherme", 20);
        System.out.println(p1.toString());

        System.out.println(new Pessoa("Guilherme", 20).equals(new Pessoa("Guilherme", 20)));

        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

    }
}

// == -> Não compara igualdade lógica
// .equals -> Compara igualdade lógica
class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

//    @Override
//    public String toString(){
//        return String.format("Nome: %s | Idade: %d", nome, idade);
//    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pessoa p2 = (Pessoa) obj;
        return idade == p2.idade && nome.equals(p2.nome);
    }

    @Override
    public int hashCode(){
        return Objects.hash(nome, idade);
    }
}

// Object -> Pessoa -> Aluno