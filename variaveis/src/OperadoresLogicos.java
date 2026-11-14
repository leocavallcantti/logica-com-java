public class OperadoresLogicos {
    public static void main(String[] args) {

        /* O operador && requer que ambos os valores ou expressões sejam verdadeiros
        para retornar TRUE; caso contrário, retornará FALSE. */

        boolean tenhoDinheiro = true;
        boolean estaEnsolarado = true;

        if (tenhoDinheiro && estaEnsolarado) {
            System.out.print("Eu irei sair! Pois tenho dinheiro e o dia está ensolarado!");
        } else {
            System.out.print("Eu não irei sair.");
        }

        /* O operador || requer que apenas um dos valores ou expressões
        seja verdadeira para retornar TRUE.*/

        boolean vontadeDeSair = false;
        boolean alguemNosChamouParaIr = true;

        if (vontadeDeSair || alguemNosChamouParaIr) {
            System.out.print("Eu irei ao parque!");
        } else {
            System.out.print("Eu não irei sair.");
        }

    }
}
