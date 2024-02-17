package fun.daiyu;

import fun.daiyu.generator.data.BlockTagProvider;
import fun.daiyu.generator.data.ItemTagProvider;
import fun.daiyu.generator.data.LootTableProvider;
import fun.daiyu.generator.data.ModelProvider;
import fun.daiyu.registry.Blocks;
import fun.daiyu.registry.Items;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DaiYuDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        Items.RegistryItemTask();
        Blocks.RegistryItemGroupTask();

        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(BlockTagProvider::new);
        pack.addProvider(LootTableProvider::new);
        pack.addProvider(ItemTagProvider::new);
        pack.addProvider(ModelProvider::new);
	}
}
