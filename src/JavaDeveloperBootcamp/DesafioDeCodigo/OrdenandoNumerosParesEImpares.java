package JavaDeveloperBootcamp.DesafioDeCodigo;

// Ordenando Números Pares e Ímpares

/* Crie um programa onde você receberá valores inteiros não negativos como
entrada.
Ordene estes valores de acordo com o seguinte critério:
- Primeiro os Pares
- Depois os Ímpares
- Você deve exibir os pares em ordem crescente e na sequência os ímpares em
ordem decrescente.
- Entrada
A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000)
Este é o número de linhas de entrada que vem logo a seguir. As próximas N
linhas terão, cada uma delas, um valor inteiro não negativo.
- Saída
Exiba todos os valores lidos na entrada segundo a ordem apresentada acima.
Cada número deve ser impresso em uma linha, conforme exemplo de saída abaixo.
*/

import java.util.Arrays;
import java.util.Scanner;

public class OrdenandoNumerosParesEImpares {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int entrada = scan.nextInt();

        int[] numeros = new int[entrada];

        for (int i = 0; i < entrada; i++) {
            int nomeQlqr = scan.nextInt();
            numeros[i] = nomeQlqr;
        }

        Arrays.sort(numeros);

      // numeros pares em ordem crescente

        for (int j = 0; j < entrada; j++) {

            if (numeros[j] % 2 == 0) {
                System.out.print(numeros[j] + "\n ");
            }
        }

        // ímpar em ordem decrescente


        for(int j = (entrada -1); j >= 0; j--) {
            if (numeros[j] % 2 == 1) {
                System.out.print(numeros[j] + "\n ");
            }
        }
    }
}
