public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("111222333-44", "Arthur Santos");
        Cliente c2 = new Cliente("222333444-55", "Fulano de Tal");

        Conta cc1 = new ContaCorrente(c1);
        Conta cp1 = new ContaPoupanca(c1);

        cc1.imprimirExtrato();
        cp1.imprimirExtrato();

        Conta cc2 = new ContaCorrente(c2);

        try {
            cc1.transferir(250, cc2);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
            System.out.println("Tente Novamente");
        }

        cc1.depositar(1500, false);

        try {
            cc1.transferir(250, cc2);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
            System.out.println("Tente Novamente");
        }

        cc1.imprimirExtrato();
        cc2.imprimirExtrato();
    }
}