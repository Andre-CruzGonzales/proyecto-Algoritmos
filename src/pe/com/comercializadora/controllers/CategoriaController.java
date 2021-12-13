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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pe.com.comercializadora.config.Conexion;
import pe.com.comercializadora.modelos.Categoria;

/**
 *
 * @author Andre
 */
public class CategoriaController {
    private Conexion mysql = new Conexion();
    private Connection con = mysql.conectar();
    private String sql="";
    public Integer totalRegistro;
    
    //configuramos la tabla para q muestre solo lso datos q necesito
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        String [] titulo = {"ID","Nombre","Registro"};
        String [] registro = new String[3];
        totalRegistro = 0;
        modelo =  new DefaultTableModel(null,titulo);
        sql = "select * from categoria where nombre like '%"+buscar+"%' order by id";
        System.out.println(sql);
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                registro[0]=rs.getString("id");
                registro[1]=rs.getString("nombre");
                registro[2]=rs.getString("estado_registro");
                totalRegistro++;
                modelo.addRow(registro);
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return modelo;
    }
    
    public boolean insertar(Categoria categoria){
        sql = "insert into categoria (nombre,estado_registro) values(?,?)";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,categoria.getNombre());
            pst.setString(2,"A");
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
    public boolean editar(Categoria categoria){
        sql = "update categoria set nombre=? where id=?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,categoria.getNombre());
            pst.setInt(2,categoria.getId());
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
    public boolean desactivar(Categoria categoria){
        sql = "update categoria set estado_registro=? where id=?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,"I");
            pst.setInt(2,categoria.getId());
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
    public boolean activar(Categoria categoria){
        sql = "update categoria set estado_registro=? where id=?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,"A");
            pst.setInt(2,categoria.getId());
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
    public boolean destroy(Categoria categoria){
        sql = "delete from categoria where id=?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1,categoria.getId());
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
    public ArrayList<Categoria> list(){
        Categoria tipo_documento;
        ArrayList<Categoria> tipos_documentos=new ArrayList<Categoria>();
        sql = "select * from categoria where estado_registro = 'A'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String estado_registro = rs.getString("estado_registro");
                tipo_documento=new Categoria(id, nombre, estado_registro);
                tipos_documentos.add(tipo_documento);
                
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return tipos_documentos;
    }
    public int list_compareID(ArrayList<Categoria> tipos,int IDItem){
        int index=0;
        for(int i= 0;i<tipos.size();i++){
            if(tipos.get(i).getId()==IDItem){
                index=i;
            }
        }
        return index;
    }
}
