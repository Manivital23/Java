package exercicios_repeticao;

import java.util.Scanner;

public class Exercicio7 {

    // 7) Leia a idade de 20 pessoas e exiba a média das idades.

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade " + i + ": ");
            int numero = entrada.nextInt();
            soma += numero;
        }

        int media = soma / 20;

        System.out.println("A média das idades é: " + media);
    }
}
