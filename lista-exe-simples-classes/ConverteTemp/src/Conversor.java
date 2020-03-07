/**
 *
 * @author Ademir Mazer Junior
 */
public class Conversor {
    public double converterEmCelsius(double F) {
        return (F - 32) * (5/9);
    }

    public double converterEmFahrenheit(double C) {
        return (9 * C + 160) / 5;
    }

    public double converter(Temperatura t) {
        if (t.tipo == 'C' || t.tipo == 'c') {
            return this.converterEmFahrenheit(t.valor);
        }

        return this.converterEmCelsius(t.valor);
    }
}
