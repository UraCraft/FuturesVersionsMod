package fr.lavapower.fvmod.blocks;

import fr.lavapower.fvmod.blocks.utils.SimpleBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;

public class DeadCoralBlock extends SimpleBlock
{
    public static final PropertyEnum<EnumType> VARIANT = PropertyEnum.create("variant", EnumType.class);

    public DeadCoralBlock() {
        super(Material.ROCK, "dead_coral");
        setResistance(6F);
        setHardness(1.5F);
        setDefaultState(blockState.getBaseState().withProperty(VARIANT, EnumType.TUBE));
    }

    @Override
    public int damageDropped(IBlockState state)
    {
        return state.getValue(VARIANT).getMetadata();
    }

    @Override
    public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
    {
        for(EnumType type: EnumType.values())
            items.add(new ItemStack(this, 1, type.getMetadata()));
    }

    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(VARIANT, EnumType.byMetadata(meta));
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        return state.getValue(VARIANT).getMetadata();
    }

    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, VARIANT);
    }

    public enum EnumType implements IStringSerializable {
        TUBE(0, "tube", "dead_coral_tube"),
        BRAIN(1, "brain", "dead_coral_brain"),
        BUBBLE(2, "bubble", "dead_coral_bubble"),
        FIRE(3, "fire", "dead_coral_fire"),
        HORN(4, "horn", "dead_coral_horn");

        private static final EnumType[] META_LOOKUP = new EnumType[values().length];
        private final int meta;
        private final String name;
        private final String unlocalizedName;

        private EnumType(int meta, String name, String unlocalizedName) {
            this.meta = meta;
            this.name = name;
            this.unlocalizedName = unlocalizedName;
        }

        public static String[] getUnlocalizedNames() {
            String[] names = new String[values().length];
            for(int i = 0; i < META_LOOKUP.length; i++)
                names[i] = META_LOOKUP[i].unlocalizedName;
            return names;
        }

        public static String[] getNames() {
            String[] names = new String[values().length];
            for(int i = 0; i < META_LOOKUP.length; i++)
                names[i] = META_LOOKUP[i].name;
            return names;
        }

        public static EnumType byMetadata(int meta) {
            if(meta < 0 || meta >= META_LOOKUP.length)
                meta = 0;
            return META_LOOKUP[meta];
        }

        public int getMetadata() {
            return this.meta;
        }

        public String toString() {
            return this.name;
        }

        @Override
        public String getName()
        {
            return this.name;
        }

        static {
            for(EnumType type : values()) {
                META_LOOKUP[type.getMetadata()] = type;
            }
        }
    }
}
