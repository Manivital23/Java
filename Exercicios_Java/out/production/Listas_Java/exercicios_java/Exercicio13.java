package exercicios_java;

import java.util.Scanner;

public class Exercicio13 {

    //Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula da conversão é: F=(9*C+160) /5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (9 * celsius + 160) / 5;

        System.out.printf("Temperatura em Fahrenheit: %.2f°F%n", fahrenheit);
    }
}
