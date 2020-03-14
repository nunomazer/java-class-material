/**
 *
 * @author Ademir Mazer Junior
 */
public class Conversor {
    public double converterEmCelsius(double F) {
        return (F - 32) * (5.0/9.0);
    }

    public double converterEmFahrenheit(double C) {
        return (9.0 * C + 160.0) / 5.0;
    }

    public double converter(Temperatura t) {
        if (t.tipo == 'C' || t.tipo == 'c') {
            return this.converterEmFahrenheit(t.valor);
        }

        return this.converterEmCelsius(t.valor);
    }
}
