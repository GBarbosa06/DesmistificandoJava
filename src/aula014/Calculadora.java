package aula014;

public class Calculadora {

    int somar(int a, int b) {
        return a + b;
    }

    int somar(int a, int b, String c) {
        return a + b + Integer.parseInt(c);
    }

    int somar(int a, String b, int c) {
        return a + Integer.parseInt(b) + c;
    }
}