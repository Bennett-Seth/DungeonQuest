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
public class VampireView extends View{
    
    
    public VampireView (){
        super( "\n"
            + "\nThere is a vampire in this room. The vampire"
            + "\nhas a strength of 10. What do you wish to do?"
            + "\nF - Flee"
            + "\nI - View Strength and Inventory"
            + "\nM - View Map"
            + "\nH - View the Help Menu"
            + "\nQ - Quit to Main Menu"
            + "\n--------------------------------");
    }
    
    @Override
    public boolean doAction(String value){
        
        value = value.toUpperCase();
        
        switch (value){
            case "F": 
                this.fleeRoom();
                break;
            case "I": 
                this.displayInventory();
                break;
            case "M": 
                this.displayMap();
                break;
            case "H": 
                this.displayHelpMenu();
                break;
            case "Q":
                this.quitGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    
    public void fleeRoom() {
         System.out.println("\n*** fleeRoom() function called ***");
    }
    
    public void displayInventory() {
        System.out.println("\n*** displayInventory() function called ***");
    }
    
    public void displayMap() {
        System.out.println("\n*** displayMap() function called ***");
    }

    public void displayHelpMenu() {
        HelpMenuView helpView = new HelpMenuView();
        helpView.display();
    }

    public void quitGame() {
        System.out.println("\n*** quitGame() function called ***");
    }
}
