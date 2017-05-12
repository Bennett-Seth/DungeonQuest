/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonquest;

import byui.cit260.DungeonQuest.model.Actor;
import byui.cit260.DungeonQuest.model.Player;
import byui.cit260.DungeonQuest.model.Map;
import byui.cit260.DungeonQuest.model.Location;

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
        Actor actorOne = new Actor();
        Map mapOne = new Map();
        Location locationOne = new Location();
    
        playerOne.setName("Seth");
        playerOne.setStrength(0);
        actorOne.setName("Gordon");
        actorOne.setDescription("Goblin of this Dungeon");
        actorOne.setCoordinants(0);
        actorOne.setStatus("Enemy");
        actorOne.setStrength(1);
        mapOne.setDescription("Safe Room");
        mapOne.setRowCount(0);
        mapOne.setColumnCount(0);
        mapOne.setCurrentRow(0);
        mapOne.setCurrentColumn(0);
        mapOne.setCurrentScene("Safe");
        locationOne.setColumn(0);
        locationOne.setRow(0);
        locationOne.setVisited("visited");
    
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);      
        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
    }
 
}
