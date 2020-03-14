/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media.rn;

/**
 *
 * @author nunomazer
 */
public class Aluno {
    private double[] notas;

    public double[] getNotas() {
        return this.notas;
    }

    /**
     * Recebe a quantidade de notas que irão compor a média do aluno
     *
     * @param int qtde
     */
    public boolean setQtdeNotas(int qtde) {
        if (qtde < 1 || qtde > 10) {
            return false;
        }

        this.notas = new double[qtde];

        return true;
    }

    public int getQtdeNotas() {
        return notas.length;
    }

    public boolean setNota(int n, double nota) {
        if (nota < 0 || nota > 10) {
            return false;
        }

        this.notas[n] = nota;
        return true;
    }

    double media() {
        return ( notas[0]+notas[1]+notas[2]+notas[3] ) / 4.0;
    }

    String situacao() {
        return (media() >= 7) ? "Passou" : "Reprovou";
    }
}