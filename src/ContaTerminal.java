import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor digite o número da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Por favor digite o número da agência: ");
        String numeroAgencia = sc.nextLine();
        System.out.print("Por favor entre o nome do cliente: ");
        String nomeCliente = sc.nextLine();
        System.out.print("Por favor entre o saldo da conta: ");
        float saldoConta = sc.nextFloat();

        System.out.println();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, numeroAgencia, numeroConta, saldoConta);

        sc.close();
    }
}
