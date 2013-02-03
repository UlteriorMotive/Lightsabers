package ulterior.lightcraft;

import net.minecraft.creativetab.CreativeTabs;
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
import cpw.mods.fml.common.registry.GameRegistry;
import ulterior.lightcraft.items.ModItems;
import ulterior.lightcraft.lib.References;
import ulterior.lightcraft.block.ModBlocks;
import ulterior.lightcraft.core.*;

@Mod(modid="Lightcraft", name="Lightcraft", version="Super Beta Mode")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class Lightcraft {

        @Instance("Lightcraft")
        public static Lightcraft instance;
   
        @SidedProxy(clientSide = References.CLTPROXY , serverSide = References.COMPROXY)
        public static CommonProxy proxy;
        
        public static CreativeTabs lightTab = new LightCreativeTab("lightTab");
        
        @PreInit
        public void preInit(FMLPreInitializationEvent event) {
        	
        }
        
        @Init
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
                ModItems.init();
                ModBlocks.init();
                
                GameRegistry.registerWorldGenerator(new LightWorldGenerator());
        }
        
        @PostInit
        public void postInit(FMLPostInitializationEvent event) {
        	
        }
}