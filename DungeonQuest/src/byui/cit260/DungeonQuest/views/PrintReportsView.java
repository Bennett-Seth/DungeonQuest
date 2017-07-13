/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.views;

/**
 *
 * @author parrdyl
 */
public class PrintReportsView extends View {    
    public PrintReportsView (){
        super( "\n"
            + "\n--------------------------------"
            +"\n| Report Menu"
            + "\n--------------------------------"
            + "\nA - Enemy Strengths"
            + "\nI - Inventory Strenghts"
            + "\nH - Actors List"
            + "\nQ - Quit to Main Menu"

                
            + "\n--------------------------------");
    }
    
    @Override
    public boolean doAction(String value){
        
        value = value.toUpperCase();
        
        switch (value){
            case "A": 
                this.displayStrength();
                break;  
            case "I":
                this.displayInventoryStrength();
                break;
            case "L": //View the Help Menu
                this.displayActorsList();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    
    public void displayStrength(){
        EnemiesStrengthView StrengthView = new EnemiesStrengthView();
        StrengthView.display();
    }
    private void displayInventoryStrength() {
       InventoryStrengthView StrengthView = new InventoryStrengthView();
       StrengthView.display();
    }
    private void displayActorsList() {
        ActorsListView actorsView = new ActorsListView();
        actorsView.display();
    }
}
