package academy.devdojo.estruturascondicionais.exerciciosifelse;

/* Desenvolva uma calculadora de IMC (Índice de Massa Corporal), utilizando a fórmula
 imc = peso / (altura * altura). Após realizado o cálculo, classificar o paciente
 de acordo com a tabela abaixo. */

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class CalculadoraImc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu peso em Kg(KiloGramas): ");
        var peso = sc.nextDouble();
        System.out.print("Infome sua altura: ");
        var altura = sc.nextDouble();

        var imc = peso / ( altura * altura );

        if ( imc < 10 ){
            System.out.println("Desnutrição Grau 5");
        } else if ( imc > 10 && imc < 12.9 ) {
            System.out.println("Desnutrição Grau 4");
        } else if ( imc > 13 && imc < 15.9 ) {
            System.out.println("Desnutrição Grau 3");
        } else if ( imc > 16 && imc < 16.9 ) {
            System.out.println("Desnutrição Grau 2");
        } else if ( imc > 17 && imc < 18.4 ){
            System.out.println("Desnutrição Grau 1");
        } else if ( imc > 18.5 && imc < 24.9 ) {
            System.out.println("Peso Ideal");
        } else if ( imc > 25 && imc < 29.9 ) {
            System.out.println("Pré-Obesidade");
        } else if ( imc > 30 && imc < 34.5 ) {
            System.out.println("Obesidade Grau 1");
        } else if ( imc > 35 && imc < 39.9) {
            System.out.println("Obesidade Grau 2");
        } else {
            System.out.println("Obesidade Grau 3");
        }

        System.out.println("imc: " + String.format("%.1f",imc));

        sc.close();
        // EXERCÍCIO VIRADO NO JIRAYA
    }
}
