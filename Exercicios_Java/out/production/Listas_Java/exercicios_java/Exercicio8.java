package exercicios_java;

import java.util.Scanner;

public class Exercicio8 {

    // Escrever um programa que leia o valor - a porcentagem do IPI a ser acrescido no valor das peças, - o código da peça 1, valor unitário da peça 1, quantidade de peças 1, - o código da peça 2, valor unitário da peça 2, quantidade de peças 2. O programa deve calcular o valor total a ser pago e apresentar o resultado. Cálculo: (valor1*quant1 + valor2*quant2) * (IPI/100+1)

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite a porcentagem do IPI: ");
            float ipi = scanner.nextFloat();

            System.out.print("Digite o código da peça 1: ");
            int cod1 = scanner.nextInt();

            System.out.print("Digite o valor unitário da peça 1: ");
            float valor1 = scanner.nextFloat();

            System.out.print("Digite a quantidade da peça 1: ");
            int quant1 = scanner.nextInt();

            System.out.print("Digite o código da peça 2: ");
            int cod2 = scanner.nextInt();

            System.out.print("Digite o valor unitário da peça 2: ");
            float valor2 = scanner.nextFloat();

            System.out.print("Digite a quantidade da peça 2: ");
            int quant2 = scanner.nextInt();

            float total = (valor1 * quant1 + valor2 * quant2) * (ipi / 100 + 1);

            System.out.println("Valor total a pagar: R$ " + total);

        }
    }
