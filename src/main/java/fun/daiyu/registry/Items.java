package fun.daiyu.registry;

import fun.daiyu.DaiYu;
import fun.daiyu.entry.item.CookedRadiationFish;
import fun.daiyu.entry.tool.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Items {
    public static final Item RADIATION_FISH = RegistryItem("radiation_fish",new Item(new FabricItemSettings()));
    public static final Item COOKED_RADIATION_FISH = RegistryItem("cooked_radiation_fish", new CookedRadiationFish(new FabricItemSettings().food(new FoodComponent.Builder().hunger(20).meat().snack().saturationModifier(2.25f).alwaysEdible().build())));
    public static final Item RADIATION_FISH_SWORD = RegistryItem("radiation_fish_sword", new RadiationFishSword(new RadiationFishTool(), 6, -2, new Item.Settings()));
    public static final Item RADIATION_FISH_AXE = RegistryItem("radiation_fish_axe", new RadiationFishAxe(new RadiationFishTool(), 9, -3.1f, new Item.Settings()));
    public static final Item RADIATION_FISH_HOE = RegistryItem("radiation_fish_hoe", new RadiationFishHoe(new RadiationFishTool(), 1, -1f, new Item.Settings()));
    public static final Item RADIATION_FISH_SHOVEL = RegistryItem("radiation_fish_shovel", new RadiationFishShovel(new RadiationFishTool(), 4.5f, -1f, new Item.Settings()));
    public static final Item RADIATION_FISH_PICKAXE = RegistryItem("radiation_fish_pickaxe", new RadiationFishPickaxe(new RadiationFishTool(), 4, -1f, new Item.Settings()));
    public static <T extends net.minecraft.item.Item> net.minecraft.item.Item RegistryItem(String name, T item){
        net.minecraft.item.Item registeredItem = Registry.register(Registries.ITEM,new Identifier("daiyu",name), item);
        DaiYu.itemList.add(registeredItem);
        return registeredItem;
    }
    public static void RegistryItemTask() {}
}
