/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria_MODELO;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import veterinaria_CONTROLADOR.ClienteData;
import veterinaria_CONTROLADOR.Conexion;
import veterinaria_CONTROLADOR.MascotaData;
import veterinaria_CONTROLADOR.TratamientoData;
import veterinaria_CONTROLADOR.VisitaData;

/**
 *
 * @author Barbara
 */
public class Veterianaria_Test_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            // TODO code application logic here
            Conexion conexion = new Conexion();
            ClienteData cd = new ClienteData(conexion);
            MascotaData md = new MascotaData(conexion);
            TratamientoData td = new TratamientoData(conexion);
            VisitaData vd = new VisitaData(conexion);

// PRUEBA creacion: CLIENTE-MASCOTA //
            Cliente cliente1 = new Cliente(12345678, "El", "Chespirito", "Avenida siempre viva 123", 12345678, "Pedrito rulito", true);
            
            System.out.println(cliente1);

            Mascota mascota1 = new Mascota("Chatran", "macho", "gato", "generico", "negro", LocalDate.of(1987, 7, 13), 4.4, 5.5, true, cliente1);
            
            System.out.println(mascota1);
            
            
            
            
            
            
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Veterianaria_Test_Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
