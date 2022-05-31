/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria_CONTROLADOR;

import java.sql.Connection;
import java.sql.SQLException;
import veterinaria_MODELO.Mascota;
import veterinaria_MODELO.Tratamiento;
import veterinaria_MODELO.Visita;

/**
 *
 * @author Barbara
 */
public class VisitaData {

    private Connection con = null;
    private Conexion conexion;
    MascotaData md;
    TratamientoData td;

    public VisitaData(Conexion conexion) {
        try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error en la conexion");
        }
    }
    
    public Mascota buscarMascotaActiva(int p_id_visita) {

        MascotaData md = new MascotaData(conexion);
        return md.buscarMascotaActiva(p_id_visita);
    }

    public Tratamiento buscarTratamiento(int p_id_tratamiento) {

        TratamientoData td = new TratamientoData(conexion);
        return td.buscarTratamientoActivo(p_id_tratamiento);

    }

    public void guardarVisita(Visita visita) {

        String sql = "";


     }
    
}
