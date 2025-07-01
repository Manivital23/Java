package lista_2;

import java.util.Scanner;

public class exercicio24 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;
        int soma = 0;

        System.out.println("Digite números para somar. Mas se adicionar um número negativo, a conta se encerra!");

        while(true){
            System.out.println("Digite um número: ");
            numero = entrada.nextInt();

            if(numero < 0){
                break;
            }

            soma += numero;
        }

        System.out.println("Conta encerrada!");
        System.out.println("A soma dos números digitados é: " + soma);
    }
}
