/* Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos
valores informados são pares, quantos valores informados são ímpares, quantos
valores informados são positivos e quantos valores informados são negativos.
- Entrada
Você receberá 5 valores inteiros.
- Saída
Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por
linha e não esquecendo o final de linha após cada uma. */



package JavaDeveloperBootcamp;

import java.io.IOException;
import java.util.Scanner;

public class LeituraParesImpares {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

//declare suas variaveis corretamente
        int impar = 0;
        int par = 0;
        int positivo = 0;
        int negativo = 0;


//continue a solução

        for (int i = 0; i < 5; i++) {
            int numero;
            numero = leitor.nextInt();

            if(numero % 2 == 0) {
                par++;
                }

            else {
                impar++;
            }

            if(numero > 0) {
                positivo++;

            } else if (numero < 0) {
                negativo++;
            }
        }
//insira suas variaveis corretamente
        System.out.println( "" + par + " par(es)");
        System.out.println( "" + impar + " impar(es)");
        System.out.println( "" + positivo + " positivo(s)");
        System.out.println( "" +  negativo + " negativo(s)");
    }

}