import java.util.Locale;
import java.util.Scanner;

/**
 * <h1>Desafio de Projeto</h1>
 * Simulando Uma Conta Bancária Através Do Terminal/Console.
 * <p>
 * <b>Nota:</b> O objetivo desse desafio é colocar em prática os fundamentos da
 * linguagem e noções de regras de estrutura de sintaxe.
 * 
 * @autor Hugo Carnavalle
 * @version 1.0
 * @since 10/12/2024
 */

public class ContaTerminal {
    /**
     * Este método é utilizado para registrar e exibir em tela os dados de uma conta
     * corrente.
     * 
     * @param numeroConta este é o primeiro parâmetro do método.
     * @param agencia     este é o segundo parâmetro do método.
     * @param nomeCliente este é o terceiro parâmetro do método.
     * @param saldo       este é o quarto parâmetro do método.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta!");

        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");

        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome do Cliente!");

        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo da Conta!");

        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}