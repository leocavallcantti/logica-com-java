package academy.devdojo.estruturacondicionais.ifelse;

import java.util.Scanner;

public class Condicionais4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu Salario para Calculo de Imposto de Renda");
        System.out.println("====================================================");

        System.out.print("Salario: R$ ");
        var salario = sc.nextDouble();

        if ( salario <= 2428.80 ) {
            System.out.println("Você está isento do Imposto de Renda !!");
        } else if ( salario >= 2428.81 && salario <= 2826.65 ) {
            System.out.println("7.5% " + String.format("%.2f", salario * 0.075 ));
        } else if ( salario >= 2826.66 && salario <= 3751.05 ) {
            System.out.println("15% " + String.format("%.2f", salario * 0.15 ));
        } else if ( salario >= 3751.06 && salario <= 4664.68 ) {
            System.out.println("22,5% " + String.format("%.2f", salario * 0.225 ));
        } else {
            System.out.println("27,5% " + String.format("%.2f", salario * 0.275 ));
        }
        sc.close();;
    }
}
