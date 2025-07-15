package exercicios_java;

import java.util.Scanner;

public class Exercicio11 {

    //Escreva um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mes (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome , o salário fixo e salário no final do mes.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do vendedor: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário fixo: R$ ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o total de vendas no mês: R$ ");
        double totalVendas = scanner.nextDouble();

        double comissao = totalVendas * 0.15;

        double salarioFinal = salarioFixo + comissao;

        System.out.println("Resumo do Vendedor:");
        System.out.println("Nome: " + nome);
        System.out.printf("Salário fixo: R$ %.2f%n", salarioFixo);
        System.out.printf("Salário final com comissão: R$ %.2f%n", salarioFinal);

    }
}