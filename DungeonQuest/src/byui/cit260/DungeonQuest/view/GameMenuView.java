/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.view;

import byui.cit260.DungeonQuest.control.MapControl;
import byui.cit260.DungeonQuest.model.Game;
import byui.cit260.DungeonQuest.model.Inventory;
import byui.cit260.DungeonQuest.model.Location;
import byui.cit260.DungeonQuest.model.Map;
import dungeonquest.DungeonQuest;
import java.util.Scanner;

/**
 *
 * @author ZiksMS_Sophia
 */
public class GameMenuView extends View{
//    private final String menu;
//    private String promptMessage;
    
    
    public GameMenuView (){
        super( "\n"
            + "\n--------------------------------"
            +"\n| Game Menu"
            + "\n--------------------------------"
            + "\nT - Interact with the trap"
            + "\nZ - Interact with the zombies"
            + "\nF - Interact with the fairies"
            + "\nW - Interact with the Wizard"
            + "\nE - Find the Enemy with the maximum strength."
            + "\nS = Find the Item with the greatest strength"
            + "\nM - See the Map of the Dungeon (select a room to explore)"
            + "\nG - Go to new location"
            + "\nI - Review Your Character’s Inventory and Player Level" 
            + "\nH - View the Help Menu"
            + "\nQ - Quit to Main Menu"
            + "\nL - Prompt to Menu with a List of Actors and Descriptions"
                
            + "\n--------------------------------");
    }
    
    @Override
    public boolean doAction(String value){
        
        value = value.toUpperCase();
        
        switch (value){
            case "M": //See the Map of the Dungeon(select a room to explore
                this.displayMap();
                break;
            case "T": //Display Trap Room
                this.displayTrap();
                break;
            case "Z": //Display Zombies Room
                this.displayZombies();
                break;
            case "F": //Display Fairies Room
                this.displayFairies();
                break;   
            case "E": //Displey the character with the maximum strength
                this.displayStrength();
                break;
            case "S"://Display the inventory item with the greatest strength
                this.displayInventoryStrength();
                break;
            case "I": //Review your characters's inventory and player levol
                this.displayInventory();
                break;
            case "H": //View the Help Menu
                this.displayHelpMenu();
                break;
            case "G": 
                this.goToNewLocation();
                break;
            case "W":
                this.displayWizard();
                break;
            case "L": //Prompt to Menu with List of Actors and Descriptions
                this.displayActorsList();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    
    public void displayMap() {
        String leftIndicator;
        String rightIndicator;

        Game game = DungeonQuest.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        Location[][] locations = map.getLocations(); // retreive the locations from map
          // Build the heading of the map
          this.console.print("  |");
          for( int column = 0; column < locations[0].length; column++){
            // print col numbers to side of map
            this.console.print("  " + column + " |"); 
          }
          // Now build the map.  For each row, show the column information
          this.console.println();
          for( int row = 0; row < locations.length; row++){
           this.console.print(row + " "); // print row numbers to side of map
            for( int column = 0; column < locations[row].length; column++){
              // set default indicators as blanks
              leftIndicator = " ";
              rightIndicator = " ";
              if(locations[row][column] == map.getCurrentLocation()){
                // Set star indicators to show this is the current location.
                leftIndicator = "*"; 
                rightIndicator = "*"; 
              } 
              else if(locations[row][column].isVisited()){
                 // Set < > indicators to show this location has been visited.
                 leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
                 rightIndicator = "<"; // same as above
              }
             this.console.print("|"); // start map with a |
              if(locations[row][column].getScene() == null)
              {
                   // No scene assigned here so use ?? for the symbol
                   this.console.print(leftIndicator + "??" + rightIndicator);
              }
              else
                this.console.print(leftIndicator
                   + locations[row][column].getScene().getSymbol()
                   + rightIndicator);
            }
           this.console.println("|");
          }
        this.console.println("You are currently in " + map.getCurrentLocation().getScene().getDescription());
       }

    public void displayTrap() {
        InteractWithTheTrapView trapView = new InteractWithTheTrapView();
        trapView.display();
    }
    
    public void displayZombies(){
        ZombiesRoomView ZombiesView = new ZombiesRoomView();
        ZombiesView.display();
    }
    
    public void displayFairies(){
        FairiesView fairiesView = new FairiesView();
        fairiesView.display();
    }
    
    public void displayStrength(){
        EnemiesStrengthView StrengthView = new EnemiesStrengthView();
        StrengthView.display();
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
        
        /* Don't forget to calculate the player's strength */
            
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

        this.console.println("\nYour Player Strength is " + playerSTR);
  
        
    }
    }
    }

    public void displayHelpMenu() {
        HelpMenuView helpView = new HelpMenuView();
        helpView.display();
    }
    public void goToNewLocation() {
        displayMap();
        int row = getIntInput("Please enter what row you would like to go to: ", 0, 4);
        if (row == -999)
            return;
        int column = getIntInput("Please enter what column you would like to go to: ", 0, 4);
        if (column == -999)
            return;
        Game game = DungeonQuest.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        MapControl.movePlayer(map, row, column);
        //This is where we should call a scene view associated with the new scene
        displayMap();
    }

    private void displayInventoryStrength() {
       InventoryStrengthView StrengthView = new InventoryStrengthView();
       StrengthView.display();
    }

    private void displayWizard() {
        WhiteWizardView whiteWizardView = new WhiteWizardView();
        whiteWizardView.display();
    }

    private void displayActorsList() {
        ActorsListView actorsView = new ActorsListView();
        actorsView.display();
    }

    
}
