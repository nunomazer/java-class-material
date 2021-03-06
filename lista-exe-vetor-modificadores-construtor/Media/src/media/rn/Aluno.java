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
        if (qtde < 1 || qtde > 8) {
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

    public double getMedia() {
        double media = 0;

        for (double n : this.notas) {
            media += n;
        }

        return media / this.notas.length;
    }

    public String getSituacao() {
        return (getMedia() >= 7) ? "Passou" : "Reprovou";
    }
}