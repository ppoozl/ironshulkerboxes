package com.progwml6.ironshulkerbox.common.util;

import com.progwml6.ironshulkerbox.IronShulkerBox;
import net.minecraft.item.DyeColor;

public class BlockNames
{
    public static final String IRON_SHULKER_BOX = IronShulkerBox.MOD_ID + ":iron_shulker_box";

    public static final String GOLD_SHULKER_BOX = IronShulkerBox.MOD_ID + ":gold_shulker_box";

    public static final String DIAMOND_SHULKER_BOX = IronShulkerBox.MOD_ID + ":diamond_shulker_box";

    public static final String COPPER_SHULKER_BOX = IronShulkerBox.MOD_ID + ":copper_shulker_box";

    public static final String SILVER_SHULKER_BOX = IronShulkerBox.MOD_ID + ":silver_shulker_box";

    public static final String CRYSTAL_SHULKER_BOX = IronShulkerBox.MOD_ID + ":crystal_shulker_box";

    public static final String OBSIDIAN_SHULKER_BOX = IronShulkerBox.MOD_ID + ":obsidian_shulker_box";

    public static final String IRON_SHULKER_BOX_COLOR = IronShulkerBox.MOD_ID + ":iron_shulker_box_";

    public static final String GOLD_SHULKER_BOX_COLOR = IronShulkerBox.MOD_ID + ":gold_shulker_box_";

    public static final String DIAMOND_SHULKER_BOX_COLOR = IronShulkerBox.MOD_ID + ":diamond_shulker_box_";

    public static final String COPPER_SHULKER_BOX_COLOR = IronShulkerBox.MOD_ID + ":copper_shulker_box_";

    public static final String SILVER_SHULKER_BOX_COLOR = IronShulkerBox.MOD_ID + ":silver_shulker_box_";

    public static final String CRYSTAL_SHULKER_BOX_COLOR = IronShulkerBox.MOD_ID + ":crystal_shulker_box_";

    public static final String OBSIDIAN_SHULKER_BOX_COLOR = IronShulkerBox.MOD_ID + ":obsidian_shulker_box_";

    public static final String getNameWithColor(String baseNameIn, DyeColor colorIn)
    {
        return baseNameIn + "_" + colorIn.getTranslationKey();
    }

}
