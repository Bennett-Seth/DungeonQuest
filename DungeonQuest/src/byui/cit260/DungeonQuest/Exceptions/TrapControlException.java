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
public class TrapControlException extends Exception{

    public TrapControlException() {
    }

    public TrapControlException(String message) {
        super(message);
    }

    public TrapControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public TrapControlException(Throwable cause) {
        super(cause);
    }

    public TrapControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

   
    
}
