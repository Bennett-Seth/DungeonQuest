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
        Inventory sword = new Inventory();
        Game newGame = new Game();
        
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
        sword.setInventoryItem("Sword");
        sword.setAmount(1);
        sword.setItemDescription("The point end goes into the other man.");
        sword.setItemLevel(5);
        sword.setQualityInStock(1);
        newGame.setNoPlayer(1);

        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);      
        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        String swordInfo = sword.toString();
        System.out.println(swordInfo);
        String newGameInfo = newGame.toString();
        System.out.println(newGameInfo);
        
        
        Questions questionOne = new Questions();
       
       questionOne.setQuestion("question");
       questionOne.setAnswer("answer");
       questionOne.setAnswer1("answer1");
       questionOne.setAnswer2("answer2 this is the correct");
       questionOne.setAnswer3("answer3");
       questionOne.setAnswer4("answer4");
       questionOne.setCorrectAnswerNumber(2);
      
       String questionInfo = questionOne.toString();
               System.out.println(questionInfo);
               
       Scene sceneOne = new Scene();
        sceneOne.setName("cell one");
        sceneOne.setSymbol("c1");
        sceneOne.setDescription("prision cell");
        sceneOne.setBlocked(false);
        
        String sceneInfo = sceneOne.toString();
            System.out.println(sceneInfo);
    }
 
}
