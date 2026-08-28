package aula020.exercicio.implementacoes;

import aula020.exercicio.interfaces.Ligavel;

public class Televisao implements Ligavel {
    @Override
    public void desligar() {
        System.out.println("Televisão ligando");
    }

    @Override
    public void ligar() {
        System.out.println("Televisão desligando");
    }
}
