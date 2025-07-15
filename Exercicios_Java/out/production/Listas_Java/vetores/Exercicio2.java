package vetores;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        int soma = 0;
        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Número" + (1 + 1) + ": ");

            numeros[i] = scanner.nextInt();
            soma += numeros[i];

            System.out.println("Números digitados: " + Arrays.toString(numeros));
            System.out.println("Soma total:" + soma);

        }
    }
}