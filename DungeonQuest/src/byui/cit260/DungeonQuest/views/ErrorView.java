/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.views;

import dungeonquest.DungeonQuest;
import java.io.PrintWriter;

/**
 *
 * @author Seth
 */
public class ErrorView {
 
    private static final PrintWriter errorFile = DungeonQuest.getOutFile();
    private static final PrintWriter logFile = DungeonQuest.getLogFile();
    
    public static void display(String className, String errorMessage){
        
        errorFile.println(
                "------------------------------------"
            +   "/n - Error - " + errorMessage 
            +   "/n----------------------------------");
        
        //log error
        logFile.println(className + " - " + errorMessage);
    }
    
    
}
