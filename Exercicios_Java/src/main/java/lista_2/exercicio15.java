package lista_2;

import java.util.Scanner;

public class exercicio15 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int somaIdades = 0;

        for (int i = 1; i <= 20; i++){
            System.out.println("Digite a " +  i + " ° idade");
            int idade = entrada.nextInt();

           somaIdades += idade;
        }

        System.out.println("A soma das idades é: " + somaIdades);
    }

}
