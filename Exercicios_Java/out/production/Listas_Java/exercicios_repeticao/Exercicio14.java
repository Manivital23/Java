package exercicios_repeticao;

import java.util.Scanner;

public class Exercicio14 {

    //14) Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100, quantos estão entre 101 e 200 e quantos são maiores de 200.

    public static void main(String[] args) {

        int n, entre1 = 0, entre2 = 0, maior = 0, i;

        Scanner entrada = new Scanner(System.in);

        for (i = 1; i <= 20; i++){

            System.out.println("Digite o " + i + " numero");
            n = entrada.nextInt();

            if(n >= 0 && n <= 100){
                entre1++;
            } else if (n >= 101 && n <= 200) {
                entre2++;
            }
            else if (n > 200) {
                maior++;
            }
        }
        System.out.println("A quantidade de números entre 0 e 100 é: " + entre1);
        System.out.println("A quantidade de números entre 101 e 200 é: " + entre2);
        System.out.println("A quantidade de números maiores que 200 é: " + maior);

    }
}