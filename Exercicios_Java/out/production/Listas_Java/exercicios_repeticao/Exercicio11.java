package exercicios_repeticao;

import java.util.Scanner;

public class Exercicio11 {

    //11) Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são maiores do que 8.

    public static void main(String[] args) {

        int n, maior= 0, i;

        Scanner entrada = new Scanner(System.in);

        for (i = 1; i <= 20; i++){

            System.out.println("Digite o " + i + " numero");
            n = entrada.nextInt();

            if(n >= 8){
                maior++;
            }
        }
        System.out.println("A quantidade de números maiores que 8 é: " + maior);
    }
}