package com.Kiyanox.Kiyalabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Kiyalabs.MODID, version = Kiyalabs.VERSION)
public class Kiyalabs
{
    public static final String MODID = "Kiyalabs";
    public static final String VERSION = "0.0.1";
    
    //Item Publicity
    public static Item dustArsenopyrite;
    public static Item blockArsen;
    public static Block arsenopyriteOre;
   
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	dustArsenopyrite = new KiyaItem("dustArsenopyrite");
        GameRegistry.registerItem(dustArsenopyrite, "dustArsenopyrite");
        
        blockArsen = new KiyaItem("blockArsen");
        GameRegistry.registerItem(blockArsen, "blockArsen");
        
        arsenopyriteOre = new KiyaMaterials(Material.rock, "arsenopyriteOre", dustArsenopyrite);
        GameRegistry.registerBlock(arsenopyriteOre, "arsenopyriteOre");
        
    } 
}
