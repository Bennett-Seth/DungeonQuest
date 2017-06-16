/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.view;

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
            + "\nM - See the Map of the Dungeon (select a room to explore)"
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
            case "T": 
                this.displayTrapMenu();
                break;
            case "I": //Review your characters's inventory and player levol
                this.displayInventory();
                break;
            case "H": //View the Help Menu
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    public void displayMap() {
        System.out.println("\n*** displayMap() function called ***");
    }
    public void displayTrapMenu() {
        InteractWithTheTrapView trapView = new InteractWithTheTrapView();
        trapView.displayInteractWithTheTrapView();
    }

    public void displayInventory() {
        System.out.println("\n*** displayInventory() function called ***");
    }

    public void displayHelpMenu() {
        System.out.println("\n*** displayHelpMenu() function called ***");
    }

}
