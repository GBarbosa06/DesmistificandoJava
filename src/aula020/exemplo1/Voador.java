package aula020.exemplo1;

public interface Voador {
    void voar();
    default void pousar(){
        System.out.println("Pousando...");
    }
}
