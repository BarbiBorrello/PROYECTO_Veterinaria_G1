package veterinaria_CONTROLADOR;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import veterinaria_MODELO.Cliente;

public class ClienteData {

    private Connection con = null;

    public ClienteData(Conexion conexion) {
        try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error en la conexion");
        }
    }

    public Cliente buscarCliente(int p_id_cliente) {

        // Iniciacion null de la variable cliente
        Cliente cliente = null;

        // String de consulta a base de datos
        String sql = "SELECT * FROM cliente WHERE activo = 1 AND id_cliente =?;";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, p_id_cliente);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                /* Instanciado de cliente encontrado en la BD con todos sus parametros */
                cliente = new Cliente();
                cliente.setId_cliente(rs.getInt("id_cliente"));
                cliente.setDni(rs.getLong("dni"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombreD(rs.getString("nombre_duenio"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setTelefono(rs.getLong("telefono"));
                cliente.setContactoA("contacto_alternativo");
                cliente.setActivo(rs.getBoolean("activo"));

                // Mensaje de cliente encontrado
                JOptionPane.showMessageDialog(null, " Se encontro Id:" + cliente.toString());

            } else {
                // Mensaje de cliente no encontrado
                JOptionPane.showMessageDialog(null, " Id de Alumno inexistente");

            }
            ps.close();
        } catch (SQLException ex) {
            // Mensaje de error de acceso a la base de datos
            JOptionPane.showMessageDialog(null, " Error de conexion desde buscar alumno " + ex);

        }

        return cliente;
    }

    public void agregarCliente(Cliente p_cliente) {

        // String de consulta a base de datos
        String sql = "INSERT INTO cliente (dni, apellido, nombre_duenio, direccion, telefono, contacto_alternativo, activo)  VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setLong(1, p_cliente.getDni());
            ps.setString(2, p_cliente.getApellido());
            ps.setString(3, p_cliente.getNombreD());
            ps.setString(4, p_cliente.getDireccion());
            ps.setLong(5, p_cliente.getTelefono());
            ps.setString(6, p_cliente.getContactoA());
            ps.setInt(7, p_cliente.getActivo() ? 1 : 0);

            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                p_cliente.setId_cliente(rs.getInt(1));
                JOptionPane.showMessageDialog(null, " Se genero el id:" + p_cliente.getId_cliente() + " del cliente exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "No genero el id del cliente");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde insertar cliente " + ex);

        }
    }

    public void modificarCliente(int p_id_cliente, Cliente p_cliente) {

        // String de consulta a base de datos
        String sql = "UPDATE cliente SET dni=?, apellido=?, nombre_duenio=?, direccion=?, telefono=?, contacto_alternativo=?, activo=? WHERE id_cliente=?;";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setLong(1, p_cliente.getDni());
            ps.setString(2, p_cliente.getApellido());
            ps.setString(3, p_cliente.getNombreD());
            ps.setString(4, p_cliente.getDireccion());
            ps.setLong(5, p_cliente.getTelefono());
            ps.setString(6, p_cliente.getContactoA());
            ps.setInt(7, p_cliente.getActivo() ? 1 : 0);
            ps.setInt(8, p_id_cliente);

            int rs = ps.executeUpdate();

            if (rs > 0) {
                JOptionPane.showMessageDialog(null, " Cliente se actualizado exitosamente ");
            } else {
                JOptionPane.showMessageDialog(null, " Cliente No se pudo actualizar ");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde insertar cliente " + ex);

        }
    }

    public void borrarCliente(int p_id_cliente) {

        // String de consulta a base de datos
        String sql = "UPDATE cliente SET activo =0 WHERE id_cliente=?";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, p_id_cliente);

            int rs = ps.executeUpdate();

            if (rs > 0) {
                JOptionPane.showMessageDialog(null, "Cliente borrado exitosamente ");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo borrar, cliente inexistente ");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde insertar cliente " + ex);

        }
    }

}
