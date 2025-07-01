package lista_1;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o saldo: ");

        float saldo = entrada.nextFloat();

        double reajuste = saldo * 1.01;

        System.out.println("Saldo com reajuste de 1%: R$ " + reajuste);
    }
}