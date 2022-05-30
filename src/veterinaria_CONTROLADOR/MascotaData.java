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
import veterinaria_MODELO.Cliente;
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

    public void agregar_Mascota(Mascota mascota) {

        String sql = "INSERT INTO mascota (alias , sexo, especie, raza , color_pelaje, fecha_nac, peso_actual, id_cliente, peso_promedio, activo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, mascota.getAlias());
            ps.setString(2, mascota.getSexo());
            ps.setString(3, mascota.getEspecie());
            ps.setString(4, mascota.getRaza());
            ps.setString(5, mascota.getColor_pelaje());
            ps.setDate(6, Date.valueOf(mascota.getFecha_nac()));
            ps.setDouble(7, mascota.getPeso_actual());
            ps.setObject(8, mascota.getCliente().getId_cliente());
            ps.setDouble(9, mascota.getPeso_promedio());

            // if reducido
            ps.setInt(10, mascota.isActivo() ? 1 : 0);

            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();

            JOptionPane.showMessageDialog(null, " Mascota cargada exitosamente");

            if (rs.next()) {
                mascota.setId_mascota(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null, "No se pude cargar mascota ");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion al guardar mascota " + ex);

        }
    }
         // busca mascotas vivas y fallecidas: FALTA PROBAR //
    
    public Mascota buscarMascota(int id_mascota) {

        Mascota mascota = null;

        String sql = "SELECT * FROM mascota WHERE activo =1 AND id_mascota =? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id_mascota);

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
   
         

                    JOptionPane.showMessageDialog(null, "Mascota encrontrada exitosamente :"+" "+mascota.getAlias());

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

//    public Mascota buscarMascotaInactiva(int id_mascota) {
//
//        Mascota mascota = null;
//
//        String sql = "SELECT * FROM mascota WHERE activo =-1 AND id_mascota =?;";
//
//        try {
//            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//            ps.setInt(1, id_mascota);
//
//            ResultSet rs = ps.executeQuery();
//
//            if (rs.wasNull() == true) {
//
//                while (rs.next()) {
//
//                    mascota = new Mascota();
//
//                    mascota.setId_mascota(rs.getInt("id_mascota"));
//                    mascota.setAlias(rs.getString("alias"));
//                    mascota.setSexo(rs.getString("sexo"));
//                    mascota.setEspecie(rs.getString("especie"));
//                    mascota.setRaza(rs.getString("raza"));
//                    mascota.setColor_pelaje(rs.getString("color_pelaje"));
//                    mascota.setFecha_nac(rs.getDate("fecha_nac").toLocalDate());
//                    mascota.setPeso_actual(rs.getDouble("peso_actual"));
//                    mascota.setPeso_promedio(rs.getDouble("peso_promedio"));
//                    mascota.setActivo(rs.getBoolean("activo"));
//
//                    JOptionPane.showMessageDialog(null, "Mascota fallecida");
//
//                }
//
//            }
//            ps.close();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, " Error de conexion desde buscar mascota " + ex);
//        }
//
//        return mascota;
//    }

    
// busca por el NOMBRE de la mascota, por si se escribio mal al momento del ingreso//
    
      public Mascota buscarMascotaNombre (String alias){
   
          Mascota mascota = null;
;
          
          String sql = "SELECT * FROM mascota WHERE alias LIKE \"%?%\" AND activo = 1";
        
          
           try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,"alias");
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.wasNull() == false){
                
            mascota.getId_mascota();
            mascota.getSexo();
            mascota.getEspecie();
            mascota.getRaza();
            mascota.getColor_pelaje();
            mascota.getFecha_nac();
            mascota.getPeso_actual();
            mascota.getPeso_promedio();
            mascota.setActivo(true);

            
            JOptionPane.showMessageDialog(null,"encrontrado exitosamente");    
            }
            else {
            JOptionPane.showMessageDialog(null, "Verifique el nombre de la mascota");
            }
           
            ps.close();
          
     }  catch (SQLException ex) { 
           JOptionPane.showMessageDialog(null, " Error de conexion desde buscar mascota por su nombre " + ex);
        } 
            
     return mascota ; 
      }
      
      
   //    
      
    public Mascota buscarMascotaxCliente( int id_cliente) {

        Mascota mascota = null;

        String sql = "SELECT * FROM mascota WHERE id_cliente = ? AND `activo`=1;";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setObject(8, mascota.getCliente());

            ResultSet rs = ps.executeQuery();

            if (rs.wasNull() == true) {

                mascota.getId_mascota();
                mascota.getSexo();
                mascota.getEspecie();
                mascota.getRaza();
                mascota.getColor_pelaje();
                mascota.getFecha_nac();
                mascota.getPeso_actual();
                mascota.getPeso_promedio();
                mascota.setActivo(true);

                JOptionPane.showMessageDialog(null, mascota.getAlias()+ "encrontrado exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "Verifique el duenio de la mascota");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error de conexion desde buscar mascota por cliente " + ex);
        }
 return mascota;
    }
    
    
    public Mascota buscarMascotaxSexo( String sexo) {

        Mascota mascota = null;

        String sql = "SELECT * FROM mascota WHERE sexo LIKE \"%?%\" AND `activo` =1 ";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(2, mascota.getSexo());

            ResultSet rs = ps.executeQuery();

            if (rs.wasNull() == true) {

                mascota.getId_mascota();
                mascota.getEspecie();
                mascota.getRaza();
                mascota.getColor_pelaje();
                mascota.getFecha_nac();
                mascota.getPeso_actual();
                mascota.getPeso_promedio();
                mascota.setActivo(true);

                JOptionPane.showMessageDialog(null, mascota.getAlias()+ "encrontrado exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "Verifique el duenio de la mascota");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error de conexion desde buscar mascota por cliente " + ex);
        }
 return mascota;
    }
}