package net.mackdoodler.allergies.client;

import net.mackdoodler.allergies.AllergyMod;
import net.mackdoodler.allergies.IProxy;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy implements IProxy{

	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(AllergyMod.MODID + ":" + id, "inventory"));
	}
	
    public void preInit(FMLPreInitializationEvent e) {
    }
	
    public void init(FMLInitializationEvent e) {
    }
	
    public void postInit(FMLPostInitializationEvent e) {
    }
}
