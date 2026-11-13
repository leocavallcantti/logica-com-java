package academy.devdojo.estruturacondicionais.ifelse;

import java.util.Scanner;

public class Condicionais7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Crie um nome para o Login: ");
        var nomeLogin = sc.nextLine();

        if ( nomeLogin.equalsIgnoreCase("admin") || nomeLogin.equalsIgnoreCase("administrador") ) {
            System.out.println(nomeLogin + " Usário Inválido");
        } else {
            System.out.println("Usario cadastrado com sucesso");
        }
        sc.close();
    }
}
