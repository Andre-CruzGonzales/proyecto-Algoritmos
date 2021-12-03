/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.comercializadora.modelos;
import java.math.BigInteger;
import java.security.MessageDigest;
import javax.crypto.*;
/**
 *
 * @author Andre
 */
public class Usuario {
    private int id;
    private String username;
    private String password;
    private String estado_registro;
    private Rol rol;

    public Usuario(int id, String username, String password, String estado_registro, Rol rol) {
        setPassword(password);
        this.id = id;
        this.username = username;
        this.password = getPassword();
        this.estado_registro = estado_registro;
        this.rol = rol;
    }
    public Usuario(){
        
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-384");
            byte[] messageDigest = md.digest(password.getBytes("UTF-8"));
            BigInteger number = new BigInteger(1,messageDigest);
            String hashtext = number.toString(16);
            while(hashtext.length()<32){
                hashtext = "0"+hashtext;
            }
            this.password = hashtext;
        } catch (Exception e) {
        }
        
    }

    public void setEstado_registro(String estado_registro) {
        this.estado_registro = estado_registro;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEstado_registro() {
        return estado_registro;
    }

    public Rol getRol() {
        return rol;
    }
    public boolean comparePasswords(String password,String newPassword){
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-384");
            byte[] messageDigest = md.digest(password.getBytes("UTF-8"));
            BigInteger number = new BigInteger(1,messageDigest);
            String hashtext = number.toString(16);
            while(hashtext.length()<32){
                hashtext = "0"+hashtext;
            }
            newPassword = hashtext;
            if(password.equals(newPassword)){
                return true;
            }
            else{
                return false;
            }
        } catch (Exception e) {
            return false;
        }
        
    }
    
}
