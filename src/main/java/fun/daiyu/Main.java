package fun.daiyu;


import fun.daiyu.registry.Blocks;
import fun.daiyu.registry.ItemGroup;
import fun.daiyu.registry.Items;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {
    @Override
    public void onInitialize() {
        Items items = new Items();
        var itemsList = items.RegistryItemTask();
        Blocks blocks = new Blocks();
        var blocksList = blocks.RegistryBlockTask();
        ItemGroup itemGroup = new ItemGroup();
        itemGroup.RegistryItemGroupTask(itemsList,blocksList);


    }
}
