/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media;

/**
 *
 * @author nunomazer
 */
public class Aluno {
    double nota[] = new double[4];

    double media() {
        return ( nota[0]+nota[1]+nota[2]+nota[3] ) / 4.0;
    }

    String situacao() {
        return (media() >= 7) ? "Passou" : "Reprovou";
    }
}
