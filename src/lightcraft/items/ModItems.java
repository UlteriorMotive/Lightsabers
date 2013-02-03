package ulterior.lightcraft.items;

import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModItems {
	
	public static Item rawCrystalite;
	public static Item refCrystalite;
	public static Item powCrystalite;
	public static Item lightCrystal;
	public static Item lightSwordHilt;
	public static Item hilt;
	public static Item softLightSword;
	
	public static void init() {
	
		rawCrystalite = new ItemRawCrystalite(28000);
		refCrystalite = new ItemRefCrystalite(28001);
		powCrystalite = new ItemPowCrytsalite(28002);
		lightCrystal = new ItemLightCrystal(28003);
		lightSwordHilt = new ItemLSHilt(28017);
		softLightSword = new ItemLightSword(28032, SoftLight);
		hilt = new ItemHilt(28016);
		
		LanguageRegistry.addName(rawCrystalite, "Raw Crytsalite");
		LanguageRegistry.addName(refCrystalite, "Crytsalite");
		LanguageRegistry.addName(hilt, "Hilt");
		LanguageRegistry.addName(powCrystalite, "Power Crystal");
		LanguageRegistry.addName(lightCrystal, "Light Crystal");
		LanguageRegistry.addName(lightSwordHilt, "Dead Light Sword");
		LanguageRegistry.addName(softLightSword, "LightSword");
		
		GameRegistry.addRecipe(new ItemStack(hilt), "i ", "w ", 'i', Item.ingotIron, 'w', Block.cloth);
		GameRegistry.addShapelessRecipe(new ItemStack(powCrystalite), refCrystalite, Item.redstone);
		GameRegistry.addShapelessRecipe(new ItemStack(lightCrystal), refCrystalite, Item.lightStoneDust);
		GameRegistry.addRecipe(new ItemStack(lightSwordHilt), "l", "h", 'l', lightCrystal, 'h', hilt);
		GameRegistry.addShapelessRecipe(new ItemStack(softLightSword), lightSwordHilt, powCrystalite);
		GameRegistry.addSmelting(rawCrystalite.itemID, new ItemStack(refCrystalite), 0.7f);
	}

	public static EnumToolMaterial SoftLight = EnumHelper.addToolMaterial("SoftLight", 1, 262, 4.0F, 3, 0);
	public static EnumToolMaterial HardLight = EnumHelper.addToolMaterial("HardLight", 2, 500, 6.0F, 4, 0);
	public static EnumToolMaterial MythicLight = EnumHelper.addToolMaterial("MythicLight", 3, 1500, 8.0F, 5, 0);
	public static EnumToolMaterial AdamantLight = EnumHelper.addToolMaterial("AdamantLight", 3, 3000, 10.0F, 6, 0);

}
