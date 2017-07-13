/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.Exceptions;

/**
 *
 * @author parrdyl
 */
public class GoblinControlException extends Exception{

    public GoblinControlException() {
    }

    public GoblinControlException(String string) {
        super(string);
    }

    public GoblinControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public GoblinControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public GoblinControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
