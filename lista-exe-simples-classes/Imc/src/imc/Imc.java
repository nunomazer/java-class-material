/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

import java.text.DecimalFormat;

/**
 *
 * @author nunomazer
 */
public class Imc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Paciente p = new Paciente();

        p.nome = "João";
        p.idade = 46;
        p.altura = 1.8;
        p.peso = 94;

        AvaliacaoSaude avaliacao = new AvaliacaoSaude();

        System.out.println("Paciente " + p.nome + " com IMC " +
                (new DecimalFormat("###.##")).format(avaliacao.calculaImc(p)) +
                " na situação = " + avaliacao.situacaoImc(p)
        );

        p.nome = "Claudia";
        p.idade = 30;
        p.altura = 1.63;
        p.peso = 69;

        System.out.println("Paciente " + p.nome + " com IMC " +
                (new DecimalFormat("###.##")).format(avaliacao.calculaImc(p)) +
                " na situação = " + avaliacao.situacaoImc(p)
        );

        p.nome = "Maria";
        p.idade = 66;
        p.altura = 1.63;
        p.peso = 69;

        System.out.println("Paciente " + p.nome + " com IMC " +
                (new DecimalFormat("###.##")).format(avaliacao.calculaImc(p)) +
                " na situação = " + avaliacao.situacaoImc(p)
        );
    }

}
