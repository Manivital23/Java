package segunda_aula;

import java.util.Scanner;

public class Idade {

    public static void main(String[] args) {

        int anos;
        int meses;
        int dias;
        int idadeEmDias;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com sua idade em anos: ");
        anos = entrada.nextInt();

        System.out.print("Entre com os meses: ");
        meses = entrada.nextInt();

        System.out.print("Entre com os dias: ");
        dias = entrada.nextInt();

        idadeEmDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("Sua idade expressa em dias é: " + idadeEmDias + " dias.");

    }

}
