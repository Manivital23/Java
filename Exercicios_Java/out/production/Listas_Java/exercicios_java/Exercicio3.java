package exercicios_java;

import java.util.Scanner;

public class Exercicio3 {

    //3- A CEF concederá um crédito especial com juros de 2% aos seus clientes de acordo com o saldo médio no último ano. Fazer um programa em JAVA que leia o saldo médio de um cliente e calcule o valor do crédito de acordo com a tabela a seguir. Imprimir uma mensagem informando o saldo médio e o valor de crédito.

    public static void main(String[] args) {

        double saldoMedio, credito = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu saldo médio: ");
        saldoMedio = entrada.nextDouble();

        if (saldoMedio >= 0 && saldoMedio <= 500) {
            credito = 0;

            System.out.println("Você não tem direito a crédito.");

        } else if (saldoMedio <= 1000) {
            credito = saldoMedio * 0.3;
        } else if (saldoMedio <= 3000) {
            credito = saldoMedio * 0.4;
        } else {
            credito = saldoMedio * 0.5;
        }

        System.out.println("Saldo médio: R$" + saldoMedio);
        System.out.println("Valor do crédito: R$" + credito);
    }
}