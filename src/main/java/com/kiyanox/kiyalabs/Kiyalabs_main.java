package com.kiyanox.kiyalabs;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Kiyalabs_main.MODID, version = Kiyalabs_main.VERSION)
public class Kiyalabs_main
{
    public static final String MODID = "kiyalabs";
    public static final String MODNAME = "Kiyalabs";
    public static final String VERSION = "0.0.1";
    
    //############################# PROXY ###############################################
    
    @SidedProxy(clientSide="com.kiyanox.kiyalabs.Client", serverSide="com.kiyanox.kiyalabs.Server")
    public static ProxyInstance proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	    proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
	    proxy.init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	    proxy.postInit(event);
	}
	
	//############################# PROXY ###############################################
}
