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
public class ZombiesRoomView extends View {
    public ZombiesRoomView (){
        super("\n"
                + "\n--------------------------------------------------- "
                + "\n|  Zombies Room                                     "
                + "\n There are hungry Zombies sleeping in this room.    "
                + "\n They are all over the floor.                       "
                + "\n You must pass throuth without awake them!          "
                + "\n Watch your steps! A wrong move and you might become"
                + "\n one of them.                                       "
                + "\n To complete this task successfully, you must enter "
                + "\n the right number of steps needed to pass the       "
                + "\n zombies in the room.                               "
                + "\n You must cross 160ft to be safe from the zombies.  "
                + "\n Considere your height and estimate your steps to   "
                + "\n safety.                                            "
                + "\n A step shorter, and you'll be trapped between them."
                + "\n A step longer, and you'll hit the pile of old can  "
                + "\n and awake them.                                    "
                + "\n                                                    "
                + "\n| Enter the number of steps now:                    "
            );
    }
    
    @Override
    public boolean doAction(String value){
 
        int steps = Integer.parseInt(value);
        if(steps >= 20 && steps <= 30){
            System.out.println("\n Congratulations! "
                    + "You are at a safe zone for now. Keep playing.");
            return true;
        }
        else if(steps <=19){
            System.out.println("\n Your steps are to short! "
                    + "You are trapped with the zombies.");
            return false;
        }
        else if(steps >= 31){
            System.out.println("\n Your steps are too long! "
                    + "You hit the pile of old cans and awake the zombies.");
            return false;
        }
           else{
                System.out.println("\n You entered an invalid value. "
                + "Try again");
            return false;
        }
       
    }

}