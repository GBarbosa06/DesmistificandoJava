package aula011;

public class Carro {
    String modelo;
    String cor;
    int velocidade;

    void ligar(){
        System.out.println("O carro ligou!");
    }

    void acelerar(int novaVelocidade){
        System.out.println("O carro está acelerando");
        velocidade = novaVelocidade;
        System.out.println("A nova velocidade é " + velocidade + "km/h");
    }

    void freiar(){
        System.out.println("O carro está freiando");
        velocidade -= 10;
        System.out.println("A nova velocidade é " + velocidade + "km/h");
    }
}