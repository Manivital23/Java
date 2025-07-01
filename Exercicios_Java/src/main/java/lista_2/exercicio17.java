package lista_2;

import java.util.Scanner;

public class exercicio17 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int maioridade = 0;

        for (int i = 1; i <= 20; i++){
            System.out.println("Digite a " +  i + " ª idade");
            int idade = entrada.nextInt();

            if (idade >= 18){
                maioridade++;
            }
        }

        System.out.println("Nesse grupo, " + maioridade  + " são maiores de idade");

    }
}
