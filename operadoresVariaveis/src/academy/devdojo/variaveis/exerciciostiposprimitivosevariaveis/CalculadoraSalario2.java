package academy.devdojo.variaveis.exerciciostiposprimitivosevariaveis;

/* Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas
informar o total a receber no final do mês, com duas casas decimais. O arquivo de entrada contém um texto
(primeiro nome do vendedor) e 2 valores de dupla precisão (double) com duas casas decimais, representando o
salário fixo do vendedor e montante total das vendas efetuadas por este vendedor, respectivamente. */

import java.util.Scanner;

public class CalculadoraSalario2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o Nome do Vendendor: ");
        var nomeVendedor = sc.nextLine();
        System.out.print("Digite o Salario Fixo: ");
        var salarioFixo = sc.nextDouble();
        System.out.print("Digite o valor vendas feitas esse mês: ");
        var valorVendas = sc.nextDouble();

        var comissao = valorVendas * 0.15;
        var salarioFinal = comissao + salarioFixo;

        System.out.println("Salario com 15% de Comissão: R$" + String.format("%.2f", salarioFinal));

        sc.close();

        // Exercicio beecrowd
    }
}

