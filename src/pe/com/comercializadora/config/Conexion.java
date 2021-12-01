/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.comercializadora.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Andre
 */
public class Conexion {
    //jdbc:mysql://localhost/" + dbName + "?user=" + dbUserName + "&password=" + dbPassword + "&useUnicode=true&characterEncoding=UTF-8";
    private final String db = "comercializadora";
    private final String user = "root";
    private final String password="";
    //private final String host = "20.124.130.23/"+db+"?user="+user+"&password="+password+"&useUnicode=true&characterEncoding=UTF-8";
    private final String url = "jdbc:mysql://"+"localhost/"+db;
    public Connection conectar(){
        Connection link =null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            link = DriverManager.getConnection(this.url,this.user,this.password);
            System.out.println("conexion exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            JOptionPane.showConfirmDialog(null,e);
        }
        return link;
    }
    
    
    
    
}
