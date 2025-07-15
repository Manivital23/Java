package exercicios_repeticao;

import java.util.Scanner;

public class Exercicio13 {

    //13) Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100.

    public static void main(String[] args) {

        int n, entre = 0, i;

        Scanner entrada = new Scanner(System.in);

        for (i = 1; i <= 20; i++){

            System.out.println("Digite o " + i + " numero");
            n = entrada.nextInt();

            if(n >= 0 && n <= 100){
                entre++;
            }
        }
        System.out.println("A quantidade numeros entre 0 e 100 são: " + entre);
    }
}