/**
 *
 * @author Ademir Mazer Junior
 */
public class Conta {
    String titular;
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
        return this.saldo * 0.1;
    }

    String recuperarDadosParaImpressao() {
        String dados = "Titular: " + this.titular;
        dados += "\nAgência: " + this.agencia + "Número: " + this.num;
        // imprimir aqui os outros atributos...
        // também pode imprimir this.calculaRendimento()
        return dados;
    }
}
