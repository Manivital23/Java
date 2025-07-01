package lista_3;

import java.util.Scanner;

public class EX_06 {
    public static void main(String[] args) {
        int n,soma=0, i;
        Scanner entrada = new Scanner(System.in);

        for (i=1;i<=20; i++){
            System.out.println("entre com a idade da "+i+"° pessoa");
            n = entrada.nextInt();
            soma+=n;
        }
        System.out.println("A soma das idades é: " + soma);
    }
}
