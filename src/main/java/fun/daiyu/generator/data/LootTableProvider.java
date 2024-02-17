package fun.daiyu.generator.data;

import fun.daiyu.registry.Blocks;
import fun.daiyu.registry.Items;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class LootTableProvider extends FabricBlockLootTableProvider {
    public LootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(Blocks.RADIATION_FISH_ORE, manyDrops(Blocks.RADIATION_FISH_ORE, Items.RADIATION_FISH, 1, 3));
    }

    public LootTable.Builder manyDrops(Block drop, Item item, int min, int max) {
        return dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ItemEntry.builder(item).apply(SetCountLootFunction
                .builder(UniformLootNumberProvider.create(min, max))).apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}
