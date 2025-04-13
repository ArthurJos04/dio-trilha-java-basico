public interface IConta {

    void depositar(double valor, boolean ehTransferencia);

    void sacar(double valor) throws SaldoInsuficienteException;

    void transferir(double valor, Conta contaDestino) throws SaldoInsuficienteException;

    void imprimirExtrato();
}
