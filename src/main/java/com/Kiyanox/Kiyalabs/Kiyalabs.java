package com.Kiyanox.Kiyalabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Kiyalabs.MODID, version = Kiyalabs.VERSION)
public class Kiyalabs
{
    public static final String MODID = "Kiyalabs";
    public static final String VERSION = "1.1";
   
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        Item crystallizedbanVilljo = new ModItem("crystallizedbanVilljo");
        GameRegistry.registerItem(crystallizedbanVilljo, "crystallizedbanVilljo");
        
        Item blockVilljo = new ModItem("blockVilljo");
        GameRegistry.registerItem(blockVilljo, "blockVilljo");
        
        Block banvilljoOre = new ModBlock(Material.rock, "banvilljoOre", crystallizedbanVilljo);
        GameRegistry.registerBlock(banvilljoOre, "banvilljoOre");
        
    }
    
    private class ModItem extends Item
    {
        public ModItem(String itemName)
        {
            this.setUnlocalizedName(itemName);
            this.setTextureName(MODID + ":" + itemName);
            this.setCreativeTab(CreativeTabs.tabMisc);
        }

    }
    
    private class ModBlock extends Block
    {
    	
    	private Item toDrop;
    	
    	public ModBlock(Material material, String blockName, Item toDrop)
        {
            super(material);
            this.setBlockName(blockName);
            this.setBlockTextureName(MODID + ":" + blockName);
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
}
