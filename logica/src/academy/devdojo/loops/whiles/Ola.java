package academy.devdojo.loops.whiles;

import java.util.Scanner;

public class Ola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var contador = 0;

        while ( contador <= 10 ){ // Será executado caso condição for verdadeira
            System.out.println("Olá");
            contador = contador + 1; // Contador recebe ele mesmo + 1
        }
    }
}
