import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ehPar = false;
        boolean ehValido = false;
        int primeiroNumero = 0;
        int segundoNumero = 0;

        while (true) {
            try {
                System.out.print("Digite o Primeiro número: ");
                primeiroNumero = scanner.nextInt();
                System.out.print("Digite o Segundo número: ");
                segundoNumero = scanner.nextInt();
                ehValido = segundoNumEhValido(primeiroNumero, segundoNumero);

                if (!ehValido) {
                    throw new SegundoNumeroInvalidoException(
                            "O segundo número precisa ser maior que o primeiro número"
                    );
                }
                break;
            } catch (SegundoNumeroInvalidoException e) {
                System.out.println("Erro: " + e.getMessage());
                System.out.println("Tente novamente.");
            }
        }

        while (true) {
            try {
                System.out.print("Escolha uma opção (Par/Ímpar): ");
                String opcao = scanner.next();
                ehPar = ehParImpar(opcao);
                break;
            } catch (OpcaoInvalidaException exception) {
                System.out.println("Erro: " + exception.getMessage());
                System.out.println("Tente novamente.");
            }
        }

        System.out.println("Números " + (ehPar ? "pares" : "ímpares") + " no intervalo:");
        for (int i = segundoNumero; i >= primeiroNumero; i--) {
            if ((i % 2 == 0 && ehPar) || (i % 2 != 0 && !ehPar)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Para uma nova linha no final da saída

        scanner.close();
    }

    static boolean segundoNumEhValido(int primeiroNum, int segundoNum) throws SegundoNumeroInvalidoException {
        return segundoNum > primeiroNum;
    }

    static boolean ehParImpar(String opcao) throws OpcaoInvalidaException {
        if (opcao.equalsIgnoreCase("Par")) {
            return true;
        } else if (opcao.equalsIgnoreCase("Impar")) {
            return false;
        } else {
            throw new OpcaoInvalidaException("Opção inválida! Escolha entre 'Par' ou 'Ímpar'.");
        }
    }
}
