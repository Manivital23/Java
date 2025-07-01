package lista_3;

import java.util.Scanner;

public class EX_13 {
    public static void main(String[] args) {
        int n,cem=0, i;
        Scanner entrada = new Scanner(System.in);

        for (i=1;i<=20; i++){
            System.out.println("entre com o "+i+"° numero");
            n = entrada.nextInt();

            if(n >= 0 && n <= 100){
                cem++;
            }
        }
        System.out.println("A quantidade numeros entre 0 e 100 são: " + cem);
    }
}