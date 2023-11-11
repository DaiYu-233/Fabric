package fun.daiyu;


import fun.daiyu.registry.ItemGroup;
import fun.daiyu.registry.Items;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {
    @Override
    public void onInitialize() {
        Items.RegistryItemTask();
        ItemGroup.RegistryItemGroupTask();
    }
}
