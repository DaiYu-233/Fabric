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
    public List<Item> itemList = new ArrayList<>();
    public static final Item ROW_RADIANT_FISH = new RowRadiantFish(new FabricItemSettings());

    public List<Item> RegistryItemTask() {
        RegistryItem("row_radiant_fish",new RowRadiantFish(new FabricItemSettings()));
        RegistryItem("cooked_radiant_fish", new CookedRadiantFish(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).meat().snack().saturationModifier(0.65f).alwaysEdible().build())));
        RegistryItem("radiant_fish_sword", new RadiantFishSword(new RadiantFishTool(), 6, -2, new Item.Settings()));
        RegistryItem("radiant_fish_shovel", new RadiantFishShovel(new RadiantFishTool(), 4.5f, -1f, new Item.Settings()));
        RegistryItem("radiant_fish_pickaxe", new RadiantFishPickaxe(new RadiantFishTool(), 4, -1f, new Item.Settings()));
        RegistryItem("radiant_fish_axe", new RadiantFishAxe(new RadiantFishTool(), 9, -3.1f, new Item.Settings()));
        RegistryItem("radiant_fish_hoe", new RadiantFishHoe(new RadiantFishTool(), 1, -1f, new Item.Settings()));
        return itemList;
    }

    public <T extends Item> Item RegistryItem(String name,T item){
        Item registeredItem = Registry.register(Registries.ITEM,new Identifier("daiyu",name), item);
        itemList.add(registeredItem);
        return registeredItem;
    }


}
