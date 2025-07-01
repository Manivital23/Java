package lista_3;

import java.util.Scanner;

public class EX_03 {
    public static void main(String[] args) {
        String nome;
        int i;

        Scanner entrada = new Scanner(System.in);

        System.out.println("qual seu nome?");
        nome = entrada.next();
        for (i=0;i<=15;i++){
            System.out.println(nome);
        }
    }
}
