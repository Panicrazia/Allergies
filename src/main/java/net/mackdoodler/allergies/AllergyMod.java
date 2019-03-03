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
	 * placeable drugged meat that carnivores and zombies path to and eat (means a new ai for  eligible mobs)
	 * 
	 * drowsy potion effect which continuously applies more tranquilizers up to like 20 or some shit i dunno
	 * 
	 * tranquilizer arrows (5 tranq per?)
	 * 
	 * item which places down a vegitized slime, crafted with 4 slimeballs in a square
	 * 	^possibly a custom entityItem for these which when put into the world destroys itself and spawns a vegitized slime
	 *  ^slimes spawned with this item dont despawn
	 * 
	 * large slimes leave behind a slime residue (basically the thinnest snow layer but slimey) that slows and can be shovelled for a slimeball, or knocked away into slimeballs using water
	 *  ^might be out of scope for the mod
	 * 
	 * add config for maximum tranquilizer strength (atm it is assumed to be 50)
	 * 
	 * make lunar lillies only bloom at night, plus give them a better model
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
