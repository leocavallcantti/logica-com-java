import java.util.Scanner;
    public class OperadoresAritmeticos {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Adição - Responsável por retornar a soma feita entre dois valores.

            System.out.print("Informe o Primeiro Número para Adição: ");
            var valor1 = sc.nextInt();
            System.out.print("Informe o Segundo Número: ");
            var valor2 = sc.nextInt();
            var soma1 = valor1 + valor2;
            System.out.println("============================");

            /* Subtração - Responsável por retornar subtração feita entre dois valores.
            Para chegar no resultado, o valora esquerda é subtraído pelo valor a direita. */

            System.out.print("Informe o Primeiro número para Subtração: ");
            var valor3 = sc.nextInt();
            System.out.print("Informe o Segundo Número: ");
            var valor4 = sc.nextInt();
            var soma2 = valor3 + valor4;
            System.out.println("============================");

            // Multiplicação - Responsável por retornar multiplicação feita entre dois valores.

            System.out.print("Informe o Primeiro Número para Multiplicação: ");
            var valor5 = sc.nextInt();
            System.out.print("Informe o Segundo Número: ");
            var valor6 = sc.nextInt();
            var soma3 = valor5 + valor6;
            System.out.println("============================");

            /* Divisão - Responsável por retornar a divisão feita entre dois valores.
            Para chegar no resultado o valor a esquerda é dividido pelo valor a direita. */

            System.out.print("Informe o Primeiro Número para Divisão: ");
            var valor7 = sc.nextInt();
            System.out.print("Informe o Segundo Número: ");
            var valor8 = sc.nextInt();
            var soma4 = valor5 + valor6;
            System.out.println("============================");

            /* Resto da Divisão - Responsável por retornar o resto da divisão feita entre dois valores.
            Para chegar no resultado, o valor da esquerda é dividido pelo valor a direita, e o resto
            da divisão realizada vem como retorno. */

            System.out.print("Informe o Primeiro número Para o resto da divisão: ");
            var valor9 = sc.nextInt();
            System.out.print("Informe o Segundo Número: ");
            var valor10 = sc.nextInt();
            var soma5 = valor5 + valor6;
            System.out.println("============================");

            System.out.println("Resultado Adição: " + valor1 + " + " + valor2 + " " + " = " + soma1 );
            System.out.println("Resultado Subtração: " + valor3 + " - " + valor4 + " " + " = " + soma2 );
            System.out.println("Resultado Multiplicação: " + valor5 + " X " + valor6 + " " + " = " + soma3 );
            System.out.println("Resultado Divisão: " + valor7 + " / " + valor8 + " " + " = " + soma4 );
            System.out.println("Resultado da Divisão: " + valor9 + " % " + valor10 + " " + " = " + soma5 );

        }
}
