/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonquest;

import byui.cit260.DungeonQuest.model.Actor;
import byui.cit260.DungeonQuest.model.Game;
import byui.cit260.DungeonQuest.model.Inventory;
import byui.cit260.DungeonQuest.model.Player;
import byui.cit260.DungeonQuest.model.Map;
import byui.cit260.DungeonQuest.model.Location;
import byui.cit260.DungeonQuest.model.Questions;
import byui.cit260.DungeonQuest.model.Scene;
import byui.cit260.DungeonQuest.view.StartProgramView;

/**
 *
 * @author Seth
 */
public class DungeonQuest {
    
            
    private static Game currentGame = null;
    private static Player player = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        DungeonQuest.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        DungeonQuest.player = player;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       StartProgramView startProgramView = new StartProgramView();
       startProgramView.displayStartProgramView();
       
    }

    public static double getCircumference() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
