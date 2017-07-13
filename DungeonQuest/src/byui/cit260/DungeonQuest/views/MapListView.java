/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.views;

import byui.cit260.DungeonQuest.control.MapControl;
import byui.cit260.DungeonQuest.model.Scene;
import dungeonquest.DungeonQuest;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author parrdyl
 */
public class MapListView extends View {
    public MapListView () {
        super("\n"
                + "\n-------------------------------------------"
                + "\nP - Print map listings to a file"
                + "\n-------------------------------------------"
        );
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
            switch (value) {
                case "P": 
                this.printMapList(MapControl.createScenes());
                return true; 
                default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
             }
        return false;
    }
    
    
        public void printMapList(Scene[] mapList){
 
        this.console.println("\n Enter the name of the File: ");
          String outputLocation;  
   
        try {
            outputLocation = this.keyboard.readLine();
            
            try (PrintWriter out = new PrintWriter(outputLocation)) {
                out.println("\n\n            Map List              ");
                out.printf("%n%-15s%15s", "Room Name", "Description");
                out.printf("%n%-15s%15s", "---------", "-----------");

                for (Scene map : mapList) {
                    out.printf("%n%-20s%10s"                , map.getName()
                                                            , map.getDescription());
                }  
            }   catch (IOException ex)  {
                ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + ex.getMessage());
        }
        } catch (IOException ex) {
            Logger.getLogger(MapListView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
