package academy.devdojo.estruturascondicionais.exerciciosifelse;

/* Desenvolva um programa que execute a leitura de um valor numérico inteiro, caso o
valor esteja entre 1 e 9 apresentar a mensagem "Dentro do valor permitido" e caso
contrário apresentar a mensagem "Fora do Valor Permitido". */

import java.util.Scanner;

public class DentrodoValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        var numero = sc.nextInt();

        if (numero <=9 ){
            System.out.println("DENTRO DO VALOR PERMITIDO");
        } else {
            System.out.println("FORA DO VALOR PERMITIDO");
        }
        sc.close();
        // EXERCÍCIO VIRADO NO JIRAYA
    }
}
