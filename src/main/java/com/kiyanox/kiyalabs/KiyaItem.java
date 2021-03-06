package com.kiyanox.kiyalabs;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class KiyaItem {

	public static Item aldermaniteDust;
	public static Item KiyanumDust;
	public static Item rheniumDust;
	public static Item rutherfordiumDust;
	public static Item dubniumDust;
	public static Item dysprosiumDust;
	public static Item lawrenciumDust;
	public static Item holmiumDust;
	public static Item scandiumDust;
	public static Item gadoliniumDust;
	

    public static final void init() {

    	aldermaniteDust = new Item().setUnlocalizedName("aldermaniteDust").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Kiyalabs_main.MODID + ":aldermaniteDust");
    	GameRegistry.registerItem(aldermaniteDust, "aldermaniteDust");
    	KiyanumDust = new Item().setUnlocalizedName("kiyanumDust").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Kiyalabs_main.MODID + ":kiyanumDust");
    	GameRegistry.registerItem(KiyanumDust, "kiyanumDust");
		rheniumDust = new Item().setUnlocalizedName("rheniumDust").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Kiyalabs_main.MODID + ":rheniumDust");
		GameRegistry.registerItem(rheniumDust, "rheniumDust");
		rutherfordiumDust = new Item().setUnlocalizedName("rutherfordiumDust").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Kiyalabs_main.MODID + ":rutherfordiumDust");
		GameRegistry.registerItem(rutherfordiumDust, "rutherfordiumDust");
		dubniumDust = new Item().setUnlocalizedName("dubniumDust").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Kiyalabs_main.MODID + ":dubniumDust");
		GameRegistry.registerItem(dubniumDust, "dubniumDust");
		dysprosiumDust = new Item().setUnlocalizedName("dysprosiumDust").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Kiyalabs_main.MODID + ":dysprosiumDust");
		GameRegistry.registerItem(dysprosiumDust, "dysprosiumDust");
		lawrenciumDust = new Item().setUnlocalizedName("lawrenciumDust").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Kiyalabs_main.MODID + ":lawrenciumDust");
		GameRegistry.registerItem(lawrenciumDust, "lawrenciumDust");
		holmiumDust = new Item().setUnlocalizedName("holmiumDust").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Kiyalabs_main.MODID + ":holmiumDust");
		GameRegistry.registerItem(holmiumDust, "holmiumDust");
		scandiumDust = new Item().setUnlocalizedName("scandiumDust").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Kiyalabs_main.MODID + ":scandiumDust");
		GameRegistry.registerItem(scandiumDust, "scandiumDust");
		gadoliniumDust = new Item().setUnlocalizedName("gadoliniumDust").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Kiyalabs_main.MODID + ":gadoliniumDust");
		GameRegistry.registerItem(gadoliniumDust, "gadoliniumDust");


    }

}