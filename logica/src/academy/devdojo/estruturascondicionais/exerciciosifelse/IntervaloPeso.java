package academy.devdojo.estruturascondicionais.exerciciosifelse;

/* Crie um programa que checa se um peso está dentro de um intervalo saudável (entre 50.0 kg e 100.0 kg, inclusivos):
1. Use o "Scanner" para solicitar e ler o peso de uma pessoa (double peso).
2. Use o operador lógico '&&' para criar a condição: `peso` deve ser maior ou igual a 50.0 "E" 'peso' deve ser menor ou igual a 100.0.
3. Use a estrutura 'if/else' para:
- Se o peso estiver no intervalo, imprimir: "Peso [Peso] kg. Peso considerado no intervalo saudável."
- Caso contrário, imprimir: "Peso [Peso] kg. Peso fora do intervalo saudável." */

import java.util.Scanner;

public class IntervaloPeso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu Peso em Kg(KiloGramas): ");
        var peso = sc.nextDouble();

        if ( peso >= 50.00 && peso <= 100.00 ) {
            System.out.println(peso + "Kg. Peso considerado no intervalo saudável.");
        } else {
            System.out.println(peso + "Kg. Peso fora do intervalo saudável.");
        }


    }
}
