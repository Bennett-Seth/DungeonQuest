/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.DunceonQuest.view;

import byui.cir260.DungeonQuest.control.GameControl;
import byui.cit260.DungeonQuest.model.GameMenuView;
import dungeonquest.DungeonQuest;
import java.util.Scanner;

/**
 *
 * @author parrdyl
 */
public class MapMenuView {
    
    private String promptMessage;
    
    public MapMenuView(){
        this.promptMessage= "\nPlease select an option ";
        this.displayMap();
    }
    
    private void displayMap() {
           System.out.println(
            "\n"
            + "\n--------------------------------"
            +"\n| Map Menu"
            + ""
            + "\n--------------------------------"
            + "\nV - View Map"
            + "\nS - Show my location"
            + "\nR = Show visited Rooms"
            + "\n--------------------------------");
    }
    public void displayMapMenuView(){
        
        boolean done = false;
        do {
            String mapOption = this.getMapOption();
            if (mapOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(mapOption);
        } while (!done);
    }

    private String getMapOption() {
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

    private boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice){
            case "V":
                this.showMap();
                break;
            case "S":
                this.showMyPosition();
                break;
            case "R":
                this.showVisitedRooms();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;                
        }
        return false;
    }

    private void showMap() {
         System.out.println("*** showMap function called ***");
    }

    private void showMyPosition() {
         System.out.println("*** startExistingGame function called ***");
    }

    private void showVisitedRooms() {
            System.out.println("*** displayHelpMenu function called ***");
    }

}
    

