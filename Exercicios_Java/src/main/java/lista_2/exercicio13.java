package lista_2;

import java.util.Scanner;

public class exercicio13 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a temperatura na sua cidade hoje?");
        int grausCelsius = entrada.nextInt();

        int fahrenheit = (9 * grausCelsius + 160)/5;

        System.out.println("Esta temperatura " + grausCelsius + "°C" + " em Fahrenheit fica " + fahrenheit + "°F");


    }
}
