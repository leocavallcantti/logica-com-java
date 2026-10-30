/* Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno.
A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3
e a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa
decimal. O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).
Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 1 dígito após o ponto
decimal e com um espaço em branco antes e depois da igualdade. Assim como todos os problemas, não esqueça
de imprimir o fim de linha após o resultado. */

import java.util.Scanner;

public class MediaAluno2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o Nome do Aluno: ");
        var nomeAluno = sc.nextLine();
        System.out.print("Digite a Primeira Nota do " + nomeAluno + ":");
        var nota1 = sc.nextDouble();
        System.out.print("Digite a Segunda nota do " + nomeAluno + ":");
        var nota2 = sc.nextDouble();
        System.out.print("Digite a Terceira nota do " +nomeAluno + ":");
        var nota3 = sc.nextDouble();
        var espaco = sc.nextLine();

        var media = ( nota1 * 2 + nota2 * 3 + nota3 * 5 ) / 10;

        System.out.println("A media do Aluno " + nomeAluno + " eh: " + String.format("%,.1f", media) );

        sc.close();
    }
}
