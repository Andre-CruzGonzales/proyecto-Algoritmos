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
public class Persona {
    private String numero_documento;
    private String nombre;
    private String direccion;
    private String celular;
    private TipoDocumento tipo_documento;
    private String email;

    public Persona(String numero_documento, String nombre, String direccion, String celular, TipoDocumento tipo_documento, String email) {
        
        this.numero_documento = numero_documento;
        this.nombre = nombre;
        this.direccion = direccion;
        this.celular = celular;
        
        this.tipo_documento = tipo_documento;
        this.email = email;
        //super(numero_documento,nombre,direccion,celular,tipo_documento,email);
        
    }
    public Persona(){
        super();
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    

    public void setTipo_documento(TipoDocumento tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCelular() {
        return celular;
    }

    

    public TipoDocumento getTipo_documento() {
        return tipo_documento;
    }

    public String getEmail() {
        return email;
    }
    
    
}
