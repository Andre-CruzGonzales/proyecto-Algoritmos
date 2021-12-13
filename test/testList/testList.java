/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testList;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import pe.com.comercializadora.controllers.CategoriaController;
import pe.com.comercializadora.modelos.Categoria;

/**
 *
 * @author Andre
 */
public class testList {
    static ArrayList<Categoria> categorias = new ArrayList<Categoria>();
    
    public testList() {
    }
    @BeforeClass
    public static void setUpClass() {
        for(int i=0;i<5;i++){
            categorias.add(new Categoria(i, "categoria-"+i, "A"));
        }
    }
    @Test
    public void testCompareId(){
        CategoriaController controller = new CategoriaController();
        Categoria categoria = new Categoria(1,"categoria-3","A");
        Assert.assertEquals(categoria.getId(),controller.list_compareID(categorias, 1));
        
    }
    
    
}

