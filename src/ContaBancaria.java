import java.text.NumberFormat;
import java.util.Scanner;

public abstract class ContaBancaria implements Conta{
    Scanner scanner = new Scanner(System.in);
    double balance;

    @Override
    public void Deposit() {
        double depositValue;

        System.out.println("Opção escolhida: Depósito");
        System.out.println("Escolheu a opção errada? Digite 0 para voltar!");
        System.out.println("Digite o valor que deseja depositar:");
        depositValue = scanner.nextDouble();
        double taxa = depositValue * 0.01;
        if (depositValue == 0){
            System.out.println("Voltando para o painel!");
        } else {
            System.out.println("Você depositou o valor de: R$" + depositValue);
            System.out.println("Taxa: R$" + taxa + " (1%)");
            System.out.println("Valor total depositado: R$" + (depositValue - taxa));
            balance = depositValue - taxa;
        }
    }

    @Override
    public void Withdraw() {
        System.out.println("Opção escolhida: Sacar");
    }

    @Override
    public void TotalBalance() {
        System.out.println("Opção escolhida: Saldo");
        System.out.println(balance);
    }
}
