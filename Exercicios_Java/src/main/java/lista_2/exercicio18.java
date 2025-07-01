package lista_2;

import java.util.Scanner;

public class exercicio18 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome_novo = "";
        int idade_nova = Integer.MAX_VALUE;

        for(int i = 1; i <= 10; i++){
            System.out.println("Entre com o nome da " + i + " ª pessoa:");
            String nome = entrada.nextLine();

            System.out.println("Digite a idade do(a) " + nome + ": ");
            int idade = entrada.nextInt();
            entrada.nextLine();

            if(idade < idade_nova){
                idade_nova = idade;
                nome_novo = nome;
            }
        }

        System.out.println("A pessoa mais nova desse grupo é o(a)" + nome_novo + " com " + idade_nova +" anos");
    }
}
