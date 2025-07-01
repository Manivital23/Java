package lista_3;

import java.util.Scanner;

public class EX_05 {
    public static void main(String[] args) {
        int n,soma = 0, i;
        Scanner entrada = new Scanner(System.in);
        for (i=1;i<=10; i++){
            System.out.println("entre com o "+i+"° numero");
            n = entrada.nextInt();
            soma+=n;
        }
        System.out.println(soma);
    }
}
