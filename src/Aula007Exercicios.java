/*
Operadores Aritméticos
(+ - * / %)

1
* Soma simples

    Crie um programa que:
    Leia dois números inteiros
    Mostre a soma deles

    * Dica: use Scanner.

2
* Média de notas

Leia 3 notas (double)
Calcule e imprima a média

3
* Divisão e resto

Leia dois números inteiros
Mostre:
o resultado da divisão
o resto da divisão

4
* Conversão de temperatura

Leia uma temperatura em Celsius
Converta para Fahrenheit

Fórmula:
F = (C * 9/5) + 32

5
* Área do retângulo

Leia base e altura
Calcule e exiba a área



Operadores Relacionais

(> < >= <= == !=)

6
* Maior ou menor

Leia dois números
Informe qual é o maior ou se são iguais

7
* Aprovado ou reprovado

Leia a média final de um aluno
Se média ≥ 7 → Aprovado
Caso contrário → Reprovado

8
* Número positivo, negativo ou zero

Leia um número inteiro
Informe se ele é positivo, negativo ou zero

9
* Idade válida

Leia uma idade
Verifique se está entre 0 e 120


Operadores Condicionais
(if, else, else if, &&, ||, !)

10
Pode votar?

Leia a idade
Se idade ≥ 16 → “Pode votar”
Senão → “Não pode votar”

1️1
* Par ou ímpar

Leia um número
Verifique se é par ou ímpar

Dica:
Use o operador %

1️2
* Login simples

Leia:
usuário
senha
Se usuário = "admin" e senha = "123"
→ Login válido
Caso contrário → Login inválido

1️3
* Classificação por nota

Leia uma nota de 0 a 10
Classifique:
9 a 10 → Excelente
7 a 8 → Bom
5 a 6 → Regular
< 5 → Insuficiente

1️4
* Desconto na compra

Leia o valor da compra
Se valor ≥ 500 → desconto de 10%
Senão → desconto de 5%
Mostre o valor final



Desafios! Se quiser subir o nível

15
* Calculadora simples

Leia dois números
Leia a operação (+ - * /)
Mostre o resultado usando if/else

16
* Ano bissexto

Leia um ano
Verifique se é bissexto


Regras para verificar:
Divisível por 4
Não divisível por 100, ou divisível por 400

*/

import java.util.Scanner;

public class Aula007Exercicios {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ==============================
        // Soma simples
        // ==============================
        System.out.println("1) Soma de dois números");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Soma: " + (a + b));

        // ==============================
        // Média de notas
        // ==============================
        System.out.println("\n2) Média de três notas");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double media = (n1 + n2 + n3) / 3;
        System.out.println("Média: " + media);

        // ==============================
        // Divisão e resto
        // ==============================
        System.out.println("\n3) Divisão e resto");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Divisão: " + (x / y));
        System.out.println("Resto: " + (x % y));

        // ==============================
        // Celsius para Fahrenheit
        // ==============================
        System.out.println("\n4) Celsius para Fahrenheit");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Fahrenheit: " + fahrenheit);

        // ==============================
        // Área do retângulo
        // ==============================
        System.out.println("\n5) Área do retângulo");
        double base = sc.nextDouble();
        double altura = sc.nextDouble();
        System.out.println("Área: " + (base * altura));

        // ==============================
        // Maior ou menor
        // ==============================
        System.out.println("\n6) Maior ou menor");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("Maior: " + num1);
        } else if (num2 > num1) {
            System.out.println("Maior: " + num2);
        } else {
            System.out.println("São iguais");
        }

        // ==============================
        // Aprovado ou reprovado
        // ==============================
        System.out.println("\n7) Aprovado ou Reprovado");
        double mediaFinal = sc.nextDouble();

        if (mediaFinal >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        // ==============================
        // Positivo, negativo ou zero
        // ==============================
        System.out.println("\n8) Positivo, negativo ou zero");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("Positivo");
        } else if (numero < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Zero");
        }

        // ==============================
        // Idade válida
        // ==============================
        System.out.println("\n9) Idade válida");
        int idade = sc.nextInt();

        if (idade >= 0 && idade <= 120) {
            System.out.println("Idade válida");
        } else {
            System.out.println("Idade inválida");
        }

        // ==============================
        // Pode votar?
        // ==============================
        System.out.println("\n10) Pode votar?");
        idade = sc.nextInt();

        if (idade >= 16) {
            System.out.println("Pode votar");
        } else {
            System.out.println("Não pode votar");
        }

        // ==============================
        // Par ou ímpar
        // ==============================
        System.out.println("\n11) Par ou ímpar");
        int valor = sc.nextInt();

        if (valor % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }

        // ==============================
        // Login simples
        // ==============================
        System.out.println("\n12) Login");
        sc.nextLine(); // limpar buffer
        String usuario = sc.nextLine();
        String senha = sc.nextLine();

        if (usuario.equals("admin") && senha.equals("123")) {
            System.out.println("Login válido");
        } else {
            System.out.println("Login inválido");
        }

        // ==============================
        // Classificação por nota
        // ==============================
        System.out.println("\n13) Classificação por nota");
        double nota = sc.nextDouble();

        if (nota >= 9) {
            System.out.println("Excelente");
        } else if (nota >= 7) {
            System.out.println("Bom");
        } else if (nota >= 5) {
            System.out.println("Regular");
        } else {
            System.out.println("Insuficiente");
        }

        // ==============================
        // Desconto na compra
        // ==============================
        System.out.println("\n14) Desconto na compra");
        double valorCompra = sc.nextDouble();
        double desconto;

        if (valorCompra >= 500) {
            desconto = valorCompra * 0.10;
        } else {
            desconto = valorCompra * 0.05;
        }

        System.out.println("Valor final: " + (valorCompra - desconto));

        // ==============================
        //  Calculadora simples
        // ==============================
        System.out.println("\n15) Calculadora");
        double v1 = sc.nextDouble();
        double v2 = sc.nextDouble();
        char operacao = sc.next().charAt(0);

        if (operacao == '+') {
            System.out.println(v1 + v2);
        } else if (operacao == '-') {
            System.out.println(v1 - v2);
        } else if (operacao == '*') {
            System.out.println(v1 * v2);
        } else if (operacao == '/') {
            System.out.println(v1 / v2);
        } else {
            System.out.println("Operação inválida");
        }

        // ==============================
        //  Ano bissexto
        // ==============================
        System.out.println("\n16) Ano bissexto");
        int ano = sc.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Não é bissexto");
        }

        sc.close();
    }
}