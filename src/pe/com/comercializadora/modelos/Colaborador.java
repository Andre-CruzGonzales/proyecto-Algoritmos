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
public class Colaborador {
    private int id;
    private String numero_documento;
    private String nombre;
    private String direccion;
    private String celular;
    private String estado_registro;
    private Usuario usuario;
    private TipoDocumento tipo_documento;
    private String email;
    public Colaborador(int id, String numero_documento, String nombre, String direccion, String celular, String estado_registro, Usuario usuario, TipoDocumento tipo_documento,String email) {
        this.id = id;
        this.numero_documento = numero_documento;
        this.nombre = nombre;
        this.direccion = direccion;
        this.celular = celular;
        this.estado_registro = estado_registro;
        this.usuario = usuario;
        this.tipo_documento = tipo_documento;
        this.email = email;
    }
    public Colaborador(){
        
    }

    public void setId(int id) {
        this.id = id;
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

    public void setEstado_registro(String estado_registro) {
        this.estado_registro = estado_registro;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setTipo_documento(TipoDocumento tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    public int getId() {
        return id;
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

    public String getEstado_registro() {
        return estado_registro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public TipoDocumento getTipo_documento() {
        return tipo_documento;
    }

    public String getEmail() {
        return email;
    }
    
    
    
}
