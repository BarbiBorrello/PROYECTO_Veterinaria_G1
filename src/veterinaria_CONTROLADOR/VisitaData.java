/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria_CONTROLADOR;

import java.sql.Connection;
import java.sql.SQLException;
import veterinaria_MODELO.Tratamiento;
import veterinaria_MODELO.Visita;

/**
 *
 * @author Barbara
 */
public class VisitaData {

    private Connection con = null;
   private Conexion conexion;

    public VisitaData(Conexion conexion) {
        try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error en la conexion");
        }
    }
    
    public Visita buscarVisita(int p_id_visita) {

        VisitaData vd = new VisitaData(conexion);
        return vd.buscarVisita(p_id_visita);
    }

    public Tratamiento buscarTratmiento(int p_id_tratamiento) {

        TratamientoData td = new TratamientoData(conexion);
        return td.buscarTratamiento(p_id_tratamiento);

    }

    public void guardarVisita(Visita visita) {

        String sql = "";


     }
    
}
