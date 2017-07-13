/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.view;

import byui.cit260.DungeonQuest.control.GameControl;
import byui.cit260.DungeonQuest.control.InventoryControl;
import byui.cit260.DungeonQuest.model.Actor;
import byui.cit260.DungeonQuest.model.Game;
import byui.cit260.DungeonQuest.model.Inventory;
import dungeonquest.DungeonQuest;
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
            +"\n--------------------------------"
            +"\nI - View Your Inventory"
            +"\nS - Get Your Player Strength"
            +"\nP- Print The Inventory List"
            +"\nQ - Quit"
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
            case "P":
                this.printInventory(InventoryControl.createInventoryList());
                break; 
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try again");
                break;                
        }
        return false;
    }

    private void viewPlayerInventory() {
        Game game = DungeonQuest.getCurrentGame();
        Inventory[] inventory = game.getInventory();
        
        this.console.println("\n      LIST OF INVENTORY ITEMS");

        /* Note - removing the .getAmount != 0 limit results in everything
        getting published to the viewer. A chunk of ugly details*/
        
        for (int i = 0; i < inventory.length; i++){
            if (inventory[i].getAmount() != 0) {
            this.console.println(inventory[i]);    
            }    
        }
        
        this.console.println("Your pack is empty, time to go hunting!");
    }
    private void calcStrength() {
        Game game = DungeonQuest.getCurrentGame();
        Inventory[] inventory = game.getInventory();
        
            int playerWEP = 0;
            int playerARM = 0;
            int playerSTR = 0;
        
            for (int i = 0; i <= 9; i++){
                if (inventory[i].getAmount() != 0) {
                    playerWEP = inventory[i].getItemLevel();
                } 
        
                    if (playerWEP < inventory[i].getItemLevel()) {
                        playerWEP = inventory[i].getItemLevel();
                    }
        
                    if (playerWEP > inventory[i].getItemLevel()) {
                        playerWEP = playerWEP;
                    }
        
                else {
                    playerWEP = 0;
                }
                
            for (i = 10; i < inventory.length; i++){
                if (inventory[i].getAmount() != 0) {
                    playerARM = inventory[i].getItemLevel();
                }
        
                    if (playerARM < inventory[i].getItemLevel()) {
                        playerARM = inventory[i].getItemLevel();
                    }
        
                    if (playerARM > inventory[i].getItemLevel()) {
                        playerARM = playerWEP;
                    }
                else {
                    playerARM = 0;
                }
        
            playerSTR = playerWEP + playerARM;

    }
    }
            this.console.println("\nYour Player Strength is " + playerSTR);
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
                out.printf("%n%-25s%-45s%-10d"    , inventory.getInventoryItem()
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
}
