package com.Chaosfox13.ModTest;

import com.Chaosfox13.ModTest.handler.ConfigurationHandler;
import com.Chaosfox13.ModTest.proxy.IProxy;
import com.Chaosfox13.ModTest.reference.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory=Reference.GUI_FACTORY_CLASS)
public class ModTest 
{
	@Mod.Instance(Reference.MOD_ID)
	public static ModTest instance;
	@SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS, modId= "ModTest")
	public static IProxy proxy;
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
	}
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{
		
	}
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
}
