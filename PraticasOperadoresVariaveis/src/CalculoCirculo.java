/* A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para
este problema que π = 3.14159. Efetue o cálculo da área, elevando o valor de raio ao quadrado
e multiplicando por π. A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a
variável raio. Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo
abaixo, com 4 casas após o ponto decimal. Utilize variáveis de dupla precisão (double). Como todos
os problemas, não esqueça de imprimir o fim de linha após o resultado. */

import java.util.Scanner;

public class CalculoCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio do Circulo: ");
        var raio = sc.nextDouble();

        var pi = 3.14159;
        var area = pi * raio * raio;

        System.out.println("A aréa do Circulo eh: " + area);

        sc.close();

    }
}
    // Exercicio beecrowd