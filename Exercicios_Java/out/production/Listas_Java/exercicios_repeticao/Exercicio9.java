package exercicios_repeticao;

import java.util.Scanner;

public class Exercicio9 {

    //9) Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.

    public static void main(String[] args) {

        int n, i, menor = 100;

        String nome, menorzinho = "";
        Scanner entrada = new Scanner(System.in);

        for (i = 1; i <= 5; i++) {
            System.out.println("Digite o nome da " + i + " pessoa");
            nome = entrada.next();

            System.out.println("Digite o nome da " + i + "° pessoa");
            n = entrada.nextInt();

            if (n < menor) {
                menor = n;
                menorzinho = nome;
            }
        }
        System.out.println("A pessoa mais nova é " + menorzinho + " com " + menor + " anos de idade");
    }
}
