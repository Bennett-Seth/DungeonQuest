/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.view;

import byui.cit260.DungeonQuest.model.Game;
import byui.cit260.DungeonQuest.model.Inventory;
import dungeonquest.DungeonQuest;

/**
 *
 * @author parrdyl
 */
public class DragonView extends View{
    
    
    public DragonView (){
        super( "\n"
            + "\nYou have discovered and awoken the dragon. He has"
            + "\nhas a strength of 50. You can run away or you can fight."
            + "\nF - Fight"
            + "\nI - View Inventory"
            + "\nH - View the Help Menu"   
            + "\nQ - Flee to previous menu"
            + "\n--------------------------------");
    }
    
    @Override
    public boolean doAction(String value){
        
        value = value.toUpperCase();
        
        switch (value){
            case "I": 
                this.displayInventory();
                break;
            case "M": 
                this.displayMap();
                break;
            case "H": 
                this.displayHelpMenu();
                break;
            case "F":
                this.displayDragonFight();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    
    public void displayInventory() {
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
    
    public void displayMap() {
        MapMenuView mapMenu = new MapMenuView();
        mapMenu.display();
    }

    public void displayHelpMenu() {
        HelpMenuView helpView = new HelpMenuView();
        helpView.display();
    }

    private void displayDragonFight() {
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
            if(playerSTR>50) 
                this.console.println("You have beat the dragon! You have beat the game");
            else
                this.console.println("You have lost. Game Over.");
    }
 }

