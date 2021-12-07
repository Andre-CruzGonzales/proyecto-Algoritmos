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
public class Colaborador extends Persona{
    private int id;
    
    private String estado_registro;
    private Usuario usuario;
    public Colaborador(int id, String numero_documento, String nombre, String direccion, String celular, String estado_registro, Usuario usuario, TipoDocumento tipo_documento,String email) {
        super(numero_documento, nombre, direccion, celular, tipo_documento, email);
        this.id = id;
        this.estado_registro = estado_registro;
        this.usuario = usuario;
    }
    
    public Colaborador(){
        super();
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setNumero_documento(String numero_documento) {
        super.setNumero_documento(numero_documento);
    }
    
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    public void setDireccion(String direccion) {
        super.setDireccion(direccion);
    }

    public void setCelular(String celular) {
        super.setCelular(celular);
    }

    public void setEstado_registro(String estado_registro) {
        this.estado_registro = estado_registro;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setTipo_documento(TipoDocumento tipo_documento) {
        super.setTipo_documento(tipo_documento);
    }

    public void setEmail(String email) {
        super.setEmail(email);
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

    public String getCelular() {
        return super.getCelular();
    }

    public String getEstado_registro() {
        return estado_registro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public TipoDocumento getTipo_documento() {
        return super.getTipo_documento();
    }

    public String getEmail() {
        return super.getEmail();
    }
    
    
    
}
