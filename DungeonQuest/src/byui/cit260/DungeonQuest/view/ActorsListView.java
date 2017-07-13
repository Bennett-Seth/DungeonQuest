/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.view;

import byui.cit260.DungeonQuest.model.Actor;
import dungeonquest.DungeonQuest;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ZiksMS_Sophia
 */
public class ActorsListView extends View{
    public ActorsListView(){
        super("\n"
                + "\n----------------------------------------------------- "
                + "\nS - Prompt to access the file with"
                + "\n   List of actors and their descriptions             "
        );
    }
    @Override
    public boolean doAction(String value){
        value = value.toUpperCase();
            switch (value){
                case "S"://show actors'description and strenght
                this.PrintActorsListLocationReport(DungeonQuest.getCurrentGame().getActors());
                return true; 
                default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
             }
        return false;
        }
       
   
         
    public void PrintActorsListLocationReport(Actor[] actorsLocation){
 
        this.console.println("\n Enter the name of the File: ");
          String outputLocation;  
   
        try {
            outputLocation = this.keyboard.readLine();
        
        //create BufferedReader object for input file
        try (PrintWriter out = new PrintWriter(outputLocation)) {
            //print title and column headings
            out.println("\n\n          Actors Location                      ");
            out.printf("%n%-15s%15s%15s", "Actors", "Description", "Strength");
            out.printf("%n%-15s%15s%15s", "-------", "----------", "---------");
            
            //print the description and strenght of each item
            for (Actor actors : actorsLocation) {
                out.printf("%n%-20s%10s%13.2f"    , actors.getName()
                                                  , actors.getDescription()
                                                  , actors.getStrength());
            } 
            this.console.println("Your game was saved successfully.");
       
        }   catch (IOException ex)  {
            Logger.getLogger("I/O Error: " + ex.getMessage());
        }
        
        } catch (IOException ex) {
            Logger.getLogger(ActorsListView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

