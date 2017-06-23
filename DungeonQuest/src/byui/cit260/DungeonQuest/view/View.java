/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.view;

import java.util.Scanner;

/**
 *
 * @author ZiksMS_Sophia
 */
public abstract class View implements ViewInterface{
    protected String displayMessage;
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
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while(!valid){
            System.out.println("\n" + this.displayMessage);
            
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
     public int getIntInput(String prompt, int min, int max) {
         Scanner keyboard = new Scanner(System.in);
         int returnValue = -1;
         while(returnValue == -1){
            System.out.println(prompt + "(-999 to cancel)");
            returnValue = keyboard.nextInt();
            
            if (returnValue == -999) 
                return returnValue;
            if (returnValue < min || returnValue> max){
                System.out.println("You are out of the boundaries. Try Again!");
                returnValue = -1;
            }
         }
        return returnValue;
     }
}
