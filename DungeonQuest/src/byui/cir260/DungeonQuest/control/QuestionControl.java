/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cir260.DungeonQuest.control;

/**
 *
 * @author Seth
 */
public class QuestionControl {
    
    public double wizardQuestion(double var1, double var2, double var3){

        if (var1 <= 0){
            return -1;
        }
        
        if (var2 <= 0){
            return -1;
        }
        
        if (var3 <= 0){
            return -1;
        }
        
        double answerAddition = (var1 + var2 + var3);
        double answerMultiplication = (var1 * var2 * var3);
        
        double result = (answerAddition / answerMultiplication);
            return result;
        }  
    }


