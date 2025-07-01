package lista_1;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos anos você tem? ");
        int anos = entrada.nextInt();

        System.out.print("E quantos meses? ");
        int meses = entrada.nextInt();

        System.out.print("E quantos dias? ");
        int dias = entrada.nextInt();

        int totalDias = (anos * 365) + (meses * 30) + dias;


        System.out.println(anos + " anos, " + meses + " meses e " + dias);
        System.out.println("Você já viveu por " + totalDias + " dias.");
    }
}
