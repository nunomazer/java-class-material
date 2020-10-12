/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author nunomazer
 */
public class Paciente {
    private String nome;
    private String cpf;
    private String email;
    private ArrayList<Comorbidade> comorbidades = new ArrayList<Comorbidade>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Comorbidade> getComorbidades() {
        return comorbidades;
    }

    public void addComorbidade(Comorbidade comorbidade) {
        this.comorbidades.add(comorbidade);
    }

    public Integer calcularRiscoSaude() {
        Integer risco = 0;
        for (Comorbidade comorbidade : this.comorbidades) {
            risco += comorbidade.getNivel();
        }
        return risco;
    }

    public String calcularComplexidade() {
        Integer risco = this.calcularRiscoSaude();

        if (risco <= 2) {
            return "Baixa";
        }

        if (risco <= 6) {
            return "Média";
        }

        if (risco <= 10) {
            return "Alta";
        }

        return "Altíssima";
    }
}
