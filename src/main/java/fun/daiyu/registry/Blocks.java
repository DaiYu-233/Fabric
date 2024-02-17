package fun.daiyu.registry;

import fun.daiyu.DaiYu;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Blocks {

    public static final Block RADIATION_FISH_ORE = RegistryBlock("radiation_fish_ore",
        new Block(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.DIAMOND_ORE)));

    public static net.minecraft.block.Block RegistryBlock(String name, net.minecraft.block.Block block) {
        RegistryBlockItem(name, block);
        return Registry.register(Registries.BLOCK,new Identifier(DaiYu.Const.Mod_Id,name),block);
    }
    public static Item RegistryBlockItem(String name, net.minecraft.block.Block block) {
        var registriedBlockItem = Registry.register(Registries.ITEM, new Identifier(DaiYu.Const.Mod_Id, name),
            new BlockItem(block, new FabricItemSettings()));
        DaiYu.itemList.add(registriedBlockItem);
        return registriedBlockItem;
    }
    public static void RegistryItemGroupTask() {
    }
}
