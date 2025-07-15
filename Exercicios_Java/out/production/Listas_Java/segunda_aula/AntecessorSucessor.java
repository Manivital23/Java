package segunda_aula;

import java.util.Scanner;

public class AntecessorSucessor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int numero = entrada.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);

    }

}
