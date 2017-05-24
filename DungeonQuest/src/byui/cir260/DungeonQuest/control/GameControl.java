/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cir260.DungeonQuest.control;

/**
 *
 * @author Sophia
 */
public class GameControl{
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
