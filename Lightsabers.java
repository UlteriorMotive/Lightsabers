package ulterior.lightsabers;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="Lightsabers", name="Lightsabers", version="Super Beta Mode")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class Lightsabers {

	@Instance("Lightsabers")
	public static Lightsabers instance;
	
	@SidedProxy(clientSide="ulterior.lightsabers.client.ClientProxy", serverSide="ulterior.lightsabers.CommonProxy")
	public static CommonProxy proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event){
	
	}
	
	@Init
	public void load(FMLInitializationEvent event){
		
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
