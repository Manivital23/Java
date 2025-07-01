package lista_2;

import java.util.Scanner;

public class exercicio19 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a cotação em reais da moeda a ser convertida.");
        double moeda = entrada.nextDouble();

        System.out.println("Quantos dinheiros você possui?");
        double quantidade = entrada.nextDouble();


        double conversao = moeda * quantidade;

        System.out.printf("No total você tem: R$ %.2f%n", conversao);

    }
}
