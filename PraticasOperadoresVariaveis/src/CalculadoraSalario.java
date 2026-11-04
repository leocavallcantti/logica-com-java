/* Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas
o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número
e o salário do funcionário, com duas casas decimais. O arquivo de entrada contém 2 números
inteiros e 1 número com duas casas decimais, representando o número, quantidade de horas
trabalhadas e o valor que o funcionário recebe por hora trabalhada, respectivamente.
Imprima o número e o salário do funcionário, conforme exemplo fornecido, com um espaço em
branco antes e depois da igualdade. No caso do salário, também deve haver um espaço em branco após o $. */

import java.util.Scanner;

public class CalculadoraSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero do Funcionario: ");
        var numeroFuncionario = sc.nextDouble();
        System.out.print("Digite a Carga Horaria mensal do Funcionario: ");
        var cargaHoraria = sc.nextDouble();
        System.out.print("Digite o R$ por hora Trabalhada: R$ ");
        var valorHora = sc.nextDouble();

        double salarioMensal = cargaHoraria * valorHora;

        System.out.println("O Funcionario Nº" + numeroFuncionario + " recebera mensalmente R$ "
                + String.format("%,.1f", salarioMensal));

        sc.close();

    }
}
