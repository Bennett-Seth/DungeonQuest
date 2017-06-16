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
                System.out.println("\n*** Invalid selection *** Try again");
                break;                
        }
        return false;
    }

        private void openGoal() {
            System.out.println("*** open Goal function called ***");
        }

        private void openMove() {
            System.out.println("*** openMove function called ***");
        }

        private void openExplore() {
           System.out.println("*** openExplore function called ***");
        }

        private void openInventory() {
           System.out.println("*** openInventory function called ***");
        }

        private void openAddGear() {
            System.out.println("*** openAddGear function called ***");
        }

        private void openFighting() {
           System.out.println("*** openFighting function called ***");
        }

        private void openInteractions() {
            System.out.println("*** openInteraction function called ***");
        }
 }


 

