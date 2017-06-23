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
            + "\nE - Find the Enemy with the maximum strength."
            + "\nM - See the Map of the Dungeon (select a room to explore)"
            + "\nG - Go to new location"
            + "\nI - Review Your Character’s Inventory and Player Level" 
            + "\nH - View the Help Menu"
            + "\nQ - Quit to Main Menu"
                
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
            case "E": //Displey the character with the maximum strength
                this.displayStrength();
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
            default:
                System.out.println("\n*** Invalid selection *** Try again");
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
          System.out.print("  |");
          for( int column = 0; column < locations[0].length; column++){
            // print col numbers to side of map
            System.out.print("  " + column + " |"); 
          }
          // Now build the map.  For each row, show the column information
          System.out.println();
          for( int row = 0; row < locations.length; row++){
           System.out.print(row + " "); // print row numbers to side of map
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
             System.out.print("|"); // start map with a |
              if(locations[row][column].getScene() == null)
              {
                   // No scene assigned here so use ?? for the symbol
                   System.out.print(leftIndicator + "??" + rightIndicator);
              }
              else
                System.out.print(leftIndicator
                   + locations[row][column].getScene().getSymbol()
                   + rightIndicator);
            }
           System.out.println("|");
          }
        System.out.println("You are currently in " + map.getCurrentLocation().getScene().getDescription());
       }

    public void displayTrap() {
        InteractWithTheTrapView trapView = new InteractWithTheTrapView();
        trapView.display();
    }
    
    public void displayZombies(){
        ZombiesRoomView ZombiesView = new ZombiesRoomView();
        ZombiesView.display();
    }
    
    public void displayStrength(){
        EnemiesStrengthView StrengthView = new EnemiesStrengthView();
        StrengthView.display();
    }
    
    public void displayInventory() {

        Game game = DungeonQuest.getCurrentGame();
        Inventory[] inventory = game.getInventory();
        
        System.out.println("\n      LIST OF INVENTORY ITEMS");

        for (int i = 0; i < inventory.length; i++){
            if (inventory[i].getAmount() != 0) {
            System.out.println(inventory[i]);    
            }    
        }
        
        System.out.println("Your pack is empty, time to go hunting!");
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
}
