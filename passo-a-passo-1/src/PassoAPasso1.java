
/**
 *
 * @author Ademir Mazer Junior
 */
public class PassoAPasso1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta c1 = new Conta();

        c1.titular = "Hugo";
        c1.num = 123;
        c1.agencia = "45678-9";
        c1.saldo = 50.0;

        Data abertura = new Data();
        abertura.dia = 04;
        abertura.mes = 05;
        abertura.ano = 2015;

        c1.dataAbertura = abertura;

        c1.depositar(100.0);
        System.out.println(c1.recuperarDadosParaImpressao());
        System.out.println("saldo atual:" + c1.saldo);
        System.out.println("rendimento mensal:" + c1.calcularRendimento());

        c1.sacar(20.0);
        System.out.println(c1.recuperarDadosParaImpressao());
        System.out.println("saldo atual:" + c1.saldo);
        System.out.println("rendimento mensal:" + c1.calcularRendimento());


    }

}
