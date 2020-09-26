/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxiaereo;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import modelos.AgendaVoo;
import modelos.Cliente;
import modelos.Helicoptero;
import modelos.Modelo;
import modelos.Piloto;
import modelos.RegistroAgendaVoo;

/**
 *
 * @author mazer
 */
public class TaxiAereo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Piloto p = new Piloto();
        p.setBreve(2939485824L);
        
        Modelo m = new Modelo("FX50");
        
        Helicoptero h = new Helicoptero();
        h.setCodigo(1);
        h.setModelo(m);
        h.setAnoFabricacao(2005);
        
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/uuuu HH:mm")
                .withResolverStyle(ResolverStyle.STRICT); // para não aceitar datas inválidas
        LocalDateTime d = LocalDateTime.parse("24/12/2020 12:00", parser);
              
        Cliente c = new Cliente();
        c.setNome("Maria");
        
        RegistroAgendaVoo rav = new RegistroAgendaVoo(c, h, p, d);
        
        AgendaVoo agenda = new AgendaVoo();
        agenda.agendar(rav);
        
        System.out.println(p.getBreve());
    }
    
}
