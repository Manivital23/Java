package exercicios_repeticao;

import java.util.Scanner;

public class Exercicio4 {

    //4) Leia o nome um número do usuário um número N e escreva o nome dele na tela N vezes.

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite um número: ");
        int N = entrada.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println("Nome do usuário: " + nome);
        }
    }
}
