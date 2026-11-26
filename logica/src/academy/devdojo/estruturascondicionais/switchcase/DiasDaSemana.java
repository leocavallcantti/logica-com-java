package academy.devdojo.estruturascondicionais.switchcase;

import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o dia da Semamana (1/7): ");
        var dia = sc.nextInt();

        switch (dia) {  // Valor que será utilizado como base para comparações de igualdade.
            case 1: // Será executado caso o valor do case for correspondente o valor do Switch
                System.out.println("Segunda - Feira");
                break; // Instrui o programa a sair do switch após a execução do bloco de código do case correspondente.
            case 2:
                System.out.println("Terça - feira");
                break;
            case 3:
                System.out.println("Quarta - Feira");
                break;
            case 4:
                System.out.println("Quinta - Feira");
                break;
            case 5:
                System.out.println("Sexta - Feira");
                break;
            default: // Será executado sem nenhum outro case responder.
                System.out.println("Número Invalido.");
        }
        sc.close();
    }
}
