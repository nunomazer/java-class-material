/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author nunomazer
 */
public class ConverteTemp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conversor c = new Conversor();

        System.err.println("1C = " + c.converterEmFahrenheit(3) + "F");
        System.err.println("1F = " + c.converterEmCelsius(1) + "C");

        System.err.println("30C = " + c.converterEmFahrenheit(30) + "F");
        System.err.println("110F = " + c.converterEmCelsius(110) + "C");

        Temperatura t = new Temperatura();
        t.tipo = 'C'; // note que strings com aspas duplas e char com aspas simples
        t.valor = 91;

        System.err.println("91C = " + c.converter(t) + "F");

        t.tipo = 'F';
        System.err.println("91F = " + c.converter(t) + "C");


    }

}
