/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.view;

import byui.cit260.DungeonQuest.Exceptions.WizardControlException;
import byui.cit260.DungeonQuest.control.GameControl;
import byui.cit260.DungeonQuest.control.QuestionControl;
import byui.cit260.DungeonQuest.model.Player;
import java.util.Scanner;

/**
 *
 * @author parrdyl
 */
public class WhiteWizardView extends View {
   
            
    public WhiteWizardView() {
        super("\n"
                +"\n*********************************************************"
                +"\n| White Wizard Room                                     |"
                +"\nI am Usidore, Wizard of the 12th Realm of                " 
                +"\nEphysiyies, Master of Light and Shadow,                  " 
                +"\nManipulator of Magical Delights and Devourer             "
                +"\nof Chaos, and Champion of the Great Halls of             "
                +"\nTerr'akkas. The elves know me as Fi’ang Yalok.           "
                + "\nThe dwarves know me as Zoenen Hoogstandjes, and         "
                + "\nI am also known in the Northeast as Gaismunēnas         "
                + "\nMeistar. There may be other secret names you do         "
                + "\nnot know yet!                                           "
                +"                                                           "
                +"\nToday I will aid your quest by giving you the great      " 
                + "\narmor of Ephysiyies if you are smart enough to solve    "
                + "\nmy riddle. The riddle is: what 3 positive numbers"
                + "\ngive the same result when multiplied and added together?"
                + "\nPlease enter your 3 numbers: "       
                + "\n--------------------------------------------------------"
        );
     }
    
        @Override
        public boolean doAction(String value) { 
            
            double var1 = 0;
            double var2 = 0;
            double var3 = 0;
            try{
                try {
                    var1 = Double.parseDouble(keyboard.readLine());
                    var2 = Double.parseDouble(keyboard.readLine());
                    var3 = Double.parseDouble(keyboard.readLine());
                } catch (NumberFormatException nf) {
                    ErrorView.display(this.getClass().getName(),
                            "\nYou must enter a valid number.");
                return false;
                }
            } catch(Exception e) {
                System.out.println("Error reading input: " + e.getMessage());
            }
            try{
                double calculation = QuestionControl.wizardQuestion(var1, var2, var3);
                this.console.println("The result of the numbers you entered is " + calculation + ". Because they check out here is your hint:");
                return true;
            } catch (WizardControlException we) {
                ErrorView.display(this.getClass().getName(),
                        we.getMessage());
            }
            return false;
        }
}
    


