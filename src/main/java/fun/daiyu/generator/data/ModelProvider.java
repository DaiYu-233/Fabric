package fun.daiyu.generator.data;

import fun.daiyu.DaiYu;
import fun.daiyu.entry.Class;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModelProvider extends FabricModelProvider {
    public ModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        DaiYu.blockList.forEach(block -> {
            if (block.Model == Class.DaiYuBlockModelType.CubeAll) {
                blockStateModelGenerator.registerSimpleCubeAll(block.Block);
            }
        });
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        DaiYu.itemList.forEach(item -> {
            itemModelGenerator.register(item.Item, item.Model);
        });
    }
}
