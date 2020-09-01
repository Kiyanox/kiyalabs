package com.kiyanox.kiyalabs ;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Kiyalabs_main.MODID, version = Kiyalabs_main.VERSION)
public class Kiyalabs_main
{
    public static final String MODID = "Kiyalabs";
    public static final String VERSION = "0.0.1";
    
    //Item Publicity
    public static Item arsenopyriteDust;
    //public static Item blockArsen;
    public static Block arsenopyriteOre;
   
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	arsenopyriteDust = new KiyaItem("arsenopyriteDust");
        GameRegistry.registerItem(arsenopyriteDust, "arsenopyriteDust");
        
        //blockArsen = new KiyaItem("blockArsen");
        //GameRegistry.registerItem(blockArsen, "blockArsen");
        
        arsenopyriteOre = new KiyaMaterials(Material.rock, "arsenopyriteOre", arsenopyriteDust);
        GameRegistry.registerBlock(arsenopyriteOre, "arsenopyriteOre");
        
        GameRegistry.registerWorldGenerator(new OreGeneration(arsenopyriteOre, 8), 0);
        
    } 
}
