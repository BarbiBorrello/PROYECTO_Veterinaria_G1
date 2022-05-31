/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria_CONTROLADOR;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import veterinaria_MODELO.Tratamiento;
import veterinaria_MODELO.Visita;

/**
 *
 * @author Barbara
 */
public class TratamientoData {
    
    private Connection con = null;
    Tratamiento t = new Tratamiento ();
    TratamientoData td ;

    public TratamientoData(Conexion conexion) {
        try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error en la conexion");
        }
    }
    
    
    public void agregar_Tratamiento(Tratamiento p_tratamiento){
        
       String sql = "INSERT INTO tratamiento( descripcion , medicamento ,  importe ,  activo ,  id_visita , tipo_tratamiento ) VALUES (? , ? , ? , ? , ? , ? )"; 
        
               try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); 
            
            ps.setString(1, p_tratamiento.getDescripcion());
            ps.setString(2, p_tratamiento.getMedicamento());
            ps.setDouble(3, p_tratamiento.getPrecio());
            ps.setInt(4, p_tratamiento.isActivo() ? 1 : 0);
            ps.setObject(5, p_tratamiento.getVisita().getIdvisita());
            ps.setString(6, p_tratamiento.getTipo_tratamiento());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            JOptionPane.showMessageDialog(null, " Tratamiento cargado exitosamente");

            if (rs.next()) {
                p_tratamiento.setId_tratamiento(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null, "No se pude cargar el tratamiento ");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion al guardar el tratamiento " + ex);
        }

    }

    // estadisticas de los tratamientos mas utilizados por especialidad //
    
    public Tratamiento buscarTratamientoActivo(int p_id_tratamiento) {

        Tratamiento tratamiento = null;

        String sql = "SELECT * FROM tratamiento WHERE activo =1 AND id_tratamiento =? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, p_id_tratamiento);

            ResultSet rs = ps.executeQuery();

            if (rs.wasNull() == false) {

                while (rs.next()) {

                    tratamiento = new Tratamiento();

                    tratamiento.setId_tratamiento(rs.getInt("id_tratamiento"));
                    tratamiento.setDescripcion(rs.getString("descripcion"));
                    tratamiento.setMedicamento(rs.getString("medicamento"));
                    tratamiento.setPrecio(rs.getDouble("importe"));
                    tratamiento.setActivo(rs.getBoolean("activo"));
                    tratamiento.setTipo_tratamiento(rs.getString("tipo_tratamiento"));

                    JOptionPane.showMessageDialog(null, "Tratamiento encrontrado exitosamente :" + " " + tratamiento.getTipo_tratamiento());
                }

            } else {
                JOptionPane.showMessageDialog(null, "Tratamiento inexistente");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error de conexion desde buscar tratamiento " + ex);
        }

        return tratamiento;
    }
    
    // estadistica de tratamientos de practica nula //
    
    public Tratamiento buscarTratamientoInactivo(int p_id_tratamiento) {

        Tratamiento tratamiento = null;

        String sql = "SELECT * FROM tratamiento WHERE activo =-1 AND id_tratamiento =? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, p_id_tratamiento);

            ResultSet rs = ps.executeQuery();

            if (rs.wasNull() == true) {

                while (rs.next()) {

                    tratamiento = new Tratamiento();

                    tratamiento.setId_tratamiento(rs.getInt("id_tratamiento"));
                    tratamiento.setDescripcion(rs.getString("descripcion"));
                    tratamiento.setMedicamento(rs.getString("medicamento"));
                    tratamiento.setPrecio(rs.getDouble("importe"));
                    tratamiento.setActivo(rs.getBoolean("activo"));
                    tratamiento.setTipo_tratamiento(rs.getString("tipo_tratamiento"));

                    JOptionPane.showMessageDialog(null, "Tratamiento encrontrado exitosamente :" + " " + tratamiento.getTipo_tratamiento());
                }

            } else {
                JOptionPane.showMessageDialog(null, "Tratamiento inexistente");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error de conexion desde buscar tratamiento inactivo " + ex);
        }

        return tratamiento;
    }

    public void modificarTratamiento(int p_id_tratamiento, Tratamiento p_tratamiento) {

        String sql = "UPDATE tratamiento SET descripcion = ? , medicamento = ? , importe = ?, activo = ?, tipo_tratamiento = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, p_tratamiento.getDescripcion());
            ps.setString(2, p_tratamiento.getMedicamento());
            ps.setDouble(3, p_tratamiento.getPrecio());
            ps.setInt(4, p_tratamiento.isActivo() ? 1 : 0);
            ps.setString(5, p_tratamiento.getTipo_tratamiento());

            int rs = ps.executeUpdate();

            if (rs > 0) {
                JOptionPane.showMessageDialog(null, " Tratamiento actualizado exitosamente ");
            } else {
                JOptionPane.showMessageDialog(null, " El tratamiento No se pudo actualizar ");
            }

            ps.close();

        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error de conexion desde modificar tratamiento " + ex);
        }
    }

    public void borrarTratamiento(int p_id_tratamiento) {

        String sql = "UPDATE tratamiento SET activo =0 WHERE id_tratamiento=?";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, p_id_tratamiento);

            int rs = ps.executeUpdate();

            if (rs > 0) {
                JOptionPane.showMessageDialog(null, "Tratamiento borrado exitosamente ");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo borrar, tratamiento inexistente ");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde borrar tratamiento " + ex);

        }

    }
    
    	   public void activarTratamiento(int p_id_tratamiento) {

        String sql = "UPDATE tratamiento SET activo =1 WHERE id_tratamiento=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, p_id_tratamiento);

            int rs = ps.executeUpdate();

            if (rs > 0) {
                JOptionPane.showMessageDialog(null, "Se activo el estado del tratamiento ");
            } else {
                JOptionPane.showMessageDialog(null, " El id del tratamiento no existe ");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde activar Tratamiento " + ex);

        }
    }
        public List<Tratamiento> obtenerTratamientos(){
            
          ArrayList<Tratamiento> tratamientos = new ArrayList<Tratamiento>();  
            
            try {
                String sql = "SELECT * FROM tratamiento;";

                PreparedStatement ps = con.prepareStatement(sql);

                ResultSet rs = ps.executeQuery(); 
            
                Tratamiento tratamiento;
                
                while (rs.next()) {
                    
                tratamiento = new Tratamiento();    
                 
                tratamiento.setId_tratamiento(rs.getInt("id_tratamiento"));
                tratamiento.setDescripcion(rs.getString("descripcion"));
                tratamiento.setMedicamento(rs.getString("medicamento"));
                tratamiento.setPrecio(rs.getDouble("importe"));
                tratamiento.setActivo(rs.getBoolean("activo"));
                tratamiento.setId_tratamiento(rs.getInt("id_tratamiento"));
                tratamiento.setTipo_tratamiento(rs.getString("tipo_tratamiento"));
                
                tratamientos.add(tratamiento);
       
                }
            ps.close();
            
            
            
        } catch (SQLException ex) {
           System.out.println("Error al obtener los tratamientos: " + ex.getMessage());
        }
     return tratamientos;
}
}