package fun.daiyu.registry;

import fun.daiyu.DaiYu;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ItemGroup {
    public static final net.minecraft.item.ItemGroup DAIYU_GROUP = Registry.register
        (Registries.ITEM_GROUP, new Identifier(DaiYu.Const.Mod_Id, "daiyu_group"),
        FabricItemGroup.builder().displayName(Text.translatable("daiyu"))
        .icon(() -> new ItemStack((Item.RADIATION_FISH)))
        .entries(((displayContext, entries) -> {
            Item.itemList.forEach(item -> {
                entries.add(new ItemStack(item));
            });
        })).build());

    public static void RegistryItemGroupTask() {}
}
