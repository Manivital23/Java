package exercicios_java;

import java.util.Scanner;

public class Exercicio4 {

    //4- Dados três valores A, B e C, construa um programa em JAVA, que imprima os valores de forma descendente (do maior para o menor).

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o valor de A: ");
            int a = scanner.nextInt();

            System.out.print("Digite o valor de B: ");
            int b = scanner.nextInt();

            System.out.print("Digite o valor de C: ");
            int c = scanner.nextInt();

            if (a >= b && b >= c) {
                System.out.println(a + ", " + b + ", " + c);

            } else if (a >= c && c >= b) {
                System.out.println(a + ", " + c + ", " + b);

            } else if (b >= a && a >= c) {
                System.out.println(b + ", " + a + ", " + c);

            } else if (b >= c) {
                System.out.println(b + ", " + c + ", " + a);

            } else if (a >= b) {
                System.out.println(c + ", " + a + ", " + b);

            } else {
                System.out.println(c + ", " + b + ", " + a);
            }
        }
    }

