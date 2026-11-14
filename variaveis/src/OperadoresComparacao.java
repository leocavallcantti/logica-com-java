public class OperadoresComparacao {
    public static void main(String[] args) {

        // Operador de igualdade. Serve para perguntarmos se o valor a esquerda é igual ao valor a direita.
        System.out.print(5 == 5);   // TRUE.
        System.out.print(99 == 99); // TRUE.
        System.out.print(1 == 5);   // FALSE.

        // Operador "diferença". Serve para perguntarmos se o valor a esquerda é diferente ao valor a direita.
        System.out.print(5 != 5);   // FALSE. (5 não é diferente de 5)
        System.out.print(10 != 100); // TRUE.
        System.out.print(-1 != 1);   // TRUE.

        // Operador "maior". Serve para perguntamos se o valor a esquerda é maior que o valor da direita.
        System.out.print(4 > 1);  // TRUE
        System.out.print(5 > 10); // FALSE
        System.out.print(5 > 5);  // FALSE. (5 não é maior que 5)

        //Operador "menor". Serve para perguntamos se o valor a esquerda é menor que o valor da direita.
        System.out.print(4 < 1);  // FALSE
        System.out.print(5 < 10); // TRUE
        System.out.print(5 < 5);  // FALSE. (5 não é menor que 5)

        /*  Operador "maior ou igual". Podemos também perguntar se o valor a esquerda
        é maior ou igual ao valor da direita. */
        System.out.print(4 >= 4);  // TRUE. (pois 4 é igual a 4)
        System.out.print(5 >= 3);  // TRUE. (pois 5 é maior que 3)
        System.out.print(5 >= 10); // FALSE.

         /*  Operador "menor ou igual". Neste caso, perguntamos se o valor a esquerda
         é menor ou igual ao valor da direita. */
        System.out.print(4 <= 4);  // TRUE. (pois 4 é igual a 4)
        System.out.print(4 <= 10); // TRUE. (pois 4 é menor que 10)
        System.out.print(5 <= 3);  // FALSE.

    }
}
