import java.util.Scanner;

public class Condicionais2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu Salario: R$ ");
        var salario = sc.nextDouble();

        var trintaPorCento = salario * 0.30;
        var quinzePorcento = salario * 0.10;

        if ( salario > 4500 ){
            System.out.println("30% de R$ " + salario + " eh: R$ " + String.format("%.2f",trintaPorCento));
        } else {
            System.out.println("15% de R$ " + salario + " eh: R$ " + String.format("%.2f",quinzePorcento));
        }
    }
}
