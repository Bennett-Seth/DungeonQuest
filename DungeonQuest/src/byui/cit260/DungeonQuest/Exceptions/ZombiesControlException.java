/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.Exceptions;

/**
 *
 * @author ZiksMS
 */
public class ZombiesControlException extends Exception{

    public ZombiesControlException() {
    }

    public ZombiesControlException(String message) {
        super(message);
    }

    public ZombiesControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public ZombiesControlException(Throwable cause) {
        super(cause);
    }

    public ZombiesControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
