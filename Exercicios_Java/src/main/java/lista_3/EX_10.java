package lista_3;

import java.util.Scanner;

public class EX_10 {
    public static void main(String[] args) {
        int n,i,mult = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("entre com o numero da tabela: ");
        n = entrada.nextInt();

        for (i=1;i<=10; i++){
            mult = n * i;
            System.out.println(n +" * "+ i +" = "+ mult);
        }
    }
}
