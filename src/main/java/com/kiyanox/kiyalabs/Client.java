package com.kiyanox.kiyalabs;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class Client extends ProxyInstance {

    @Override
    public void preInit(FMLPreInitializationEvent event) {
    	KiyaItem.init();
    	KiyalabsBlock.init();
    	CraftingRecipes.init();
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }

}