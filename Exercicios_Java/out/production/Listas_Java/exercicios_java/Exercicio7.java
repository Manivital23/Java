package exercicios_java;

public class Exercicio7 {

    //Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos números 4,5 e 6. A soma das duas médias. A média das médias.

    public static void main(String[] args) {

        float media1, media2, somaMedias, mediaDasMedias;

        media1 = (float) (8 + 9 + 7) / 3;
        media2 = (float) (4 + 5 + 6) / 3;

        somaMedias = media1 + media2;
        mediaDasMedias = somaMedias / 2;

        System.out.println("A média aritmética do primeiro grupo é: " + media1);
        System.out.println("A média aritmética do segundo grupo é: " + media2);
        System.out.println("A soma das médias é: " + somaMedias);
        System.out.println("A média das médias é: " + mediaDasMedias);
    }
}
