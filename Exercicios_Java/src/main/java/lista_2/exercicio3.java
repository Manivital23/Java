package lista_2;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Seja bem vindo à MedGur Econômica Federal!");
        System.out.println("Insira o saldo médio:");
        double saldoMedio = entrada.nextDouble();
        double credito = 0;

        if(saldoMedio <= 500){
            credito = 0;
        }else if(saldoMedio <= 1000){
            credito = saldoMedio * 0.30;
        }else if(saldoMedio <= 3000){
            credito = saldoMedio * 0.40;
        }else{
            credito = saldoMedio * 0.50;
        }

        System.out.println("O saldo médio é de R$ " + saldoMedio);
        System.out.println("O crédito disponível é de R$ " + credito);
    }
}
