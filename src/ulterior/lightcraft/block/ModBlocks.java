package ulterior.lightcraft.block;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;


public class ModBlocks {
	
	public static Block oreCrystalite;
	
	public static void init() {
		oreCrystalite = new BlockCrystaliteOre(580, 0, Material.iron).setHardness(3.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep);
		LanguageRegistry.addName(oreCrystalite, "Crystalite Ore");
		GameRegistry.registerBlock(oreCrystalite, "oreCrystalite");
		MinecraftForge.setBlockHarvestLevel(oreCrystalite, "pickaxe", 2);
	}

}
