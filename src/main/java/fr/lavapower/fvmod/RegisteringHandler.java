package fr.lavapower.fvmod;

import fr.lavapower.fvmod.blocks.FVBlocks;
import fr.lavapower.fvmod.items.FVItems;
import fr.lavapower.fvmod.tileentities.TileEntityBarrel;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class RegisteringHandler
{
    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                FVBlocks.NORMAL_PUMPKIN,
                FVBlocks.PRISMARINE_STAIRS,
                FVBlocks.PRISMARINE_HALFSLAB,
                FVBlocks.PRISMARINE_DOUBLESLAB,
                FVBlocks.DEAD_CORAL,
                FVBlocks.CORAL_BLOCK,
                FVBlocks.DEAD_CORAL_BUSH,
                FVBlocks.CORAL_BUSH,
                FVBlocks.KELP,
                FVBlocks.DRIED_KELP,
                FVBlocks.BLUE_ICE,
                FVBlocks.BARREL,
                FVBlocks.FLETCHING_TABLE,
                FVBlocks.SMITHING_TABLE,
                FVBlocks.BASALT,
                FVBlocks.POLISHED_BASALT,
                FVBlocks.ANCIENT_DEBRIS,
                FVBlocks.NETHERITE_BLOCK,
                FVBlocks.STRIPPED_OAK_LOG,
                FVBlocks.STRIPPED_SPRUCE_LOG,
                FVBlocks.STRIPPED_BIRCH_LOG,
                FVBlocks.STRIPPED_JUNGLE_LOG,
                FVBlocks.STRIPPED_ACACIA_LOG,
                FVBlocks.STRIPPED_DARK_OAK_LOG,
                FVBlocks.STRIPPED_OAK_WOOD,
                FVBlocks.STRIPPED_SPRUCE_WOOD,
                FVBlocks.STRIPPED_BIRCH_WOOD,
                FVBlocks.STRIPPED_JUNGLE_WOOD,
                FVBlocks.STRIPPED_ACACIA_WOOD,
                FVBlocks.STRIPPED_DARK_OAK_WOOD,
                FVBlocks.CRYING_OBSIDIAN
        );
    }

    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                FVItems.BLOCK_NORMAL_PUMPKIN,
                FVItems.BLOCK_PRISMARINE_STAIRS,
                FVItems.BLOCK_PRISMARINE_SLAB,
                FVItems.BLOCK_DEAD_CORAL,
                FVItems.BLOCK_CORAL,
                FVItems.BLOCK_DEAD_CORAL_BUSH,
                FVItems.BLOCK_CORAL_BUSH,
                FVItems.BLOCK_KELP,
                FVItems.DRIED_KELP,
                FVItems.BLOCK_DRIED_KELP,
                FVItems.BLOCK_BLUE_ICE,
                FVItems.BLOCK_BARREL,
                FVItems.BLOCK_FLETCHING_TABLE,
                FVItems.BLOCK_SMITHING_TABLE,
                FVItems.BLOCK_BASALT,
                FVItems.BLOCK_POLISHED_BASALT,
                FVItems.BLOCK_ANCIENT_DEBRIS,
                FVItems.NETHERITE_SCRAP,
                FVItems.NETHERITE_INGOT,
                FVItems.BLOCK_NETHERITE_BLOCK,
                FVItems.NETHERITE_SWORD,
                FVItems.NETHERITE_AXE,
                FVItems.NETHERITE_PICKAXE,
                FVItems.NETHERITE_HOE,
                FVItems.NETHERITE_SHOVEL,
                FVItems.NETHERITE_HELMET,
                FVItems.NETHERITE_CHESTPLATE,
                FVItems.NETHERITE_LEGGINGS,
                FVItems.NETHERITE_BOOTS,
                FVItems.BLOCK_STRIPPED_OAK_LOG,
                FVItems.BLOCK_STRIPPED_SPRUCE_LOG,
                FVItems.BLOCK_STRIPPED_BIRCH_LOG,
                FVItems.BLOCK_STRIPPED_JUNGLE_LOG,
                FVItems.BLOCK_STRIPPED_ACACIA_LOG,
                FVItems.BLOCK_STRIPPED_DARK_OAK_LOG,
                FVItems.BLOCK_STRIPPED_OAK_WOOD,
                FVItems.BLOCK_STRIPPED_SPRUCE_WOOD,
                FVItems.BLOCK_STRIPPED_BIRCH_WOOD,
                FVItems.BLOCK_STRIPPED_JUNGLE_WOOD,
                FVItems.BLOCK_STRIPPED_ACACIA_WOOD,
                FVItems.BLOCK_STRIPPED_DARK_OAK_WOOD,
                FVItems.BLOCK_CRYING_OBSIDIAN
        );
    }

    public static void registerEntities() {
        GameRegistry.registerTileEntity(TileEntityBarrel.class, new ResourceLocation(FVMod.MODID+":barrel"));
    }

    public static void registerRecipes() {
        GameRegistry.addSmelting(FVBlocks.KELP, new ItemStack(FVItems.DRIED_KELP), 0.1F);
        GameRegistry.addSmelting(FVBlocks.ANCIENT_DEBRIS, new ItemStack(FVItems.NETHERITE_SCRAP), 0F);
    }
}
