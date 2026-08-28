package aula020.exercicio.implementacoes;

import aula020.exercicio.interfaces.Conectavel;
import aula020.exercicio.interfaces.Ligavel;

public class Computador implements Ligavel, Conectavel {
    @Override
    public void ligar() {
        System.out.println("Computador ligando");
    }

    @Override
    public void desligar() {
        System.out.println("Computador desligando");
    }

    @Override
    public void conectarInternet() {
        System.out.println("Computador conectando à internet");
    }
}
