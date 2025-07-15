package segunda_aula;

import java.util.Scanner;

public class Media {

    public static void main(String[] args){

        float nota1;
        float nota2;
        float nota3;
        float nota4;
        float media;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com a primeira nota: ");
        nota1 = entrada.nextFloat();

        System.out.println("Entre com a segunda nota: ");
        nota2 = entrada.nextFloat();

        System.out.println("Entre com a terceira nota: ");
        nota3 = entrada.nextFloat();

        System.out.println("Entre com a quarta nota: ");
        nota4 = entrada.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("O resultado da media das quatro notas é: " + media);

        if(media >=6){
            System.out.println("Aluno está aprovado:");
        }else if(media >=5){
            System.out.println("Aluno está de recuperação:");
        }else{
            System.out.println("Aluno está reprovado:");
        }

    }
}
