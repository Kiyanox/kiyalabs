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
    public static final String VERSION = "1.1";
   
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        Item crystallizedbanVilljo = new KiyaItem("crystallizedbanVilljo");
        GameRegistry.registerItem(crystallizedbanVilljo, "crystallizedbanVilljo");
        
        Item blockVilljo = new KiyaItem("blockVilljo");
        GameRegistry.registerItem(blockVilljo, "blockVilljo");
        
        Block banvilljoOre = new KiyaMaterials(Material.rock, "banvilljoOre", crystallizedbanVilljo);
        GameRegistry.registerBlock(banvilljoOre, "banvilljoOre");
        
    } 
}
