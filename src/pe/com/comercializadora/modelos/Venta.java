/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.comercializadora.modelos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Andre
 */
public class Venta {
    private int id;
    private String date;
    private String estado_registro;
    private double total;
    private final double IGV=18.00;
    private Cliente cliente;
    private ArrayList<VentaDetalle> ventaDetalle;

    public Venta(int id, String date, String estado_registro, double total, Cliente cliente, ArrayList<VentaDetalle> ventaDetalle) {
        this.id = id;
        this.date = date;
        this.estado_registro = estado_registro;
        this.total = total;
        this.cliente = cliente;
        this.ventaDetalle = ventaDetalle;
    }
    public Venta(){
        ventaDetalle = new ArrayList<VentaDetalle>();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setEstado_registro(String estado_registro) {
        this.estado_registro = estado_registro;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setVentaDetalle(ArrayList<VentaDetalle> ventaDetalle) {
        this.ventaDetalle = ventaDetalle;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getEstado_registro() {
        return estado_registro;
    }

    public double getTotal() {
        return total;
    }

    public double getIGV() {
        return IGV;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<VentaDetalle> getVentaDetalle() {
        return ventaDetalle;
    }
    public void addVentaDetalle(VentaDetalle ventaDetalle){
        this.ventaDetalle.add(ventaDetalle);
    }
    public void quitarVentaDetalleIndex(int index){
        this.ventaDetalle.remove(index);
    }
    
    
}
