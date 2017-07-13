/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.view;

import byui.cit260.DungeonQuest.control.GameControl;
import byui.cit260.DungeonQuest.control.MapControl;
import byui.cit260.DungeonQuest.model.Game;
import byui.cit260.DungeonQuest.model.Location;
import byui.cit260.DungeonQuest.model.Map;
import byui.cit260.DungeonQuest.model.Scene;
//import byui.cit260.DungeonQuest.model.GameMenuView;
import dungeonquest.DungeonQuest;
import java.util.Scanner;

/**
 *
 * @author parrdyl
 */
public class MapMenuView extends View{
    
//    private String promptMessage;
//    
//    public MapMenuView(){
//        this.promptMessage= "\nPlease select an option ";
//        this.displayMap();
//    }
    
            public MapMenuView(){
           super(
            "\n"
            + "\n--------------------------------"
            +"\n| Map Menu"
            + ""
            + "\n--------------------------------"
            + "\nS - View Map"
            + "\nM - Move to a new location"
            + "\nR = Show report of all rooms"
            + "\nQ = Return to previous menu"
            + "\n--------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase();
        
        switch (value){
            case "S":
                this.showMap();
                break;
            case "M":
                this.moveToNewLocation();
                break;
            case "R":
                this.showVisitedRooms();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try again");
                break;                
        }
        return false;
    }

    private void showMap() {
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
        this.console.println("You are currently in " + map.getCurrentLocation().getScene().getName() + ". " + map.getCurrentLocation().getScene().getDescription());
    }

    private void moveToNewLocation() {
        showMap();
        int row = getIntInput("Please enter what row you would like to go to: ", 0, 4);
        if (row == -999)
            return;
        int column = getIntInput("Please enter what column you would like to go to: ", 0, 4);
        if (column == -999)
            return;
        Game game = DungeonQuest.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        MapControl.movePlayer(map, row, column);
        switch(map.getCurrentLocation().getScene().getSymbol()){
            case "WZ":
                WhiteWizardView whiteWizard = new WhiteWizardView();
                whiteWizard.display();
                break; 
            case "ZM":
                ZombiesRoomView zombieView = new ZombiesRoomView();
                zombieView.display();
                break;
            case "GB":
                GoblinView goblinView = new GoblinView();
                goblinView.display();
                break;
            case "TR":
                InteractWithTheTrapView trapView = new InteractWithTheTrapView();
                trapView.display();
                break;
            case "VP":
                VampireView vampireView = new VampireView();
                vampireView.display();
                break;
            case "FS":
                FairiesView fairiesView = new FairiesView();
                fairiesView.display();
                break;
            case "DR":
                DragonView dragonView = new DragonView();
                dragonView.display();
                break;
            case "EM":
                break;
            case "ST":
                break;
            case "FN":
                break;
        }
        showMap();
        
 
        //This is where we should call a scene view associated with the new scene
    }

    private void showVisitedRooms() {
        MapListView mapView = new MapListView();
        mapView.display();
    }

}
    

