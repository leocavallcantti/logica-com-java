/*
Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno.
A seguir, calcule a média do aluno, sabendo que a nota. A tem peso 3.5 e a nota B tem peso 7.5
(A soma dos pesos portanto é 11). Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa
decimal. O arquivo de entrada contém 2 valores com uma casa decimal cada um. Imprima a mensagem
"MEDIA" e a média do aluno conforme exemplo abaixo, com 5 dígitos após o ponto decimal e com um
espaço em branco antes e depois da igualdade. Utilize variáveis de dupla precisão (double) e
como todos os problemas, não esqueça de imprimir o fim de linha após o resultado. */

import java.util.Scanner;

public class MediaAluno1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o Nome do Aluno: ");
        var nomeAluno = sc.nextLine();
        System.out.print("Digite a Primeira Nota do " + nomeAluno + ":");
        var nota1 = sc.nextDouble();
        System.out.print("Digite a Segunda nota do " + nomeAluno + ":");
        var nota2 = sc.nextDouble();

        var media = ( nota1 + nota2 ) / 2;

        System.out.println("A media do Aluno " + nomeAluno + " eh: " + String.format("%,.1f", media) );

        sc.close();

    }
}

        // Exercicio beecrowd