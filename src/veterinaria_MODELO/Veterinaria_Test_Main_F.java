/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria_MODELO;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import veterinaria_CONTROLADOR.ClienteData;
import veterinaria_CONTROLADOR.Conexion;
import veterinaria_CONTROLADOR.MascotaData;
import veterinaria_CONTROLADOR.TratamientoData;
import veterinaria_CONTROLADOR.VisitaData;

public class Veterinaria_Test_Main_F {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {

            Conexion conexion = new Conexion();
            ClienteData cd = new ClienteData(conexion);
            MascotaData md = new MascotaData(conexion);
            TratamientoData td = new TratamientoData(conexion);
            VisitaData vd = new VisitaData(conexion);

            /* ----------- PRUEBAS EN ClienteDATA ----------- */
            // Creacion de un cliente para pruebas
            //Cliente cliente1 = new Cliente(23456789, "Francella", "Guillermo", "Avenida siempre viva 123", 12345678, "Pedrito rulito", true);

            /* -----Insercion de un cliente en la BD----- */
            //Cliente creado anteriormente
            //cd.agregarCliente(cliente1);

            // cliente con parametros null
            //cd.agregarCliente(new Cliente());
            /* -----Consulta por un cliente existente en la base de datos y un cliente no existente----- */
            //cd.buscarCliente(2);
            //cd.buscarCliente(20);
            /* -----Modificacion de un cliente utilizando cliente2----- */
            //Cliente cliente2 = new Cliente(987655432, "El", "Chavo del 8", "Avenida siempre viva 123", 12345678, "Pedrito rulito", true);
            //Modificacion de un cliente existente y uno no existente
            //cd.modificarCliente(3, cliente2);
            //cd.modificarCliente(10, cliente2);
            /* -----Borrado de cliente existente y uno no existente----- */
            //cd.borrarCliente(3);
            //cd.borrarCliente(20);
            
            
            /* -----Listado de Clientes sin filtrado ----- */
            
            /*
            List<Cliente> clientela = cd.listarCliente("", "");
            
            for (Cliente c1 : clientela) {
                System.out.println(c1.toString());
            }
            */
            
            
            /* ------Listado de clientes usando filtro----- */
            // Filtros posibles "ID", "DNI", "Telefono", "Activo", "Apellido", "Nombre", "Direccion", "Contacto alternativo"
            // uso listarCliente(filtro por ejemplo "Apellido" , valor a filtrar por Ejemplo "Francella")
            
             /*            
            List<Cliente> clientela = cd.listarCliente("Apellido", "Francella");
            
            for (Cliente c1 : clientela) {
                System.out.println(c1.toString());
            }
            */
            

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Veterinaria_Test_Main_F.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}