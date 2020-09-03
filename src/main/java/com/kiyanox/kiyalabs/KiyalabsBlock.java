package com.kiyanox.kiyalabs;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class KiyalabsBlock {
	
	public static Block arsenopyriteOre;
	public static Block aldermaniteOre;
	public static Block KiyanumOre;
	public static Block loranditeOre;
	public static Block stibiopalladiniteOre;
	public static Block corundumOre;

	    public static final void init() {
	    	
			GameRegistry.registerBlock(arsenopyriteOre = new KiyaMaterials("arsenopyriteOre", Material.rock), "arsenopyriteOre");
			GameRegistry.registerBlock(aldermaniteOre = new KiyaMaterials("aldermaniteOre", Material.rock), "aldermaniteOre");
			GameRegistry.registerBlock(KiyanumOre = new KiyaMaterials("KiyanumOre", Material.rock), "KiyanumOre");
			GameRegistry.registerBlock(loranditeOre = new KiyaMaterials("loranditeOre", Material.rock), "loranditeOre");
			GameRegistry.registerBlock(stibiopalladiniteOre = new KiyaMaterials("stibiopalladiniteOre", Material.rock), "stibiopalladiniteOre");
			GameRegistry.registerBlock(corundumOre = new KiyaMaterials("corundumOre", Material.rock), "corundumOre");
	    }
}
