/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.control;

import byui.cit260.DungeonQuest.control.InventoryControl;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Seth
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    @Test
    public void testSomeMethod() {
      
        System.out.println("calcStrength");
        
        // input the variables
        int weaponStrength = 1;
        int armorStrength = 2;
        
        // expected result
        int expectedResult = 3;
        
        // create instance of the QuestionControl class
        InventoryControl instance = new InventoryControl();
        
        // call function to run test
       // int result = instance.calcStrength(weaponStrength, armorStrength);
        
        // compare the result with our expected result
        //assertEquals(expectedResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");

    }
    
}
