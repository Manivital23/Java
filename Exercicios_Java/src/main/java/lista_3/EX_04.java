package lista_3;

import java.util.Scanner;

public class EX_04 {
    public static void main(String[] args) {
        String nome;
        int n = 0, i;

        Scanner entrada = new Scanner(System.in);

        System.out.println("qual seu nome? ");
        nome = entrada.next();
        System.out.println("Quantas vezes quer que seu nome se repita? ");
        n = entrada.nextInt();
        for (i=0;i<=n; i++){
            System.out.println(nome);
        }
    }
}
