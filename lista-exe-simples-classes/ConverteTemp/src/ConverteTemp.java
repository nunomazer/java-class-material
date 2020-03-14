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

        System.out.println("1C = " + c.converterEmFahrenheit(3) + "F");
        System.out.println("1F = " + c.converterEmCelsius(1.0) + "C");

        System.out.println("30C = " + c.converterEmFahrenheit(30) + "F");
        System.out.println("110F = " + c.converterEmCelsius(110) + "C");

        Temperatura t = new Temperatura();
        t.tipo = 'C'; // note que strings com aspas duplas e char com aspas simples
        t.valor = 91;

        System.out.println("91C = " + c.converter(t) + "F");

        t.tipo = 'F';
        System.out.println("91F = " + c.converter(t) + "C");


    }

}
