package lista_2;

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Esse número é divisivel por 2!");
        }else if(numero % 5 == 0){
            System.out.println("Esse numero é divisivel por 5!");
        }else if(numero % 10 == 0){
            System.out.println("Esse numero é divisivel por 10!");
        }else{
            System.out.println("Esse numero não é divisivel por 2, 5 nem por 10!");
        }

    }
}
