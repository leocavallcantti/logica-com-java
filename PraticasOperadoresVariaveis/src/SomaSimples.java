/* Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre
elas e atribua à variável SOMA. A seguir escrever o valor desta variável. Entrada O arquivo de
entrada contém 2 valores inteiros. Saída Imprima a mensagem "SOMA" com todas as  letras
maiúsculas com um espaço em branco antes e depois da igualdade seguido pelo valor
correspondente à soma de A e B. Como todos os problemas, não esqueça de imprimir
o fim de linha após o resultado. */

import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o Primeiro Numéro para Soma: ");
        var a = sc.nextInt();
        System.out.print("Informe o Segundo Número:");
        var b = sc.nextInt();
        var soma = a + b;

        System.out.println("Resultado: " + soma );

        sc.close();

    }
}
    // Exercicio beecrowd