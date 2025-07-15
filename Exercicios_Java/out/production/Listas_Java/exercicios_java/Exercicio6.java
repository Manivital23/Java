package exercicios_java;

import java.util.Scanner;

public class Exercicio6 {

    //6- Desenvolva um programa em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor.

        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            System.out.print("Informe um número inteiro: ");
            int numero = entrada.nextInt();

            int antecessor = numero - 1;
            int sucessor = numero + 1;

            System.out.println("Antecessor: " + antecessor);
            System.out.println("Sucessor: " + sucessor);

        }

    }
