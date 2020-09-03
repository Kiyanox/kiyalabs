package com.kiyanox.kiyalabs;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class KiyaMaterials extends Block {
	
	private Item toDrop;

	protected KiyaMaterials(String unlocalizedName, Material material) {
		super(material);
		this.setBlockName(unlocalizedName);
		this.setBlockTextureName(Kiyalabs_main.MODID + ":" + unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(4.0F);
        this.setStepSound(soundTypeStone);
        this.setHarvestLevel("pickaxe", 3);
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
