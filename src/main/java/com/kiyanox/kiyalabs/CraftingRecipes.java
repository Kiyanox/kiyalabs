package com.kiyanox.kiyalabs;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class CraftingRecipes {

    public static final void init(){
        GameRegistry.addRecipe(new ItemStack(KiyalabsBlock.BlockKiyanum), new Object[] {"###", " ### ", "### ", '#', KiyaItem.Kiyanum,});
    }


}
