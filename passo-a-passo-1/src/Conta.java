/**
 *
 * @author Ademir Mazer Junior
 */
public class Conta {
    String nome;
    int num;
    String agencia;
    double saldo;
    String dataAbertura;

    void sacar(double valor) {
        this.saldo -= valor;
    }

    void depositar(double valor) {
        this.saldo += valor;
    }

    double calcularRendimento() {
        return this.saldo = 0.1;
    }
}
