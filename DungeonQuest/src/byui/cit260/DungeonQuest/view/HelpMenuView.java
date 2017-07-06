/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.view;

import byui.cit260.DungeonQuest.control.GameControl;
import dungeonquest.DungeonQuest;
import java.util.Scanner;

/**
 *
 * @author parrdyl
 */
public class HelpMenuView extends View {
    
//    private String help;
//    private String promptMessage;
//    
    public HelpMenuView(){
    super( "\n"
        + "\n--------------------------------"
        +"\n| Help Menu"
        + ""
        + "\n--------------------------------"
        + "\nG - What is the goal of the game?"
        + "\nM - How to move to a new room"
        + "\nE - Hot to explore a room"
        + "\nV - How to view gear in inventory"
        + "\nA - How to add gear to inventory"
        + "\nF - Fighting enemies"
        + "\nI - Game interactions"
        + "\nQ - Quit Help Menu"

        + "\n--------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase();
        
        switch (value){
            case "G":
                this.openGoal();
                break;
            case "M":
                this.openMove();
                break;
            case "E":
                this.openExplore();
                break;
            case "V":
                this.openInventory();
                break;
            case "A":
                this.openAddGear();
                break;
            case "F":
                this.openFighting();
                break;
            case "I":
                this.openInteractions();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try again");
                break;                
        }
        return false;
    }

        private void openGoal() {
            this.console.println("*** open Goal function called ***");
        }

        private void openMove() {
            this.console.println("*** openMove function called ***");
        }

        private void openExplore() {
           this.console.println("*** openExplore function called ***");
        }

        private void openInventory() {
           this.console.println("*** openInventory function called ***");
        }

        private void openAddGear() {
            this.console.println("*** openAddGear function called ***");
        }

        private void openFighting() {
           this.console.println("*** openFighting function called ***");
        }

        private void openInteractions() {
            this.console.println("*** openInteraction function called ***");
        }
 }


 

