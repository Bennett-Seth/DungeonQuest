/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.view;

/**
 *
 * @author Seth
 */
public class GoblinView extends View{
    
    
    public GoblinView (){
        super( "\n"
            + "\nYou face a creepy Goblin."
            + "\nWhat do you do?"
            + "\n--------------------------------"
            +"\n| Combat Menu"
            + "\n--------------------------------"
            + "\nR - Run away"
            + "\nF - Fight the Goblin"
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
            case "R": //Retreat into the previous room
                this.previousRoom();
                break;
            case "F": //Fight the Goblin
                this.fightMoster();
                break;
            case "M": //See the Map of the Dungeon(select a room to explore
                this.displayMap();
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
    
    public void previousRoom() {
         this.console.println("\n*** previousRoom() function called ***");
    }
    
    public void fightMoster() {
        this.console.println("\n*** fightMonster() function called ***");
    }
    
    public void displayMap() {
        this.console.println("\n*** displayMap() function called ***");
    }

    public void displayInventory() {
        this.console.println("\n*** displayInventory() function called ***");
    }

    public void displayHelpMenu() {
        this.console.println("\n*** displayHelpMenu() function called ***");
    }

    

    
    
    
    
    
    
    
    
    
}
