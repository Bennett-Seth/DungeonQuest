/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Seth
 */
public class Inventory implements Serializable{
    
    private String inventoryItem;
    private String itemDescription;
    private int itemLevel;
    private int amount;
    private int qualityInStock;

    public Inventory() {
    }

    
    public String getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(String inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public int getItemLevel() {
        return itemLevel;
    }

    public void setItemLevel(int itemLevel) {
        this.itemLevel = itemLevel;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getQualityInStock() {
        return qualityInStock;
    }

    public void setQualityInStock(int qualityInStock) {
        this.qualityInStock = qualityInStock;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.inventoryItem);
        hash = 67 * hash + Objects.hashCode(this.itemDescription);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.itemLevel) ^ (Double.doubleToLongBits(this.itemLevel) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.amount) ^ (Double.doubleToLongBits(this.amount) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.qualityInStock) ^ (Double.doubleToLongBits(this.qualityInStock) >>> 32));
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
        final Inventory other = (Inventory) obj;
        if (Double.doubleToLongBits(this.itemLevel) != Double.doubleToLongBits(other.itemLevel)) {
            return false;
        }
        if (Double.doubleToLongBits(this.amount) != Double.doubleToLongBits(other.amount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.qualityInStock) != Double.doubleToLongBits(other.qualityInStock)) {
            return false;
        }
        if (!Objects.equals(this.inventoryItem, other.inventoryItem)) {
            return false;
        }
        if (!Objects.equals(this.itemDescription, other.itemDescription)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory{" + "inventoryItem=" + inventoryItem + ", itemDescription=" + itemDescription + ", itemLevel=" + itemLevel + ", amount=" + amount + ", qualityInStock=" + qualityInStock + '}';
    }

 
    
    
}
