package lista_3;

import java.util.Scanner;

public class EX_08 {
    public static void main(String[] args) {
        int n,maior=0, i;
        Scanner entrada = new Scanner(System.in);

        for (i=1;i<=20; i++){
            System.out.println("entre com a idade da "+i+"° pessoa");
            n = entrada.nextInt();

            if(n>=18){
                maior++;
            }
        }
        System.out.println("A quantidade de pessoas maiores de idade são: " + maior);
    }
}
