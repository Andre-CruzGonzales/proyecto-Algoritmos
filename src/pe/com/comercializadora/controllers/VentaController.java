/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.comercializadora.controllers;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pe.com.comercializadora.config.Conexion;
import pe.com.comercializadora.modelos.Venta;
import pe.com.comercializadora.modelos.VentaDetalle;

/**
 *
 * @author Andre
 */
public class VentaController {
    private Conexion mysql = new Conexion();
    private Connection con = mysql.conectar();
    private String sql="";
    public Integer totalRegistro;
    
    public DefaultTableModel mostrar_busqueda_cliente(String buscar){
        DefaultTableModel modelo;
        String [] titulo = {"ID","Tipo Doc","Numero Doc","Nombre"};
        String [] registro = new String[4];
        totalRegistro = 0;
        modelo =  new DefaultTableModel(null,titulo);
        sql = "select * from cliente LEFT JOIN tipo_documento ON tipo_documento.id = cliente.tipo_documento_id where (cliente.numero_documento like '%"+buscar+"%' OR cliente.nombre like '%"+buscar+"%') AND cliente.estado_registro!='I' order by cliente.id";
        System.out.println(sql);
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                registro[0]=rs.getString("cliente.id");
                registro[1]=rs.getString("tipo_documento.nombre");
                registro[2]=rs.getString("cliente.numero_documento");
                registro[3]=rs.getString("cliente.nombre");
                totalRegistro++;
                modelo.addRow(registro);
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return modelo;
    }
    public DefaultTableModel mostrar_busqueda_producto(String buscar){
        DefaultTableModel modelo;
        String [] titulo = {"ID","Producto","Marca","Categoria","Precio Venta"};
        String [] registro = new String[5];
        totalRegistro = 0;
        modelo =  new DefaultTableModel(null,titulo);
        sql = "select * from producto LEFT JOIN marca ON marca.id = producto.marca_id LEFT JOIN categoria ON categoria.id = producto.categoria_id where producto.nombre like '%"+buscar+"%' AND producto.estado_registro!='I' order by producto.id";
        System.out.println(sql);
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                registro[0]=rs.getString("producto.id");
                registro[1]=rs.getString("producto.nombre");
                registro[2]=rs.getString("marca.nombre");
                registro[3]=rs.getString("categoria.nombre");
                registro[4]=rs.getString("producto.precio_venta");
                totalRegistro++;
                modelo.addRow(registro);
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return modelo;
    }
    public DefaultTableModel mostrar_venta_detalle(Venta venta){
        DefaultTableModel modelo;
        String [] titulo = {"ID","Producto","Cantidad","Precio Unitario","Precio Venta"};
        String [] registro = new String[5];
        totalRegistro = 0;
        double total=0.0;
        modelo =  new DefaultTableModel(null,titulo);
       
        try {
            
            for(int i=0;i<venta.getVentaDetalle().size();i++){
                registro[0]=""+venta.getVentaDetalle().get(i).getId()+"";
                registro[1]=venta.getVentaDetalle().get(i).getProductos().getNombre();
                registro[2]=""+venta.getVentaDetalle().get(i).getCantidad();
                registro[3]=""+venta.getVentaDetalle().get(i).getPrecio_unitario();
                registro[4]=""+venta.getVentaDetalle().get(i).getPrecio_venta();
                System.out.println(i);
                totalRegistro++;
                total +=venta.getVentaDetalle().get(i).getPrecio_venta();
                modelo.addRow(registro);
            }
            venta.setTotal(total);
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return modelo;
    }
    public boolean insertar(Venta venta){
        sql = "insert into venta (fecha_emision,estado_registro,total,igv,cliente_id) values(?,?,?,?,?)";
      String sql3="select * from venta order by id desc limit 1";
        String sql2 ="insert into venta_detalle (venta_id,precio_venta,precio_unitario,estado_registro,producto_id,cantidad) values (?,?,?,?,?,?) ";
        boolean valor=false;
        int lastID=0;
        try {
            
            
            PreparedStatement pst = con.prepareStatement(sql);
            PreparedStatement pst2 = con.prepareStatement(sql2);
            pst.setDate(1, (Date) venta.getDate());
            pst.setString(2,"A");
            pst.setDouble(3,venta.getTotal());
            pst.setDouble(4,venta.getIGV());
            pst.setInt(5,venta.getCliente().getId());
            System.out.println("Guarda Cabecera");
            int isRegistros = pst.executeUpdate();
            //traer el ultimo ID
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql3);
            while(rs.next()){
                lastID=rs.getInt("id");
            }
            for(int i=0;i<venta.getVentaDetalle().size();i++){
                pst2.setInt(1, lastID);
                pst2.setDouble(2,venta.getVentaDetalle().get(i).getPrecio_venta());
                pst2.setDouble(3,venta.getVentaDetalle().get(i).getPrecio_unitario());
                pst2.setString(4,"A");
                pst2.setDouble(5,venta.getVentaDetalle().get(i).getProductos().getId());
                pst2.setDouble(6,venta.getVentaDetalle().get(i).getCantidad());
                int isRegistros2 = pst2.executeUpdate();
                if(isRegistros2!=0){
                    valor = true;
                }else{
                    System.out.println("NOOO Guarda Detalle");
                    return false;
                }
            }
            //int isRegistros = pst.executeUpdate();
            if(isRegistros!=0){
                if(valor){
                 return true;

                }
                return false;
            }else{
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
}
