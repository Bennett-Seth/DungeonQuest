/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.view;

import byui.cit260.DungeonQuest.model.Game;
import byui.cit260.DungeonQuest.model.Inventory;
import dungeonquest.DungeonQuest;
import java.io.IOException;

/**
 *
 * @author parrdyl
 */
public class VampireJuniorView extends View {
    public VampireJuniorView (){
        super( "\n"
            + "\nJunior: A feast fit for a prince has entered my room."
            + "\nJunior has a strength of 30."
            + "\nWhat would you like to do?"
            + "\n--------------------------------"
            +"\n| Combat Menu"
            + "\n--------------------------------"
            + "\nQ - Run away"
            + "\nF - Fight the Goblin"
            + "\nI - Review Your Character’s Inventory and Player Level"
            + "\nH - View the Help Menu"
            + "\n--------------------------------");
    }
    
    @Override
    public boolean doAction(String value){
        
        value = value.toUpperCase();
        
        switch (value){
            case "F": //Fight the Goblin
                this.fightMoster();
                break;

            case "I": //Review your characters's inventory and player levol
                this.displayInventory();
                break;
            case "H": //View the Help Menu
                this.displayHelpMenu();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    
    public void fightMoster() {
        String result;
        
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
            if(playerSTR>30) 
                this.console.println("You have beat Junior!");
            else
                this.console.println("You have lost. Game Over.");
    
            this.console.println("But wait! Junior has dropped "
                        + "the Weathered Axe. Do you want to "
                        + "pick up this weapon?"
                        + "-----------------------------------"
                        + "Y - Yes "
                        + "N - No ");
            
                try {    
                    result = keyboard.readLine();
                
                    if ("Y" != result) {
                        this.console.println("You did not pick up the "
                                + " Weathered Axe. Move on to the "
                                + "next room.");           
                    } else {
                       
                    inventory[7].setAmount(1);
                    this.console.println("You have picked up the "
                            + "Weathered Axe. If it's good enough "
                            + "for trees, it should work just fine "
                            + "on Goblin skulls.");
                    }

                } catch (IOException ex) {
                    ErrorView.display(this.getClass().getName(),
                                    "\nYou must enter a 'Y' or an 'N'.");
                }
    
    }

    public void displayInventory() {
        InventoryView inventoryView = new InventoryView();
        inventoryView.display();
    }

    public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }   
    
}

