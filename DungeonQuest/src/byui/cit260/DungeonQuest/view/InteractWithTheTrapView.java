/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.view;

import byui.cit260.DungeonQuest.control.GameControl;
import dungeonquest.DungeonQuest;
import java.util.Scanner;

/**
 *
 * @author ZiksMS_Sophia
 */
public class InteractWithTheTrapView {
    private String prompMessage;
    public InteractWithTheTrapView() {
        this.prompMessage = "\nYou are entering the Trap Room";
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
                 "\n*************************************************"
               + "\n*                                               *"
               + "\n* There is a hole on the floor! "
               + "\n* If the hole is too big, you will fall on it.  *"
               + "\n* If it is too small, your foot will get stuck  *"
               + "\n* on it, and you will be trapped. In both cases,*"
               + "\n* you'll instantly lose the game.               *"
               + "\n* You can save yourself by entering the radius  *"
               + "\n* of the hole.                                  *"
               + "\n* Don't make it too big or too small!           *"
               );
    }    
        
    public void displayInteractWithTheTrapView() {
        
        boolean done = false;
 
        do {
            String trapOption = this.getTrapOption();
            if (trapOption.toUpperCase().equals("Q")) 
                return; 

            done = this.doAction(trapOption);
        } while (!done);
    }

    private String getTrapOption() {
        System.out.println("\n*** getTrapOption() function called ***");
        return "N";
    }

    private boolean doAction(String trapOption) {
        System.out.println("\n*** doAction() function called ***)");
        return true;
    }
    
    public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;
        
        while(!valid) {
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            if (selection.length() < 1){
                System.out.println("\n*** Invalid selection *** Try again");
                continue;
            }
            break;
        }
        return selection;
    }
    
    public boolean doAction(double circumference){
        if (circumference >= 62.83 && circumference <= 94.25){
            System.out.println("\n The circumference of the hole is not "
                    + "dangerous at all. Keep playing");
            return true;
        }
            
        if (circumference < 62.83){
            System.out.println("\nThe circumference of the hole is too small. "
                    + "Your foot is stuck. You've lost");
            return false;
        }
            
        if (circumference > 94.25){
                System.out.println("\nThe circumference of the hole is too big,"
                        + " and you fell into it. You've lost the game.");
            return false;
        }
        
        else{
                System.out.println("\nYou entered an invalid radius. Try again");
            return false;
        }
    }   
        public void calcTrap(){
            double value = GameControl.calcTrap(DungeonQuest.getCircumference());
            if (value < 0){
                System.out.println("Error - Failed interaction");
            }
            //GameMenuView gameMenu = new GameMenuView();
            //gameMenu.displayGameMenuView();
        }     
    }
