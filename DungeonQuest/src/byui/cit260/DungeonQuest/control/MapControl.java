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

    public static Map createMap() {
        Map map = new Map(5, 5);

        Scene[] scenes = createScenes();

        GameControl.assignScenesToLocations(map, scenes);

        return map;
    }

    public static Scene[] createScenes() {
        Scene[] scenes = new Scene[SceneType.values().length];

        Scene startingScene = new Scene();
        startingScene.setDescription("The journey has just begun. GOOD LUCK!!");
        startingScene.setSymbol("ST");
        startingScene.setName("Starting Room");
        scenes[SceneType.start.ordinal()] = startingScene;

        Scene finishScene = new Scene();
        finishScene.setDescription("You Won!");
        finishScene.setSymbol("FN");
        finishScene.setName("Finished Game");
        scenes[SceneType.finish.ordinal()] = finishScene;

        Scene wizardScene = new Scene();
        wizardScene.setDescription("The great white wizard resides in this room");
        wizardScene.setSymbol("WZ");
        wizardScene.setName("Wizard Room");
        wizardScene.setView("WhiteWizardView");
        scenes[SceneType.wizard.ordinal()] = wizardScene;

        Scene zombie1Scene = new Scene();
        zombie1Scene.setDescription("Home to Seth, who is now a zombie.");
        zombie1Scene.setSymbol("ZM");
        zombie1Scene.setName("Monster Room");
        scenes[SceneType.zombie1.ordinal()] = zombie1Scene;
        
        Scene zombie2Scene = new Scene();
        zombie2Scene.setDescription("Home to Diane, Seth's wife, who is now a zombie.");
        zombie2Scene.setSymbol("ZM");
        zombie2Scene.setName("Monster Room");
        scenes[SceneType.zombie2.ordinal()] = zombie2Scene; 
        
        Scene goblinScene1 = new Scene();
        goblinScene1.setDescription("Home to the goblin Grog.");
        goblinScene1.setSymbol("GB");
        goblinScene1.setName("Monster Room");
        scenes[SceneType.goblin1.ordinal()] = goblinScene1;

        Scene goblinScene2 = new Scene();
        goblinScene2.setDescription("Home to the goblin Troth. Cousin to Grog.");
        goblinScene2.setSymbol("GB");
        goblinScene2.setName("Monster Room");
        scenes[SceneType.goblin2.ordinal()] = goblinScene2;
        
        Scene goblinScene3 = new Scene();
        goblinScene3.setDescription("Home to the goblin Bulth.");
        goblinScene3.setSymbol("GB");
        goblinScene3.setName("Monster Room");
        scenes[SceneType.goblin3.ordinal()] = goblinScene3;
        
        Scene goblinScene4 = new Scene();
        goblinScene4.setDescription("Home to the goblin Agor, leader of the Goblins.");
        goblinScene4.setSymbol("AG");
        goblinScene4.setName("Monster Room");
        scenes[SceneType.goblin4.ordinal()] = goblinScene4;
        
        Scene goblinScene5 = new Scene();
        goblinScene5.setDescription("Home to the goblin Calgor.");
        goblinScene5.setSymbol("GB");
        goblinScene5.setName("Monster Room");
        scenes[SceneType.goblin5.ordinal()] = goblinScene5;
        
        Scene trapScene = new Scene();
        trapScene.setDescription("Watch your step!");
        trapScene.setSymbol("TR");
        trapScene.setName("Trap Room");
        scenes[SceneType.trap.ordinal()] = trapScene;

        Scene vampire1Scene = new Scene();
        vampire1Scene.setDescription("This is home to Draco, King of the Vampires.");
        vampire1Scene.setSymbol("VP");
        vampire1Scene.setName("Monster Room");
        scenes[SceneType.vampire1.ordinal()] = vampire1Scene;
        
        Scene vampire2Scene = new Scene();
        vampire2Scene.setDescription("This is home to the vampire Katrina.");
        vampire2Scene.setSymbol("VP");
        vampire2Scene.setName("Monster Room");
        scenes[SceneType.vampire2.ordinal()] = vampire2Scene;
        
        Scene vampire3Scene = new Scene();
        vampire3Scene.setDescription("This is home to the vampire Katelina, wife of Draco and Queen of the Vampires.");
        vampire3Scene.setSymbol("VP");
        vampire3Scene.setName("Monster Room");
        scenes[SceneType.vampire3.ordinal()] = vampire3Scene;
        
        Scene vampire4Scene = new Scene();
        vampire4Scene.setDescription("This is home to Junior, son of Draco and Katelina.");
        vampire4Scene.setSymbol("VP");
        vampire4Scene.setName("Monster Room");
        scenes[SceneType.vampire4.ordinal()] = vampire4Scene;

        Scene instructionScene = new Scene();
        instructionScene.setDescription("This room contains instructions for the game");
        instructionScene.setSymbol("IN");
        instructionScene.setName("Instructions Room");
        scenes[SceneType.instructions.ordinal()] = instructionScene;

        Scene fairiesScene = new Scene();
        fairiesScene.setDescription("This is home to the Fairies");
        fairiesScene.setSymbol("FS");
        fairiesScene.setName("Fairy Room");
        scenes[SceneType.fairies.ordinal()] = fairiesScene;

        Scene emptyScene = new Scene();
        emptyScene.setDescription("There is nothing for you in this room");
        emptyScene.setSymbol("EM");
        emptyScene.setName("Empty Room");
        scenes[SceneType.empty.ordinal()] = emptyScene;
        
        Scene dragonScene = new Scene();
        dragonScene.setDescription("You have woken the Dragon. Fight and win or flee and be a coward!");
        dragonScene.setSymbol("DR");
        dragonScene.setName("Dragon Room");
        scenes[SceneType.dragon.ordinal()] = dragonScene;

        return scenes;
    }

    public enum SceneType {
        start,
        instructions,
        finish,
        wizard,
        zombie1,
        zombie2,
        goblin1,
        goblin2,
        goblin3,
        goblin4,
        goblin5,
        trap,
        vampire1,
        vampire2,
        vampire3,
        vampire4,
        fairies,
        empty,
        dragon;
    }

    public static void movePlayerToStartingLocation(Map map) {
        // If starting location is not supposed to be 0,0 then use the correct values here.
        movePlayer(map, 0, 0); // or instead of 0,0 you can select a different starting location
    }

    public static void movePlayer(Map map, int row, int column) {
        map.setCurrentRow(row);
        map.setCurrentColumn(column);
        map.getCurrentLocation().setVisited(true);

    }
}
