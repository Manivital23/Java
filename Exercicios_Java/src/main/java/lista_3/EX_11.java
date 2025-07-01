package aula_01;

import java.util.Scanner;

public class EX_11 {
    public static void main(String[] args) {
        int n,maior=0, i;
        Scanner entrada = new Scanner(System.in);

        for (i=1;i<=20; i++){
            System.out.println("entre com o "+i+"° numero");
            n = entrada.nextInt();

            if(n>=8){
                maior++;
            }
        }
        System.out.println("A quantidade de numeros maiores que 8 são: " + maior);
    }
}