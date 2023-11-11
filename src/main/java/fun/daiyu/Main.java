package fun.daiyu;

import fun.daiyu.registry.Blocks;
import fun.daiyu.registry.ItemGroup;
import fun.daiyu.registry.Items;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {
    /**
     * Runs the mod initializer.
     */


    @Override
    public void onInitialize() {
        Items.RegistryItemTask();
        Blocks.RegistryBlockTask();
        ItemGroup.RegistryItemGroupTask();
    }
}
