package fr.lavapower.fvmod.blocks;

import fr.lavapower.fvmod.FVMod;
import fr.lavapower.fvmod.blocks.utils.*;
import fr.lavapower.fvmod.blocks.utils.slab.SimpleDoubleSlab;
import fr.lavapower.fvmod.blocks.utils.slab.SimpleHalfSlab;
import fr.lavapower.fvmod.blocks.utils.slab.SimpleSlab;
import fr.lavapower.fvmod.items.FVItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraftforge.oredict.OreDictionary;

public class FVBlocks
{
    public static final NormalPumpkinBlock NORMAL_PUMPKIN = new NormalPumpkinBlock();
    public static final SimpleStairs PRISMARINE_STAIRS = new SimpleStairs(Blocks.PRISMARINE.getDefaultState(), "prismarine_stairs");
    public static final SimpleSlab PRISMARINE_DOUBLESLAB = new SimpleDoubleSlab(Material.ROCK, "prismarine_doubleslab");
    public static final SimpleSlab PRISMARINE_HALFSLAB = new SimpleHalfSlab(Material.ROCK, "prismarine_halfslab");
    public static final DeadCoralBlock DEAD_CORAL = new DeadCoralBlock();
    public static final CoralBlock CORAL_BLOCK = new CoralBlock();
    public static final DeadCoralBush DEAD_CORAL_BUSH = new DeadCoralBush();
    public static final CoralBush CORAL_BUSH = new CoralBush();
    public static final Kelp KELP = new Kelp();
    public static final SimpleBlock DRIED_KELP = new SimpleBlock(Material.GROUND, "dried_kelp_block");
    public static final SimpleIce BLUE_ICE = new SimpleIce(Material.PACKED_ICE, "blue_ice", 0.99F);
    public static final Barrel BARREL = new Barrel();
    public static final SimpleOrientableBlock FLETCHING_TABLE = new SimpleOrientableBlock(Material.WOOD, "fletching_table");
    public static final SmithingTable SMITHING_TABLE = new SmithingTable();
    public static final SimpleRotatedPillarBlock BASALT = new SimpleRotatedPillarBlock(Material.ROCK, "basalt");
    public static final SimpleRotatedPillarBlock POLISHED_BASALT = new SimpleRotatedPillarBlock(Material.ROCK, "polished_basalt");
    public static final SimpleBlock ANCIENT_DEBRIS = new SimpleBlock(Material.ROCK, "ancient_debris");
    public static final SimpleBlock NETHERITE_BLOCK = new SimpleBlock(Material.ROCK, "netherite_block");
    public static final SimpleBlock CRYING_OBSIDIAN = new SimpleBlock(Material.ROCK, "crying_obsidian");
    public static final SimpleRotatedPillarBlock STRIPPED_OAK_LOG = new SimpleRotatedPillarBlock(Material.WOOD, "stripped_oak_log");
    public static final SimpleRotatedPillarBlock STRIPPED_SPRUCE_LOG = new SimpleRotatedPillarBlock(Material.WOOD, "stripped_spruce_log");
    public static final SimpleRotatedPillarBlock STRIPPED_BIRCH_LOG = new SimpleRotatedPillarBlock(Material.WOOD, "stripped_birch_log");
    public static final SimpleRotatedPillarBlock STRIPPED_JUNGLE_LOG = new SimpleRotatedPillarBlock(Material.WOOD, "stripped_jungle_log");
    public static final SimpleRotatedPillarBlock STRIPPED_ACACIA_LOG = new SimpleRotatedPillarBlock(Material.WOOD, "stripped_acacia_log");
    public static final SimpleRotatedPillarBlock STRIPPED_DARK_OAK_LOG = new SimpleRotatedPillarBlock(Material.WOOD, "stripped_dark_oak_log");
    public static final SimpleRotatedPillarBlock STRIPPED_OAK_WOOD = new SimpleRotatedPillarBlock(Material.WOOD, "stripped_oak_wood");
    public static final SimpleRotatedPillarBlock STRIPPED_SPRUCE_WOOD = new SimpleRotatedPillarBlock(Material.WOOD, "stripped_spruce_wood");
    public static final SimpleRotatedPillarBlock STRIPPED_BIRCH_WOOD = new SimpleRotatedPillarBlock(Material.WOOD, "stripped_birch_wood");
    public static final SimpleRotatedPillarBlock STRIPPED_JUNGLE_WOOD = new SimpleRotatedPillarBlock(Material.WOOD, "stripped_jungle_wood");
    public static final SimpleRotatedPillarBlock STRIPPED_ACACIA_WOOD = new SimpleRotatedPillarBlock(Material.WOOD, "stripped_acacia_wood");
    public static final SimpleRotatedPillarBlock STRIPPED_DARK_OAK_WOOD = new SimpleRotatedPillarBlock(Material.WOOD, "stripped_dark_oak_wood");

    static
    {
        PRISMARINE_DOUBLESLAB.setItem(FVItems.BLOCK_PRISMARINE_SLAB).setResistance(6F).setHardness(1.5F);
        PRISMARINE_HALFSLAB.setItem(FVItems.BLOCK_PRISMARINE_SLAB).setResistance(6F).setHardness(1.5F);
        DRIED_KELP.setResistance(12.5F).setHardness(0.5F);
        BLUE_ICE.setResistance(2.8F).setHardness(2.8F);
        FLETCHING_TABLE.setResistance(2.5F).setHardness(2.5F);
        SMITHING_TABLE.setResistance(2.5F).setHardness(2.5F);
        BASALT.setResistance(1.25F).setResistance(1.25F);
        POLISHED_BASALT.setResistance(1.25F).setResistance(1.25F);
        ANCIENT_DEBRIS.setResistance(1200F).setResistance(30F).setHarvestLevel("pickaxe", 3);
        NETHERITE_BLOCK.setResistance(1200F).setResistance(50F).setHarvestLevel("pickaxe", 3);
        CRYING_OBSIDIAN.setResistance(1200F).setResistance(50F).setHarvestLevel("pickaxe", 3);
        STRIPPED_OAK_LOG.setResistance(10F).setResistance(2F);

        OreDictionary.registerOre("logWood", STRIPPED_OAK_LOG);
        OreDictionary.registerOre("logWood", STRIPPED_SPRUCE_LOG);
        OreDictionary.registerOre("logWood", STRIPPED_BIRCH_LOG);
        OreDictionary.registerOre("logWood", STRIPPED_JUNGLE_LOG);
        OreDictionary.registerOre("logWood", STRIPPED_ACACIA_LOG);
        OreDictionary.registerOre("logWood", STRIPPED_DARK_OAK_LOG);
        OreDictionary.registerOre("logWood", STRIPPED_OAK_WOOD);
        OreDictionary.registerOre("logWood", STRIPPED_SPRUCE_WOOD);
        OreDictionary.registerOre("logWood", STRIPPED_BIRCH_WOOD);
        OreDictionary.registerOre("logWood", STRIPPED_JUNGLE_WOOD);
        OreDictionary.registerOre("logWood", STRIPPED_ACACIA_WOOD);
        OreDictionary.registerOre("logWood", STRIPPED_DARK_OAK_WOOD);
    }

    public static void setBlockName(Block block, String name) {
        block.setRegistryName(FVMod.MODID, name).setUnlocalizedName(FVMod.MODID + "." + name);
    }
}
