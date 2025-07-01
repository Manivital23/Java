package lista_3;

import java.util.Scanner;

public class EX_12 {
    public static void main(String[] args) {
        int n,pares=0, i;
        Scanner entrada = new Scanner(System.in);

        for (i=1;i<=20; i++){
            System.out.println("entre com o "+i+"° numero");
            n = entrada.nextInt();

            if(n % 2 == 0){
                pares++;
            }
        }
        System.out.println("A quantidade numeros de pares são: " + pares);
    }
}