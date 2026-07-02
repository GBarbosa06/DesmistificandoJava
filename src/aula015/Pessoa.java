package aula015;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(!nome.isBlank()){
            this.nome = nome;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void fazerAniversario(){
        System.out.println("Parabéns!");
        idade++;
    }
}
