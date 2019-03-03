package net.mackdoodler.allergies;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = AllergyMod.MODID, name =AllergyMod.MODNAME, version = AllergyMod.VERSION, acceptedMinecraftVersions = "[1.12.2]")
public class AllergyMod {
	/* 
	 * allergy mod ideas TODO:
	 * 
	 * storing a map of items to enums of a given allergy effect
	 * 
	 * effects:
	 * nothing
	 * instant death
	 * 
	 */
	
	public static final String MODID = "allergies";
	public static final String MODNAME = "Allergies";
	public static final String VERSION = "1.0.0";
	
	@Mod.Instance(MODID)
	public static AllergyMod instance;
	
	@SidedProxy(clientSide = "net.mackdoodler.allergies.client.ClientProxy", serverSide = "net.mackdoodler.allergies.common.CommonProxy")
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(MODNAME + " is loading!");
		proxy.preInit(event);
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
}
