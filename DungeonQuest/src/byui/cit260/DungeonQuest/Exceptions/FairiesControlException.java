/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.Exceptions;

/**
 *
 * @author Seth
 */
public class FairiesControlException extends Exception{

    public FairiesControlException() {
    }

    public FairiesControlException(String message) {
        super(message);
    }

    public FairiesControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public FairiesControlException(Throwable cause) {
        super(cause);
    }

    public FairiesControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
