import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu primeiro nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        String nomeCliente = nome + " " + sobrenome;

        System.out.println("Digite o número da sua conta");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da sua agência");
        String agencia = scanner.next();
        
        System.out.println("Digite o seu saldo atual");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + "!");
        System.out.println("Obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", sua conta bancária é " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");

        
    }
}
