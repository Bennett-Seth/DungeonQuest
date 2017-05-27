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
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return false;
    }
    static double calcTrap(double radius){
        if (radius <= 0)
            return -1;
        double circumference = radius * Math.PI * 2;
        if (circumference <=62.82 || circumference >= 94.26)
            return -2;
        return circumference;
        
    }
            
}

