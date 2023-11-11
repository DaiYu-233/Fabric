package fun.daiyu.Items.tools.RadiantFish;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RadiantFishAxe extends AxeItem {
    public RadiantFishAxe(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        if (isWood(world, new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ()))) {
            world.breakBlock(new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ()), true);
        }
        if (isWood(world, new BlockPos(pos.getX(), pos.getY() + 2, pos.getZ()))) {
            world.breakBlock(new BlockPos(pos.getX(), pos.getY() + 2, pos.getZ()), true);
        }
        return super.postMine(stack, world, state, pos, miner);
    }

    public boolean isWood(World world, BlockPos pos) {
        Block block = world.getBlockState(pos).getBlock();
        return block == Blocks.OAK_LOG || block == Blocks.BIRCH_LOG || block == Blocks.SPRUCE_LOG ||
                block == Blocks.JUNGLE_LOG || block == Blocks.ACACIA_LOG || block == Blocks.DARK_OAK_LOG ||
                block == Blocks.CRIMSON_STEM || block == Blocks.WARPED_STEM;
    }

}
