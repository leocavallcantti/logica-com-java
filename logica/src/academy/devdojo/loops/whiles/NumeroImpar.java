package academy.devdojo.loops.whiles;

import java.util.Scanner;

public class NumeroImpar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor desejado: ");
        var valor = sc.nextInt();
        var i = 0; // iniciara a contagem no Zero

        while (i <= valor) { // ira ser executado enquanto 'i' for menor ou igual a 'valor'
            if (i % 2 != 0) { // será executado caso o numero digitado não for divisível por 2
                System.out.println("i = " + i);
            }
            i++; // Incrementa o valor de 'i' em +1 (equivalente a: i = i + 1).
        }
        sc.close();
    }
}
