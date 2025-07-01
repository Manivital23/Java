package lista_2;

import java.util.Scanner;

public class exercicio23 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numeroEntre0 = 0;
        int numeroEntre101 = 0;
        int numeroMaior = 0;

        for(int i = 1; i <= 20; i++) {
            System.out.println("Digite o " + i + "° número:");
            int numero = entrada.nextInt();

            if(numero >= 0 && numero <= 100){
                numeroEntre0++;
            }else if(numero >= 101 && numero <= 200){
                numeroEntre101++;
            }else if(numero >= 201){
                numeroMaior++;
            }
        }

        System.out.println("Nesse grupo:");
        System.out.println(numeroEntre0 + " número(s) é/estão entre 0 e 100");
        System.out.println(numeroEntre101 + " número(s) é/estão entre 101 e 200");
        System.out.println(numeroMaior + " número(s) é/são maior(es) que 200");
    }
}
