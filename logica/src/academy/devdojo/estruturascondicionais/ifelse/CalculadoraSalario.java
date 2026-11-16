package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class CalculadoraSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu Salario: R$ ");
        var salario = sc.nextDouble();

        if ( salario > 4500 ){ // Este trecho só é executado se o salário for maior que 4500.01
            var resultado = salario * 0.30;
            System.out.println("30% de R$ " + salario + " eh: R$ " + String.format("%.2f",resultado));
        } else { // Este trecho será executado se o salário for menor ou igual a 4500.00
            var resultado = salario * 0.15;
            System.out.println("15% de R$ " + salario + " eh: R$ " + String.format("%.2f",resultado));
        }

        sc.close();
    }
}