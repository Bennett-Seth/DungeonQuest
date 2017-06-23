/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.control;

import byui.cit260.DungeonQuest.model.Actor;
import byui.cit260.DungeonQuest.model.Game;
import byui.cit260.DungeonQuest.model.Location;
import byui.cit260.DungeonQuest.model.Map;
import byui.cit260.DungeonQuest.model.Player;
import byui.cit260.DungeonQuest.model.Scene;
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
      Game game = new Game();
      game.setActors(createActorList());
      game.setPlayer(player);
      DungeonQuest.setCurrentGame(game);
      Map map = MapControl.createMap();
      game.setMap(map);
      MapControl.movePlayerToStartingLocation(map);
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
    public static Actor[] createActorList(){
       Actor[] actors = new Actor[5]; 
        
        Actor newActor = new Actor();
        
        newActor.setName("Fairie");
        newActor.setDescription("bright");
        newActor.setStrength(50.0);
        newActor.setEnemy(false);
        actors[0] = newActor;
        
        newActor = new Actor();
        newActor.setName("Vanpire");
        newActor.setDescription("Dark");
        newActor.setStrength(30.0);
        newActor.setEnemy(true);
        actors[1] = newActor;
        
        newActor = new Actor();
        newActor.setName("Zombie");
        newActor.setDescription("Ugly Guy");
        newActor.setStrength(10.0);
        newActor.setEnemy(true);
        actors[2] = newActor;
        
        newActor = new Actor();
        newActor.setName("Blue Wizard");
        newActor.setDescription("Old");
        newActor.setStrength(100.0);
        newActor.setEnemy(false);
        actors[3] = newActor;
        
        newActor = new Actor();
        newActor.setName("Globin");
        newActor.setDescription("Nasty");
        newActor.setStrength(20.0);
        newActor.setEnemy(true);
        actors[4] = newActor;
        return actors;
        
    }
    public static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[] [] locations = map.getLocations();
        
        //start point
        locations[0][0].setScene(scenes[Map.SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[Map.SceneType.instructions.ordinal()]);
        locations[0][2].setScene(scenes[Map.SceneType.goblin.ordinal()]);
        locations[0][3].setScene(scenes[Map.SceneType.empty.ordinal()]);
        locations[0][4].setScene(scenes[Map.SceneType.vampire.ordinal()]);
        
        locations[1][0].setScene(scenes[Map.SceneType.zombie.ordinal()]);
        locations[1][1].setScene(scenes[Map.SceneType.vampire.ordinal()]);
        locations[1][2].setScene(scenes[Map.SceneType.empty.ordinal()]);
        locations[1][3].setScene(scenes[Map.SceneType.goblin.ordinal()]);
        locations[1][4].setScene(scenes[Map.SceneType.trap.ordinal()]);
        
        locations[2][0].setScene(scenes[Map.SceneType.empty.ordinal()]);
        locations[2][1].setScene(scenes[Map.SceneType.wizard.ordinal()]);
        locations[2][2].setScene(scenes[Map.SceneType.goblin.ordinal()]);
        locations[2][3].setScene(scenes[Map.SceneType.empty.ordinal()]);
        locations[2][4].setScene(scenes[Map.SceneType.vampire.ordinal()]);
        
        locations[3][0].setScene(scenes[Map.SceneType.goblin.ordinal()]);
        locations[3][1].setScene(scenes[Map.SceneType.empty.ordinal()]);
        locations[3][2].setScene(scenes[Map.SceneType.zombie.ordinal()]);
        locations[3][3].setScene(scenes[Map.SceneType.fairies.ordinal()]);
        locations[3][4].setScene(scenes[Map.SceneType.empty.ordinal()]);
        
        locations[4][0].setScene(scenes[Map.SceneType.vampire.ordinal()]);
        locations[4][1].setScene(scenes[Map.SceneType.empty.ordinal()]);
        locations[4][2].setScene(scenes[Map.SceneType.goblin.ordinal()]);
        locations[4][3].setScene(scenes[Map.SceneType.empty.ordinal()]);
        locations[4][4].setScene(scenes[Map.SceneType.finish.ordinal()]);               
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

