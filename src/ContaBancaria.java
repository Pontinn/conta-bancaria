import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class ContaBancaria implements Conta {
    Scanner scanner = new Scanner(System.in);
    double balance;

    @Override
    public void Deposit() {
        double depositValue;

        System.out.println("Opção escolhida: Depósito");
        System.out.println("Escolheu a opção errada? Digite 0 para voltar!");
        System.out.println("Digite o valor que deseja depositar:");

        /*Error handling if the scanner receives a non-numeric value*/
        try {
            depositValue = scanner.nextDouble();
            double taxa = depositValue * 0.01;
            double netValue = depositValue - taxa;
            if (depositValue == 0) {
                System.out.println("Voltando para o painel!");
            } else {
                System.out.println("Você depositou o valor de: R$" + depositValue);
                System.out.println("Taxa: R$" + taxa + " (1%)");
                System.out.println("Valor total depositado: R$" + (depositValue - taxa));
                balance = balance + netValue;
            }
        } catch (InputMismatchException e) {
            System.out.println("O valor do deposito pode conter somente números!");

            /*Clear the buffer to receive a new value*/
            scanner.nextLine();
        }
    }

    @Override
    public void Withdraw() {
        double withdrawValue;
        System.out.println("Opção escolhida: Sacar");
        System.out.println("Escolheu a opção errada? Digite 0 para voltar!");
        System.out.println("Digite o valor que deseja sacar:");
        
        /*Error handling if the scanner receives a non-numeric value*/
        try {
            withdrawValue = scanner.nextDouble();
            if (withdrawValue == 0) {
                System.out.println("Voltando para o painel!");
            } else if (withdrawValue > balance) {
                System.out.println("Você não tem saldo suficiente para sacar o valor: R$" + withdrawValue);
            } else {
                System.out.println("Você sacou o valor de: R$" + withdrawValue);
                balance = balance - withdrawValue;
            }
        } catch (InputMismatchException e) {
            System.out.println("O valor do saque pode conter somente números!");

            /*Clear the buffer to receive a new value*/
            scanner.nextLine();
        }

    }

    @Override
    public void TotalBalance() {
        System.out.println("Opção escolhida: Saldo");
        System.out.println("Seu saldo atual é de: R$" + balance);
    }
}
