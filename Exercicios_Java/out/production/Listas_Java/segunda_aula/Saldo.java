package segunda_aula;

import java.util.Scanner;

public class Saldo {

    public static void main(String[] args) {

        int saldo;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com seu saldo: ");
        saldo = entrada.nextInt();

        double reajuste = saldo * 1.01;

        System.out.println("Saldo com reajuste de 1%: " + reajuste);

    }
}