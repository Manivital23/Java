package lista_2;

import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Deseja votar? Espere só um momento.");
        System.out.println("Antes, vamos ter certeza de que você pode.");
        System.out.println("Por favor, insira a sua idade: ");
        int idade = entrada.nextInt();

        if(idade <= 15){
            System.out.println("Você não pode votar!");
        }else if((idade >= 16 && idade <= 17) || (idade > 70)){
            System.out.println("Seu voto é opcional");
        }
        else {
            System.out.println("O seu voto é obirgatório!");
        }
    }
}
