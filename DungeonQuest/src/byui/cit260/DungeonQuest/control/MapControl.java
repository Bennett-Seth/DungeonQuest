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

    private static Scene[] createScenes() {
        Scene[] scenes = new Scene[SceneType.values().length];

        Scene startingScene = new Scene();
        startingScene.setDescription("Entrance to the Dungeon");
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
        scenes[SceneType.wizard.ordinal()] = wizardScene;

        Scene zombieScene = new Scene();
        zombieScene.setDescription("Home to creatures that only enjoy eating brains");
        zombieScene.setSymbol("ZM");
        zombieScene.setName("Zombie Room");
        scenes[SceneType.zombie.ordinal()] = zombieScene;

        Scene goblinScene = new Scene();
        goblinScene.setDescription("Home to creatures of the caves");
        goblinScene.setSymbol("GB");
        goblinScene.setName("Goblin Room");
        scenes[SceneType.goblin.ordinal()] = goblinScene;

        Scene trapScene = new Scene();
        trapScene.setDescription("Watch your step. It's a trap");
        trapScene.setSymbol("TR");
        trapScene.setName("Trap Room");
        scenes[SceneType.trap.ordinal()] = trapScene;

        Scene vampireScene = new Scene();
        vampireScene.setDescription("This is home to the blood sucking, reflectionless characters");
        vampireScene.setSymbol("VP");
        vampireScene.setName("Vampire Room");
        scenes[SceneType.vampire.ordinal()] = vampireScene;

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
        emptyScene.setDescription("This room is empty");
        emptyScene.setSymbol("FS");
        emptyScene.setName("Empty Room");
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
