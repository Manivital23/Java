package segunda_aula;

import java.util.Scanner;

public class CalculoIPI {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a porcentagem do IPI: ");
        double ipi = input.nextDouble();

        System.out.print("Digite o código da peça 1: ");
        int codigo1 = input.nextInt();

        System.out.print("Digite o valor unitário da peça 1: ");
        double valor1 = input.nextDouble();

        System.out.print("Digite a quantidade da peça 1: ");
        int quantidade1 = input.nextInt();

        System.out.print("Digite o código da peça 2: ");
        int codigo2 = input.nextInt();

        System.out.print("Digite o valor unitário da peça 2: ");
        double valor2 = input.nextDouble();

        System.out.print("Digite a quantidade da peça 2: ");
        int quantidade2 = input.nextInt();

        double total = (valor1 * quantidade1 + valor2 * quantidade2) * (ipi / 100 + 1);

        System.out.printf("O valor total a ser pago é: " + total);

    }
}
