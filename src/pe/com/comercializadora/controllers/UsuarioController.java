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
import pe.com.comercializadora.modelos.Colaborador;
import pe.com.comercializadora.modelos.Usuario;

/**
 *
 * @author Andre
 */
public class UsuarioController {
    private Conexion mysql = new Conexion();
    private Connection con = mysql.conectar();
    private String sql="";
    public Integer totalRegistro;
    
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        String [] titulo = {"ID_Col","ID_usu","ID_rol","ID_TipDoc","tipo DOC","numero DOC","Nombre","Direccion","Usuario","Rol","Celular","Email","Estado"};
        String [] registro = new String[13];
        totalRegistro = 0;
        modelo =  new DefaultTableModel(null,titulo);
        sql = "select * from colaborador "
                + "LEFT JOIN usuario ON usuario.id=colaborador.usuario_id "
                + "LEFT JOIN tipo_documento ON tipo_documento.id = colaborador.tipo_documento_id "
                + "LEFT JOIN rol ON rol.id = usuario.rol_id "
                + "WHERE colaborador.nombre LIKE '%"+buscar+"%' order by colaborador.id";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                registro[0]=rs.getString("colaborador.id");
                registro[1]=rs.getString("usuario.id");
                registro[2]=rs.getString("rol.id");
                registro[3]=rs.getString("tipo_documento.id");
                registro[4]=rs.getString("tipo_documento.nombre");
                registro[5]=rs.getString("colaborador.numero_documento");
                registro[6]=rs.getString("colaborador.nombre");
                registro[7]=rs.getString("colaborador.direccion");
                registro[8]=rs.getString("usuario.username");
                registro[9]=rs.getString("rol.nombre");
                registro[10]=rs.getString("colaborador.celular");
                registro[11]=rs.getString("colaborador.email");
                registro[12]=rs.getString("usuario.estado_registro");
                totalRegistro++;
                modelo.addRow(registro);
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "UsuarioController->mostrar: "+e);
        }
        return modelo;
    }
    public boolean insertar(Colaborador colaborador){
        String sql_usuario = "insert into usuario (username,password,estado_registro,rol_id) values (?,?,?,?)";
        String sql_id_usu = "select * from usuario order by id desc limit 1";
        String sql_colaborador = "insert into colaborador (numero_documento,nombre,direccion,celular,estado_registro,usuario_id,tipo_documento_id,email) values(?,?,?,?,?,?,?,?)";
        int lastIDUser=0;
        try {
            PreparedStatement pst1 = con.prepareStatement(sql_usuario);
            PreparedStatement pst2 = con.prepareStatement(sql_colaborador);
            pst1.setString(1,colaborador.getUsuario().getUsername());
            pst1.setString(2,colaborador.getUsuario().getPassword());
            pst1.setString(3,"A");
            pst1.setInt(4,colaborador.getUsuario().getRol().getId());
            int ps1 = pst1.executeUpdate();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql_id_usu);
            while(rs.next()){
                lastIDUser=rs.getInt("id");
            }
            pst2.setString(1,colaborador.getNumero_documento());
            pst2.setString(2,colaborador.getNombre());
            pst2.setString(3,colaborador.getDireccion());
            pst2.setString(4,colaborador.getCelular());
            pst2.setString(5,"A");
            pst2.setInt(6,lastIDUser);
            pst2.setInt(7,colaborador.getTipo_documento().getId());
            pst2.setString(8,colaborador.getEmail());
            int ps2 = pst2.executeUpdate();
            if(ps1!=0 && ps2!=0){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    public boolean editar(Colaborador colaborador){
        String sql_usuario = "update usuario set username=?,rol_id=? where id=?";
        String sql_colaborador = "UPDATE colaborador set numero_documento=?,nombre=?,direccion=?,celular=?,tipo_documento_id=?, email=? where id=?";
        try {
            PreparedStatement pst1 = con.prepareStatement(sql_usuario);
            PreparedStatement pst2 = con.prepareStatement(sql_colaborador);
            pst1.setString(1,colaborador.getUsuario().getUsername());
            pst1.setInt(2,colaborador.getUsuario().getRol().getId());
            pst1.setInt(3,colaborador.getId());
            int ps1 = pst1.executeUpdate();
            
            pst2.setString(1,colaborador.getNumero_documento());
            pst2.setString(2,colaborador.getNombre());
            pst2.setString(3,colaborador.getDireccion());
            pst2.setString(4,colaborador.getCelular());
            pst2.setInt(5,colaborador.getTipo_documento().getId());
            pst2.setString(6,colaborador.getEmail());
            pst2.setInt(7,colaborador.getId());
            int ps2 = pst2.executeUpdate();
            if(ps1!=0 && ps2!=0){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    public boolean desactivar_usuario(Colaborador colaborador){
        sql = "update usuario set estado_registro=? where id=?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,"I");
            pst.setInt(2,colaborador.getUsuario().getId());
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
    public boolean activar_usuario(Colaborador colaborador){
        sql = "update usuario set estado_registro=? where id=?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,"A");
            pst.setInt(2,colaborador.getUsuario().getId());
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
