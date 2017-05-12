/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonquest;

import byui.cit260.DungeonQuest.model.Game;
import byui.cit260.DungeonQuest.model.Inventory;
import byui.cit260.DungeonQuest.model.Player;

/**
 *
 * @author Seth
 */
public class DungeonQuest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Player playerOne = new Player();
        
        playerOne.setName("Seth");
        playerOne.setStrength(0);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    
        Inventory sword = new Inventory();
        
        sword.setInventoryItem("Sword");
        sword.setAmount(1);
        sword.setItemDescription("The point end goes into the other man.");
        sword.setItemLevel(5);
        sword.setQualityInStock(1);
    
        String swordInfo = sword.toString();
        System.out.println(swordInfo);
    
        Game newGame = new Game();
        
        newGame.setNoPlayer(1);
        
        String newGameInfo = newGame.toString();
        System.out.println(newGameInfo);
        
        
    }
    
}
