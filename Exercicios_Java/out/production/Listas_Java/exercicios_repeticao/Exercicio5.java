package exercicios_repeticao;

import java.util.Scanner;

public class Exercicio5 {

    // 5) Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números.

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + " número: ");
            int numero = entrada.nextInt();
            soma += numero;
        }

        System.out.println("A soma dos 10 números é: " + soma);

        entrada.close();
    }
}
