package lista_3;

import java.util.Scanner;

public class EX_14 {
    public static void main(String[] args) {
        int n,cem=0,duzentos=0,maior=0, i;
        Scanner entrada = new Scanner(System.in);

        for (i=1;i<=20; i++){
            System.out.println("entre com o "+i+"° numero");
            n = entrada.nextInt();

            if(n >= 0 && n <= 100){
                cem++;
            } else if (n >= 101 && n <= 200) {
                duzentos++;
            }
            else if (n > 200) {
                maior++;
            }
        }
        System.out.println("A quantidade numeros entre 0 e 100 são: " + cem);
        System.out.println("A quantidade numeros entre 101 e 200 são: " + duzentos);
        System.out.println("A quantidade numeros maiores que 200: " + maior);

    }
}