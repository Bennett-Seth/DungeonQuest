/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.views;

import byui.cit260.DungeonQuest.Exceptions.FairiesControlException;
import byui.cit260.DungeonQuest.control.GameControl;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Seth
 */
public class FairiesView extends View{
    
//    private String promptMessage;
//    
//    public FairiesView(){
//        this.promptMessage= "\n You have entered the den of the fairies. ";
//        this.faceTheFairies();
//    }
    
    public FairiesView() {
        super(
            "\n"
            + "\n--------------------------------"
            +"\n If you wish to earn our favor"
            +"\n and our wrath avoid,"
            +"\n then you must tell us now"
            + "\n with how many rooms"
            + "\n you have already toyed."
            + "\n"
            + "\n--------------------------------"
            + "\n How many rooms have you explored?"
            );
    
    }
//    
//    public void fairiesView() {
//        
//        boolean done = false;
// 
//        do {
//            String FairiesOption = this.getFairiesOption();
//            if (FairiesOption.toUpperCase().equals("Q")) 
//                return; 
//            // done = this.doAction(FairiesOption);
//            done = this.doAction();
//        } while (!done);
//    }
//
//    private String getFairiesOption() {
//        Scanner keyboard = new Scanner(System.in);
//        String value = "";
//        boolean valid = false;
//        
//        while(!valid){
//            System.out.println("You have entered the den of the fairies");
//            
//            value = keyboard.nextLine();
//            value = value.trim();
// 
//            if (value.length() < 1) { 
//                System.out.println("\nInvalid value: value cannot be blank");
//                continue;
//            }
//            break;
//        }
//        return value;    
//    }
    
    @Override
    public boolean doAction(String value) {
        
        double exploredRooms = 0;    
        
//        Scanner keyboard = new Scanner(System.in);
//            System.out.println("Enter below how many rooms you have survived:");
//            Double exploredRooms = keyboard.nextDouble();
//        
        try {
            exploredRooms = Double.parseDouble(value);
        }catch (NumberFormatException nf) { 
            ErrorView.display(this.getClass().getName(),
                    "\nYou must enter a valid number.");
          return false;
        }
        
//        double radius = 0;
//        try{
//          radius = Double.parseDouble(value);
//        } catch (NumberFormatException nf) {
//            System.out.println("\nYou must enter a valid number.");
//          return false;
//        }
            
        try {
            GameControl.fairyQuestion(exploredRooms);
            this.console.println("You are worthy of our aid! The two weapons are"
                    + "with the Draco and Agor. Defeat them and you can beat the "
                    + "game.");
                return true; 
        } catch (FairiesControlException fce) {
            ErrorView.display(this.getClass().getName(),
                    fce.getMessage());
        }
            return true;
  
}

    
    
//    private int fairyQuestion(Double exploredRooms) {
//        System.out.println("*** fairyQuestion function called ***");
//     return 0;   
//    }

//    private boolean doAction(Double fairyQuestion) {
//        System.out.println("*** doAction function called ***");
//    }
      
}
    
    