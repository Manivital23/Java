package exercicios_repeticao;

import java.util.Scanner;

public class Exercico3 {

    // 3) Leia o nome do usuário e escreva o nome dele na tela 10 vezes.

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        for (int i = 0; i < 10; i++) {
            System.out.println("Nome do usuário: " + nome);
        }
    }
}
