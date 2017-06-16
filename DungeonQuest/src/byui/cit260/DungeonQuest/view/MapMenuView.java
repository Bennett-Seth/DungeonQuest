/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.view;

import byui.cit260.DungeonQuest.control.GameControl;
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
            + "\nV - View Map"
            + "\nS - Show my location"
            + "\nR = Show visited Rooms"
            + "\n--------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase();
        
        switch (value){
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
    

