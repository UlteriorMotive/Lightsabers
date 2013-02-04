package ulterior.lightcraft.block;

import java.util.Random;

import ulterior.lightcraft.Lightcraft;
import ulterior.lightcraft.core.LightCreativeTab;

import net.minecraft.block.material.Material;

public class BlockCrystaliteOre extends BlockLight {

	public BlockCrystaliteOre(int id, int texture, Material material) {
		super(id, texture, material);
		this.setCreativeTab(Lightcraft.lightTab);
	}
	
	public int idDropped(int par1, Random random, int par2) {
		return ulterior.lightcraft.items.ModItems.rawCrystalite.itemID;
	}
	
}
