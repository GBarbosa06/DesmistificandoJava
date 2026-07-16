package aula017.animal;

public class Animal {
    protected String nome;
    protected int idade;
    protected double peso;

    public void comer(){
        System.out.println("Comendo...");
    }
    public void dormir(){
        System.out.println("Dormindo...");
    }

    public void emitirSom(){
        System.out.println("Som genérico");
    }
}
