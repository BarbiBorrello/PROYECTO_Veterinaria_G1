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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import veterinaria_MODELO.Mascota;

/**
 *
 * @author Barbara
 */
public class MascotaData {
    
        private Connection con = null;

    public MascotaData(Conexion conexion) {
        try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error en la conexion");
        }
    }
    
    public void guardarMascota(Mascota mascota){
        
String sql = " INSERT INTO mascota (alias , sexo, especie, raza, color_pelaje, fecha_nac,peso_actual, id_cliente, peso_promedio, activo) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
             ps.setString(1, mascota.getAlias());
             ps.setString(2, mascota.getSexo());
             ps.setString(3, mascota.getEspecie());
             ps.setString(4, mascota.getRaza());
             ps.setString(5, mascota.getColor_pelaje());
             ps.setDate (6, Date.valueOf(mascota.getFecha_nac()));
             ps.setDouble(7, mascota.getPeso_actual());
             ps.setObject(8, mascota.getCliente());
             ps.setDouble(9, mascota.getPeso_promedio());
             
             // if reducido
             ps.setInt(4, mascota.isActivo() ? 1 : 0);
             
             ps.executeUpdate();
             ResultSet rs = ps.getGeneratedKeys();

            JOptionPane.showMessageDialog(null, " Mascota cargada exitosamente");
             
            if (rs.next()) {
                mascota.setId_mascota(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null, "No se pude cargar mascota ");
            }

            ps.close();      
        
    }       catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error de conexion al guardar mascota " + ex);

            }
}
}
