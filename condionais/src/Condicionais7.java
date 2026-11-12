import java.util.Scanner;

public class Condicionais7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu sexo (M/F): ");
        var sexo = sc.next();
        System.out.print("Digite sua Idade: ");
        var idade = sc.nextInt();

        if ( (sexo.equalsIgnoreCase("M") == sexo.equalsIgnoreCase("F") ) && idade < 18 ) {
            System.out.println("Alistamento não permitido");
        } else if ( sexo.equalsIgnoreCase("M") || idade > 18 ) {
            System.out.println("Alistamento Obrigatorio ");
        } else if ( sexo.equalsIgnoreCase("F") && idade < 18 ) {
            System.out.println("Alistamento não permitido");
        } else {
            System.out.print("Deseja se alistar (S/N): ");
            var simOuNao = sc.next();
        }

        sc.close();
    }
}
