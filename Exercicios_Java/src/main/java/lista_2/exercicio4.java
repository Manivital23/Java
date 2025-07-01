package lista_2;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        int numero1 = entrada.nextInt();

        System.out.println("Insira o segundo número: ");
        int numero2 = entrada.nextInt();

        System.out.println("Insira o terceiro número: ");
        int numero3 = entrada.nextInt();

        int numeroMaior;
        int numeroMedio;
        int numeroMenor;

        if(numero1 >= numero2 && numero1 >= numero3){
            numeroMaior = numero1;
            if(numero2 >= numero3){
                numeroMedio = numero2;
                numeroMenor = numero3;
            }else{
                numeroMedio = numero3;
                numeroMenor = numero2;
            }
        }else if(numero2 >= numero1 && numero2 >= numero3){
            numeroMaior = numero2;
            if(numero1 >= numero3){
                numeroMedio = numero1;
                numeroMenor = numero3;
            }else{
                numeroMedio = numero3;
                numeroMenor = numero1;
            }
        }else{
            numeroMaior = numero3;
            if(numero1 >= numero2){
                numeroMedio = numero1;
                numeroMenor = numero2;
            }else{
                numeroMedio = numero2;
                numeroMenor = numero1;
            }
        }

        System.out.println("A ordem decrescente dos números é: " + numeroMaior + ", " + numeroMedio + ", " + numeroMenor);


    }
}
