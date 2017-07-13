/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.view;

/**
 *
 * @author parrdyl
 */
public class GoblinGrogView extends View{
    
    
    public GoblinGrogView (){
        super( "\n"
            + "\nAgor: Ahhh! I will destroy you."
            + "\nAgor has a strength of 20."
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
        this.console.println("\n*** fightMonster() function called ***");
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
