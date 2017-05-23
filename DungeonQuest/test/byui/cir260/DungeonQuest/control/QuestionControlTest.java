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
 * @author Seth
 */
public class QuestionControlTest {
    
    public QuestionControlTest() {
    }

    @Test
    public void testWizardQuestion() {
        System.out.println("wizardQuestion");
        
        // input the variables
        double var1 = 1;
        double var2 = 2;
        double var3 = 3;
        
        // expected result
        double expectedResult = 1;
        
        // create instance of the QuestionControl class
        QuestionControl instance = new QuestionControl();
        
        // call function to run test
        double result = instance.wizardQuestion(var1, var2, var3);
        
        // compare the result with our expected result
        assertEquals(expectedResult, result, 0.00);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
