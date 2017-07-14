/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.control;

import byui.cit260.DungeonQuest.Exceptions.FairiesControlException;
import byui.cit260.DungeonQuest.Exceptions.GameControlException;
import byui.cit260.DungeonQuest.Exceptions.TrapControlException;
import byui.cit260.DungeonQuest.Exceptions.ZombiesControlException;
import byui.cit260.DungeonQuest.model.Actor;
import byui.cit260.DungeonQuest.model.Game;
import byui.cit260.DungeonQuest.model.Inventory;
import byui.cit260.DungeonQuest.model.Location;
import byui.cit260.DungeonQuest.model.Map;
import byui.cit260.DungeonQuest.model.Player;
import byui.cit260.DungeonQuest.model.Scene;
import dungeonquest.DungeonQuest;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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
      
      Inventory[] inventoryList = InventoryControl.createInventoryList();
      game.setInventory(inventoryList);
      
      Map map = MapControl.createMap();
      game.setMap(map);
      MapControl.movePlayerToStartingLocation(map);
    }

    public static void saveGame(Game game, String filepath)
            throws GameControlException {
        
        try( FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game); // write the game object out to file
        }
        catch (Exception e) {
            throw new GameControlException(e.getMessage()); 
            }
        }
    
    public static void getSavedGame(String filepath)
                throws GameControlException {
        Game game = null;
        
        try(FileInputStream fips = new FileInputStream(filepath)){
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject(); // read the game object from file
        }
        catch (Exception e){
            throw new GameControlException(e.getMessage());
        }
        
        // close the output file
        DungeonQuest.setCurrentGame(game); // Save in DungeonQuest
    }
    
    public static Boolean zombiesRoom(Boolean steps) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static String zombiesRoom(String steps) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
       Actor[] actors = new Actor[15]; 
        
        Actor newActor = new Actor();
        
        newActor.setName("Fairie");
        newActor.setDescription("Bright");
        newActor.setStrength(100.0);
        newActor.setEnemy(false);
        actors[0] = newActor;
        
        newActor = new Actor();
        newActor.setName("Draco");
        newActor.setDescription("Vampire");
        newActor.setStrength(40.0);
        newActor.setEnemy(true);
        actors[1] = newActor;
        
        newActor = new Actor();
        newActor.setName("Steven");
        newActor.setDescription("Zombie");
        newActor.setStrength(22.0);
        newActor.setEnemy(true);
        actors[2] = newActor;
        
        newActor = new Actor();
        newActor.setName("White Wizard");
        newActor.setDescription("Old");
        newActor.setStrength(100.0);
        newActor.setEnemy(false);
        actors[3] = newActor;
        
        newActor = new Actor();
        newActor.setName("Agor");
        newActor.setDescription("Goblin");
        newActor.setStrength(35.0);
        newActor.setEnemy(true);
        actors[4] = newActor;
                
        newActor = new Actor();
        newActor.setName("Dragon");
        newActor.setDescription("Beast");
        newActor.setStrength(50.0);
        newActor.setEnemy(true);
        actors[5] = newActor;
        
        newActor = new Actor();
        newActor.setName("Diane");
        newActor.setDescription("Zombie");
        newActor.setStrength(18.0);
        newActor.setEnemy(true);
        actors[6] = newActor;
        
        newActor = new Actor();
        newActor.setName("Grog");
        newActor.setDescription("Goblin");
        newActor.setStrength(20.0);
        newActor.setEnemy(true);
        actors[7] = newActor;
        
        newActor = new Actor();
        newActor.setName("Troth");
        newActor.setDescription("Goblin");
        newActor.setStrength(25.0);
        newActor.setEnemy(true);
        actors[8] = newActor;
        
        newActor = new Actor();
        newActor.setName("Bulth");
        newActor.setDescription("Goblin");
        newActor.setStrength(28.0);
        newActor.setEnemy(true);
        actors[9] = newActor;
        
        newActor = new Actor();
        newActor.setName("Calgor");
        newActor.setDescription("Goblin");
        newActor.setStrength(30.0);
        newActor.setEnemy(true);
        actors[10] = newActor;
        
        newActor = new Actor();
        newActor.setName("Draco");
        newActor.setDescription("Vampire");
        newActor.setStrength(45.0);
        newActor.setEnemy(true);
        actors[11] = newActor;
        
        newActor = new Actor();
        newActor.setName("Katrina");
        newActor.setDescription("Vampire");
        newActor.setStrength(35.0);
        newActor.setEnemy(true);
        actors[12] = newActor;
        
        newActor = new Actor();
        newActor.setName("Katelina");
        newActor.setDescription("Vampire");
        newActor.setStrength(38.0);
        newActor.setEnemy(true);
        actors[13] = newActor;
        
        newActor = new Actor();
        newActor.setName("Junior");
        newActor.setDescription("Vampire");
        newActor.setStrength(30.0);
        newActor.setEnemy(true);
        actors[14] = newActor;
        
        return actors;
    }

    public static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[] [] locations = map.getLocations();
        
        //start point
        locations[0][0].setScene(scenes[MapControl.SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[MapControl.SceneType.empty.ordinal()]);
        locations[0][2].setScene(scenes[MapControl.SceneType.goblin1.ordinal()]);
        locations[0][3].setScene(scenes[MapControl.SceneType.empty.ordinal()]);
        locations[0][4].setScene(scenes[MapControl.SceneType.vampire2.ordinal()]);
        
        locations[1][0].setScene(scenes[MapControl.SceneType.zombie2.ordinal()]);
        locations[1][1].setScene(scenes[MapControl.SceneType.vampire4.ordinal()]);
        locations[1][2].setScene(scenes[MapControl.SceneType.empty.ordinal()]);
        locations[1][3].setScene(scenes[MapControl.SceneType.goblin2.ordinal()]);
        locations[1][4].setScene(scenes[MapControl.SceneType.trap.ordinal()]);
        
        locations[2][0].setScene(scenes[MapControl.SceneType.empty.ordinal()]);
        locations[2][1].setScene(scenes[MapControl.SceneType.wizard.ordinal()]);
        locations[2][2].setScene(scenes[MapControl.SceneType.goblin3.ordinal()]);
        locations[2][3].setScene(scenes[MapControl.SceneType.empty.ordinal()]);
        locations[2][4].setScene(scenes[MapControl.SceneType.vampire3.ordinal()]);
        
        locations[3][0].setScene(scenes[MapControl.SceneType.goblin4.ordinal()]);
        locations[3][1].setScene(scenes[MapControl.SceneType.dragon.ordinal()]);
        locations[3][2].setScene(scenes[MapControl.SceneType.zombie1.ordinal()]);
        locations[3][3].setScene(scenes[MapControl.SceneType.fairies.ordinal()]);
        locations[3][4].setScene(scenes[MapControl.SceneType.empty.ordinal()]);
        
        locations[4][0].setScene(scenes[MapControl.SceneType.vampire1.ordinal()]);
        locations[4][1].setScene(scenes[MapControl.SceneType.empty.ordinal()]);
        locations[4][2].setScene(scenes[MapControl.SceneType.goblin5.ordinal()]);
        locations[4][3].setScene(scenes[MapControl.SceneType.empty.ordinal()]);
        locations[4][4].setScene(scenes[MapControl.SceneType.finish.ordinal()]);               
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
    public static double calcTrap(double radius)
                            throws TrapControlException{
        if (radius <= 0)
            throw new TrapControlException("This radius is an invalid number");
        double circumference = radius * Math.PI * 2;
        if (circumference <=62.82)
            throw new TrapControlException("This radius is too small");
        if (circumference >= 94.25)
            throw new TrapControlException("This radius is too big");
        return circumference;
    }
    
    public static Double fairyQuestion(double exploredRooms) throws FairiesControlException {
        
        double result = (exploredRooms / 2);
        
        if (result < 0) {
            throw new FairiesControlException ("Must submit a 1 or larger");
        }
        if (result < 0.5) {
            throw new FairiesControlException ("You have not explored enough" + 
                    " rooms. The fairies claim you as their own. You can never leave.");
        }
        else{
            return result;
        }   
        
    }
    
    public static boolean zombiesRoom (int steps)
                        throws ZombiesControlException {
        if(steps >= 1 && steps <= 19)
            throw new ZombiesControlException("Your steps are to short! "
                    + "You are trapped with the zombies.");
        
        if(steps >= 31 && steps <=999)
            throw new ZombiesControlException("Your steps are too long! "
                    + "You hit a pile of old cans and woke up the zombies.");
        
        if(steps >=1000)
             throw new ZombiesControlException("You are way off. "
                     + "Try again");
        
        if(steps <=0)
             throw new ZombiesControlException("You entered an invalid value. "
                     + "Try again");
            return true;
    }
        
}
    


