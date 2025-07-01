package lista_3;

import java.util.Scanner;

public class EX_09 {
    public static void main(String[] args) {
        int n, i,menor=100;
        String nome,menorn = "";
        Scanner entrada = new Scanner(System.in);

        for (i=1;i<=5; i++){
            System.out.println("entre com o nome da "+i+"° pessoa");
            nome = entrada.next();
            System.out.println("entre com a idade da "+i+"° pessoa");
            n = entrada.nextInt();
if (n < menor){
    menor = n;
    menorn = nome;
}
        }
        System.out.println("A pessoa mais nova é " + menorn + " com " + menor + " anos de idade");
    }
}
