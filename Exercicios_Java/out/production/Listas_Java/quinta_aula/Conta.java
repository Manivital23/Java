package quinta_aula;

import java.util.Scanner;
import java.util.Random; //pedir para gerar um número aleatório

public class Conta {

   int numero_conta;
   String titular_conta;
   double saldo; // valor quebrado e dinheiro - valor maior

   Scanner entrada = new Scanner(System.in);

   public Conta(String nome_titular, double saldo_inicial){
       this.titular_conta = nome_titular;
       this.saldo = saldo_inicial;

       Random gerador_numeoro = new Random(); // gerador randomico(aleatótio) de numeros
       numero_conta = gerador_numeoro.nextInt(1000);
   }

   public void VerSaldo(){

       System.out.println("O número da conta é: " + numero_conta);
       System.out.println("O titular da conta é: " + titular_conta);
       System.out.println("O saldo da conta é: " + saldo);
   }

   public void Saque(double valor_saque){
       if (saldo >= valor_saque){
           saldo = saldo - valor_saque;
           System.out.println("Valor do saldo atual é: " + saldo);
       }else{
           System.out.println("Seu saldo é insuficiente");
       }
   }

   public void Deposito(double valor_deposito){
       if (valor_deposito <=0){
           System.out.println("Depósito inválido! O valor do depósito é menor ou igual a 0");
       }else{
           saldo = saldo + valor_deposito;
           System.out.println("Valor do saldo atual é: " + saldo);
       }
   }

    public void Emprestimo(double valor_emprestimo){
        if (valor_emprestimo <= 1000 && saldo < 100){
            saldo = saldo + valor_emprestimo;
            System.out.println("Empréstimo realizado! Novo saldo: " + saldo);
        } else {
            System.out.println("Empréstimo inválido! Só é permitido empréstimo abaixo de R$1000 e com saldo menor que R$100.");
        }
    }

   public void Exibir_menu(){
       System.out.println("Bem vindo ao Banco XYZ");
       System.out.println("Escolha a sua opção: ");
       System.out.println("1 - Ver saldo");
       System.out.println("2 - Sacar");
       System.out.println("3 - Depositar");
       System.out.println("4 - Empréstimo");
       System.out.println("5 - Finalizar");
   }

   public void Iniciar(){
       int opcao;
           do {
               Exibir_menu();
               opcao = entrada.nextInt();
               Escolher_funcao(opcao);
           }while (opcao !=5); //enquanto for diferente de 4
   }

   public void Escolher_funcao(int opcao){
       double saque;
       double deposito;
       double emprestimo;

       switch (opcao){
           case 1: VerSaldo();
           break;

           case 2:
               System.out.println("Digite o valor a ser sacado: ");
               saque = entrada.nextDouble();
               Saque(saque);
           break;

           case 3: System.out.println("Digite o valor a ser depositado: ");
               deposito = entrada.nextDouble();
               Deposito(deposito);
           break;

           case 4:
               System.out.println("Digite o valor a ser emprestado: ");
               emprestimo = entrada.nextDouble();
               Emprestimo(emprestimo);

           case 5:
               System.out.println("Operaçao finalizada");
           break;

           default:
               System.out.println("Opção inválida");
       }
   }
}
