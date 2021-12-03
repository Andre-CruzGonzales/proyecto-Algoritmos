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
import pe.com.comercializadora.modelos.TipoDocumento;

/**
 *
 * @author Andre
 */
public class TipoDocumentoController {
    private Conexion mysql = new Conexion();
    private Connection con = mysql.conectar();
    private String sql="";
    public Integer totalRegistro;
    
    public ArrayList<TipoDocumento> list(){
        TipoDocumento tipo_documento;
        ArrayList<TipoDocumento> tipos_documentos=new ArrayList<TipoDocumento>();
        sql = "select * from tipo_documento where estado_registro = 'A'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String estado_registro = rs.getString("estado_registro");
                tipo_documento=new TipoDocumento(id, nombre, estado_registro);
                tipos_documentos.add(tipo_documento);
                
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return tipos_documentos;
    }
    public int list_compareID(ArrayList<TipoDocumento> tipos_documento,int IDTipDoc){
        int index=0;
        for(int i= 0;i<tipos_documento.size();i++){
            if(tipos_documento.get(i).getId()==IDTipDoc){
                index=i;
            }
        }
        return index;
    }
    
}
