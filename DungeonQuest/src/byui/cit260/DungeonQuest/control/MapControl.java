/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.control;

import byui.cit260.DungeonQuest.model.Map;
import byui.cit260.DungeonQuest.model.Scene;

/**
 *
 * @author Seth
 */
public class MapControl {
    private static Map createMap() {
        Map map = new Map(5,5);

        Scene[] scenes = createScenes();

        GameControl.assignScenesToLocations(map, scenes);

        return map;
    }
     private static Scene[] createScenes(){
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription("What a joy this in");
        startingScene.setSymbol(" ST ");
        startingScene.setBlocked(false);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription("You Won!");
        finishScene.setSymbol(" FN ");
        finishScene.setBlocked(false);
        scenes[SceneType.finish.ordinal()] = finishScene;
        
         Scene wizardScene = new Scene();
        wizardScene.setDescription("Wizard Syp!");
        wizardScene.setSymbol(" WZ ");
        wizardScene.setBlocked(false);
        scenes[SceneType.wizard.ordinal()] = wizardScene;
       
         Scene zombieScene = new Scene();
        zombieScene.setDescription("Brains!");
        zombieScene.setSymbol(" ZM ");
        zombieScene.setBlocked(false);
        scenes[SceneType.zombie.ordinal()] = zombieScene;
        
         Scene goblinScene = new Scene();
        goblinScene.setDescription("Creepy Dungeon People!");
        goblinScene.setSymbol(" GB ");
        goblinScene.setBlocked(false);
        scenes[SceneType.goblin.ordinal()] = goblinScene;
        
         Scene trapScene = new Scene();
        trapScene.setDescription("AHHHHHHHH!");
        trapScene.setSymbol(" TR ");
        trapScene.setBlocked(false);
        scenes[SceneType.trap.ordinal()] = trapScene;
        
         Scene vampireScene = new Scene();
        vampireScene.setDescription("Blood Suckers!");
        vampireScene.setSymbol(" VP ");
        vampireScene.setBlocked(false);
        scenes[SceneType.vampire.ordinal()] = vampireScene;
        
        Scene instructionScene = new Scene();
        instructionScene.setDescription("Blood blah blah blah");
        instructionScene.setSymbol(" IN ");
        instructionScene.setBlocked(false);
        scenes[SceneType.instructions.ordinal()] = instructionScene;
        
        Scene fairiesScene = new Scene();
        fairiesScene.setDescription("Blood blah blah blah");
        fairiesScene.setSymbol(" FS ");
        fairiesScene.setBlocked(false);
        scenes[SceneType.fairies.ordinal()] = fairiesScene;
        
        Scene emptyScene = new Scene();
        emptyScene.setDescription("This room is empty");
        emptyScene.setSymbol(" FS ");
        emptyScene.setBlocked(false);
        scenes[SceneType.empty.ordinal()] = emptyScene;
        
        return scenes;
    }
  public enum SceneType {
      start,
      instructions,
      finish,
      wizard,
      zombie,
      goblin,
      trap,
      vampire,
      fairies,
      empty;
  }
}
