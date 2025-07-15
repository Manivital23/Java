package exercicios_repeticao;

public class Exercico2 {

    // 2) Escreva um algoritmo que calcule a soma dos números de 1 a 15.

    public static void main(String[] args) {

        int soma = 0;

        for (int i = 1; i <= 15; i++) {
            soma = soma + i;
        }

        System.out.println("A soma dos números de 1 a 15 é: " + soma);
    }
}
