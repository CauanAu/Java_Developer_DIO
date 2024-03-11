import java.util.Scanner;

/**
 * <h1> Conta bancaria </h1>
 * Classe utilizada para criação de conta bancária básica.
 * 
 * @author Cauan Augusto
 * @version 1.0
 * @since 11/03/2024
 */
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia, nomeCliente;
        double saldo;

        // Requisição de informações para o usuário.
        System.out.println("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Por favor, digite o número da agência: ");
        agencia = scanner.nextLine();
        System.out.println("Por favor, digite o seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo inicial: ");
        saldo = scanner.nextDouble();

        // Imprimir informações da conta.
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}