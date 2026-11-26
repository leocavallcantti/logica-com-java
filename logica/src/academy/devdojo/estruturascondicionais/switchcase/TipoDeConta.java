package academy.devdojo.estruturascondicionais.switchcase;

/* Como Gerente eu gostaria que meus usuários pudessem digitar o tipo de conta
e o sistema imprima qual a porcentagem de juros que aquela conta irá oferecer.
Com o intuito de agilizar o acesso as informçãoes. tipos de contas:
Conta Poupança 0.05% | Conta Corrente 0.02% | Conta Investimento 0.01% */
import java.util.Scanner;

public class TipoDeConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Estilos de Contas: Conta Corrente, Conta Investidor e Conta Investidor");
        System.out.print("Digite qual o seu tipo de conta: ");
        var contaEstilo = sc.nextLine();


        switch ( contaEstilo ){
            case "Conta Puopança":
                System.out.println("Juros de 0.05%");
                break;
            case "Conta Corrente":
                System.out.println("Juros de 0.02%");
                break;
            case "Conta Investidor":
                System.out.println("Juros de 0.01%");
                break;
            default:
                System.out.println("Conta Inexistente !");
        }
        sc.close();
        }
    }

