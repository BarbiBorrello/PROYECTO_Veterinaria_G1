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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import veterinaria_MODELO.Cliente;
import veterinaria_MODELO.Mascota; 

/**
 *
 * @author Barbara
 */
public class MascotaData {

    private Connection con = null;
    Cliente c = new Cliente ();
    ClienteData cd ;
    VisitaData vd;

    public MascotaData(Conexion conexion) {
        try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error en la conexion");
        }
    }

    public void agregar_Mascota(Mascota p_mascota) {

        String sql = "INSERT INTO mascota (alias , sexo, especie, raza , color_pelaje, fecha_nac, peso_actual, id_cliente, peso_promedio, activo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, p_mascota.getAlias());
            ps.setString(2, p_mascota.getSexo());
            ps.setString(3, p_mascota.getEspecie());
            ps.setString(4, p_mascota.getRaza());
            ps.setString(5, p_mascota.getColor_pelaje());
            ps.setDate(6, Date.valueOf(p_mascota.getFecha_nac()));
            ps.setDouble(7, p_mascota.getPeso_actual());
            ps.setObject(8, p_mascota.getCliente().getId_cliente());
            ps.setDouble(9, p_mascota.getPeso_promedio());

            // if reducido
            ps.setInt(10, p_mascota.isActivo() ? 1 : 0);

            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();

            JOptionPane.showMessageDialog(null, " Mascota cargada exitosamente");

            if (rs.next()) {
                p_mascota.setId_mascota(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null, "No se pude cargar mascota ");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion al guardar mascota " + ex);

        }
    }

 // busca a todas al mascotas que estan "vivas" independientemente de sus visitas"   
    public Mascota buscarMascotaActiva(int p_id_mascota) {

        Mascota mascota = null;

        String sql = "SELECT * FROM mascota WHERE activo =1 AND id_mascota =? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, p_id_mascota);

            ResultSet rs = ps.executeQuery();

            if (rs.wasNull() == false) {

                while (rs.next()) {

                    mascota = new Mascota();

                    mascota.setId_mascota(rs.getInt("id_mascota"));
                    mascota.setAlias(rs.getString("alias"));
                    mascota.setSexo(rs.getString("sexo"));
                    mascota.setEspecie(rs.getString("especie"));
                    mascota.setRaza(rs.getString("raza"));
                    mascota.setColor_pelaje(rs.getString("color_pelaje"));
                    mascota.setFecha_nac(rs.getDate("fecha_nac").toLocalDate());
                    mascota.setPeso_actual(rs.getDouble("peso_actual"));
                    mascota.setPeso_promedio(rs.getDouble("peso_promedio"));
                    mascota.setActivo(rs.getBoolean("activo"));

                    JOptionPane.showMessageDialog(null, "Mascota encrontrada exitosamente :" + " " + mascota.getAlias());
                }

            } else {
                JOptionPane.showMessageDialog(null, "Mascota inexistente");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error de conexion desde buscar mascota " + ex);
        }

        return mascota;
    }
    

    public void modificarMascota(int p_id_mascota, Mascota p_mascota){
        
        // String de consulta a base de datos
        
        String sql ="UPDATE mascota SET alias = ?, sexo = ?, especie = ?, raza = ?, color_pelaje = ?, fecha_nac = ?, peso_actual = ?, id_cliente = ? , peso_promedio = ?, activo = ?";
        
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        
            ps.setString(1, p_mascota.getAlias());
            ps.setString(2, p_mascota.getSexo());
            ps.setString(3, p_mascota.getEspecie());
            ps.setString(4, p_mascota.getRaza());
            ps.setString(5, p_mascota.getColor_pelaje());
            ps.setDate(6, Date.valueOf(p_mascota.getFecha_nac()));
            ps.setDouble(7, p_mascota.getPeso_actual());
            ps.setObject(8, p_mascota.getCliente().getId_cliente());
            ps.setDouble(9, p_mascota.getPeso_promedio());
            ps.setInt(10, p_mascota.isActivo() ? 1 : 0);
        
            int rs = ps.executeUpdate();

            if (rs > 0) {
                JOptionPane.showMessageDialog(null, " Mascota se actualizado exitosamente ");
            } else {
                JOptionPane.showMessageDialog(null, " Mascota No se pudo actualizar ");
            }

            ps.close();
        
        
    }   catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde insertar cliente " + ex);
        }

}
    
    public void borrarMascota(int p_id_mascota) {
        
        // String de consulta a base de datos
        String sql = "UPDATE mascota SET activo =0 WHERE id_mascota=?";
        
            try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, p_id_mascota);

            int rs = ps.executeUpdate();

            if (rs > 0) {
                JOptionPane.showMessageDialog(null, "Mascota borrada exitosamente ");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo borrar, mascota inexistente ");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde borrar mascota " + ex);

        }
    }
    
        public void activarMascota(int p_id_mascota) {

        String sql = "UPDATE cliente SET activo =1 WHERE id_cliente=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, p_id_mascota);

            int rs = ps.executeUpdate();

            if (rs > 0) {
                JOptionPane.showMessageDialog(null, "Se activo el estado de la mascota ");
            } else {
                JOptionPane.showMessageDialog(null, " El id de la mascota no existe ");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde activar Mascota " + ex);

        }
    }

    public List<Mascota> obtenerMascotas(){
        
        
         ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
         
        try {
            String sql = "SELECT * FROM mascota;";

            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            Mascota mascota;
//          cd = new ClienteData(con);
            while (rs.next()) {
                
                mascota = new Mascota();
                
                
                mascota.setId_mascota(rs.getInt("id_mascota"));
                mascota.setAlias(rs.getString("alias"));
                mascota.setSexo(rs.getString("sexo"));
                mascota.setEspecie(rs.getString("especie"));
                mascota.setRaza(rs.getString("raza"));
                mascota.setColor_pelaje(rs.getString("color_pelaje"));
                mascota.setFecha_nac(rs.getDate("fecha_nac").toLocalDate());
                mascota.setPeso_actual(rs.getDouble("peso_actual"));
                mascota.setCliente(cd.buscarCliente(rs.getInt("id_cliente")));
                mascota.setPeso_promedio(rs.getDouble("peso_promedio"));
                mascota.setActivo(rs.getBoolean("activo"));
     

                mascotas.add(mascota);
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }

        return mascotas;
    }
        
        public void pesoActual(int p_id_mascota){
            
           double peso_actual;
           
//           peso_actual=vd.buscarVisita(p_id_mascota).getPeso();
            
        }
        
        public double pesoPromedio( int p_peso_actual){
//            
//            double promedio = 0;
            return 0;
        }
    }
