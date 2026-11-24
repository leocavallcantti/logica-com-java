package academy.devdojo.estruturascondicionais.exerciciosifelse;

import java.util.Scanner;

/* Crie um programa que verifica se um cliente tem direito a desconto usando o operador lógico OR (||):
1. Use o Scanner para ler:
- int quantidadeItens (quantidade de produtos comprados).
- boolean clientePremium (digite "true" se for premium, "false" se não for).
2. A condição para desconto é: a quantidade de itens for maior que 10 	OU" o cliente for premium.
3. Use a estrutura `if/else` para:
- Se a condição de desconto for "true", imprimir: "Desconto aplicado! O cliente é elegível."
- Caso contrário, imprimir: "Sem desconto. Compra normal. "*/

public class ChecagemIntervaloDePeso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de Blusas Compradas: ");
        var quantidadeItens = sc.nextInt();
        System.out.print("Cliente Premium (T/F):");
        var clientePremium = sc.nextBoolean();

        if ( quantidadeItens >= 10 || clientePremium == true ) {
            System.out.println("Desconto aplicado! O cliente é elegível.");
        } else {
            System.out.println("Sem desconto. Compra normal.");
        }

        // EXERCÍCIO VIRADO NO JIRAYA
        sc.close();
    }
}
