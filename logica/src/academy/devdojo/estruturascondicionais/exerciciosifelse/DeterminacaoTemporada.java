package academy.devdojo.estruturascondicionais.exerciciosifelse;

import java.util.Scanner;

/* Crie um programa que solicite o número do mês (1 a 12). Use 'if-else - if-else' e
operadores lógicos ( '&&' para 'E' ) para determinar a estação do ano.
- Verão: 12, 1, 2
- Outono: 3, 4, 5
- Inverno: 6, 7, 8
- Primavera: 9, 10, 11, */

public class DeterminacaoTemporada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o Numero do Mês: ");
        var mes = sc.nextInt();

        if ( mes < 1 || mes > 12 ) {
            System.out.println("Mês inválido. Por favor, insira um valor entre 1 e 12.");
        } else if ( mes == 1 || mes == 2 || mes == 12 ) {
            System.out.println("Verão: 1 - Janeiro, 2 - Fevereiro e 12 - Dezembro.");
        } else if ( mes >= 3 && mes <= 5 ) {
            System.out.println("Outono : 3 - Março, 4 - Abril e 5 - Maio.");
        } else if ( mes >= 6 && mes <= 8 ) {
            System.out.println("Inverno: 6 - Junho, 7 - Julho e 8 - Agosto.");
        } else {
            System.out.println("Primavera: 9 - Setembro, 10 - Outubro e 11 - Novembro.");
        }
       sc.close();
    }
}