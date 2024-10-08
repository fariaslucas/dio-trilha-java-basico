import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da sua conta:");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da agência:");
        String agencia = scanner.next();

        scanner.nextLine();

        System.out.println("Digite seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo da conta:");
        double saldo = scanner.nextDouble();

        String mensagem = "Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque";

        System.out.println(mensagem);

        scanner.close();
    }
}
