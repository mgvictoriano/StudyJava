import java.util.Scanner;

public class Challenge2 {

    /* Desafio de cordas
Faça com que a função StringChallenge( str )
pegue o parâmetro str que está sendo passado e o retorne no formato camel case adequado,
onde a primeira letra de cada palavra é maiúscula (excluindo a primeira letra).
A string conterá apenas letras e alguma combinação de caracteres de pontuação delimitadores separando cada palavra.

Por exemplo: se str for "BOB loves-coding", seu programa deve retornar a string bobLovesCoding . */




    public static String StringChallenge(String str) {
        str = str.substring(0).toLowerCase();

        StringBuilder builder = new StringBuilder(str);

        for (int i = 0; i < builder.length(); i++) {

            if (builder.charAt(i) == '-'
                    || builder.charAt(i) == '*'
                    || builder.charAt(i) == '_'
                    || builder.charAt(i) == ' ') {


                builder.deleteCharAt(i);
                builder.replace(i, i + 1,
                        String.valueOf(
                                Character.toUpperCase(
                                        builder.charAt(i))));

            }
        }

        return builder.toString();

    }
    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(StringChallenge(s.nextLine()));
    }

}
