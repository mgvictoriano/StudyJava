public class Mdc {


    /* Desafio de matemática
Faça com que a função MathChallenge( num1 , num2 ) pegue ambos os parâmetros sendo passados e retorne o Greatest Common Factor .
Ou seja, retorne o maior número que entra igualmente em ambos os números sem resto. Por exemplo: 12 e 16 ambos são divisíveis por
1, 2 e 4, então a saída deve ser 4. O intervalo para ambos os parâmetros será de 1 a 10^3.
*/

    public static int MDC(int a, int b) {
        int resto;

        while (b != 0) {
            resto = a % b;
            a = b;
            b = resto;
        }

        return a;
    }
}
