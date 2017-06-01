/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cir260.DungeonQuest.control;

/**
 *
 * @author Seth
 */
public class InventoryControl {

    public int calcStrength(int weaponStrength, int armorStrength){

        
        if (weaponStrength <= 0){
            return -1;
        }
        
        if (armorStrength <= 0){
            return -1;
        }
        
        int Strength = (weaponStrength + armorStrength);
            return Strength;
        }  
    }

    