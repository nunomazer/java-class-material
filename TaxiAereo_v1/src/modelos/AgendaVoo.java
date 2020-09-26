/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author mazer
 */
public class AgendaVoo {
    private List<RegistroAgendaVoo> registros = new ArrayList<RegistroAgendaVoo>();

    private boolean isPilotoDisponivel(Piloto p, LocalDateTime data) {
        LocalDate novaData = data.toLocalDate();
        
        for (int i=0; i < registros.size(); i++) {
            RegistroAgendaVoo rav = registros.get(i);
            
            if (rav.getDataHora().toLocalDate().equals(novaData) && 
                    rav.getPiloto().getCpf().equals(p.getCpf())) {
                return false;
            }
        }
        
        return true;
    }
    
    private boolean isHelicopteroDisponivel(Helicoptero h, LocalDateTime data) {
        return true;
    }
    
    public boolean agendar(RegistroAgendaVoo rav) {
        this.isPilotoDisponivel(rav.getPiloto(), rav.getDataHora());
        
        return true;
    }
}
