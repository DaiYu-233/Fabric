package fun.daiyu.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class ItemGroup {
    public static void RegistryItemGroupTask(){
        net.minecraft.item.ItemGroup ITEM_GROUP = FabricItemGroup.builder()
                .icon(() -> new ItemStack(Items.ROW_RADIANT_FISH))
                .displayName(Text.translatable("itemGroup.daiyu.main"))
                .entries((displayContext, entries) -> {
                    Items.itemList.forEach(item -> {
                        entries.add(new ItemStack(item));
                    });
                })
                .build();
        Registry.register(Registries.ITEM_GROUP, new Identifier("daiyu", "daiyu_group"), ITEM_GROUP);
    }
}
