package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class TorneioNatacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Torneio Natação");
        System.out.println("================");

        System.out.print("Digite o Nome do participante: ");
        var nomeParticipante = sc.nextLine();
        System.out.print("Digite a idade do participante: ");
        var idadeParticipante = sc.nextInt();

        if ( idadeParticipante <= 10 ) { // Este trecho só é executado se a idade for menor ou igual a 10 anos
            System.out.println(nomeParticipante + " Participará da categoria Infantil");
        } else if ( idadeParticipante >= 11 && idadeParticipante <= 15) { // Este trecho será executado se a idade estiver entre 11 e 15 anos
            System.out.println(nomeParticipante + " Participará da categoria Juvenil");
        } else if ( idadeParticipante >= 16 && idadeParticipante <= 19 ) { // Este trecho será executado se a idade estiver entre 16 e 19 anos
            System.out.println(nomeParticipante + " Participará da categoria Pré-Adulto");
        } else { // Este trecho será executado se a idade for maior ou igual a 20 anos (nenhuma condição acima foi verdadeira)
            System.out.println(nomeParticipante + " Participará da categoria Adulto");
        }
        sc.close();
    }
}