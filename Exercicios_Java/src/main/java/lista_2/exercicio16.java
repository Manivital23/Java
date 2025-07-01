package lista_2;

import java.util.Scanner;

public class exercicio16 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int somaIdades = 0;

        for (int i = 1; i <= 20; i++){
            System.out.println("Digite a " +  i + " ° idade");
            int idade = entrada.nextInt();

           somaIdades += idade;
        }

        double media = somaIdades / 20;

        System.out.println("A média das idades é: " + media);
    }

}
