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
import pe.com.comercializadora.modelos.Marca;

/**
 *
 * @author Andre
 */
public class MarcaController {
    private Conexion mysql = new Conexion();
    private Connection con = mysql.conectar();
    private String sql="";
    public Integer totalRegistro;
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        String [] titulo = {"ID","Nombre","Registro"};
        String [] registro = new String[3];
        totalRegistro = 0;
        modelo =  new DefaultTableModel(null,titulo);
        sql = "select * from marca where nombre like '%"+buscar+"%' order by id";
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
    
    public boolean insertar(Marca marca){
        sql = "insert into marca (nombre,estado_registro) values(?,?)";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,marca.getNombre());
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
    public boolean editar(Marca marca){
        sql = "update marca set nombre=? where id=?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,marca.getNombre());
            pst.setInt(2,marca.getId());
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
    public boolean desactivar(Marca marca){
        sql = "update marca set estado_registro=? where id=?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,"I");
            pst.setInt(2,marca.getId());
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
    public boolean activar(Marca marca){
        sql = "update marca set estado_registro=? where id=?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,"A");
            pst.setInt(2,marca.getId());
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
    public boolean destroy(Marca marca){
        sql = "delete from categoria where id=?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1,marca.getId());
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
    public ArrayList<Marca> list(){
        Marca tipo_documento;
        ArrayList<Marca> tipos_documentos=new ArrayList<Marca>();
        sql = "select * from marca where estado_registro = 'A'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String estado_registro = rs.getString("estado_registro");
                tipo_documento=new Marca(id, nombre, estado_registro);
                tipos_documentos.add(tipo_documento);
                
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return tipos_documentos;
    }
    public int list_compareID(ArrayList<Marca> tipos,int IDItem){
        int index=0;
        for(int i= 0;i<tipos.size();i++){
            if(tipos.get(i).getId()==IDItem){
                index=i;
            }
        }
        return index;
    }
}
