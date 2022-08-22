package net.notmango.mangotechores.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.notmango.mangotechores.block.ModBlocks;

public class ModCreativeModeTab {

    public static final CreativeModeTab MANGO_ORES = new CreativeModeTab("mangotechores") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.TIN_ORE.get());
        }
    };

    public static final CreativeModeTab MANGO_INGOTS = new CreativeModeTab("mangotechingots") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TIN_INGOT.get());
        }
    };

    public static final CreativeModeTab MANGO_BLOCKS = new CreativeModeTab("mangotechblocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.TIN_BLOCK.get());
        }
    };
}
