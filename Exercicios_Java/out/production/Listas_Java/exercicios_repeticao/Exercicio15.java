package exercicios_repeticao;

import java.util.Scanner;

public class Exercicio15 {

    //15) Escreva um algoritmo que leia uma sequência de números do usuário e realize a soma desses números. Encerre a execução quando um número negativo for digitado.

public static void main(String[] args) {

        int n ,soma = 0, i;

        Scanner entrada = new Scanner(System.in);

        for (i = 1; i > 0;){

            System.out.println("Digite o número: ");
            n = entrada.nextInt();
            soma += n;

            if (n < 0){
                i = -1;
            }
        }

        System.out.println("A soma dos números é: " + soma);
    }
}
