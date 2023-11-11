package fun.daiyu.registry;

import fun.daiyu.Items.Foods.CookedRadiantFish;
import fun.daiyu.Items.Foods.RowRadiantFish;
import fun.daiyu.Items.tools.RadiantFish.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class Items {
    public static final RowRadiantFish ROW_RADIANT_FISH = new RowRadiantFish(new FabricItemSettings());
    public static final CookedRadiantFish COOKED_RADIANT_FISH = new CookedRadiantFish(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).meat().snack().saturationModifier(0.65f).alwaysEdible().build()));
    public static final RadiantFishSword RADIANT_FISH_SWORD = new RadiantFishSword(new RadiantFishTool(),6,-2,new Item.Settings());
    public static final RadiantFishAxe RADIANT_FISH_AXE = new RadiantFishAxe(new RadiantFishTool(),9,-3.1f,new Item.Settings());
    public static final RadiantFishHoe RADIANT_FISH_HOE = new RadiantFishHoe(new RadiantFishTool(),1,-1f,new Item.Settings());
    public static final RadiantFishShovel RADIANT_FISH_SHOVEL = new RadiantFishShovel(new RadiantFishTool(),4.5f,-1f,new Item.Settings());
    public static final RadiantFishPickaxe RADIANT_FISH_PICKAXE = new RadiantFishPickaxe(new RadiantFishTool(),4,-1f,new Item.Settings());
}
