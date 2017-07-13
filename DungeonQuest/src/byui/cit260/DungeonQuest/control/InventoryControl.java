/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DungeonQuest.control;

import byui.cit260.DungeonQuest.model.Inventory;

/**
 *
 * @author Seth
 */
public class InventoryControl {
    
    /* I think I need to initialize a 'empty' player inventory here... 
    That seems to be what was previously done in MapControl...
    */
    
     public static Inventory[] createInventoryList() {
        
         Inventory[] inventory = new Inventory[20];
         
         Inventory bronzeDagger = new Inventory();
         bronzeDagger.setInventoryItem("Bronze Dagger");
         bronzeDagger.setItemDescription("An antique, but it can still cut.");
         bronzeDagger.setItemLevel(10);
         bronzeDagger.setAmount(1);
         inventory[Item.bronzeDagger.ordinal()] = bronzeDagger;
         
         Inventory steelDagger = new Inventory();
         steelDagger.setInventoryItem("Steel Dagger");
         steelDagger.setItemDescription("A sturdy blade.");
         steelDagger.setItemLevel(11);
         steelDagger.setAmount(0);
         inventory[Item.steelDagger.ordinal()] = steelDagger;
         
         Inventory mithrilDagger = new Inventory();
         mithrilDagger.setInventoryItem("Mithril Dagger");
         mithrilDagger.setItemDescription("A real blade for killing real monsters.");
         mithrilDagger.setItemLevel(12);
         mithrilDagger.setAmount(0);
         inventory[Item.mithrilDagger.ordinal()] = mithrilDagger;
         
         Inventory rustySword = new Inventory();
         rustySword.setInventoryItem("Rusty Sword");
         rustySword.setItemDescription("An old, weathered weapon.");
         rustySword.setItemLevel(13);
         rustySword.setAmount(0);
         inventory[Item.rustySword.ordinal()] = rustySword;
         
         Inventory polishedSword = new Inventory();
         polishedSword.setInventoryItem("Polished Sword");
         polishedSword.setItemDescription("A weapon for a real adventurer.");
         polishedSword.setItemLevel(14);
         polishedSword.setAmount(0);
         inventory[Item.polishedSword.ordinal()] = polishedSword;
         
         Inventory mithrilSword = new Inventory();
         mithrilSword.setInventoryItem("Mitril Sword");
         mithrilSword.setItemDescription("A real blade for killing real monsters.");
         mithrilSword.setItemLevel(15);
         mithrilSword.setAmount(0);
         inventory[Item.mithrilSword.ordinal()] = mithrilSword;
         
         Inventory weatheredAxe = new Inventory();
         weatheredAxe.setInventoryItem("weathered Axe");
         weatheredAxe.setItemDescription("Good for straw, logs and skulls.");
         weatheredAxe.setItemLevel(16);
         weatheredAxe.setAmount(0);
         inventory[Item.weatheredAxe.ordinal()] = weatheredAxe;
         
         Inventory sturdyAxe = new Inventory();
         sturdyAxe.setInventoryItem("Sturdy Axe");
         sturdyAxe.setItemDescription("When it doubt, start chopping.");
         sturdyAxe.setItemLevel(17);
         sturdyAxe.setAmount(0);
         inventory[Item.sturdyAxe.ordinal()] = sturdyAxe;
         
         Inventory vikingAxe = new Inventory();
         vikingAxe.setInventoryItem("Viking Axe");
         vikingAxe.setItemDescription("A real axe, for slaying real monsters.");
         vikingAxe.setItemLevel(18);
         vikingAxe.setAmount(0);
         inventory[Item.vikingAxe.ordinal()] = vikingAxe;
         
         Inventory holySpear = new Inventory();
         holySpear.setInventoryItem("Holy Spear");
         holySpear.setItemDescription("God blessed for destroying monsters.");
         holySpear.setItemLevel(35);
         holySpear.setAmount(0);
         inventory[Item.holySpear.ordinal()] = holySpear;
         
         Inventory tatteredLeatherArmor = new Inventory();
         tatteredLeatherArmor.setInventoryItem("Tattered Leather Armor");
         tatteredLeatherArmor.setItemDescription("Battered, but still usable.");
         tatteredLeatherArmor.setItemLevel(10);
         tatteredLeatherArmor.setAmount(1);
         inventory[Item.tatteredLeatherArmor.ordinal()] = tatteredLeatherArmor;
         
         Inventory sturdyLeatherArmor = new Inventory();
         sturdyLeatherArmor.setInventoryItem("Sturdy Leather Armor");
         sturdyLeatherArmor.setItemDescription("Flexible and strong armor.");
         sturdyLeatherArmor.setItemLevel(11);
         sturdyLeatherArmor.setAmount(0);
         inventory[Item.sturdyLeatherArmor.ordinal()] = sturdyLeatherArmor;
         
         Inventory polishedLeatherArmor = new Inventory();
         polishedLeatherArmor.setInventoryItem("Polished Leather Armor");
         polishedLeatherArmor.setItemDescription("Barely used. Great quality.");
         polishedLeatherArmor.setItemLevel(12);
         polishedLeatherArmor.setAmount(0);
         inventory[Item.polishedLeatherArmor.ordinal()] = polishedLeatherArmor;
         
         Inventory tatteredScaleMail = new Inventory();
         tatteredScaleMail.setInventoryItem("Tattered Scale Mail");
         tatteredScaleMail.setItemDescription("Strong but worn.");
         tatteredScaleMail.setItemLevel(13);
         tatteredScaleMail.setAmount(0);
         inventory[Item.tatteredScaleMail.ordinal()] = tatteredScaleMail;
         
         Inventory sturdyScaleMail = new Inventory();
         sturdyScaleMail.setInventoryItem("Sturdy Scale Mail");
         sturdyScaleMail.setItemDescription("Barely used. Great quality.");
         sturdyScaleMail.setItemLevel(14);
         sturdyScaleMail.setAmount(0);
         inventory[Item.sturdyScaleMail.ordinal()] = sturdyScaleMail;
         
         Inventory polishedScaleMail = new Inventory();
         polishedScaleMail.setInventoryItem("Polished Scale Mail");
         polishedScaleMail.setItemDescription("Quality armor for your chest.");
         polishedScaleMail.setItemLevel(15);
         polishedScaleMail.setAmount(0);
         inventory[Item.polishedScaleMail.ordinal()] = polishedLeatherArmor;
         
         Inventory tatteredPlateMail = new Inventory();
         tatteredPlateMail.setInventoryItem("Tattered Plate Mail");
         tatteredPlateMail.setItemDescription("A relic from a powerful hero.");
         tatteredPlateMail.setItemLevel(16);
         tatteredPlateMail.setAmount(0);
         inventory[Item.tatteredPlateMail.ordinal()] = tatteredPlateMail;
         
         Inventory sturdyPlateMail = new Inventory();
         sturdyPlateMail.setInventoryItem("Sturdy Plate Mail");
         sturdyPlateMail.setItemDescription("Covers your whole body in thick metal.");
         sturdyPlateMail.setItemLevel(17);
         sturdyPlateMail.setAmount(0);
         inventory[Item.sturdyPlateMail.ordinal()] = sturdyPlateMail;
         
         Inventory polishedPlateMail = new Inventory();
         polishedPlateMail.setInventoryItem("Polished Plate Mail");
         polishedPlateMail.setItemDescription("Become a living tank of iron and steel.");
         polishedPlateMail.setItemLevel(18);
         polishedPlateMail.setAmount(0);
         inventory[Item.polishedPlateMail.ordinal()] = polishedPlateMail;
         
         Inventory cloakOfLight = new Inventory();
         cloakOfLight.setInventoryItem("Cloak of Light");
         cloakOfLight.setItemDescription("The best protection comes from the Gods.");
         cloakOfLight.setItemLevel(30);
         cloakOfLight.setAmount(0);
         inventory[Item.cloakOfLight.ordinal()] = cloakOfLight;
 
         return inventory;
    }
    public enum Item {
        bronzeDagger,
        steelDagger,
        mithrilDagger,
        rustySword,
        polishedSword,
        mithrilSword,
        weatheredAxe,
        sturdyAxe,
        vikingAxe,
        holySpear,
        tatteredLeatherArmor,
        sturdyLeatherArmor,
        polishedLeatherArmor,
        tatteredScaleMail,
        sturdyScaleMail,
        polishedScaleMail,
        tatteredPlateMail,
        sturdyPlateMail,
        polishedPlateMail,
        cloakOfLight;
    }
}
