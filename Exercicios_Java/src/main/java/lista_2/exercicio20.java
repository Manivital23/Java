package lista_2;

import java.util.Scanner;

public class exercicio20 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numeroMaior = 0;

        for(int i = 1; i <= 20; i++){
            System.out.println("Digite o " + i + "° número:");
            int numero = entrada.nextInt();

            if(numero > 8){
                numeroMaior++;
            }
        }

        System.out.println("Existem " + numeroMaior + " número(s) maior(es) que 8");

    }
}
