import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean panel = true;
        int panelResponse;

        ContaCorrente account = new ContaCorrente();
        Scanner scanner = new Scanner(System.in);

        while (panel) {
            System.out.println("===== Conta Bancária =====");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Saldo");
            System.out.println("4 - Sair");
            System.out.println("Digite o número da opção desejada:");
            try {
                panelResponse = scanner.nextInt();

                switch (panelResponse) {
                    case 1:
                        System.out.println("Você escolheu a opção: 1.");
                        account.Deposit();
                        break;
                    case 2:
                        System.out.println("Você escolheu a opção: 2.");
                        account.Withdraw();
                        break;
                    case 3:
                        System.out.println("Você escolheu a opção: 3.");
                        account.TotalBalance();
                        break;
                    case 4:
                        System.out.println("Você escolheu a opção: 4.");
                        panel = false;
                        break;
                    default:
                        System.out.println("Número inválido!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Opção Invalida!");
                scanner.nextLine();
            }
        }
    }
}
