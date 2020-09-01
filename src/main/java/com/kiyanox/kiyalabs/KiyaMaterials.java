package com.kiyanox.kiyalabs;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class KiyaMaterials extends Block
{
	
	private Item toDrop;
	
	public KiyaMaterials(Material material, String blockName, Item toDrop)
    {
        super(material);
        this.setBlockName(blockName);
        this.setBlockTextureName(Kiyalabs_main.MODID + ":" + blockName);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(4.0F);
        this.setStepSound(soundTypeStone);
        this.setHarvestLevel("pickaxe", 1);
        this.toDrop = toDrop;
    }
    
    @Override
    public Item getItemDropped(int i, Random random, int j)
    {
        if(toDrop != null)
        {
            return toDrop;
        }
        else return Item.getItemFromBlock(this);
    }        
}
