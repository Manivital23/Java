package exercicios_repeticao;

import java.util.Scanner;

public class Exercicio12 {

   //12) Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são pares.

    public static void main(String[] args) {

        int n, par= 0, i;

        Scanner entrada = new Scanner(System.in);

        for (i = 1; i <= 20; i++){

            System.out.println("Digite o " + i + " numero");
            n = entrada.nextInt();

            if(n % 2 == 0){
                par++;
            }
        }
        System.out.println("A quantidade de números pares é: " + par);
    }
}