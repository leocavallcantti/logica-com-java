    package academy.devdojo.estruturascondicionais.ifelse;

    import java.util.Scanner;

    public class CalculadoraImposto {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Informe seu Salario para Calculo de Imposto de Renda");
            System.out.println("====================================================");

            System.out.print("Salario: R$ ");
            var salario = sc.nextDouble();

            if ( salario <= 2428.80 ) { // Este trecho só é executado se o salário for menor ou igual a 2428.80
                System.out.println("Você está isento do Imposto de Renda !!");
            } else if ( salario <= 2826.65 ) { // Este trecho será executado se o salário for menor ou igual a 2826.65
                System.out.println("7.5% " + String.format("%.2f", salario * 0.075 ));
            } else if ( salario <= 3751.05 ) { // Este trecho será executado se o salário for menor ou igual a 3751.05
                System.out.println("15% " + String.format("%.2f", salario * 0.15 ));
            } else if ( salario <= 4664.68 ) { // Este trecho será executado se o salário for menor ou igual a 4664.68
                System.out.println("22,5% " + String.format("%.2f", salario * 0.225 ));
            } else { // Este trecho será executado se o salário for maior que 4664.68
                System.out.println("27,5% " + String.format("%.2f", salario * 0.275 ));
            }
            sc.close();
        }
    }
