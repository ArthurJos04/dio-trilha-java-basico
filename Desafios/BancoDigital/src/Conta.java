public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1; //sempre sera esse valor pois queremos que a agencia sempre seja a mesma
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println(String.format("Foi realizado um saque de R$%.2f com sucesso!", this.saldo));
            System.out.println(String.format("Saldo atual: R$%.2f", this.saldo));
        }
        else {
            throw new SaldoInsuficienteException("Saldo Insuficiente para saque!");
        }
    }

    boolean ehTransferencia = false;

    @Override
    public void depositar(double valor, boolean ehTransferencia) {
        this.saldo += valor;

        String message = !ehTransferencia
                ? String.format("Foi realizado um depósito de R$%.2f com sucesso ", valor)
                : String.format("Uma transferência de R$%.2f foi realizada com sucesso!", valor);

        System.out.println(message);
        System.out.println(String.format("Saldo atual: R$%.2f", this.saldo));
    }

    @Override
    public void transferir(double valor, Conta contaDestino) throws SaldoInsuficienteException {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            contaDestino.depositar(valor, true);
            System.out.println(String.format("para a conta destino - Agencia: %d, Numero: %d, Nome: %s", contaDestino.agencia, contaDestino.numero, contaDestino.cliente.getNome()));
        }
        else {
            throw new SaldoInsuficienteException("Saldo Insuficiente para transferência!");
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("CPF: %s", this.cliente.getCpf()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: R$%.2f", this.saldo));

    }
}
