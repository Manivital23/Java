package lista_2;

public class exercicio7 {

    public static void main(String[] args) {

        float numA = 4;
        float numB = 5;
        float numC = 6;

        float numD = 8;
        float numF = 9;
        float numG = 7;

        float media1 = (numA + numB + numC)/3;
        float media2 = (numD + numF + numG)/3;

        float soma = media1 + media2;
        float media3 = (media1 + media2)/2;

        System.out.println("A média dos números 4,5 e 6 é: " + media1);
        System.out.println("A média dos número 7, 8 e 9 é: " + media2);
        System.out.println("A soma das duas médias é: " + soma);
        System.out.println("A média das duas médias é: " + media3);
    }
}
