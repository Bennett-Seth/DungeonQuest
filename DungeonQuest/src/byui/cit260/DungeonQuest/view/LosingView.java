/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.view;

/**
 *
 * @author ZiksMS
 */
public class LosingView extends View {
    public LosingView (){
        super("\n"
                + "\n---------------------------------------  "
                + "\n|  Sorry, You lost! Game Over!           "
            );
    }
    
    @Override
    public boolean doAction(String value){
        return true;
        
    }
     
}
