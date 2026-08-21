package aula020;

import aula020.exemplo1.Aviao;
import aula020.exemplo1.Passaro;
import aula020.exemplo1.Voador;

public class Main {
    public static void main(String[] args) {
//        Voador v1 = new Passaro();
//        Voador v2 = new Aviao();
//
//        v1.voar();
//        v2.voar();

        Voador[] voadores = {
                new Aviao(),
                new Passaro(),
                new Aviao()
        };

        for (Voador voador : voadores) {
            voador.voar();
            voador.pousar();
        }
    }
}
