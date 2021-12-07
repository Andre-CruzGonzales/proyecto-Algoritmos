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
public class Cliente extends Persona {
    private int id;
    
    
    
    
    
    private String estado_registro;
    

    public Cliente(int id, String numero_documento, String nombre, String direccion, String email, String celular, String estado_registro, TipoDocumento tipo_documento) {
        super(numero_documento, nombre, direccion, celular, tipo_documento, email);
        this.id = id;
        this.estado_registro = estado_registro;
    }
    
    public Cliente(){
        super();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumero_documento(String numero_documento) {
        super.setNumero_documento(numero_documento);
    }

    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    public void setDireccion(String direccion) {
        super.setDireccion(direccion);
    }

    public void setEmail(String email) {
        super.setEmail(email);
    }

    public void setCelular(String celular) {
        super.setCelular(celular);
    }

    public void setEstado_registro(String estado_registro) {
        this.estado_registro = estado_registro;
    }

    public void setTipo_documento(TipoDocumento tipo_documento) {
        super.setTipo_documento(tipo_documento);
    }

    public int getId() {
        return id;
    }

    public String getNumero_documento() {
        return super.getNumero_documento();
    }

    public String getNombre() {
        return super.getNombre();
    }

    public String getDireccion() {
        return super.getDireccion();
    }

    public String getEmail() {
        return super.getEmail();
    }

    public String getCelular() {
        return super.getCelular();
    }

    public String getEstado_registro() {
        return estado_registro;
    }

    public TipoDocumento getTipo_documento() {
        return super.getTipo_documento();
    }
    public String toString(){
        return "id:"+this.getId()+" numero_documento:"+ this.getNumero_documento()+" nombre:"+this.getNombre();
    }
    
}
