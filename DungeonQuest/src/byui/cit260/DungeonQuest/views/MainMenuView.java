/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.views;

import byui.cit260.DungeonQuest.control.GameControl;
//import byui.cit260.DungeonQuest.model.GameMenuView;
import dungeonquest.DungeonQuest;
import java.util.Scanner;
import byui.cit260.DungeonQuest.views.ErrorView;


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
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try again");
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
        
        // prompt for and get the name of the file to save the game in
        this.console.println("\n/nEnter the file path for file where the"
                                + "game is to be saved");
        
        String filePath = this.getInput();
        
        try {
            // start a saved game
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayHelpMenu() {
        HelpMenuView helpView = new HelpMenuView();
        helpView.display();
    }

    private void saveGame() {
        // prompt for and get the name of the file to save the game in 
        this.console.println("\n\nEnter the file path for the file where the game "
                            + "is to be saved.");
        String filePath = this.getInput();
 
        try{
            // save the game to the specified file
            GameControl.saveGame(DungeonQuest.getCurrentGame(), filePath);
            this.console.println("Your game was saved successfully.");
            
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
    }
    
}

