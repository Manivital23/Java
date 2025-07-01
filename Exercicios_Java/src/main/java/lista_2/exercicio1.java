package lista_2;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // escolha do prato
        System.out.println("Olá, seja bem vindo à cantina da MedGur!");
        System.out.println("Para começar, selecione um prato:");
        System.out.println("1-vegano | 2-frutos do mar | 3-pato | 4-boi");
        int prato_principal = entrada.nextInt();

        // escolha da bebida
        System.out.println("Perfeitamente, agora escolha uma bebida");
        System.out.println("1-chá | 2-suco | 3-vinho | 4-refrigerante");
        int bebida = entrada.nextInt();

        System.out.println("E, por fim, escolha uma sobremesa");
        System.out.println("1-salada de frutas | 2-banana split | 3-mousse de maracujá | 4-mousse de limão");
        int sobremesa = entrada.nextInt();

        int caloriasPrato = 0;
        int caloriasBebida = 0;
        int caloriasSobremesa = 0;

        switch (prato_principal) {
            case 1: caloriasPrato = 130; break;
            case 2: caloriasPrato = 220; break;
            case 3: caloriasPrato = 260; break;
            case 4: caloriasPrato = 550; break;
            default:
                System.out.println("Opção indisponível");
        }

        switch (bebida) {
            case 1: caloriasBebida = 10; break;
            case 2: caloriasBebida = 70; break;
            case 3: caloriasBebida = 150; break;
            case 4: caloriasBebida = 65; break;
            default:
                System.out.println("Opção indisponível");
        }
        switch (sobremesa) {
            case 1: caloriasSobremesa = 75; break;
            case 2: caloriasSobremesa = 340; break;
            case 3: caloriasSobremesa = 240; break;
            case 4: caloriasSobremesa = 238; break;
            default:
                System.out.println("Opção indisponível");
        }

        int caloriasTotais = caloriasPrato + caloriasBebida + caloriasSobremesa;

        System.out.println("Vossa refeição terá " + caloriasTotais + " calorias");


    }
}
