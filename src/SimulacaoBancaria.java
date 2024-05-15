import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        
        while (true) { 
          System.out.println("--------------MENU--------------");
          System.out.println("1. Deposito");
          System.out.println("2. Saque");
          System.out.println("3. Consultar Saldo");
          System.out.println("0. Encerrar");
          System.out.println();
          System.out.println("Escolha uma opção: ");
        
        int opcao = scanner.nextInt();

          switch (opcao) {
        case 1:
            System.out.print("Informe o valor para deposito: ");
              double valorDeposito = scanner.nextDouble();
              saldo += valorDeposito;
              System.out.println("Depósito realizado com sucesso.");
          break;
          
          
        case 2:
        System.out.print("Informe o valor para saque: ");
        double valorSaque = scanner.nextDouble();
              if (valorSaque <= saldo) {
                saldo-= valorSaque;
                System.out.println("Saque realizado com sucesso.");
                
          }   else {
                System.out.println("Saldo insuficiente");
          }
          break;
          
          case 3:
          System.out.println("Seu saldo atual: " + saldo);
          break;
          
          case 0:
          System.out.println("Programa encerrado.");
          scanner.close();
          return;
          
          default:
          System.out.println("Opção inválida. Tente novamente."); 
            }
        }
    }
}