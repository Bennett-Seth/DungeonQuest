/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.views;

/**
 *
 * @author ZiksMS
 */
public class LosingView extends View {
    public LosingView (){
        super("\n"
                + "\n---------------------------------------  "
                + "\n           GAME OVER!                    "
                + "\n|        Sorry, You lost!                "
            );
    }
    
    @Override
    public boolean doAction(String value){
        return true;
        
    }
  
}
