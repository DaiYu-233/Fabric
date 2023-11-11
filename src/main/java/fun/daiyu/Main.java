package fun.daiyu;

import fun.daiyu.registry.Items;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class Main implements ModInitializer {
    /**
     * Runs the mod initializer.
     */

    private static final net.minecraft.item.ItemGroup ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(Items.ROW_RADIANT_FISH))
            .displayName(Text.translatable("itemGroup.daiyu.main"))
            .entries((displayContext, entries) -> {
                entries.add(new ItemStack(Items.ROW_RADIANT_FISH));
                entries.add(new ItemStack(Items.COOKED_RADIANT_FISH));
                entries.add(new ItemStack(Items.RADIANT_FISH_SWORD));
                entries.add(new ItemStack(Items.RADIANT_FISH_AXE));
                entries.add(new ItemStack(Items.RADIANT_FISH_HOE));
                entries.add(new ItemStack(Items.RADIANT_FISH_SHOVEL));
                entries.add(new ItemStack(Items.RADIANT_FISH_PICKAXE));
            })
            .build();

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM_GROUP, new Identifier("daiyu", "daiyu_group"), ITEM_GROUP);

        Registry.register(Registries.ITEM,new Identifier("daiyu","row_radiant_fish"), Items.ROW_RADIANT_FISH);
        Registry.register(Registries.ITEM,new Identifier("daiyu","cooked_radiant_fish"),Items.COOKED_RADIANT_FISH);
        Registry.register(Registries.ITEM,new Identifier("daiyu","radiant_fish_sword"),Items.RADIANT_FISH_SWORD);
        Registry.register(Registries.ITEM,new Identifier("daiyu","radiant_fish_axe"),Items.RADIANT_FISH_AXE);
        Registry.register(Registries.ITEM,new Identifier("daiyu","radiant_fish_hoe"),Items.RADIANT_FISH_HOE);
        Registry.register(Registries.ITEM,new Identifier("daiyu","radiant_fish_pickaxe"),Items.RADIANT_FISH_PICKAXE);
        Registry.register(Registries.ITEM,new Identifier("daiyu","radiant_fish_shovel"),Items.RADIANT_FISH_SHOVEL);
    }
}
