package fr.lavapower.fvmod.items;

import fr.lavapower.fvmod.FVMod;
import fr.lavapower.fvmod.blocks.*;
import fr.lavapower.fvmod.blocks.utils.SimpleRotatedPillarBlock;
import fr.lavapower.fvmod.items.utils.ItemBlockFuel;
import fr.lavapower.fvmod.items.utils.ItemBlockMetadata;
import fr.lavapower.fvmod.items.utils.SimpleArmor;
import fr.lavapower.fvmod.items.utils.SimpleItem;
import fr.lavapower.fvmod.items.utils.tools.*;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber(value = Side.CLIENT, modid= FVMod.MODID)
public class FVItems
{
    public static final Item.ToolMaterial NETHERITE_TOOL = EnumHelper.addToolMaterial("netherite_tool", 4, 2031, 9, 4, 15);
    public static final ItemArmor.ArmorMaterial NETHERITE_ARMOR = EnumHelper.addArmorMaterial("netherite_armor", FVMod.MODID+":netherite", 37, new int[] {3, 8, 6, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4F);

    public static final Item BLOCK_NORMAL_PUMPKIN = new ItemBlock(FVBlocks.NORMAL_PUMPKIN).setRegistryName(FVBlocks.NORMAL_PUMPKIN.getRegistryName());
    public static final Item BLOCK_PRISMARINE_STAIRS = new ItemBlock(FVBlocks.PRISMARINE_STAIRS).setRegistryName(FVBlocks.PRISMARINE_STAIRS.getRegistryName());
    public static final Item BLOCK_PRISMARINE_SLAB = new ItemSlab(FVBlocks.PRISMARINE_HALFSLAB, FVBlocks.PRISMARINE_HALFSLAB, FVBlocks.PRISMARINE_DOUBLESLAB).setRegistryName(FVBlocks.PRISMARINE_HALFSLAB.getRegistryName());
    public static final Item BLOCK_KELP = new ItemBlock(FVBlocks.KELP).setRegistryName(FVBlocks.KELP.getRegistryName());
    public static final Item BLOCK_BLUE_ICE = new ItemBlock(FVBlocks.BLUE_ICE).setRegistryName(FVBlocks.BLUE_ICE.getRegistryName());
    public static final Item BLOCK_BARREL = new ItemBlock(FVBlocks.BARREL).setRegistryName(FVBlocks.BARREL.getRegistryName());
    public static final Item BLOCK_FLETCHING_TABLE = new ItemBlock(FVBlocks.FLETCHING_TABLE).setRegistryName(FVBlocks.FLETCHING_TABLE.getRegistryName());
    public static final Item BLOCK_SMITHING_TABLE = new ItemBlock(FVBlocks.SMITHING_TABLE).setRegistryName(FVBlocks.SMITHING_TABLE.getRegistryName());
    public static final Item BLOCK_BASALT = new ItemBlock(FVBlocks.BASALT).setRegistryName(FVBlocks.BASALT.getRegistryName());
    public static final Item BLOCK_POLISHED_BASALT = new ItemBlock(FVBlocks.POLISHED_BASALT).setRegistryName(FVBlocks.POLISHED_BASALT.getRegistryName());
    public static final Item BLOCK_ANCIENT_DEBRIS = new ItemBlock(FVBlocks.ANCIENT_DEBRIS).setRegistryName(FVBlocks.ANCIENT_DEBRIS.getRegistryName());
    public static final Item BLOCK_NETHERITE_BLOCK = new ItemBlock(FVBlocks.NETHERITE_BLOCK).setRegistryName(FVBlocks.NETHERITE_BLOCK.getRegistryName());

    public static final Item BLOCK_STRIPPED_OAK_LOG = new ItemBlock(FVBlocks.STRIPPED_OAK_LOG).setRegistryName(FVBlocks.STRIPPED_OAK_LOG.getRegistryName());
    public static final Item BLOCK_STRIPPED_SPRUCE_LOG = new ItemBlock(FVBlocks.STRIPPED_SPRUCE_LOG).setRegistryName(FVBlocks.STRIPPED_SPRUCE_LOG.getRegistryName());
    public static final Item BLOCK_STRIPPED_BIRCH_LOG = new ItemBlock(FVBlocks.STRIPPED_BIRCH_LOG).setRegistryName(FVBlocks.STRIPPED_BIRCH_LOG.getRegistryName());
    public static final Item BLOCK_STRIPPED_JUNGLE_LOG = new ItemBlock(FVBlocks.STRIPPED_JUNGLE_LOG).setRegistryName(FVBlocks.STRIPPED_JUNGLE_LOG.getRegistryName());
    public static final Item BLOCK_STRIPPED_ACACIA_LOG = new ItemBlock(FVBlocks.STRIPPED_ACACIA_LOG).setRegistryName(FVBlocks.STRIPPED_ACACIA_LOG.getRegistryName());
    public static final Item BLOCK_STRIPPED_DARK_OAK_LOG = new ItemBlock(FVBlocks.STRIPPED_DARK_OAK_LOG).setRegistryName(FVBlocks.STRIPPED_DARK_OAK_LOG.getRegistryName());
    public static final Item BLOCK_STRIPPED_OAK_WOOD = new ItemBlock(FVBlocks.STRIPPED_OAK_WOOD).setRegistryName(FVBlocks.STRIPPED_OAK_WOOD.getRegistryName());
    public static final Item BLOCK_STRIPPED_SPRUCE_WOOD = new ItemBlock(FVBlocks.STRIPPED_SPRUCE_WOOD).setRegistryName(FVBlocks.STRIPPED_SPRUCE_WOOD.getRegistryName());
    public static final Item BLOCK_STRIPPED_BIRCH_WOOD = new ItemBlock(FVBlocks.STRIPPED_BIRCH_WOOD).setRegistryName(FVBlocks.STRIPPED_BIRCH_WOOD.getRegistryName());
    public static final Item BLOCK_STRIPPED_JUNGLE_WOOD = new ItemBlock(FVBlocks.STRIPPED_JUNGLE_WOOD).setRegistryName(FVBlocks.STRIPPED_JUNGLE_WOOD.getRegistryName());
    public static final Item BLOCK_STRIPPED_ACACIA_WOOD = new ItemBlock(FVBlocks.STRIPPED_ACACIA_WOOD).setRegistryName(FVBlocks.STRIPPED_ACACIA_WOOD.getRegistryName());
    public static final Item BLOCK_STRIPPED_DARK_OAK_WOOD = new ItemBlock(FVBlocks.STRIPPED_DARK_OAK_WOOD).setRegistryName(FVBlocks.STRIPPED_DARK_OAK_WOOD.getRegistryName());
    public static final Item BLOCK_CRYING_OBSIDIAN = new ItemBlock(FVBlocks.CRYING_OBSIDIAN).setRegistryName(FVBlocks.CRYING_OBSIDIAN.getRegistryName());

    public static final Item NETHERITE_SCRAP = new SimpleItem("netherite_scrap");
    public static final Item NETHERITE_INGOT = new SimpleItem("netherite_ingot");
    public static final Item NETHERITE_SWORD = new SimpleSword(NETHERITE_TOOL, "netherite_sword");
    public static final Item NETHERITE_AXE = new SimpleAxe(NETHERITE_TOOL, "netherite_axe");
    public static final Item NETHERITE_PICKAXE = new SimplePickaxe(NETHERITE_TOOL, "netherite_pickaxe");
    public static final Item NETHERITE_SHOVEL = new SimpleShovel(NETHERITE_TOOL, "netherite_shovel");
    public static final Item NETHERITE_HOE = new SimpleHoe(NETHERITE_TOOL, "netherite_hoe");
    public static final Item NETHERITE_HELMET = new SimpleArmor("netherite_helmet", NETHERITE_ARMOR, 1, EntityEquipmentSlot.HEAD);
    public static final Item NETHERITE_CHESTPLATE = new SimpleArmor("netherite_chestplate", NETHERITE_ARMOR, 1, EntityEquipmentSlot.CHEST);
    public static final Item NETHERITE_LEGGINGS = new SimpleArmor("netherite_leggings", NETHERITE_ARMOR, 2, EntityEquipmentSlot.LEGS);
    public static final Item NETHERITE_BOOTS = new SimpleArmor("netherite_boots", NETHERITE_ARMOR, 1, EntityEquipmentSlot.FEET);
    public static final Item DRIED_KELP = new DriedKelp();

    public static final Item BLOCK_DRIED_KELP = new ItemBlockFuel(FVBlocks.DRIED_KELP, 200*20).setRegistryName(FVBlocks.DRIED_KELP.getRegistryName());

    public static final Item BLOCK_DEAD_CORAL = new ItemBlockMetadata(FVBlocks.DEAD_CORAL, DeadCoralBlock.EnumType.getUnlocalizedNames()).setRegistryName(FVBlocks.DEAD_CORAL.getRegistryName());
    public static final Item BLOCK_CORAL = new ItemBlockMetadata(FVBlocks.CORAL_BLOCK, CoralBlock.EnumType.getUnlocalizedNames()).setRegistryName(FVBlocks.CORAL_BLOCK.getRegistryName());
    public static final Item BLOCK_DEAD_CORAL_BUSH = new ItemBlockMetadata(FVBlocks.DEAD_CORAL_BUSH, DeadCoralBush.EnumType.getUnlocalizedNames()).setRegistryName(FVBlocks.DEAD_CORAL_BUSH.getRegistryName());
    public static final Item BLOCK_CORAL_BUSH = new ItemBlockMetadata(FVBlocks.CORAL_BUSH, CoralBush.EnumType.getUnlocalizedNames()).setRegistryName(FVBlocks.CORAL_BUSH.getRegistryName());

    static {
        NETHERITE_TOOL.setRepairItem(new ItemStack(FVItems.NETHERITE_INGOT));
        NETHERITE_ARMOR.setRepairItem(new ItemStack(FVItems.NETHERITE_INGOT));
    }

    public static void setItemName(Item item, String name) {
        item.setRegistryName(FVMod.MODID, name).setUnlocalizedName(FVMod.MODID + "." + name);
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void registerItemModels(ModelRegistryEvent event) {
        registerModel(BLOCK_NORMAL_PUMPKIN);
        registerModel(BLOCK_PRISMARINE_STAIRS);
        registerModel(BLOCK_PRISMARINE_SLAB);
        registerModel(BLOCK_KELP);
        registerModel(DRIED_KELP);
        registerModel(BLOCK_DRIED_KELP);
        registerModel(BLOCK_BLUE_ICE);
        registerModel(BLOCK_BARREL);
        registerModel(BLOCK_FLETCHING_TABLE);
        registerModel(BLOCK_SMITHING_TABLE);
        registerModel(BLOCK_BASALT);
        registerModel(BLOCK_POLISHED_BASALT);
        registerModel(BLOCK_ANCIENT_DEBRIS);
        registerModel(NETHERITE_SCRAP);
        registerModel(NETHERITE_INGOT);
        registerModel(BLOCK_NETHERITE_BLOCK);
        registerModel(NETHERITE_SWORD);
        registerModel(NETHERITE_AXE);
        registerModel(NETHERITE_PICKAXE);
        registerModel(NETHERITE_SHOVEL);
        registerModel(NETHERITE_HOE);
        registerModel(NETHERITE_HELMET);
        registerModel(NETHERITE_CHESTPLATE);
        registerModel(NETHERITE_LEGGINGS);
        registerModel(NETHERITE_BOOTS);
        registerModel(BLOCK_CRYING_OBSIDIAN);
        registerModel(BLOCK_STRIPPED_OAK_LOG, "wood");
        registerModel(BLOCK_STRIPPED_SPRUCE_LOG, "wood");
        registerModel(BLOCK_STRIPPED_BIRCH_LOG, "wood");
        registerModel(BLOCK_STRIPPED_JUNGLE_LOG, "wood");
        registerModel(BLOCK_STRIPPED_ACACIA_LOG, "wood");
        registerModel(BLOCK_STRIPPED_DARK_OAK_LOG, "wood");
        registerModel(BLOCK_STRIPPED_OAK_WOOD, "wood");
        registerModel(BLOCK_STRIPPED_SPRUCE_WOOD, "wood");
        registerModel(BLOCK_STRIPPED_BIRCH_WOOD, "wood");
        registerModel(BLOCK_STRIPPED_JUNGLE_WOOD, "wood");
        registerModel(BLOCK_STRIPPED_ACACIA_WOOD, "wood");
        registerModel(BLOCK_STRIPPED_DARK_OAK_WOOD, "wood");

        for(int i = 0; i < DeadCoralBlock.EnumType.values().length; i++)
            registerModel(BLOCK_DEAD_CORAL, i, DeadCoralBlock.EnumType.getNames()[i], "coral");
        for(int i = 0; i < CoralBlock.EnumType.values().length; i++)
            registerModel(BLOCK_CORAL, i, CoralBlock.EnumType.getNames()[i], "coral");
        for(int i = 0; i < DeadCoralBush.EnumType.values().length; i++)
            registerModel(BLOCK_DEAD_CORAL_BUSH, i, DeadCoralBush.EnumType.getNames()[i], "coral");
        for(int i = 0; i < CoralBush.EnumType.values().length; i++)
            registerModel(BLOCK_CORAL_BUSH, i, CoralBush.EnumType.getNames()[i], "coral");
    }

    @SideOnly(Side.CLIENT)
    public static void registerModel(Item item) {
        registerModel(item, 0, null, null);
    }

    @SideOnly(Side.CLIENT)
    public static void registerModel(Item item, String folderModel) {
        registerModel(item, 0, null, folderModel);
    }

    @SideOnly(Side.CLIENT)
    public static void registerModel(Item item, int metadata, String name, String folderModel) {
        if(metadata < 0) metadata = 0;
        String resourceName = item.getUnlocalizedName().substring(5).replace(".", ":");
        if(name != null) resourceName += "_"+name;
        if(folderModel != null) resourceName = resourceName.split(":")[0] + ":" + folderModel + "/" + resourceName.split(":")[1];

        ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation(resourceName, "inventory"));
    }
}
