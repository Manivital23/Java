package lista_2;

import java.util.Scanner;

public class exercicio22 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numeroEntre = 0;

        for(int i = 1; i <= 20; i++){
            System.out.println("Digite o " + i + "° número:");
            int numero = entrada.nextInt();

            if(numero >= 0 && numero <= 100){
                numeroEntre++;
            }
        }

        System.out.println("Existem " + numeroEntre + " número(s) entre 0 e 100");

    }
}
