 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.DunceonQuest.view;

import byui.cir260.DungeonQuest.control.GameControl;
import byui.cit260.DungeonQuest.model.GameMenuView;
import dungeonquest.DungeonQuest;
import java.util.Scanner;

/**
 *
 * @author parrdyl
 */
public class HelpMenuView {
    
    private String promptMessage;
    
    public HelpMenuView(){
        this.promptMessage= "\nWhat do you need help with?";
        this.displayHelp();
    }  
    
    void displayHelp() {
            System.out.println(
            "\n"
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
            + "\nP - Map Menu"        
            + "\nQ - Quit Help Menu"

            + "\n--------------------------------");
    }
    public void displayHelpMenuView(){
        boolean done = false;
        do {
            String helpOption = this.getMenuOption();
            if (helpOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(helpOption);
        } while (!done);
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while(!valid){
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
 
            if (value.length() < 1) { 
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            
            break;
        }
 
        return value; 
    }

    private boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice){
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
            case "Q":
                this.openQuit();
                break;
            case "P":
                this.openMap();
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

        private void openQuit() {
            System.out.println("*** openQuit function called ***");
        }
        private void openMap() {
                   MapMenuView mapMenuView = new MapMenuView();
                   mapMenuView.displayMapMenuView();
                }

} 

