import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Por favor, digite o número da Conta!");

            int numeroConta = scanner.nextInt();

            System.out.println("Por favor, digite o número da Agência!");

            String agencia = scanner.next();

            System.out.println("Por favor, digite o nome do Cliente");

            String nomeCliente = scanner.next();

            System.out.println("Por favor, digite o saldo da Conta!");

            double saldo = scanner.nextDouble();

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                    + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
        }
    }
}