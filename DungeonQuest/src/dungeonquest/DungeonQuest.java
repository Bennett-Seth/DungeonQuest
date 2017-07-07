/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonquest;

import byui.cit260.DungeonQuest.model.Actor;
import byui.cit260.DungeonQuest.model.Game;
import byui.cit260.DungeonQuest.model.Inventory;
import byui.cit260.DungeonQuest.model.Player;
import byui.cit260.DungeonQuest.model.Map;
import byui.cit260.DungeonQuest.model.Location;
import byui.cit260.DungeonQuest.model.Questions;
import byui.cit260.DungeonQuest.model.Scene;
import byui.cit260.DungeonQuest.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Seth
 */
public class DungeonQuest {
    
    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    
    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        DungeonQuest.logFile = logFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        DungeonQuest.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        DungeonQuest.inFile = inFile;
    }
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        DungeonQuest.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        DungeonQuest.player = player;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       try {
        
           // open character stream files for end user input and output
            DungeonQuest.inFile =
                new BufferedReader(new InputStreamReader(System.in));
        
            DungeonQuest.outFile = new PrintWriter(System.out, true);
        
            // open log file
            String filePath = "log.txt";
            DungeonQuest.logFile = new PrintWriter(filePath);
            
            // create StartProgramView and start the program
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();
        
        } catch (Throwable e){
            System.out.println("Exception: " + e.toString() +
                                "/nCause: "  + e.getCause() +
                                "/nMessage: " + e.getMessage());
            e.printStackTrace();
        }
        
        finally{
            try{
                if(DungeonQuest.inFile != null)
                    DungeonQuest.inFile.close();
                
                if(DungeonQuest.outFile != null)
                    DungeonQuest.outFile.close();
                
                if(DungeonQuest.logFile != null)
                    DungeonQuest.logFile.close();
            
           } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
       }
    }
}

//        try{
//                // create StartProgramView and start the program
//            
//                StartProgramView startProgramView = new StartProgramView();
//                startProgramView.display();
//                
//            } catch (Throwable te) {
//                System.out.println(te.getMessage());
//                te.printStackTrace();
//                startProgramView.display();
//            }
//            } catch (Throwable e){
//    
//            System.out.println("Exception " + e.toString() +
//                                "/nCause: " + e.getCause() +
//                                "/nMessage: " + e.getMessage());
//            e.printStackTrace();
//            }
//       
//       finally{
//           
//            try {
//               if (DungeonQuest.inFile != null) 
//                    DungeonQuest.inFile.close();
//               
//               if (DungeonQuest.outFile != null)
//                    DungeonQuest.outFile.close();
//           } catch (IOException ex) {
//               System.out.println("Error closing files");
//               return;
//           }
//              
//       }

    /**
     *
     * @return
     */
