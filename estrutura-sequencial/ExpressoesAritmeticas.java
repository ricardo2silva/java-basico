public class ExpressoesAritmeticas {

    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        /** OPERADORES ARITMETICOS**/

        //adição
        int c = a + b;
        System.out.println(c); // 12

        //subtração
        c = a - b;
        System.out.println(c); // 8

        //multiplicação
        c = a * b;
        System.out.println(c); // 20

        //divisão
        c = a / b;
        System.out.println(c); // 5

        //resto da  divisão
        c = a % b;
        System.out.println(c); // 0

        /*
        * Precedencia : em 1° * / %
        *               em 2° +  -
        * */

        //EXEMPLOS DE EXPRESSOES ARITMÉTICAS

        // 2 * 6 / 3          RESULTADO = 4
        // 3 + 2 * 4          RESULTADO = 11
        // (3 + 2) * 4        RESULTADO = 20
        // 60 / (3 + 2) * 4   RESULTADO = 48
        // 60 / ((3 + 2) * 4) RESULTADO = 3

        // OBS: QUANDO A PRECEDENCIA ESTÁ NO MESMO NIVEL SE  LÊ DA ESQUERDA PARA A DIREITA COMO ACONTECE NO PRIMEIRO EXEMPLO
        // QUANDO UTILIZAMOS OS ( ) QUEBRAMOS A PRECEDENCIA E DEVE SER CALCULADO PRIMEIRO

    }
}