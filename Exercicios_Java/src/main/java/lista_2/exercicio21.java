package lista_2;

import java.util.Scanner;

public class exercicio21 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o valor da sua compra?");
        double valor = entrada.nextDouble();

        double prestacao = valor / 5;

        System.out.println("Segue valor das parcelas:");
        System.out.printf("1° parcela: R$ %.2f%n", prestacao);
        System.out.printf("2° parcela: R$ %.2f%n", prestacao);
        System.out.printf("3° parcela: R$ %.2f%n", prestacao);
        System.out.printf("4° parceça: R$ %.2f%n", prestacao);
        System.out.printf("5° parcela: R$ %.2f%n", prestacao);
    }
}

