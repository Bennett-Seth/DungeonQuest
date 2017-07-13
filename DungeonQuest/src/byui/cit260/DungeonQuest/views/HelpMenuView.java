/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.views;

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
        + "\nE - How to explore a room"
        + "\nV - How to view gear in inventory"
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
            this.console.println("There are two ways to beat this dungeon. "
                    + "You can either slay enough monsters to safely escape, "
                    + "Or you can defeat the Black Dragon. "
                    + "The choice is yours.");
        }

        private void openMove() {
            this.console.println("From the Game Menu, select the " 
                    + "'Go to new location' option. "
                    + "Next, input the row you wish to move to. "
                    + "Then, input the column you wish to move to. "
                    + "Both will be numbers between 0 and 4.");
        }

        private void openExplore() {
           this.console.println("When you reach a room, you can peak "
                   + "inside. You will see what kind of monster waits "
                   + "within, and can then decide to enter or move "
                   + "to a different location instead.");
        }

        private void openInventory() {
           this.console.println("From the Game Menu, select the 'View Inventory' "
                   + "option. From here you can examine your inventory and  "
                   + "assess your player strength. You will automatically "
                   + "use the strongest weapon and armor in your pack. From the "
                   + "Inventory Menu, select 'display inventory' to see the "
                   + "readout of your inventory and total player strength.");
        }

        private void openFighting() {
           this.console.println("Once you've decided to enter a room occupied"
                   + "by a monster, your player level will automatically "
                   + "face off against their monster level. If the total "
                   + "strength of your weapon and armor is greater than "
                   + "the monster's level, you will win the battle! Be "
                   + "careful though, because if you don't have enough "
                   + "strength, the monster will win. This dungeon could "
                   + "become your tomb.");
        }

        private void openInteractions() {
            this.console.println("Not everyone you meet in this Dungeon is "
                    + "a monster. There are a few wayward souls who might "
                    + "be willing to help you, if you answer their questions "
                    + "appropriately. There is also a nasty trap to watch out "
                    + "for. If you seek to defeat the Black Dragon, you would "
                    + "be wise to seek the council of the White Wizard.");
        }
 }


 

