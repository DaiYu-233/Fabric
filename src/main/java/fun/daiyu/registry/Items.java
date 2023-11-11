package fun.daiyu.registry;

import fun.daiyu.items.foods.CookedRadiantFish;
import fun.daiyu.items.foods.RowRadiantFish;
import fun.daiyu.items.tools.RadiantFish.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class Items {
    public static final Item ROW_RADIANT_FISH = new RowRadiantFish(new FabricItemSettings());
    public static final Item COOKED_RADIANT_FISH = new CookedRadiantFish(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).meat().snack().saturationModifier(0.65f).alwaysEdible().build()));
    public static final Item RADIANT_FISH_SWORD = new RadiantFishSword(new RadiantFishTool(),6,-2,new Item.Settings());
    public static final Item RADIANT_FISH_AXE = new RadiantFishAxe(new RadiantFishTool(),9,-3.1f,new Item.Settings());
    public static final Item RADIANT_FISH_HOE = new RadiantFishHoe(new RadiantFishTool(),1,-1f,new Item.Settings());
    public static final Item RADIANT_FISH_SHOVEL = new RadiantFishShovel(new RadiantFishTool(),4.5f,-1f,new Item.Settings());
    public static final Item RADIANT_FISH_PICKAXE = new RadiantFishPickaxe(new RadiantFishTool(),4,-1f,new Item.Settings());
}
