package exercicios_java;

import java.util.Scanner;

public class Exercicio9 {

    //Crie um programa que leia o valor do salário mínimo e o valor do salário de um usuário, calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado. (Salário mínimo = R$1.212,00).

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double salarioMinimo = 1212.00;

            System.out.print("Digite o valor do seu salário: R$ ");
            double salarioUsuario = scanner.nextDouble();

            double quantidadeSalarios = salarioUsuario / salarioMinimo;

            System.out.printf("Você ganha %.2f salários mínimos.%n", quantidadeSalarios);

        }
    }