package lista_1;

import java.util.Scanner;

public class exercicio4 {

        public static void main(String[] args) {

                Scanner entrada = new Scanner(System.in);

                System.out.println("Olá, seja bem-vindo à MedIndustria!");
                System.out.print("Insira a porcentagem do IPI a ser acrescida no valor das peças: ");
                double ipi = entrada.nextDouble();

                System.out.print("Insira o código da peça 1: ");
                int codPeca1 = entrada.nextInt();

                System.out.print("Insira o valor unitário da peça 1: ");
                double valPeca1 = entrada.nextDouble();

                System.out.print("Insira a quantidade da peça 1: ");
                int quantidadePeca1 = entrada.nextInt();

                System.out.print("Insira o código da peça 2: ");
                int codPeca2 = entrada.nextInt();

                System.out.print("Insira o valor unitário da peça 2: ");
                double valPeca2 = entrada.nextDouble();

                System.out.print("Insira a quantidade da peça 2: ");
                int quantidadePeca2 = entrada.nextInt();

                double total = (valPeca1 * quantidadePeca1 + valPeca2 * quantidadePeca2) * (ipi / 100 + 1);

                System.out.printf("O valor total da sua compra com taxas é: R$"+total);

                entrada.close();
        }
}
