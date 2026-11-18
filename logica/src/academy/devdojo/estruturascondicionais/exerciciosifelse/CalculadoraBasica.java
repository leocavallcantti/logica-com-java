package academy.devdojo.estruturascondicionais.exerciciosifelse;

/* Calculadora Básica (com menu de decisão): Crie uma calculadora capaz de realizar as quatro
operações básicas (+, -, * ou /). Ela deve apresentar um menu perguntando a operação desejada
solicitar os dois valores numéricos, realizar o cálculo e exibir o resultado. */

import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("CALCULADORA");
        System.out.println("============");

        System.out.print("Informe a operação que deseja realizar (+, -, * ou /): ");
        var operacao = sc.next();

        System.out.print("Informe o Primeiro número para a Operação: ");
        var numero1 = sc.nextDouble();

        System.out.print("Informe o Segundo número para a Operação: ");
        var numero2 = sc.nextDouble();

        if (operacao.equals("+")) {
            var resultado = numero1 + numero2;
            System.out.println(numero1 + " + " + numero2 + " = " + resultado);
        } else if (operacao.equals("-")) {
            var resultado = numero1 - numero2;
            System.out.println(numero1 + " - " + numero2 + " = " + resultado);
        } else if (operacao.equals("*")) {
            var resultado = numero1 * numero2;
            System.out.println(numero1 + " * " + numero2 + " = " + resultado);
        } else if (operacao.equals("/")) {
            if (numero2 == 0) {
                System.out.println("ERRO: Não é possível dividir por zero!");
            } else {
                var resultado = numero1 / numero2;
                System.out.println(numero1 + " / " + numero2 + " = " + resultado);
            }
        } else {
            System.out.println("OPERAÇÃO INVÁLIDA! Digite apenas +, -, * ou /.");
        }
        sc.close();
        // EXERCÍCIO VIRADO NO JIRAYA
    }
}