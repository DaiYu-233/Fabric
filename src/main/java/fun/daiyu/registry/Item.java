package fun.daiyu.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.*;

public class Item {
    public static List<net.minecraft.item.Item> itemList = new ArrayList<>();
    public static final net.minecraft.item.Item RADIATION_FISH = RegistryItem("radiation_fish",new net.minecraft.item.Item(new FabricItemSettings()));


    public static <T extends net.minecraft.item.Item> net.minecraft.item.Item RegistryItem(String name, T item){
        net.minecraft.item.Item registeredItem = Registry.register(Registries.ITEM,new Identifier("daiyu",name), item);
        itemList.add(registeredItem);
        return registeredItem;
    }
    public static void RegistryItemTask() {}
}
