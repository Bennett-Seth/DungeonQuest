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
public class GameMenuView {
    private final String menu;
    private String promptMessage;
    public GameMenuView (){
        this.menu = "\n"
            + "\n--------------------------------"
            +"\n| Game Menu"
            + "\n--------------------------------"
            + "\nT - Interact with the trap"
            + "\nM - See the Map of the Dungeon (select a room to explore)"
            + "\nI - Review Your Character’s Inventory and Player Level"
            + "\nH - View the Help Menu"
            + "\nQ - Quit to Main Menu"
                
            + "\n--------------------------------";
    }
    public void displayMenu(){
        boolean done = false; //set flag to not done
        do{
            String GameOption = this.getInput();
            if (GameOption.toUpperCase().equals("Q"))
                return;
                
            done = this.doAction(GameOption);
            
        }while (!done);
    }
    
    public String getInput(){
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;
        
        while (!valid){
           System.out.println(this.menu); 
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            if (selection.length()<1){
                System.out.println("\n*** Invalid selection *** Try again");
                continue;
            }
            break;
        }
        return selection;
    }
    public boolean doAction(String choice){
        switch (choice){
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

    private void displayMap() {
        System.out.println("\n*** displayMap() function called ***");
    }
    private void displayTrapMenu() {
        InteractWithTheTrapView trapView = new InteractWithTheTrapView();
        trapView.displayInteractWithTheTrapView();
    }

    private void displayInventory() {
        System.out.println("\n*** displayInventory() function called ***");
    }

    private void displayHelpMenu() {
        System.out.println("\n*** displayHelpMenu() function called ***");
    }

}
