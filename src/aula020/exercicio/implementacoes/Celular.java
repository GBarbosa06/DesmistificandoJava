package aula020.exercicio.implementacoes;

import aula020.exercicio.interfaces.Conectavel;
import aula020.exercicio.interfaces.Ligavel;

public class Celular implements Ligavel, Conectavel{
    @Override
    public void ligar() {
        System.out.println("Celular ligando");
    }

    @Override
    public void desligar() {
        System.out.println("Celular desligando");
    }

    @Override
    public void conectarInternet() {
        System.out.println("Celular conectando à internet");
    }
}
