package academy.devdojo.estruturacondicionais.ifelse;

import java.util.Scanner;

public class Condicionais3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("INFORME UM NUMERO PARA SABER SE ELE É IMPAR OU PAR");
        System.out.println("===================================================");

        System.out.print("Informe um Numero: ");
        var numero = sc.nextInt();

        var result = numero % 2 == 0;

        if (result) {
            System.out.println(numero + " eh Par");
        } else {
            System.out.println(numero + " eh Impar");
        }
        sc.close();
    }
}
