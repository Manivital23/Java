package lista_2;

import java.util.Scanner;

public class exercicio14 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o " + i + "° número");
            int numero = entrada.nextInt();
            soma += numero;
        }

        System.out.println("A soma desses números é igual a " + soma);
    }
}
