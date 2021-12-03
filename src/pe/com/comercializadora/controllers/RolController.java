/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.comercializadora.controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pe.com.comercializadora.config.Conexion;
import pe.com.comercializadora.modelos.Rol;

/**
 *
 * @author Andre
 */
public class RolController {
    private Conexion mysql = new Conexion();
    private Connection con = mysql.conectar();
    private String sql="";
    public Integer totalRegistro;
    
    public ArrayList<Rol> list(){
        Rol rol;
        ArrayList<Rol> roles=new ArrayList<Rol>();
        sql = "select * from rol where estado_registro = 'A'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String estado_registro = rs.getString("estado_registro");
                rol=new Rol(id, nombre, estado_registro);
                roles.add(rol);
                
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return roles;
    }
    public int list_compareID(ArrayList<Rol> roles,int idRol){
        int index=0;
        for(int i= 0;i<roles.size();i++){
            if(roles.get(i).getId()==idRol){
                index=i;
                System.out.println("DDDDDD "+i);
            }
        }
        return index;
    }
}
