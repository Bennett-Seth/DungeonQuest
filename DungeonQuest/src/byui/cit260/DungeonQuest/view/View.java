/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.view;

import dungeonquest.DungeonQuest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ZiksMS_Sophia
 */
public abstract class View implements ViewInterface{
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = DungeonQuest.getInFile();
    protected final PrintWriter console = DungeonQuest.getOutFile();
    
    public View(){
    
    }
    public View(String message){
        this.displayMessage = message;
    }
    @Override
    public void display(){
        
        boolean done = false;
        do {
            String value = this.getInput();
            if (value.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(value);
        } while (!done);
    }
    @Override
     public String getInput() {
        
        String value = "";
        boolean valid = false;
        
        while(!valid){
            this.console.println("\n" + this.displayMessage);
            
            try {
                value = this.keyboard.readLine();
            } catch (IOException ex) {
                System.out.println("Error closing files");
            }
            value = value.trim();
 
            if (value.length() < 1) { 
                ErrorView.display(this.getClass().getName(),
                        "\nInvalid value: value cannot be blank");
                continue;
            }
            
            break;
        }
 
        return value; 
    }
     public int getIntInput(String prompt, int min, int max) {
         
         int returnValue = -1;
         try {
            while(returnValue == -1){
               this.console.println(prompt + "(-999 to cancel)");
               returnValue = Integer.parseInt(keyboard.readLine());

               if (returnValue == -999) 
                   return returnValue;
               if (returnValue < min || returnValue> max){
                   ErrorView.display(this.getClass().getName(),
                           "You are out of the boundaries. Try Again!");
                   returnValue = -1;
               }
            }
         } catch (Exception e) {
             System.out.println("Error reading input: " + e.getMessage());
         }
        return returnValue;
     }
}
