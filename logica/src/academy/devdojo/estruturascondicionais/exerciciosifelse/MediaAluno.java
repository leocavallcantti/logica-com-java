package academy.devdojo.estruturascondicionais.exerciciosifelse;

/* Desenvolva uma rotina que leia as notas de quatro bimestres de um aluno (N1, N2, N3 e N4)
e informe o status do aluno baseado na tabela abaixo:
Se a média for menor que 50 || REPROVADO
Se a média for igual a 50 || RECUPERAÇÃO
Se a média for maior que 50 || APROVADO  */

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        var nomeAluno = sc.nextLine();

        System.out.print("Digite a Nota do Primeiro Bimestre: ");
        var nota1Bimestre = sc.nextDouble();
        System.out.print("Digite a Nota do Segundo Bimestre: ");
        var nota2Bimestre = sc.nextDouble();
        System.out.print("Digite a Nota do Terceiro Bimestre: ");
        var nota3Bimestre = sc.nextDouble();
        System.out.print("Digite a Nota do Quarto Bimestre: ");
        var nota4Bimestre = sc.nextDouble();

        var media = (nota1Bimestre + nota2Bimestre + nota3Bimestre + nota4Bimestre) / 4;

        if ( media > 50 ) {
            System.out.println(nomeAluno + " ESTÁ APROVADO !! ");
        } else if ( media < 50 ) {
            System.out.println(nomeAluno + " ESTÁ REPROVADO !!");
        } else {
            System.out.println(nomeAluno + " ESTÁ EM RECUPERAÇÃO !!");
        }
        sc.close();
        // EXERCÍCIO VIRADO NO JIRAYA
    }
}
