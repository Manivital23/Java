package exercicios_repeticao;

import java.util.Scanner;

public class Exercicio10 {

    //10) Crie um algoritmo leia um número do usuário e exiba a sua tabuada de multiplicação.

    public static void main(String[] args) {

        int n , i , multiplicacao = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número da tabela: ");
        n = entrada.nextInt();

        for (i = 1; i <= 10; i++){
            multiplicacao = n * i;

            System.out.println(n +" * "+ i +" = "+ multiplicacao);
        }
    }
}
