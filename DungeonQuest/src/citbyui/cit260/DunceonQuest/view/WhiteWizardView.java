/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.DunceonQuest.view;

import byui.cir260.DungeonQuest.control.GameControl;
import byui.cit260.DungeonQuest.model.Player;
import java.util.Scanner;

/**
 *
 * @author parrdyl
 */
public class WhiteWizardView {
     private String promptMessage;
    
    public WhiteWizardView() {
        
        this.promptMessage= "\nPlease enter your name: ";
        this.displayBanner();
        
    }

    private void displayBanner() {
       
        System.out.println(
                "\n*******************************************"
                +"\nI am Usidore, Wizard of the 12th Realm of" 
                +"\nEphysiyies, Master of Light and Shadow," 
                +"\nManipulator of Magical Delights and Devourer"
                +"\nof Chaos, and Champion of the Great Halls of"
                +"\nTerr'akkas. The elves know me as Fi’ang Yalok."
                + "\nThe dwarves know me as Zoenen Hoogstandjes, and"
                + "\nI am also known in the Northeast as Gaismunēnas"
                + "\nMeistar. There may be other secret names you do"
                + "\nnot know yet!"
                +""
                +"\nToday I will aid your quest by giving you the great" 
                + "\narmor of Ephysiyies if you are smart enough to solve"
                + "\nmy riddle. The riddle is: what 3 positive numbers"
                + "\ngive the same result when multiplied and added together?”"
                + "\n--------------------------------"
        );
    }
}


