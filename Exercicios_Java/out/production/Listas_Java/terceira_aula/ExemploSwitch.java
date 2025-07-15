package terceira_aula;

import java.util.Scanner;

public class ExemploSwitch {

    public static void main(String[] args) {
        int DiaSemana;
        String NomeDia;

        Scanner numero = new Scanner(System.in);
        System.out.println("Entrar com o numero do dia da semana: ");
        DiaSemana = numero.nextInt();

        switch (DiaSemana){ // Não precisa passar em todas as linhas, se achou a certa ele já para
            case 1: NomeDia = "Domingo"; break;
            case 2: NomeDia = "Segunda-feira"; break;
            case 3: NomeDia = "Terça-feira"; break;
            case 4: NomeDia = "Quarta-feira"; break;
            case 5: NomeDia = "Quinta-feira"; break;
            case 6: NomeDia = "Sexta-feira"; break;
            case 7: NomeDia = "Sábado"; break;
            default: NomeDia = "DiaInválido";
        }

        System.out.println("O dia da semana escolhido foi: " + NomeDia);
    }
}
