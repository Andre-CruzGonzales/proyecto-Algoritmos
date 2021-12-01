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
public class VentaDetalle {
    private int id;
    private double precio_venta;
    private double precio_unitario;
    private String estado_registro;
    private int venta_id;
    private Producto productos;
    private int cantidad;

    public VentaDetalle(int id, double precio_venta, double precio_unitario, String estado_registro,int cantidad, int venta_id, Producto productos) {
        this.id = id;
        this.precio_venta = precio_venta;
        this.precio_unitario = precio_unitario;
        this.estado_registro = estado_registro;
        this.cantidad = cantidad;
        this.venta_id = venta_id;
        this.productos = productos;
    }
    public VentaDetalle(int id, double precio_venta, double precio_unitario, String estado_registro,int cantidad, Producto productos) {
        this.id = id;
        this.precio_venta = precio_venta;
        this.precio_unitario = precio_unitario;
        this.estado_registro = estado_registro;
        this.cantidad = cantidad;
        this.productos = productos;
    }
    public VentaDetalle(){
        
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public void setEstado_registro(String estado_registro) {
        this.estado_registro = estado_registro;
    }

    public void setVenta_id(int venta_id) {
        this.venta_id = venta_id;
    }

    public void setProductos(Producto productos) {
        this.productos = productos;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public String getEstado_registro() {
        return estado_registro;
    }

    public int getVenta_id() {
        return venta_id;
    }

    public Producto getProductos() {
        return productos;
    }

    public int getCantidad() {
        return cantidad;
    }
    
}
