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
public class Cliente {
    private int id;
    private int numero_documento;
    private String nombre;
    private String direccion;
    private String email;
    private String celular;
    private String estado_registro;
    private TipoDocumento tipo_documento;

    public Cliente(int id, int numero_documento, String nombre, String direccion, String email, String celular, String estado_registro, TipoDocumento tipo_documento) {
        this.id = id;
        this.numero_documento = numero_documento;
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.celular = celular;
        this.estado_registro = estado_registro;
        this.tipo_documento = tipo_documento;
    }
    
    public Cliente(){
        
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumero_documento(int numero_documento) {
        this.numero_documento = numero_documento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setEstado_registro(String estado_registro) {
        this.estado_registro = estado_registro;
    }

    public void setTipo_documento(TipoDocumento tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public int getId() {
        return id;
    }

    public int getNumero_documento() {
        return numero_documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public String getCelular() {
        return celular;
    }

    public String getEstado_registro() {
        return estado_registro;
    }

    public TipoDocumento getTipo_documento() {
        return tipo_documento;
    }
    
}
