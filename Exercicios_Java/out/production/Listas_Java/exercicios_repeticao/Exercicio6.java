package exercicios_repeticao;

import java.util.Scanner;

public class Exercicio6 {

    // 6) Leia a idade de 20 pessoas e exiba a soma das idades.

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade " + i + ": ");
            int numero = entrada.nextInt();
            soma += numero;
        }

        System.out.println("A soma das 20 idades é: " + soma);
    }
}
