package fun.daiyu.entry;

import net.minecraft.block.Block;
import net.minecraft.data.client.Model;
import net.minecraft.item.Item;

public class Class {
    public static enum DaiYuBlockModelType {
        CubeAll
    }

    public static class ItemListEntry {
        public Item Item;
        public Model Model;
    }

    public static class BlockListEntry {
        public Block Block;
        public DaiYuBlockModelType Model;
    }
}
