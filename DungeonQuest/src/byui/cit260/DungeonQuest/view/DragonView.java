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
public class DragonView extends View{
    
    
    public DragonView (){
        super( "\n"
            + "\nYou have discovered and awoken the dragon. He has"
            + "\nhas a strength of 50. You can run away or you can fight."
            + "\nF - Fight"
            + "\nI - View Strength and Inventory"
            + "\nM - View Map"
            + "\nH - View the Help Menu"
            + "\nR - Flee"    
            + "\nQ - Quit to Main Menu"
            + "\n--------------------------------");
    }
    
    @Override
    public boolean doAction(String value){
        
        value = value.toUpperCase();
        
        switch (value){
            case "R": 
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
            case "F":
                this.displayDragonFight();
                break;
            case "Q":
                this.quitGame();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    
    public void fleeRoom() {
         this.console.println("\n*** fleeRoom() function called ***");
    }
    
    public void displayInventory() {
        this.console.println("\n*** displayInventory() function called ***");
    }
    
    public void displayMap() {
        MapMenuView mapMenu = new MapMenuView();
        mapMenu.display();
    }

    public void displayHelpMenu() {
        HelpMenuView helpView = new HelpMenuView();
        helpView.display();
    }

    public void quitGame() {
        this.console.println("\n*** quitGame() function called ***");
    }

    private void displayDragonFight() {
        this.console.println("\n*** displayDragonFight is called***");
    }
}
