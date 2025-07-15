package segunda_aula;

import java.util.Scanner;

public class SalarioMinimo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = entrada.nextFloat();

        System.out.print("Digite o seu salário: ");
        double salarioUsuario = entrada.nextFloat();

        double quantidadeSalarios = salarioUsuario / salarioMinimo;

        System.out.println("Você ganha " + String.format("%.0f", quantidadeSalarios ) + " salários mínimos."); //String.format("%.0f" = serve para tirar os zeros
    }

}
