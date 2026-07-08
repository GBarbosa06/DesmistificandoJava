package aula016.exercicio;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        // Se poderia instanciar apenas Pessoa, mas não faria sentido para nossa lógica

        aluno.nome = "Jorge";
        aluno.idade = 23;
        aluno.matricula = "0241386123";

        professor.nome = "Marcelo";
        professor.idade = 47;
        professor.disciplina = "Programação Orientada a Objetos";
        // professor.matricula = "29481192"; //<- ERRO

        System.out.printf("Olá! Me chamo %s, tenho %d anos e minha matrícula é %s\n",
                aluno.nome,
                aluno.idade,
                aluno.matricula);

        System.out.printf("Olá! Me chamo %s, tenho %d anos e ministro a disciplina de %s\n",
                professor.nome,
                professor.idade,
                professor.disciplina);
    }
}
