package aula020.exemplo1;

public class Passaro extends Animal implements Voador{

    @Override
    public void voar(){
        System.out.println("Pássaro voando...");
    }

    @Override
    void emitirSom() {
        System.out.println("Som...");
    }
}

// classe -> extends outra classe
// classe -> implements uma interface
// interface -> extends outra interface