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
import java.time.ZoneId;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import veterinaria_MODELO.Cliente;
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
        return md.buscarMascota(p_id_visita);
    }

    public Tratamiento buscarTratamiento(int p_id_tratamiento) {

        TratamientoData td = new TratamientoData(conexion);
        return td.buscarTratamientoActivo(p_id_tratamiento);

    }

    public void agregarVisita(Visita p_visita) {

        String sql = "INSERT INTO visita ( id_tratamiento ,fecha_visita ,id_mascota ,peso ,activo ) VALUES (? ,? ,? ,? ,? )";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, p_visita.getTratamiento().getId_tratamiento());
            ps.setDate(2, Date.valueOf(p_visita.getFecha_visita()));
            ps.setInt(3, p_visita.getMascota().getId_mascota());
            ps.setDouble(4, p_visita.getPeso());
            int activo = p_visita.isActivo() ? 1 : 0;
            ps.setInt(5, activo);
            //algo//

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

    public void modificarVisita(int p_id_visita, Visita p_visita) {

        // String de consulta a base de datos id_visita	id_tratamiento	fecha_visita	id_mascota	peso	activo	
        String sql = "UPDATE visita SET id_tratamiento=?, fecha_visita=?, id_mascota=?, peso=?, activo=? WHERE id_visita=?;";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setLong(1, p_visita.getTratamiento().getId_tratamiento());
            ps.setDate(2, Date.valueOf(p_visita.getFecha_visita()));
            ps.setInt(3, p_visita.getMascota().getId_mascota());
            ps.setDouble(4, p_visita.getPeso());
            ps.setInt(5, p_visita.isActivo() ? 1 : 0);
            ps.setInt(6, p_id_visita);

            int rs = ps.executeUpdate();

            if (rs > 0) {
                JOptionPane.showMessageDialog(null, " Visita se actualizado exitosamente ");
            } else {
                JOptionPane.showMessageDialog(null, " Visita No se pudo actualizar ");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde insertar visita " + ex);

        }
    }

    public Visita buscarVisita(int p_id_visita) {

        // Iniciacion null de la variable visita
        Visita visita = null;

        // String de consulta a base de datos
        String sql = "SELECT * FROM visita WHERE activo = 1 AND id_visita = ?;";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, p_id_visita);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                /* Instanciado de visita encontrado en la BD con todos sus parametros */
                // parametros de BD de visita: id_visita	id_tratamiento	fecha_visita	id_mascota	peso	activo
                // atributos de clase Visita: int idvisita; LocalDate fecha_visita; double peso; boolean activo; Mascota mascota; Tratamiento tratamiento;
                visita = new Visita();
                visita.setIdvisita(rs.getInt("id_visita "));
                visita.setTratamiento(buscarTratamiento(rs.getInt("id_tratamiento")));
                visita.setFecha_visita(rs.getDate("fecha_visita").toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                visita.setMascota(buscarMascotaActiva(rs.getInt("id_mascota")));
                visita.setPeso(rs.getDouble("peso"));
                visita.setActivo(rs.getBoolean("activo"));

                // Mensaje de visita encontrado
                JOptionPane.showMessageDialog(null, " Se encontro Id:" + visita.toString());

            } else {
                // Mensaje de visita no encontrado
                JOptionPane.showMessageDialog(null, " Id de visita inexistente");

            }
            ps.close();
        } catch (SQLException ex) {
            // Mensaje de error de acceso a la base de datos
            JOptionPane.showMessageDialog(null, " Error de conexion desde buscar visita " + ex);

        }

        return visita;
    }

    public void borrarMascota(int p_id_visita) {

        // String de consulta a base de datos
        String sql = "UPDATE visita SET activo =0 WHERE id_visita=?";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, p_id_visita);

            int rs = ps.executeUpdate();

            if (rs > 0) {
                JOptionPane.showMessageDialog(null, "Visita borrada exitosamente ");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo borrar, visita inexistente ");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde borrar visita " + ex);
        }
    }

    public void activarVisita(int p_id_visita) {

        String sql = "UPDATE visita SET activo =1 WHERE id_visita=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, p_id_visita);

            int rs = ps.executeUpdate();

            if (rs > 0) {
                JOptionPane.showMessageDialog(null, "Se activo el estado de la visita ");
            } else {
                JOptionPane.showMessageDialog(null, " El id de la visita no existe ");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde activar visita " + ex);

        }
    }
    
    
        public void desactivarVisita(int p_id_visita) {

        String sql = "UPDATE visita SET activo =- WHERE id_visita=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, p_id_visita);

            int rs = ps.executeUpdate();

            if (rs > 0) {
                JOptionPane.showMessageDialog(null, "Se desactivo el estado de la visita ");
            } else {
                JOptionPane.showMessageDialog(null, " El id de la visita no existe ");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde desactivar visita " + ex);

        }
    }
}
