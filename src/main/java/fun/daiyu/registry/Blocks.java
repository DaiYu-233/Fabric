package fun.daiyu.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
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
    public static List<Block> blockList = new ArrayList<>();
    public static final Block RADIANT_FISH_ORE = RegistryBlock("radiant_fish_ore", new Block(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.IRON_ORE).requiresTool()));


    public static void RegistryBlockTask() {
    }

    public static <T extends Block> Block RegistryBlock(String name, T block) {
        Items.RegistryItem(name,new BlockItem(block,new FabricItemSettings()));
        Block registeredBlock = Registry.register(Registries.BLOCK,new Identifier("daiyu",name),block);
        blockList.add(registeredBlock);
        return registeredBlock;
    }


}
