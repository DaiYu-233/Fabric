package fun.daiyu.registry;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import java.util.ArrayList;
import java.util.List;

public class Blocks {
    public List<Item> blockItemList = new ArrayList<>();

    public List<Item> RegistryBlockTask() {
        RegistryBlock("radiant_fish_ore",new Block(AbstractBlock.Settings.copy(net.minecraft.block.Blocks.IRON_ORE)));
        return blockItemList;
    }

    public <T extends Block> void RegistryBlock(String name, T block){
        Block registeredBlock = Registry.register(Registries.BLOCK,new Identifier("daiyu",name), block);
        Item registeredBlockItem = Registry.register(Registries.ITEM,new Identifier("daiyu",name), new BlockItem(block,new Item.Settings()));
        blockItemList.add(registeredBlockItem);
    }


}
