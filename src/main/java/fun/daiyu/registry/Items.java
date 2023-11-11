package fun.daiyu.registry;

import fun.daiyu.items.foods.CookedRadiantFish;
import fun.daiyu.items.foods.RowRadiantFish;
import fun.daiyu.items.tools.RadiantFish.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class Items {
    public static List<Item> itemList = new ArrayList<>();
    public static final Item ROW_RADIANT_FISH = RegistryItem("row_radiant_fish",new RowRadiantFish(new FabricItemSettings()));
    public static final Item COOKED_RADIANT_FISH = RegistryItem("cooked_radiant_fish", new CookedRadiantFish(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).meat().snack().saturationModifier(0.65f).alwaysEdible().build())));
    public static final Item RADIANT_FISH_SWORD = RegistryItem("radiant_fish_sword", new RadiantFishSword(new RadiantFishTool(), 6, -2, new Item.Settings()));
    public static final Item RADIANT_FISH_AXE = RegistryItem("radiant_fish_axe", new RadiantFishAxe(new RadiantFishTool(), 9, -3.1f, new Item.Settings()));
    public static final Item RADIANT_FISH_HOE = RegistryItem("radiant_fish_hoe", new RadiantFishHoe(new RadiantFishTool(), 1, -1f, new Item.Settings()));
    public static final Item RADIANT_FISH_SHOVEL = RegistryItem("radiant_fish_shovel", new RadiantFishShovel(new RadiantFishTool(), 4.5f, -1f, new Item.Settings()));
    public static final Item RADIANT_FISH_PICKAXE = RegistryItem("radiant_fish_pickaxe", new RadiantFishPickaxe(new RadiantFishTool(), 4, -1f, new Item.Settings()));


    public static void RegistryItemTask() {}
    public static <T extends Item> Item RegistryItem(String name,T item){
        Item registeredItem = Registry.register(Registries.ITEM,new Identifier("daiyu",name), item);
        itemList.add(registeredItem);
        return registeredItem;
    }

}
