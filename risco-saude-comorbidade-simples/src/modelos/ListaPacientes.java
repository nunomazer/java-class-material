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
public class ListaPacientes {
    private ArrayList<Paciente> pacientes = new ArrayList<Paciente>();

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void addPaciente(Paciente paciente) {
        this.pacientes.add(paciente);
    }

    public Paciente getPaciente(String cpf) {
        for (Paciente paciente : this.pacientes) {
            if (paciente.getCpf().equals(cpf)) {
                return paciente;
            }
        }
        return null;
    }

    public Integer calcularRiscoSaude(Paciente p) {
        return this.calcularRiscoSaude(p.getCpf());
    }

    public Integer calcularRiscoSaude(String cpf) {
        Paciente paciente = this.getPaciente(cpf);
        if (paciente != null) {
            return paciente.calcularRiscoSaude();
        }
        return null;
    }

    public String calcularComplexidade(Paciente p) {
        return this.calcularComplexidade(p.getCpf());
    }

    public String calcularComplexidade(String cpf) {
        Paciente paciente = this.getPaciente(cpf);
        if (paciente != null) {
            return paciente.calcularComplexidade();
        }
        return null;
    }
}
