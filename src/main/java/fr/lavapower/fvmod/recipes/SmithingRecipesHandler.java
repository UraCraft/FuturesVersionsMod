package fr.lavapower.fvmod.recipes;

import fr.lavapower.fvmod.items.FVItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;

public class SmithingRecipesHandler
{
    public final ArrayList<SmithingRecipe> recipes = new ArrayList<>();

    public SmithingRecipesHandler() {
        recipes.add(new SmithingRecipe(new ItemStack(Items.DIAMOND_HELMET), new ItemStack(FVItems.NETHERITE_INGOT), new ItemStack(FVItems.NETHERITE_HELMET)));
        recipes.add(new SmithingRecipe(new ItemStack(Items.DIAMOND_CHESTPLATE), new ItemStack(FVItems.NETHERITE_INGOT), new ItemStack(FVItems.NETHERITE_CHESTPLATE)));
        recipes.add(new SmithingRecipe(new ItemStack(Items.DIAMOND_LEGGINGS), new ItemStack(FVItems.NETHERITE_INGOT), new ItemStack(FVItems.NETHERITE_LEGGINGS)));
        recipes.add(new SmithingRecipe(new ItemStack(Items.DIAMOND_BOOTS), new ItemStack(FVItems.NETHERITE_INGOT), new ItemStack(FVItems.NETHERITE_BOOTS)));
        recipes.add(new SmithingRecipe(new ItemStack(Items.DIAMOND_SWORD), new ItemStack(FVItems.NETHERITE_INGOT), new ItemStack(FVItems.NETHERITE_SWORD)));
        recipes.add(new SmithingRecipe(new ItemStack(Items.DIAMOND_PICKAXE), new ItemStack(FVItems.NETHERITE_INGOT), new ItemStack(FVItems.NETHERITE_PICKAXE)));
        recipes.add(new SmithingRecipe(new ItemStack(Items.DIAMOND_AXE), new ItemStack(FVItems.NETHERITE_INGOT), new ItemStack(FVItems.NETHERITE_AXE)));
        recipes.add(new SmithingRecipe(new ItemStack(Items.DIAMOND_SHOVEL), new ItemStack(FVItems.NETHERITE_INGOT), new ItemStack(FVItems.NETHERITE_SHOVEL)));
        recipes.add(new SmithingRecipe(new ItemStack(Items.DIAMOND_HOE), new ItemStack(FVItems.NETHERITE_INGOT), new ItemStack(FVItems.NETHERITE_HOE)));
    }

    public SmithingRecipe getRecipe(ItemStack item1, ItemStack item2 ) {
        for(SmithingRecipe recipe: recipes) {
            if(recipe.canBeUsed(item1, item2))
                return recipe;
        }
        return null;
    }
}
