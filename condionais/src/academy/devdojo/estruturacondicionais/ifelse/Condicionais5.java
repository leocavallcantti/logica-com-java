package academy.devdojo.estruturacondicionais.ifelse;

import java.util.Scanner;

public class Condicionais5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Torneio Natação");
        System.out.println("================");

        System.out.print("Digite o Nome do participante: ");
        var nomeParticipante = sc.nextLine();
        System.out.print("Digite a idade do participante: ");
        var idadeParticipante = sc.nextInt();

        if ( idadeParticipante <= 10 ) {
            System.out.println(nomeParticipante + " Participará da categoria Infantil");
        } else if ( idadeParticipante >= 11 && idadeParticipante <= 15) {
            System.out.println(nomeParticipante + " Participará da categoria Juvenil");
        } else if ( idadeParticipante >= 16 && idadeParticipante <= 19 ) {
            System.out.println(nomeParticipante + " Participará da categoria Pré-Adulto");
        } else {
            System.out.println(nomeParticipante + " Participará da categoria Adulto");
        }
        sc.close();
    }
}
