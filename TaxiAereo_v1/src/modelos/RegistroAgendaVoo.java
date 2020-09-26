/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author mazer
 */
public class RegistroAgendaVoo {
    private Cliente cliente;
    private Helicoptero helicoptero;
    private Piloto piloto;
    private LocalDateTime dataHora;

    public RegistroAgendaVoo(Cliente cliente, Helicoptero helicoptero, Piloto piloto, LocalDateTime dataHora) {
        this.cliente = cliente;
        this.helicoptero = helicoptero;
        this.piloto = piloto;
        this.dataHora = dataHora;
    }   
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Helicoptero getHelicoptero() {
        return helicoptero;
    }

    public void setHelicoptero(Helicoptero helicoptero) {
        this.helicoptero = helicoptero;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}
