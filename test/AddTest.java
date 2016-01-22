/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author the_s
 */
public class AddTest {
    
    public AddTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of add method, of class Add.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 5;
        int b = 2;
        Add instance = new Add();
        int expResult = 7;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
    }
    
}
