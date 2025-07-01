package lista_1;

import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float salarioMinimo= 1518;

        System.out.println("Qual o valor do seu salário?");
        float salario = entrada.nextFloat();

        float quantidadeSalarios = salario / salarioMinimo;

        System.out.printf("Você ganha aproximadamente: %.2f salários mínimos.%n", quantidadeSalarios);
    }
}
