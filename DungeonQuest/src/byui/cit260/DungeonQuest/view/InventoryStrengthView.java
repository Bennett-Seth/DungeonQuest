/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.view;

import byui.cit260.DungeonQuest.model.Inventory;
import dungeonquest.DungeonQuest;

/**
 *
 * @author parrdyl
 */
class InventoryStrengthView extends View {

    public InventoryStrengthView(){
         super("\n"
                 + "\n----------------------------------------------- "
                 + "\n Inventory item with the greatest strength"
                 + "\n----------------------------------------------- "
         );
         this.displayMessage += getInventoryList()+"\n Press Q to return";
    }

    @Override

    public boolean doAction (String value){
        return true;
    }
        
    public String getInventoryList(){

    Inventory[] inventories = DungeonQuest.getCurrentGame().getInventory();
    String results = "";
    double totalStrength = 0;
    Inventory strongInventory = null;
    
    for (Inventory inventory : inventories) {
         results += "\n " + inventory.getInventoryItem()+ " strength=" + inventory.getItemLevel();
         totalStrength += inventory.getItemLevel();
         if (strongInventory == null)
             strongInventory = inventory;
         else if(inventory.getItemLevel()> strongInventory.getItemLevel())
             strongInventory = inventory;
     }
    results += "\n All Item's Strength = " + totalStrength;
    if (strongInventory != null)
        results += "\n The Strongest item is " + strongInventory.getInventoryItem(); 
   return results;
    }
}
