/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.views;

/**
 *
 * @author parrdyl
 */
public class FinalRoomView extends View{
     public FinalRoomView (){
        super( "\n"
            + "\nHave you beat 7 monsters?"
            + "\nY-Yes"
            + "\nN-No"
            + "\n--------------------------");
    }
    
    @Override
    public boolean doAction(String value){
        
        value = value.toUpperCase();
        
        switch (value){
            case "Y": 
                this.winGame();
                break;
            case "N": //Review your characters's inventory and player levol
                this.backToMap();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void winGame() {
       WinView winGame = new WinView();
       winGame.display();
    }

    private void backToMap() {
        this.console.println("You have not killed enough monsters to leave yet!");
        MapMenuView mapMenu = new MapMenuView();
        mapMenu.display();
    }
}
