package exercicios_repeticao;

import java.util.Scanner;

public class Exercicio8 {

    //8) Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade.

    public static void main(String[] args) {

        int n , maior= 0, i;

        Scanner entrada = new Scanner(System.in);

        for (i = 1; i <= 20; i++){
            System.out.println("Digite a idade da " + i + " pessoa");
            n = entrada.nextInt();

            if(n >= 18){
                maior++;
            }
        }
        System.out.println("A quantidade de pessoas maiores de idade são: " + maior);
    }
}
