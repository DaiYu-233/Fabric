package fun.daiyu.items.tools.RadiantFish;

import fun.daiyu.registry.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class RadiantFishTool implements ToolMaterial {

    @Override
    public int getDurability() {
        return 520;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 15;
    }


    @Override
    public float getAttackDamage() {
        return -1;
    }

    @Override
    public int getMiningLevel() {
        return 1;
    }


    @Override
    public int getEnchantability() {
        return 10;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.ROW_RADIANT_FISH);
    }
}
