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
public class WizardControlException extends Exception {

    public WizardControlException() {
    }

    public WizardControlException(String string) {
        super(string);
    }

    public WizardControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public WizardControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public WizardControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
