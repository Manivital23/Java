package lista_1;

import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int numero = entrada.nextInt();

        int sucessor = numero + 1;
        int antecessor = numero - 1;

        System.out.println("O número escolhido foi: " + numero);
        System.out.println("O sucessor do seu número é: " + sucessor);
        System.out.println("E o antecessor é: " + antecessor);
    }
}
