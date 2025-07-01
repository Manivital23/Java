package lista_3;

import java.util.Scanner;

public class EX_07 {
    public static void main(String[] args) {
        int n,soma=0, i;
        float media;
        Scanner entrada = new Scanner(System.in);

        for (i=1;i<=20; i++){
            System.out.println("entre com a idade da "+i+"° pessoa");
            n = entrada.nextInt();
            soma+=n;

        }
        media = soma / 20;
        System.out.println("A média das idades é: " + soma);
    }
}
