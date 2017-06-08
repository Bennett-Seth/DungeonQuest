/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.control;

/**
 *
 * @author Seth
 */
public class QuestionControl {
    
    public double wizardQuestion(double var1, double var2, double var3){

        if (var1 < 0 && var2 < 0 && var3 < 0){
            return -1;
        }
        if (var1 == 0 && var2 == 0 && var3 == 0){
            return 0;
        }
        double answerAddition = (var1 + var2 + var3);
        double answerMultiplication = (var1 * var2 * var3);
        
        double result = (answerAddition / answerMultiplication);
            return result;
    }
    public Boolean fairyQuestion(double exploredRooms) {
        if ((exploredRooms / 2) < 0) {
            return false;
        }
        
        else if ((exploredRooms / 2) < 0.5) {
            return false;
        }
        
        else if ((exploredRooms / 2) >= 0.5) {
            return true;
        }
          
        else 
        return true; 
    }
    public double calcTrap(double radius) {
        if (radius <= 0){
            return -1;
        }
        double circumference = radius * 3.14 * 2;

        if (circumference < 62.8 || circumference > 94.26){
            return -1;         
        } 
        else {
            return circumference;
        }
    }
}


