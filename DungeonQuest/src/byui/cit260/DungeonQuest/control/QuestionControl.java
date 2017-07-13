/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.control;

import byui.cit260.DungeonQuest.Exceptions.TrapControlException;
import byui.cit260.DungeonQuest.Exceptions.WizardControlException;


/**
 *
 * @author Seth
 */
public class QuestionControl {
    
    public static double wizardQuestion(double var1, double var2, double var3)
                            throws WizardControlException{

        if (var1 < 0 && var2 < 0 && var3 < 0)
            throw new WizardControlException("The numbers you entered are invalid ");
        if (var1 == 0 && var2 == 0 && var3 == 0)
            throw new WizardControlException("The numbers you enter must be more than zero ");
        double answerAddition = (var1 + var2 + var3);
        double answerMultiplication = (var1 * var2 * var3);  
        double result = (answerAddition / answerMultiplication);
        if (result != 1)
            throw new WizardControlException("The numbers you entered do not equal 1. Try Again!" + var1 + var2 + var3);
        return result;
    }
    

  }

