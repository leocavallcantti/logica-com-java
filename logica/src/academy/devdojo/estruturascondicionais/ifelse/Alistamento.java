package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class Alistamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu sexo (M/F): ");
        var sexo = sc.next();
        System.out.print("Digite sua Idade: ");
        var idade = sc.nextInt();

        if ( (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F") ) && idade < 18 ) {
            System.out.println("Alistamento não permitido"); // Executa se o sexo for M ou F e a idade for menor que 18 anos
        } else if ( sexo.equalsIgnoreCase("M") && idade >= 18 ) {
            System.out.println("Alistamento Obrigatorio "); // Executa se o sexo for M e a idade for maior ou igual a 18 anos
        } else if ( sexo.equalsIgnoreCase("F") && idade >= 18 ) {
            System.out.println("Alistamento não Obrigatorio"); // Executa se o sexo for F e a idade for maior ou igual a 18 anos
        } else {
            System.out.println("Sexo inválido! Informe apenas M ou F."); // Executa se o usuário digitar um sexo inválido (diferente de M ou F)
        }
        sc.close();
    }
}