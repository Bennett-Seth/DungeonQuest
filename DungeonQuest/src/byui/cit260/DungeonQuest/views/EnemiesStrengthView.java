/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.views;
import byui.cit260.DungeonQuest.control.GameControl;
import byui.cit260.DungeonQuest.model.Actor;
import dungeonquest.DungeonQuest;
import java.util.Scanner;


/**
 *
 * @author ZiksMS_sophia
 */
class EnemiesStrengthView extends View{

    public EnemiesStrengthView(){
         super("\n"
                 + "\n----------------------------------------------- "
                 + "\n Enemy with the maximum strength"
                 + "\n----------------------------------------------- "
         );
         this.displayMessage += getEnemiesList()+"\n Press Q to return";
    }

    @Override

    public boolean doAction (String value){
        return true;
    }
        
    public String getEnemiesList(){

    Actor[] actors = DungeonQuest.getCurrentGame().getActors();
    String results = "";
    double totalStrength = 0;
    Actor strongActor = null;
    
    for (Actor actor : actors) {
     if(actor.isEnemy()){
         results += "\n " + actor.getName()+ " strength=" + actor.getStrength();
         totalStrength += actor.getStrength();
         if (strongActor == null)
             strongActor = actor;
         else if(actor.getStrength()> strongActor.getStrength())
             strongActor = actor;
     }
    }
    results += "\n Total Enemy Strength = " + totalStrength;
    if (strongActor != null)
        results += "\n The Stronger Enemy is " + strongActor.getName(); 
   return results;
  }

    
}