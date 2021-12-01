/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.comercializadora.modelos;

/**
 *
 * @author Andre
 */
public class TipoDocumento {
    private int id;
    private String nombre;
    private String estado_registro;

    public TipoDocumento(int id, String nombre, String estado_registro) {
        this.id = id;
        this.nombre = nombre;
        this.estado_registro = estado_registro;
    }
    public TipoDocumento(){
        
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstado_registro(String estado_registro) {
        this.estado_registro = estado_registro;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstado_registro() {
        return estado_registro;
    }
    
}
