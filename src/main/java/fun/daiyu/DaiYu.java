package fun.daiyu;

import fun.daiyu.entry.Class;
import fun.daiyu.registry.Blocks;
import fun.daiyu.registry.ItemGroups;
import fun.daiyu.registry.Items;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class DaiYu implements ModInitializer {
	public static class Const{
		public static final String Mod_Id = "daiyu";
	}

    public static final Logger LOGGER = LoggerFactory.getLogger(Const.Mod_Id);
    public static List<Class.ItemListEntry> itemList = new ArrayList<>();
    public static List<Item> blockItemList = new ArrayList<>();
    public static List<Class.BlockListEntry> blockList = new ArrayList<>();

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric !");
		Items.RegistryItemTask();
		Blocks.RegistryItemGroupTask();
		ItemGroups.RegistryItemGroupTask();
	}
}