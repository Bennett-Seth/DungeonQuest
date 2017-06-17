/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.control;

import byui.cit260.DungeonQuest.model.Player;
import dungeonquest.DungeonQuest;

/**
 *
 * @author Sophia
 */
public class GameControl{


    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }      
        
        Player player = new Player();
        player.setName(name);
        
        DungeonQuest.setPlayer(player);
        
        return player;
    }

    public static void createNewGame(Player player) {
         System.out.println("*** createNewGame stub function called ***");
    }
    public boolean starNewGame(boolean player, boolean newGame, boolean saveFile, boolean starNewGame){
        if (player == newGame && player ==saveFile){
            return false;   
        }
        if (player == newGame && player != saveFile){
            return true;
        }
        
        return starNewGame;
        }

    boolean starNewGame(boolean player, boolean newGame, boolean saveFile) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return false;  
    }
    
    /**
     *
     * @param radius
     * @return
     */
    public static double calcTrap(double radius){
        if (radius <= 0)
            return -1;
        double circumference = radius * Math.PI * 2;
        if (circumference <=62.82 || circumference >= 94.26)
            return -2;
        return circumference;
        
    }
            
}

