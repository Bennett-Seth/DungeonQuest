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
public class WinView extends View{
    public WinView (){
        super("\n"
                + "\n----------------------------------------------  "
                + "\n|  Congratulations! You won the Game!           "
            );
    }
    
    @Override
    public boolean doAction(String value){
        return true;
        
    }
     
}
