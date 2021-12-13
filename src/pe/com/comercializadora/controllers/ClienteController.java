/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.comercializadora.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pe.com.comercializadora.config.Conexion;
import pe.com.comercializadora.modelos.Cliente;

/**
 *
 * @author Andre
 */
public class ClienteController {
    private Conexion mysql = new Conexion();
    private Connection con = mysql.conectar();
    private String sql="";
   
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        String [] titulo = {"ID_cli","ID_TipDoc","tipo DOC","numero DOC","Nombre","Direccion","Celular","Email","Estado"};
        String [] registro = new String[9];
        
        modelo =  new DefaultTableModel(null,titulo);
        sql = "select * from cliente "
                + "LEFT JOIN tipo_documento ON tipo_documento.id = cliente.tipo_documento_id "
                + "WHERE cliente.nombre LIKE '%"+buscar+"%' order by cliente.id";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                registro[0]=rs.getString("cliente.id");
                registro[1]=rs.getString("tipo_documento.id");
                registro[2]=rs.getString("tipo_documento.nombre");
                registro[3]=rs.getString("cliente.numero_documento");
                registro[4]=rs.getString("cliente.nombre");
                registro[5]=rs.getString("cliente.direccion");
                registro[6]=rs.getString("cliente.celular");
                registro[7]=rs.getString("cliente.email");
                registro[8]=rs.getString("cliente.estado_registro");
                
                modelo.addRow(registro);
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "UsuarioController->mostrar: "+e);
        }
        return modelo;
    }
    public boolean insertar(Cliente cliente){
        
        
        String sql_cliente = "insert into cliente (numero_documento,nombre,direccion,celular,estado_registro,tipo_documento_id,email) values(?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement pst2 = con.prepareStatement(sql_cliente);
            
            pst2.setString(1,cliente.getNumero_documento());
            pst2.setString(2,cliente.getNombre());
            pst2.setString(3,cliente.getDireccion());
            pst2.setString(4,cliente.getCelular());
            pst2.setString(5,"A");
            pst2.setInt(6,cliente.getTipo_documento().getId());
            pst2.setString(7,cliente.getEmail());
            int ps2 = pst2.executeUpdate();
            if(ps2!=0){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    public boolean editar(Cliente cliente){
        
        String sql_cliente = "UPDATE cliente set numero_documento=?,nombre=?,direccion=?,celular=?,tipo_documento_id=?, email=? where id=?";
        try {
            
            PreparedStatement pst2 = con.prepareStatement(sql_cliente);
            pst2.setString(1,cliente.getNumero_documento());
            pst2.setString(2,cliente.getNombre());
            pst2.setString(3,cliente.getDireccion());
            pst2.setString(4,cliente.getCelular());
            pst2.setInt(5,cliente.getTipo_documento().getId());
            pst2.setString(6,cliente.getEmail());
            pst2.setInt(7,cliente.getId());
            int ps2 = pst2.executeUpdate();
            if(ps2!=0){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    public boolean desactivar(Cliente cliente){
        sql = "update cliente set estado_registro=? where id=?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,"I");
            pst.setInt(2,cliente.getId());
            int isRegistros = pst.executeUpdate();
            if(isRegistros!=0){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    public boolean activar(Cliente cliente){
        sql = "update cliente set estado_registro=? where id=?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,"A");
            pst.setInt(2,cliente.getId());
            int isRegistros = pst.executeUpdate();
            if(isRegistros!=0){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
}
