/*Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua
esta operação à variável PROD. A seguir mostre a variável PROD com mensagem correspondente.
O arquivo de entrada contém 2 valores inteiros. Imprima a mensagem "PROD" e a variável PROD
conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade. Não esqueça
de imprimir o fim de linha após o produto. */

import java.util.Scanner;

public class ProdutoSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um Valor: ");
        var Valor1 = sc.nextInt();
        System.out.print("Informe outro Valor: ");
        var Valor2 = sc.nextInt();

        var Prod = Valor1 + Valor2;

        System.out.println("Resultado: " + Prod);

        sc.close();
    }
}
    // Exercicio beecrowd