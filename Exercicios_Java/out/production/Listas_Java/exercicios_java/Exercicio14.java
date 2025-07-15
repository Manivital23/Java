package exercicios_java;

import java.util.Scanner;

public class Exercicio14 {

    //Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números.


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            int num = scanner.nextInt();
            soma += num;
        }

        System.out.println("A soma dos 10 números digitados é: " + soma);
    }
}
