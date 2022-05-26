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
public class Tratamiento {
    
    private int id_tratamiento;
    private String tipo_tratamiento;
    private String descripcion;
    private String medicamento;
    private double precio;
    private boolean activo;
    
    Visita visita;

    public Tratamiento(int id_tratamiento, String tipo_tratamiento, String descripcion, String medicamento, double precio, boolean activo, Visita visita) {
        this.id_tratamiento = -1;
        this.tipo_tratamiento = tipo_tratamiento;
        this.descripcion = descripcion;
        this.medicamento = medicamento;
        this.precio = precio;
        this.activo = activo;
        this.visita = visita;
    }

    public Tratamiento(String tipo_tratamiento, String descripcion, String medicamento, double precio, boolean activo, Visita visita) {
        this.tipo_tratamiento = tipo_tratamiento;
        this.descripcion = descripcion;
        this.medicamento = medicamento;
        this.precio = precio;
        this.activo = activo;
        this.visita = visita;
    }

    public Tratamiento() {
        this.id_tratamiento = -1;
    }

    public int getId_tratamiento() {
        return id_tratamiento;
    }

    public void setId_tratamiento(int id_tratamiento) {
        this.id_tratamiento = id_tratamiento;
    }

    public String getTipo_tratamiento() {
        return tipo_tratamiento;
    }

    public void setTipo_tratamiento(String tipo_tratamiento) {
        this.tipo_tratamiento = tipo_tratamiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Visita getVisita() {
        return visita;
    }

    public void setVisita(Visita visita) {
        this.visita = visita;
    }

    @Override
    public String toString() {
        return "Tratamiento{" + "id_tratamiento=" + id_tratamiento + ", tipo_tratamiento=" + tipo_tratamiento + ", descripcion=" + descripcion + ", medicamento=" + medicamento + ", precio=" + precio + ", activo=" + activo + ", visita=" + visita + '}';
    }
    
    
    
}
