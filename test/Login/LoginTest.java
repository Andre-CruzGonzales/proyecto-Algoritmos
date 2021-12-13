package Login;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pe.com.comercializadora.modelos.Usuario;

/**
 *
 * @author Andre
 */
public class LoginTest {
    Usuario usuario =  new Usuario();
    public LoginTest() {
        
        
    }
    
    @Test
    public void testPasswordEncrypt(){
        //claculando el hash sha
        
        usuario.setPassword("123456");
        //a989ebc4a77b56a6e2bb7b19d995d185ce44090c13e2984b7ecc6d446d4b61ea9991b76a4c2f04b1b4d244841449454
        Assert.assertEquals("a989ebc4a77b56a6e2bb7b19d995d185ce44090c13e2984b7ecc6d446d4b61ea9991b76a4c2f04b1b4d244841449454", usuario.getPassword());
    }
    @Test
    public void testPasswordDiferentInput(){
        usuario.setPassword("123456");
        Assert.assertNotEquals("123456", usuario.getPassword());
    }
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
