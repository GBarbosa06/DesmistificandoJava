package aula016;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        cachorro.nome = "Rex";
        cachorro.idade = 4;
        cachorro.peso = 6.0;

        cachorro.dormir();
        cachorro.comer();
        cachorro.emitirSom();

        gato.dormir();
        gato.comer();
        gato.miar();
    }
}
