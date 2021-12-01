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
public class Producto {
    private int id;
    private String nombre;
    private double precio_compra;
    private double precio_venta;
    private String estado_registro;
    private Categoria categoria;
    private double stock;
    private Marca marca;

    public Producto(int id, String nombre, double precio_compra, double precio_venta, String estado_registro, Categoria categoria, double stock, Marca marca) {
        this.id = id;
        this.nombre = nombre;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
        this.estado_registro = estado_registro;
        this.categoria = categoria;
        this.stock = stock;
        this.marca = marca;
    }
    public Producto(int id, String nombre, double precio_venta,double stock) {
        this.id = id;
        this.nombre = nombre;
        
        this.precio_venta = precio_venta;
        
        
        this.stock = stock;
        
    }
    public Producto(int id, String nombre, double precio_venta) {
        this.id = id;
        this.nombre = nombre;
        
        this.precio_venta = precio_venta;
        
    }
    public Producto(){
        
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public void setEstado_registro(String estado_registro) {
        this.estado_registro = estado_registro;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio_compra() {
        return precio_compra;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public String getEstado_registro() {
        return estado_registro;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public double getStock() {
        return stock;
    }

    public Marca getMarca() {
        return marca;
    }
    
}
