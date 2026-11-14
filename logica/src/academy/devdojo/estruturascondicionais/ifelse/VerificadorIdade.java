package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class VerificadorIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua Idade: ");
        var idade = sc.nextInt();

        if ( idade >= 18 ) {
            System.out.println("Você é maior de Idade !!!");
        } else {
            System.out.println("Você é menor de Idade !!!");
        }

        sc.close();;
    }
}
