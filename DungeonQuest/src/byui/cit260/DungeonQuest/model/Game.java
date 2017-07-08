/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.model;

import java.io.Serializable;

/**
 *
 * @author Seth
 */
public class Game implements Serializable{
    
    private boolean winGame;
    private boolean looseGame;
    private double noPlayer;
    private Actor[] actors;
    private Player player;
    private Map map;
    private Inventory[] inventory;
    private Scene[] scene;
    

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Game() {
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    public Actor[] getActors() {
        return actors;
    }

    public void setActors(Actor[] actors) {
        this.actors = actors;
    }
    
    public boolean isWinGame() {
        return winGame;
    }

    public void setWinGame(boolean winGame) {
        this.winGame = winGame;
    }

    public boolean isLooseGame() {
        return looseGame;
    }

    public void setLooseGame(boolean looseGame) {
        this.looseGame = looseGame;
    }

    public double getNoPlayer() {
        return noPlayer;
    }

    public void setNoPlayer(double noPlayer) {
        this.noPlayer = noPlayer;
    }

    public Inventory[] getInventory() {
        return inventory;
    }
    
    public void setInventory(Inventory[] inventory){
        this.inventory = inventory;
    }
    public Scene[] getScene() {
        return scene;
    }
    public void setScene(Scene[] scene){
        this.scene = scene;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (this.winGame ? 1 : 0);
        hash = 29 * hash + (this.looseGame ? 1 : 0);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.noPlayer) ^ (Double.doubleToLongBits(this.noPlayer) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (this.winGame != other.winGame) {
            return false;
        }
        if (this.looseGame != other.looseGame) {
            return false;
        }
        if (Double.doubleToLongBits(this.noPlayer) != Double.doubleToLongBits(other.noPlayer)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "winGame=" + winGame + ", looseGame=" + looseGame + ", noPlayer=" + noPlayer + '}';
    }

    
    
    
    
}
