/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cir260.DungeonQuest.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ZiksMS
 */
public class GameControlTest {
    
    public GameControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of starNewGame method, of class GameControl.
     */
    @Test
    public void testStarNewGame() {
        System.out.println("start NewGame");
        boolean player = false;
        boolean newGame = false;
        boolean saveFile = false;
        GameControl instance = new GameControl();
        boolean expResult = false;
        boolean result = instance.starNewGame(player, newGame, saveFile);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
 @Test
    public void testCalcTrap(){
    System.out.println("start testCalcTrap");
    double radius = 10;
    double expectedResult = 62.83;
    double result = GameControl.calcTrap(radius);
    assertEquals(expectedResult, result, 0.01);
  
    radius = -1;
    expectedResult = -1;
    result = GameControl.calcTrap(radius);
    assertEquals(expectedResult, result, 0.01);
    
    radius = 0;
    expectedResult = -1;
    result = GameControl.calcTrap(radius);
    assertEquals(expectedResult, result, 0.01);
    
    radius = 1;
    expectedResult = -2;
    result = GameControl.calcTrap(radius);
    assertEquals(expectedResult, result, 0.01);
    
    radius = 100;
    expectedResult = -2;
    result = GameControl.calcTrap(radius);
    assertEquals(expectedResult, result, 0.01);
}
}
