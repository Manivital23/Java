package lista_2;

import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o saldo atual: ");
        double valor = entrada.nextDouble();

        double reajuste = valor * 0.015;
        double valorTotal = valor + reajuste;

        System.out.printf("O seu saldo pós reajuste é: %.2f%n ", valorTotal);


    }
}
