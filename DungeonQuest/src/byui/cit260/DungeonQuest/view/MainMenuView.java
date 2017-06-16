/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.view;

import byui.cit260.DungeonQuest.control.GameControl;
//import byui.cit260.DungeonQuest.model.GameMenuView;
import dungeonquest.DungeonQuest;
import java.util.Scanner;

/**
 *
 * @author parrdyl
 */
public class MainMenuView extends View{
  
    
//    private String promptMessage;
//    
//    public MainMenuView(){
//        this.promptMessage= "\nWhat would you like to do? ";
//        this.displayMain();
//    }
    
    
           public MainMenuView(){
              super("\n"
            + "\n--------------------------------"
            +"\n| Main Menu"
            + ""
            + "\n--------------------------------"
            + "\nN - Start new game"
            + "\nG - Get and start saved game"
            + "\nH - Get help on how to play the game"
            + "\nS - Save game"
            + "\nQ - Quit"
            + "\n--------------------------------");
}

//    @Override
//    public boolean doAction(String value) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    }
   
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase();
        
        switch (value){
            case "N":
                this.startNewGame();
                break;
            case "G":
                this.startExistingGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;                
        }
        return false;
    }

    private void startNewGame() {
         GameControl.createNewGame(DungeonQuest.getPlayer());
         
         GameMenuView gameMenu = new GameMenuView();
         gameMenu.display();
    }

    private void startExistingGame() {
         System.out.println("*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
            System.out.println("*** displayHelpMenu function called ***");
    }

    private void saveGame() {
         System.out.println("*** startExistingGame function called ***");
    }
    
}

