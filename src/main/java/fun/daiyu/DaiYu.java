package fun.daiyu;

import fun.daiyu.registry.Item;
import fun.daiyu.registry.ItemGroup;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DaiYu implements ModInitializer {
	public static class Const{
		public static final String Mod_Id = "daiyu";
	}
    public static final Logger LOGGER = LoggerFactory.getLogger(Const.Mod_Id);
	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		Item.RegistryItemTask();
		ItemGroup.RegistryItemGroupTask();
	}
}