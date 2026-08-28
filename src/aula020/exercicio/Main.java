package aula020.exercicio;

import aula020.exercicio.implementacoes.Celular;
import aula020.exercicio.implementacoes.Computador;
import aula020.exercicio.implementacoes.Televisao;
import aula020.exercicio.interfaces.Conectavel;
import aula020.exercicio.interfaces.Ligavel;

public class Main {
    public static void main(String[] args) {
        Ligavel[] ligaveis = {
                new Celular(),
                new Televisao(),
                new Computador()
        };

        Conectavel[] conectaveis = {
                new Celular(),
                new Computador()
        };

        for (Ligavel ligavel : ligaveis) {
            ligavel.ligar();
            ligavel.desligar();
            System.out.println("=====================");
        }


        for (Conectavel conectavel : conectaveis) {
            conectavel.conectarInternet();
            System.out.println("=====================");
        }
    }
}
