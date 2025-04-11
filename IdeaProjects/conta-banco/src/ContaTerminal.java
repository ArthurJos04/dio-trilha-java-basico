import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o número da sua conta: ");
        int numero = scanner.nextInt();
        System.out.print("Digite o número da sua Agência: ");
        String agencia = scanner.next();
        scanner.nextLine(); //limpa o buffer
        System.out.print("Digite o seu nome e sobrenome: ");
        String nomeCliente = scanner.nextLine();
        float saldo = 2578.98F;

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + "e seu saldo " + saldo + " já está disponível para saque.");


    }
}
