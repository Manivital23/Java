package lista_2;

import java.util.Scanner;

public class exercicio11 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Olá, bem vindo à MedSapatos!");
        System.out.println("Vamos agora conferir suas vendas deste mês.");

        System.out.println("Insira seu nome:");
        String nome = entrada.nextLine();

        System.out.println(nome + " Insira seu salário:");
        double salario = entrada.nextDouble();

        System.out.println(nome + " Insira o quanto você vendeu em reais este mês");
        double vendas = entrada.nextInt();

        double comissao = vendas * 0.15;
        double salarioFinal = salario + comissao;



        System.out.println("Funcionário: " + nome);
        System.out.printf("Sálario: R$ %.2f%n", salario);
        System.out.printf("Vendas: R$ %.2f%n", vendas);
        System.out.printf("Comissão: R$ %.2f%n", comissao);
        System.out.printf("Salário final: R$ %.2f%n", salarioFinal);

    }
}
