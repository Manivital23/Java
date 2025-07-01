package lista_2;

import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float salarioMinimo= 1518;

        System.out.println("Insira seu salário");
        float salario = entrada.nextFloat();

        float quantidadeSalarios = salario / salarioMinimo;

        System.out.printf("Você ganha aproximadamente: %.2f salários mínimos.%n", quantidadeSalarios);
    }
}
