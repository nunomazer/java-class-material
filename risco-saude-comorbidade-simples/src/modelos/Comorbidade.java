/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Arrays;

/**
 *
 * @author nunomazer
 */
public class Comorbidade {
    private String nome;
    private Integer nivel;
    private String[] doencas = {"Câncer", "Cardíaco", "Diabetes", "Pulmonar"};

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        if (Arrays.asList(doencas).contains(nome)) {
            this.nome = nome;
            return true;
        }
        return false;
    }

    public Integer getNivel() {
        return nivel;
    }

    public boolean setNivel(Integer nivel) {
        if (nivel >= 1 && nivel <= 5) {
            this.nivel = nivel;
            return true;
        }

        return false;
    }


}
