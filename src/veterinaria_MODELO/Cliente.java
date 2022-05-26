/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria_MODELO;

/**
 *
 * @author Barbara
 */
public class Cliente {
    
    private int id_cliente;
    private long dni;
    private String apellido;
    
    private String nombreD;
    // nombre del dueñio //
    
    private String direccion;
    private long telefono;
    
    private String contactoA;
   // contacto alterntivo//

    public Cliente(int id_cliente, long dni, String apellido, String nombreD, String direccion, long telefono, String contactoA) {
        this.id_cliente = -1;
        this.dni = dni;
        this.apellido = apellido;
        this.nombreD = nombreD;
        this.direccion = direccion;
        this.telefono = telefono;
        this.contactoA = contactoA;
    }

    public Cliente(long dni, String apellido, String nombreD, String direccion, long telefono, String contactoA) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombreD = nombreD;
        this.direccion = direccion;
        this.telefono = telefono;
        this.contactoA = contactoA;
    }

    public Cliente() {
        this.id_cliente = -1;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombreD() {
        return nombreD;
    }

    public void setNombreD(String nombreD) {
        this.nombreD = nombreD;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getContactoA() {
        return contactoA;
    }

    public void setContactoA(String contactoA) {
        this.contactoA = contactoA;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_cliente=" + id_cliente + ", dni=" + dni + ", apellido=" + apellido + ", nombreD=" + nombreD + ", direccion=" + direccion + ", telefono=" + telefono + ", contactoA=" + contactoA + '}';
    }    
    
}
