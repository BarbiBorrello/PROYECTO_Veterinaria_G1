/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria_CONTROLADOR;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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

    public void agregarVisita(Visita p_visita) {

        String sql = "INSERT INTO visita ( id_tratamiento ,fecha_visita ,id_mascota ,peso ,activo ) VALUES (? ,? ,? ,? ,? )";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, td.buscarTratamientoActivo(0).getId_tratamiento());
            ps.setDate(2, Date.valueOf(p_visita.getFecha_visita()));
            ps.setInt(3, md.buscarMascotaActiva(0).getId_mascota());
            ps.setDouble(4, p_visita.getPeso());
            ps.setInt(5, p_visita.isActivo() ? 1 : 0);

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            
            
            JOptionPane.showMessageDialog(null, " Visita cargada exitosamente");

            if (rs.next()) {
                p_visita.setIdvisita(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo cargar la visita ");
            }

            ps.close();


        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion al guardar la visita " + ex);
        }

    }
}
