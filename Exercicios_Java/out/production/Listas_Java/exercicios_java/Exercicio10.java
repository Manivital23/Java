package exercicios_java;

import java.util.Scanner;

public class Exercicio10 {

    // informar um saldo e imprimir o saldo com reajuste de 1.5%

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu saldo: R$ ");
        double saldo = scanner.nextDouble();

        double saldoReajustado = saldo + saldo * 0.015;

        System.out.printf("Seu saldo com reajuste de 1.5%% é: R$ %.2f%n", saldoReajustado);

    }
}
