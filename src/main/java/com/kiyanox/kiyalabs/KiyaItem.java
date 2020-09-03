package com.kiyanox.kiyalabs;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public final class KiyaItem {
	
	public static Item arsenopyriteDust;
	public static Item aldermaniteDust;
	public static Item Kiyanum;
	public static Item loranditeDust;
	public static Item stibiopalladiniteDust;
	public static Item corundumDust;
	

    public static final void init() {
    	
    	arsenopyriteDust = new Item().setUnlocalizedName("arsenopyriteDust").setCreativeTab(CreativeTabs.tabMisc);
    	GameRegistry.registerItem(arsenopyriteDust, "arsenopyriteDust");
    	aldermaniteDust = new Item().setUnlocalizedName("aldermaniteDust").setCreativeTab(CreativeTabs.tabMisc);
    	GameRegistry.registerItem(aldermaniteDust, "aldermaniteDust");
    	Kiyanum = new Item().setUnlocalizedName("Kiyanum").setCreativeTab(CreativeTabs.tabMisc);
    	GameRegistry.registerItem(Kiyanum, "Kiyanum");
    	loranditeDust = new Item().setUnlocalizedName("loranditeDust").setCreativeTab(CreativeTabs.tabMisc);
    	GameRegistry.registerItem(loranditeDust, "loranditeDust");
    	stibiopalladiniteDust = new Item().setUnlocalizedName("stibiopalladiniteDust").setCreativeTab(CreativeTabs.tabMisc);
    	GameRegistry.registerItem(stibiopalladiniteDust, "stibiopalladiniteDust");
    	corundumDust = new Item().setUnlocalizedName("corundumDust").setCreativeTab(CreativeTabs.tabMisc);
    	GameRegistry.registerItem(corundumDust, "corundumDust");

    }

}