package academy.devdojo.estruturascondicionais.exerciciosifelse;

/* Ordem Crescente: Desenvolva uma rotina que, dados três
números inteiros, apresente-os em ordem crescente. */

import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o Primeiro numero: ");
        var numero1 = sc.nextInt();
        System.out.print("Digite o Segundo numero: ");
        var numero2 = sc.nextInt();
        System.out.print("Digite o Terceiro numero: ");
        var numero3 = sc.nextInt();

        if ( numero1 <= numero2 && numero2 <= numero3 ) {
            System.out.println(numero1 + ", " + numero2 + ", " + numero3);
        } else if ( numero1 <= numero3 && numero3 <= numero2 ) {
            System.out.println(numero1 + ", " + numero3 + ", " + numero2);
        } else if ( numero2 <= numero1 && numero1 <= numero3 ) {
            System.out.println(numero2 + ", " + numero1 + ", " + numero3);
        } else if ( numero2 <= numero3 && numero3 <= numero1 ) {
            System.out.println(numero2 + ", " + numero3 + ", " + numero1);
        } else if ( numero3 <= numero1 && numero1 <= numero2 ) {
            System.out.println(numero3 + ", " + numero1 + ", " + numero2);
        } else {
            System.out.println(numero3 + ", " + numero2 + ", " + numero1);
        }
        sc.close();
        // EXERCÍCIO VIRADO NO JIRAYA
    }
}
