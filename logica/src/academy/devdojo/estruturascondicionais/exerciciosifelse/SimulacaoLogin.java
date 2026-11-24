package academy.devdojo.estruturascondicionais.exerciciosifelse;

/*  Crie um programa que simula um login, usando um operador lógico AND (&&):
1. Defina duas variáveis fixas para credenciais: String usuarioCorreto = "admin" e String senhaCorreta = "12345".
2. Use o `Scanner` para ler o "usuarioDigitado" e a "senhaDigitada" pelo usuário.
3. Use a estrutura if/else com o operador && para verificar se ambas as entradas do usuário coincidem com as
credenciais corretas (use o método ".equals()" para comparar strings).
4. Imprima a mensagem "Login bem-sucedido! Bem-vindao(a)." ou "Erro: Usuário ou senha incorretos.".*/

import java.util.Scanner;

public class SimulacaoLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do Usuario: ");
        var usuarioDigitado = sc.nextLine();
        System.out.print("Digite a senha: ");
        var senhaDigitada = sc.nextLine();

        var usarioCorreto = "admin";
        var senhaCorreta = "12345";

        if ( usuarioDigitado.equalsIgnoreCase("admin") && senhaDigitada.equalsIgnoreCase("12345") ) {
            System.out.println("Login bem-sucedido! Bem-vindo(a).");
        } else {
            System.out.println("Erro: Usuário ou senha incorretos.");
        }
        // EXERCÍCIO VIRADO NO JIRAYA
        sc.close();
    }
}
