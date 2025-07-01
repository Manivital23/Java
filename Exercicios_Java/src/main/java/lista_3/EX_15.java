package lista_3;

import java.util.Scanner;

public class EX_15 {
    public static void main(String[] args) {
        int n,soma=0, i;
        Scanner entrada = new Scanner(System.in);
        for (i=1;i > 0;){
            System.out.println("entre com um numero: ");
            n = entrada.nextInt();
            soma+=n;
            if (n < 0){
                i = -1;
            }
        }
        System.out.println("A soma dos numeros é: " + soma);
    }
}
