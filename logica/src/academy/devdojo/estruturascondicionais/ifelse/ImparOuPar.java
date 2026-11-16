package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class ImparOuPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("INFORME 1 NUMERO PARA SABER SE ELE É IMPAR OU PAR");
        System.out.println("===================================================");

        System.out.print("Informe um Numero: ");
        var numero = sc.nextInt();

        /* O operador '%' (módulo) retorna o resto da divisão por 2. Se o resto for 0, 'result'
        guarda true (verdadeiro); caso contrário, guarda false (falso). */
        var result = numero % 2 == 0;

        if (result) { // Este trecho só é executado se 'result' for verdadeiro (true), ou seja, resto igual a 0
            System.out.println(numero + " eh Par");
        } else { // Este trecho será executado se 'result' for falso (false), ou seja, resto diferente de 0
            System.out.println(numero + " eh Impar");
        }
        sc.close();
    }
}
