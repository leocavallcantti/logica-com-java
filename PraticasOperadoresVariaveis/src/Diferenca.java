/* Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do
produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
O arquivo de entrada contém 4 valores inteiros. Imprima a mensagem DIFERENCA, conforme
exemplo abaixo, com um espaço em branco antes e depois da igualdade. */

import java.util.Scanner;

public class Diferenca {
    public static void main() {
        Scanner sc = new Scanner (System.in);

        System.out.println("Primeira Soma");
        System.out.println("==============================");
        System.out.print("Informe o Primeiro Numero: ");
        var number1 = sc.nextInt();
        System.out.print("Informe o Segundo Numero: ");
        var number2 = sc.nextInt();
        System.out.println("==============================");
        System.out.println("Segunda Soma");
        System.out.print("Informe o Terceiro Numero: ");
        var number3 = sc.nextInt();
        System.out.print("Informe o Quarto Numero: ");
        var number4 = sc.nextInt();
        System.out.println("==============================");

        var dif = number1 * number2 - number3 * number4;
        var sum1 = number1 * number2;
        var sum2 = number3 * number4;


        System.out.println("Resultado Soma 1: " + sum1 );
        System.out.println("Resultado Soma 2: " + sum2 );
        System.out.println("Diferença entre as somas: " + dif);


    }
}

        // Exercicio beecrowd