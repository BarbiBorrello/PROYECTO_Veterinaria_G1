package veterinaria_CONTROLADOR;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
                
                JOptionPane.showMessageDialog(null, " Numero de cliente = " + p_cliente.getId_cliente() +" "+ p_cliente.getApellido()+","+p_cliente.getNombreD()+":"+" cargado exitosamente") ;
                
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
// borrado logico tambien funciona para desactivar al cliente //
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
    
    
     public void activarCliente(int p_id_cliente) {

        String sql = "UPDATE cliente SET activo =1 WHERE id_cliente=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, p_id_cliente);

            int rs = ps.executeUpdate();

            if (rs > 0) {
                JOptionPane.showMessageDialog(null, "Se activo el estado del cliente ");
            } else {
                JOptionPane.showMessageDialog(null, " El id del cliente no existe ");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde activar Cliente " + ex);

        }
    }

    public List<Cliente> obtenerClientes() {

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        try {
            String sql = "SELECT * FROM cliente;";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            Cliente cliente;

            while (rs.next()) {
                // Creacion y llenado de clientes para ser insertados en la lista
                cliente = new Cliente();
                cliente.setId_cliente(rs.getInt("id_cliente"));
                cliente.setDni(rs.getLong("dni"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombreD(rs.getString("nombre_duenio"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setTelefono(rs.getLong("telefono"));
                cliente.setContactoA("contacto_alternativo");
                cliente.setActivo(rs.getBoolean("activo"));

                clientes.add(cliente);
            }
            ps.close();

        } catch (SQLException ex) {
            System.out.println("Error al obtener los clientes: " + ex.getMessage());
        }
        return clientes;
        }

        /*
    // listarCliente devuelve una lista de clientes, recibe un parametros de busqueda y un valor de parametro de busqueda
    // los parametros de busqueda posibles son "ID", "DNI", "Telefono", "Activo", "Apellido", "Nombre", "Direccion", "Contacto alternativo"
    public List<Cliente> listarCliente(String p_filtroNombre, String p_filtroValor) {

        ArrayList<Cliente> clientes = new ArrayList<>();
        // Iniciacion null de la variable cliente
        Cliente cliente = null;
        
        // Valores de referencia para buscar
        List<String> pEntrada = List.of("ID", "DNI", "Telefono", "Activo", "Apellido", "Nombre", "Direccion", "Contacto alternativo");
        int indice = pEntrada.indexOf(p_filtroNombre);
        
        // Valores equivalentes de las columnas en la Base de Datos
        List<String> pSalida = List.of("id_cliente", "dni", "telefono", "activo", "apellido", "nombre_duenio", "direccion", "contacto_alternativo");
        
        // busqueda por default todos los clientes
        String sql = "SELECT * FROM cliente;";
        
        try {
            // si los argumentos tanto de filtro como del valor del filtro no son "" es decir contienen algun valor distinto de vacio
            // y este valor se encuentra en la lista de indidices se forman las variantes de busqueda especificada para el filtro
            if (!(p_filtroNombre =="" || p_filtroValor== "" || indice == -1)) {
                
                // Si el indice se encuentra entre 0 y 3 sera un valor del tipo INT, por lo que el valor de entrada no necesita modificacion
                // si el valor del indice de 4 a 7 el valor es un STRING por lo que se debe encerrar entre ''
                if (indice<4){
                    sql = "SELECT * FROM cliente WHERE " + pSalida.get(indice) +"="+ p_filtroValor + ";";
                } else {
                    sql = "SELECT * FROM cliente WHERE " + pSalida.get(indice) +"='"+ p_filtroValor + "';";
                }
                
            }
            
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            
            
            // Llenado de la lista de resultados(clientes)
            while (resultSet.next()) {
                // Creacion y llenado de clientes para ser insertados en la lista
                cliente = new Cliente();
                cliente.setId_cliente(resultSet.getInt("id_cliente"));
                cliente.setDni(resultSet.getLong("dni"));
                cliente.setApellido(resultSet.getString("apellido"));
                cliente.setNombreD(resultSet.getString("nombre_duenio"));
                cliente.setDireccion(resultSet.getString("direccion"));
                cliente.setTelefono(resultSet.getLong("telefono"));
                cliente.setContactoA("contacto_alternativo");
                cliente.setActivo(resultSet.getBoolean("activo"));

                clientes.add(cliente);
            }
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al obtener los clientes: " + ex.getMessage());
        }

        return clientes;
    }
         */
    }
