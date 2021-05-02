package fr.lavapower.fvmod;

import fr.lavapower.fvmod.blocks.FVBlocks;
import fr.lavapower.fvmod.blocks.utils.SimpleRotatedPillarBlock;
import fr.lavapower.fvmod.items.FVItems;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockNewLog;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.material.MapColor;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class FVCommonEvent
{
    @SubscribeEvent
    public void onEntitySpawn(EntityJoinWorldEvent event) {
        if(event.getEntity() instanceof EntityItem && (
                ((EntityItem) event.getEntity()).getItem().getItem() == FVItems.NETHERITE_SCRAP ||
                        ((EntityItem) event.getEntity()).getItem().getItem() == FVItems.BLOCK_ANCIENT_DEBRIS ||
                        ((EntityItem) event.getEntity()).getItem().getItem() == FVItems.NETHERITE_INGOT ||
                        ((EntityItem) event.getEntity()).getItem().getItem() == FVItems.NETHERITE_HELMET ||
                        ((EntityItem) event.getEntity()).getItem().getItem() == FVItems.NETHERITE_CHESTPLATE ||
                        ((EntityItem) event.getEntity()).getItem().getItem() == FVItems.NETHERITE_LEGGINGS ||
                        ((EntityItem) event.getEntity()).getItem().getItem() == FVItems.NETHERITE_BOOTS ||
                        ((EntityItem) event.getEntity()).getItem().getItem() == FVItems.NETHERITE_SWORD ||
                        ((EntityItem) event.getEntity()).getItem().getItem() == FVItems.NETHERITE_PICKAXE ||
                        ((EntityItem) event.getEntity()).getItem().getItem() == FVItems.NETHERITE_AXE ||
                        ((EntityItem) event.getEntity()).getItem().getItem() == FVItems.NETHERITE_SHOVEL ||
                        ((EntityItem) event.getEntity()).getItem().getItem() == FVItems.NETHERITE_HOE ||
                        ((EntityItem) event.getEntity()).getItem().getItem() == FVItems.BLOCK_NETHERITE_BLOCK
        )) {
            event.getEntity().setEntityInvulnerable(true);
        }
    }

    EnumFacing.Axis getAxisFromLogAxis(BlockLog.EnumAxis axis) {
        switch(axis) {
            case X:
                return EnumFacing.Axis.X;
            case Y:
                return EnumFacing.Axis.Y;
            case Z:
                return EnumFacing.Axis.Z;
            case NONE:
                return null;
        }
        return null;
    }

    @SubscribeEvent
    public void onPlayerInteractRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        if(event.getEntityPlayer().getHeldItemMainhand().getItem() == Items.WOODEN_AXE ||
                event.getEntityPlayer().getHeldItemMainhand().getItem() == Items.STONE_AXE ||
                event.getEntityPlayer().getHeldItemMainhand().getItem() == Items.IRON_AXE ||
                event.getEntityPlayer().getHeldItemMainhand().getItem() == Items.GOLDEN_AXE ||
                event.getEntityPlayer().getHeldItemMainhand().getItem() == Items.DIAMOND_AXE ||
                event.getEntityPlayer().getHeldItemMainhand().getItem() == FVItems.NETHERITE_AXE) {
            if(event.getWorld().getBlockState(event.getPos()).getBlock() == Blocks.LOG) {
                EnumFacing.Axis axis = getAxisFromLogAxis(event.getWorld().getBlockState(event.getPos()).getValue(BlockOldLog.LOG_AXIS));
                switch(event.getWorld().getBlockState(event.getPos()).getValue(BlockOldLog.VARIANT)) {
                    case OAK:
                        if(axis != null)
                            event.getWorld().setBlockState(event.getPos(), FVBlocks.STRIPPED_OAK_LOG.getDefaultState()
                                    .withProperty(SimpleRotatedPillarBlock.AXIS, axis));
                        else
                            event.getWorld().setBlockState(event.getPos(), FVBlocks.STRIPPED_OAK_WOOD.getDefaultState());
                        break;
                    case BIRCH:
                        if(axis != null)
                            event.getWorld().setBlockState(event.getPos(), FVBlocks.STRIPPED_BIRCH_LOG.getDefaultState()
                                    .withProperty(SimpleRotatedPillarBlock.AXIS, axis));
                        else
                            event.getWorld().setBlockState(event.getPos(), FVBlocks.STRIPPED_BIRCH_WOOD.getDefaultState());
                        break;
                    case SPRUCE:
                        if(axis != null)
                            event.getWorld().setBlockState(event.getPos(), FVBlocks.STRIPPED_SPRUCE_LOG.getDefaultState()
                                    .withProperty(SimpleRotatedPillarBlock.AXIS, axis));
                        else
                            event.getWorld().setBlockState(event.getPos(), FVBlocks.STRIPPED_SPRUCE_WOOD.getDefaultState());
                        break;
                    case JUNGLE:
                        if(axis != null)
                            event.getWorld().setBlockState(event.getPos(), FVBlocks.STRIPPED_JUNGLE_LOG.getDefaultState()
                                    .withProperty(SimpleRotatedPillarBlock.AXIS, axis));
                        else
                            event.getWorld().setBlockState(event.getPos(), FVBlocks.STRIPPED_JUNGLE_WOOD.getDefaultState());
                        break;
                }
                event.getEntityPlayer().getHeldItemMainhand().setItemDamage(event.getEntityPlayer().getHeldItemMainhand().getItemDamage() + 1);
            }
            else if(event.getWorld().getBlockState(event.getPos()).getBlock() == Blocks.LOG2) {
                EnumFacing.Axis axis = getAxisFromLogAxis(event.getWorld().getBlockState(event.getPos()).getValue(BlockNewLog.LOG_AXIS));
                switch(event.getWorld().getBlockState(event.getPos()).getValue(BlockNewLog.VARIANT)) {
                    case DARK_OAK:
                        if(axis != null)
                            event.getWorld().setBlockState(event.getPos(), FVBlocks.STRIPPED_DARK_OAK_LOG.getDefaultState()
                                    .withProperty(SimpleRotatedPillarBlock.AXIS, axis));
                        else
                            event.getWorld().setBlockState(event.getPos(), FVBlocks.STRIPPED_DARK_OAK_WOOD.getDefaultState());
                        break;
                    case ACACIA:
                        if(axis != null)
                            event.getWorld().setBlockState(event.getPos(), FVBlocks.STRIPPED_ACACIA_LOG.getDefaultState()
                                    .withProperty(SimpleRotatedPillarBlock.AXIS, axis));
                        else
                            event.getWorld().setBlockState(event.getPos(), FVBlocks.STRIPPED_ACACIA_WOOD.getDefaultState());
                        break;
                }
                event.getEntityPlayer().getHeldItemMainhand().setItemDamage(event.getEntityPlayer().getHeldItemMainhand().getItemDamage() + 1);
            }
        }
    }
}
