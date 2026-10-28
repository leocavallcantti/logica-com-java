import java.util.Scanner;

public class CalculoCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio do Circulo: ");
        double raio = sc.nextDouble();

        double pi = 3.14159;
        double area = pi * raio * raio;

        System.out.println("A aréa do Circulo eh: " + area);

        sc.close();

    }
}
