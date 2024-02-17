package fun.daiyu.registry;

import fun.daiyu.DaiYu;
import fun.daiyu.entry.Class;
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
            new Block(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.DIAMOND_ORE)), Class.DaiYuBlockModelType.CubeAll);

    public static net.minecraft.block.Block RegistryBlock(String name, net.minecraft.block.Block block, Class.DaiYuBlockModelType modelType) {
        RegistryBlockItem(name, block);
        var registriedBlock = Registry.register(Registries.BLOCK, new Identifier(DaiYu.Const.Mod_Id, name), block);
        Class.BlockListEntry entry = new Class.BlockListEntry();
        entry.Model = modelType;
        entry.Block = registriedBlock;
        DaiYu.blockList.add(entry);
        return registriedBlock;
    }
    public static Item RegistryBlockItem(String name, net.minecraft.block.Block block) {
        var registriedBlockItem = Registry.register(Registries.ITEM, new Identifier(DaiYu.Const.Mod_Id, name),
            new BlockItem(block, new FabricItemSettings()));
        DaiYu.blockItemList.add(registriedBlockItem);
        return registriedBlockItem;
    }
    public static void RegistryItemGroupTask() {
    }
}
