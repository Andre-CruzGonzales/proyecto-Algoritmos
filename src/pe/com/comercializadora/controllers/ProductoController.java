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
import pe.com.comercializadora.modelos.Producto;

/**
 *
 * @author Andre
 */
public class ProductoController {
    private Conexion mysql = new Conexion();
    private Connection con = mysql.conectar();
    private String sql="";
    public Integer totalRegistro;
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        String [] titulo = {"ID_pro","ID_cat","ID_mar","producto","Stock","Categoria","Marca","Precio Compra","Precio Venta","Estado"};
        String [] registro = new String[10];
        totalRegistro = 0;
        modelo =  new DefaultTableModel(null,titulo);
        sql = "select * from producto "
                + "LEFT JOIN categoria ON categoria.id=producto.categoria_id "
                + "LEFT JOIN marca ON marca.id = producto.marca_id "
                + "WHERE producto.nombre LIKE '%"+buscar+"%' order by producto.id";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                registro[0]=rs.getString("producto.id");
                registro[1]=rs.getString("categoria.id");
                registro[2]=rs.getString("marca.id");
                registro[3]=rs.getString("producto.nombre");
                registro[4]=rs.getString("producto.stock");
                registro[5]=rs.getString("categoria.nombre");
                registro[6]=rs.getString("marca.nombre");
                registro[7]=rs.getString("producto.precio_compra");
                registro[8]=rs.getString("producto.precio_venta");
                registro[9]=rs.getString("producto.estado_registro");
                
                
                totalRegistro++;
                modelo.addRow(registro);
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "ProductoController->mostrar: "+e);
        }
        return modelo;
    }
    public boolean insertar(Producto producto){
        String sql_producto = "insert into producto (nombre,precio_compra,precio_venta,estado_registro,categoria_id,stock,marca_id) values (?,?,?,?,?,?,?)";
        
       
        try {
            PreparedStatement pst1 = con.prepareStatement(sql_producto);
            
            pst1.setString(1,producto.getNombre());
            pst1.setDouble(2,producto.getPrecio_compra());
            pst1.setDouble(3,producto.getPrecio_venta());
            pst1.setString(4,"A");
            pst1.setInt(5,producto.getCategoria().getId());
            pst1.setDouble(6,producto.getStock());
            pst1.setDouble(7,producto.getMarca().getId());
            int ps1 = pst1.executeUpdate();
            
            
            if(ps1!=0){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    public boolean editar(Producto producto){
        
        String sql_producto = "UPDATE producto set nombre=?,precio_compra=?,precio_venta=?,categoria_id=?,stock=?, marca_id=? where id=?";
        try {
            PreparedStatement pst1 = con.prepareStatement(sql_producto);
            
            pst1.setString(1,producto.getNombre());
            pst1.setDouble(2,producto.getPrecio_compra());
            pst1.setDouble(3,producto.getPrecio_venta());
            pst1.setInt(4,producto.getCategoria().getId());
            pst1.setDouble(5,producto.getStock());
            pst1.setInt(6,producto.getMarca().getId());
            pst1.setInt(7,producto.getId());
            int ps1 = pst1.executeUpdate();
            if(ps1!=0){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    public boolean desactivar(Producto producto){
        sql = "update producto set estado_registro=? where id=?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,"I");
            pst.setInt(2,producto.getId());
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
    public boolean activar(Producto producto){
        sql = "update producto set estado_registro=? where id=?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1,"A");
            pst.setInt(2,producto.getId());
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
