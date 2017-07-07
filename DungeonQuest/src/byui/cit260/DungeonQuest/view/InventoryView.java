/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.view;

import byui.cit260.DungeonQuest.control.InventoryControl;
import byui.cit260.DungeonQuest.model.Actor;
import byui.cit260.DungeonQuest.model.Inventory;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            +"\nP- Print The Inventory List"
            + "\n--------------------------------"
            + "\nR - Return to Main Menu"
            + "\nM - Return to Map Menu"
            + "\nH - Get help on how to play the game"
            + "\nG - Save game"
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
            case "S":
                this.calcStrength();
                break;
            case "D":
                this.dropItem();
                break;    
            case "P":
                this.printInventory(InventoryControl.createInventoryList());
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
            case "G":
                this.saveGame();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try again");
                break;                
        }
        return false;
    }

    private void viewPlayerInventory() {
        this.console.println("*** viewPlayerInventory function called ***");
    }
    
    private void calcStrength() {
        this.console.println("*** calcStrength function called ***");
    }

    private void dropItem() {
        this.console.println("*** dropItem function called ***");
    }
    
    private void printInventory(Inventory[] inventoryList) {
        this.console.println("\nGive the file a name:");
            String outputLocation;   

        try {
            outputLocation = this.keyboard.readLine();
        
        //create BufferedReader object for input file
        try (PrintWriter out = new PrintWriter(outputLocation)) {
            //print title and column headings
            out.println("\n\n              Inventory List                      ");
            out.printf("%n%-25s%-45s%-10s", "Name", "Description", "Item Level");
            out.printf("%n%-25s%-45s%-10s", "-------", "----------", "---------");
            
            //print the description and strength of each item
            for (Inventory inventory : inventoryList) {
                out.printf("%n%-25s%-45s%-10d"        , inventory.getInventoryItem()
                                                  , inventory.getItemDescription()
                                                  , inventory.getItemLevel());
            }
            
            this.console.println("Your game was saved successfully.");
            
        }   catch (IOException ex)  {
            System.out.println("I/O Error: " + ex.getMessage());
        }
        } catch (IOException ex) {
            this.console.println("Error closing files");
            return;
        }
    }
          
    private void displayMainMenuView() {
        this.console.println("*** displayMainMenu function called ***");
    }

    private void mapMenu() {
        this.console.println("*** mapMenu function called ***");
    }
    
    private void displayHelpMenu() {
         this.console.println("*** displayHelpMenu function called ***");
    }

    private void saveGame() {
         this.console.println("*** startExistingGame function called ***");
    }

    

}

