/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.view;

import java.util.Scanner;

/**
 *
 * @author Seth
 */
public class FairiesView {
    
    private String promptMessage;
    
    public FairiesView(){
        this.promptMessage= "\n You have entered the den of the fairies. ";
        this.faceTheFairies();
    }
    
    private void faceTheFairies() {
        System.out.println(
            "\n"
            + "\n--------------------------------"
            +"\nIf you wish to earn our favor"
            +"\nand our wrath avoid,"
            +"\nthen you must tell us now"
            + "\nwith how many rooms"
            + "\nyou have already toyed."
            + "\n"
            + "\n--------------------------------"
            + "\n Input your answer below, or: "
            + "\nR - Retreat to the Map Menu"
            + "\nQ - Quit the game");
    
    }
    
    public void fairiesView() {
        
        boolean done = false;
 
        do {
            String FairiesOption = this.getFairiesOption();
            if (FairiesOption.toUpperCase().equals("Q")) 
                return; 
            // done = this.doAction(FairiesOption);
            done = this.doAction();
        } while (!done);
    }

    private String getFairiesOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while(!valid){
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
 
            if (value.length() < 1) { 
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            break;
        }
        return value;    
    }
    
        private boolean doAction() {
        
        Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter how many rooms, below:");
            Double exploredRooms = keyboard.nextDouble();
 
            if ((fairyQuestion(exploredRooms)) < 0.5){
                    System.out.println("You are not worthy of our aid");
                    return false;
            }
            
            else if ((fairyQuestion(exploredRooms)) >= 0.5){
                    System.out.println("You are worthy of our aid!");
                        return true;           
            }
            else 
                System.out.println("Invalid entry!");
                return false;
        }

    private int fairyQuestion(Double exploredRooms) {
        System.out.println("*** fairyQuestion function called ***");
     return 0;   
    }

//    private boolean doAction(Double fairyQuestion) {
//        System.out.println("*** doAction function called ***");
//    }
      
}
    
    