package quarta_aula;

import java.util.Scanner;

public class For5 {
    public static void main(String[] args) {

        int numero;
        int contador;

        Scanner scanner = new Scanner(System.in);

        for (contador = 1; contador <= 10; contador++) {
            System.out.println("Digite um numero: ");

            numero = scanner.nextInt();

            if (numero %2 == 0){
                System.out.println("O numero é Par" + numero);
            }else{
                System.out.println("O numero é ímpar" + numero);
            }
        }
    }
}