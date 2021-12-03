/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.comercializadora.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import pe.com.comercializadora.config.Conexion;
import pe.com.comercializadora.modelos.Rol;
import pe.com.comercializadora.modelos.Usuario;

/**
 *
 * @author Andre
 */
public class LoginController {

    //buscar el usuario y comparar la contraseña
    private Conexion mysql = new Conexion();
    private Connection con = mysql.conectar();

    public boolean login(Usuario usuario) {
        String sql = "select * from usuario where username=? AND password =? AND estado_registro='A'";
        boolean ingresar = false;
        
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, usuario.getUsername());
            pst.setString(2, usuario.getPassword());
            ResultSet rs2 = pst.executeQuery();
            if (rs2.next()) {
              ingresar = true;
              
              usuario.setRol(new Rol(rs2.getInt("rol_id"),"",""));
            }
        } catch (Exception e) {
        }
        System.out.println(ingresar);
        return ingresar;
    }
}
