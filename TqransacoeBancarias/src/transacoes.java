import java.util.Locale;
import java.util.Scanner;

public class transacoes {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            // Entrada do saldo inicial
            double saldoInicial = scanner.nextDouble();
            double saldoFinal = saldoInicial;

            // TODO: Na linha abaixo, implemente a entrada das três transações:
            for(int i = 0; i < 3; i++){
                double transacao = scanner.nextDouble();
                saldoFinal += transacao;
            }

            // TODO: Na linha abaixo, realize o cálculo do saldo final:

            // Saldo final
            System.out.printf("%.2f\n", saldoFinal);
            scanner.close();
        }
    }
