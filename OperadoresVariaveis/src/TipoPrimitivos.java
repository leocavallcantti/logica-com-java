public class TipoPrimitivos {
    public static void main(String[] args) {

        // Tipo de dado + Identificação + Valor Atribuido

        // String - Texto
        String nome = "Meu nome é Leonardo";
        System.out.println(nome);

        // Byte -128 a 127 ( 1 byte de informação ou 8 bit )
        byte idade =  17;
        System.out.println(idade);

        // Short - -32768  a 32767 ( 2 bytes de informação ou 16 bites )
        short estoque = 32767;
        System.out.println(estoque);

        // Int- -2147483648 a 2147483647 ( 2 Bilhões ) ( 4 bytes de informação ou 32 bits)
        int numeros = 2147483647;
        System.out.println(numeros);

        // Long -9223372036854775808 a 9223372036854775807 ()  8 bytes de infomação ou 64 bits)
        long contaCorrente = 9223372036854775807L;
        System.out.println(contaCorrente);

        //  Numeros Decimais

        // Float 7 Digitos decimais - 1234567 ( Possui 4 bytes de informação ou 32 bits )
        float real = 103.50f;
        System.out.println(real);

        // Double 15 digitos decimais 123456789123456 ( Possui 8 bytes de informação ou 64 de bits )
        double dolar = 122.50;
        System.out.println(dolar);

        // Valor Bolean

        // Bolean ( Possui 1 bit de informação ) só pode armazenar apenas 2 valores: 0 ou 1

        Boolean botaoAtivado = true;
        System.out.println(botaoAtivado);

        Boolean botaoDesativado = false;
        System.out.println(botaoDesativado);

    }
}
