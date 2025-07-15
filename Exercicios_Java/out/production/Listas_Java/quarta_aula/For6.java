package quarta_aula;

import java.util.Scanner;

public class For6 {
    public static void main(String[] args) {

        int n1, numero, par = 0, impar = 0;

        Scanner entrada = new Scanner(System.in);

        for (n1 = 1; n1<=10; n1++){
            System.out.println("Entre com " +n1 + " o. numero:");
            numero = entrada.nextInt();

            if (numero %2 == 0){
                par+=1;
            }else{
                impar+=1;
            }
        }

        System.out.println("Voce tem: " + par + " numeros pares" + impar + " numeros impares:");
    }
}
