package academy.devdojo.estruturascondicionais.exerciciosifelse;

/* Multiplicação Condicional: Leia um número inteiro qualquer e multiplique por 2,
apresentando o resultado da multiplicação somente se o resultado for maior ou igual a 30.*/

import java.util.Scanner;

public class MaiorQ30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um Numero: ");
        var numero1 = sc.nextInt();
        System.out.print("Informe outro Numero: ");
        var numero2 = sc.nextInt();

        var resultado = numero1 * numero2;

        if ( resultado >= 30 ) {
            System.out.println(numero1 + " X " + numero2 + ": " + resultado);
        } else {
            System.out.println("MENOR QUE 30");
        }
        sc.close();
        // EXERCÍCIO VIRADO NO JIRAYA
    }
}
