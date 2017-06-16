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
public class InventoryView extends View{
    
//    private String promptMessage;
//    
//    public InventoryView(){
//        this.promptMessage= "\nWhat would you like to do? ";
//        this.displayInventory();
//    }
    
    public InventoryView() {
           super(
            "\n"
            + "\n--------------------------------"
            +"\nI - View Your Inventory"
            +"\nS - Get Your Player Strength"
            +"\nD - Drop an Item"
            + "\n--------------------------------"
            + "\nR - Return to Main Menu"
            + "\nM - Return to Map Menu"
            + "\nH - Get help on how to play the game"
            + "\nS - Save game"
            + "\nQ - Quit"
            + "\n--------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase();
        
        switch (value){
            case "I":
                this.viewPlayerInventory();
                break;
            case "P":
                this.calcStrength();
                break;
            case "D":
                this.dropItem();
                break;    
            case "R":
                this.displayMainMenuView();
                break;
            case "M":
                this.mapMenu();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;                
        }
        return false;
    }

    private void viewPlayerInventory() {
        System.out.println("*** viewPlayerInventory function called ***");
    }
    
    private void calcStrength() {
        System.out.println("*** calcStrength function called ***");
    }

    private void dropItem() {
        System.out.println("*** dropItem function called ***");
    }
    
    private void displayMainMenuView() {
        System.out.println("*** displayMainMenu function called ***");
    }

    private void mapMenu() {
        System.out.println("*** mapMenu function called ***");
    }
    
    private void displayHelpMenu() {
         System.out.println("*** displayHelpMenu function called ***");
    }

    private void saveGame() {
         System.out.println("*** startExistingGame function called ***");
    }

    

}

