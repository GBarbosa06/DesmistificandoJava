package aula019.animal;

public abstract class Animal {

    public Animal(){
        System.out.println("Animal criado");
    }

    String nome;

    abstract void emitirSom();
}
