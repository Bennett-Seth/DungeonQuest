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
public class InteractWithTheTrapView extends View{
//    private String prompMessage;
//    public InteractWithTheTrapView() {
//        this.prompMessage = "\nYou are entering the Trap Room";
//        this.displayBanner();

    public InteractWithTheTrapView() {
        super("\n"
               + "\n-------------------------------------------------"
               + "\n| Interact With The Trap                        |"
               + "\n                                                 "
               + "\n There is a hole on the floor!                   "
               + "\n If the hole is too big, you will fall on it.    "
               + "\n If it is too small, your foot will get stuck    "
               + "\n on it, and you will be trapped. In both cases,  "
               + "\n you'll instantly lose the game.                 "
               + "\n You can save yourself by entering the radius    "
               + "\n of the hole!                                    "
               + "\n Don't make it too big or too small!             "
               + "\n                                                 "
               + "\n| You must enter the radius now:                 "
               );
    }    
     
    @Override  
    public boolean doAction(String value){
        double circumference = Integer.parseInt(value);
        if (circumference >= 62.83 && circumference <= 94.25){
            System.out.println("\n The circumference of the hole is not "
                    + "dangerous at all. Keep playing");
            return true;
        }
            
        else if (circumference < 62.83){
            System.out.println("\nThe circumference of the hole is too small. "
                    + "Your foot is stuck. You've lost");
            return false;
        }
            
        else if (circumference > 94.25){
                System.out.println("\nThe circumference of the hole is too big,"
                        + " and you feel on it. You've lost the game.");
            return false;
        }
        
        else{
                System.out.println("\nYou entered an invalid radius. Try again");
            return false;
        }
    }   
    
        public double calcTrap(double radius){
            double value = GameControl.calcTrap(radius);
            if (value < 0){
                System.out.println("Error - Failed interaction");
            }
            return value;
            //GameMenuView gameMenu = new GameMenuView();
            //gameMenu.displayGameMenuView();
        }     
    }
