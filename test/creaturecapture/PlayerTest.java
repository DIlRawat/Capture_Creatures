/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creaturecapture;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dil Bdr
 */
public class PlayerTest {

    public PlayerTest() {
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

    /**
     * Test of getenergy method, of class Player.
     */
    @Test
    public void testGetenergy() {
        System.out.println("getenergy");
        Player instance = new Player();
        int expResult = 100;
        int result = instance.getenergy();
        assertEquals(expResult, result);

    }

    /**
     * Test of Web method, of class Player.
     */
    @Test
    public void testWeb() {
        System.out.println("Web");
        int w = 10;
        Player instance = new Player();
        instance.Web(w);
        int expResult = 90;

        int result = instance.getenergy();
        assertEquals(expResult, result);

    }

    /**
     * Test of Bubble method, of class Player.
     */
    /*
    @Test
    public void testBubble() {
        System.out.println("Bubble");
        int b = 20;
        Player instance = new Player();
        instance.Bubble(b);
            }

    /**
     * Test of Freeze method, of class Player.
     */
 /*
    @Test
    public void testFreeze() {
        System.out.println("Freeze");
        int f = 0;
        Player instance = new Player();
        instance.Freeze(f);
        
    }

    /**
     * Test of gameover method, of class Player.
     */
 /*
    @Test
    public void testGameover() {
        System.out.println("gameover");
        Player instance = new Player();
        boolean expResult = false;
        boolean result = instance.gameover();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of EnergyAdded method, of class Player.
     */
 /*
    @Test
    public void testEnergyAdded() {
        System.out.println("EnergyAdded");
        int energy = 0;
        Player instance = new Player();
        instance.EnergyAdded(energy);
      
    }
     */
}
