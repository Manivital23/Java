package exercicios_java;

import java.util.Scanner;

public class Exercicio1 {

    //1-Criar um programa em Java, que informe a quantidade total de calorias de uma refeição a partir do usuário que deverá informar o prato, a sobremesa e a bebida (veja a tabela a seguir).
    //Sugestão: enumere cada opção de prato, sobremesa e bebida. Ou seja: Prato: 1 - vegetariano, 2 – Peixe, 3 – Frango, 4 – Carne; Sobremesa: 1 – Abacaxi, 2 – Sorvete diet, 3 – Mouse diet, 4 – Mouse chocolate; Bebida: 1 – Chá, 2 - Suco de laranja, 3 – Suco de melão, 4 – Refrigerante diet.

        public static void main (String[] args){ //psvm = abreviação

            Scanner entrada = new Scanner(System.in);

            int Prato;
            int Sobremesa;
            int Bebida;
            int Caloria = 0;

            int Vegetariano = 180;
            int Peixe = 230;
            int Frango = 250;
            int Carne = 350;
            int Abacaxi = 75;
            int Sorvete = 110;
            int MouseD = 170;
            int MouseC = 200;
            int Cha = 20;
            int SucoL = 70;
            int SucoM = 100;
            int RefriD = 65;

            System.out.println("Escolha o prato: 1- Vegetariano, 2- Peixe, 3- Frango, 4- Carne: ");
            Prato = entrada.nextInt();

            switch(Prato) {
                case 1: Caloria += 180; break;
                case 2: Caloria += 230; break;
                case 3: Caloria += 250; break;
                case 4: Caloria += 350; break;
                default: System.out.println("Prato inválido");
            }

            System.out.println("Escolha o Sobremesa: 1- Abacaxi, 2- SorveteD, 3- MouseD, 4- MouseC: ");
            Sobremesa = entrada.nextInt();

            switch(Sobremesa) {
                case 1: Caloria += 75; break;
                case 2: Caloria += 110; break;
                case 3: Caloria += 170; break;
                case 4: Caloria += 200; break;
                default: System.out.println("Sobremesa inválida");
            }

            System.out.println("Escolha o Sobremesa: 1- Cha, 2- SucoL, 3- SucoM, 4- RefriD: ");
            Bebida = entrada.nextInt();

            switch(Bebida) {
                case 1: Caloria += 20; break;
                case 2: Caloria += 70; break;
                case 3: Caloria += 100; break;
                case 4: Caloria += 65; break;
                default: System.out.println("Bebida inválida");
            }
        }
}
