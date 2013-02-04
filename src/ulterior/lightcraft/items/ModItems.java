package ulterior.lightcraft.items;

import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import ulterior.lightcraft.lib.References;

public class ModItems {
	
	public static Item rawCrystalite;
	public static Item refCrystalite;
	public static Item powCrystalite;
	public static Item lightCrystal;
	public static Item lightHilt;
	public static Item hilt;
	public static Item softLightSword;
	public static Item softLightPick;
	public static Item focus;
	public static Item softLightSpade;
	public static Item softLightAxe;
	public static Item softLightHoe;
	public static Item hardLightCrystal;
	public static Item hardCrystalite;
	public static Item hardLightSword;
	public static Item hardLightPick;
	public static Item hardLightSpade;
	public static Item hardLightAxe;
	public static Item hardLightHoe;
	
	public static void init() {
	
		rawCrystalite = new ItemRawCrystalite(References.rawCrysID);
		refCrystalite = new ItemRefCrystalite(References.refCrysID, 0);
		hardCrystalite = new ItemRefCrystalite(References.hardCrysID, 1).setItemName("hardCrystalite");
		powCrystalite = new ItemPowCrytsalite(References.powCrysID);
		lightCrystal = new ItemLightCrystal(References.lightCrysID, 0);
		hardLightCrystal = new ItemLightCrystal(References.hardLightCrysID, 1).setItemName("hardLightCrystal");
		focus = new ItemFocus(References.focusID);
		lightHilt = new ItemLSHilt(References.hiltID + 1);
		softLightSword = new ItemLightSword(References.lightSwordID, SoftLight, 5, 0).setItemName("softLightSword");
		softLightPick = new ItemLightPick(References.lightPickID, SoftLight, 8, 0).setItemName("softLightPick");
		softLightSpade = new ItemLightSpade(References.lightSpadeID, SoftLight, 9, 0).setItemName("softLightSpade");
		softLightAxe = new ItemLightAxe(References.lightAxeID, SoftLight, 10, 0).setItemName("softLightAxe");
		softLightHoe = new ItemLightHoe(References.lightHoeID, SoftLight, 11, 0).setItemName("softLightHoe");
		hardLightSword = new ItemLightSword(References.lightSwordID + 1, HardLight, 5, 1).setItemName("hardLightSword");
		hardLightPick = new ItemLightPick(References.lightPickID + 1, HardLight, 8, 1).setItemName("hardLightPick");
		hardLightSpade = new ItemLightSpade(References.lightSpadeID + 1, HardLight, 9, 1).setItemName("hardLightSpade");
		hardLightAxe = new ItemLightAxe(References.lightAxeID + 1, HardLight, 10, 1).setItemName("hardLightAxe");
		hardLightHoe = new ItemLightHoe(References.lightHoeID + 1, HardLight, 11, 1).setItemName("hardLightHoe");
		hilt = new ItemHilt(References.hiltID);
		
		LanguageRegistry.addName(rawCrystalite, "Raw Crytsalite");
		LanguageRegistry.addName(refCrystalite, "Crytsalite");
		LanguageRegistry.addName(hardCrystalite, "Hardened Crystalite");
		LanguageRegistry.addName(focus, "Focus");
		LanguageRegistry.addName(hilt, "Hilt");
		LanguageRegistry.addName(powCrystalite, "Power Crystal");
		LanguageRegistry.addName(hardLightCrystal, "Hardlight Crystal");
		LanguageRegistry.addName(lightCrystal, "Light Crystal");
		LanguageRegistry.addName(lightHilt, "Powered Hilt");
		LanguageRegistry.addName(softLightSword, "Light Sword");
		LanguageRegistry.addName(softLightPick, "Light Pickaxe");
		LanguageRegistry.addName(softLightSpade, "Light Shovel");
		LanguageRegistry.addName(softLightAxe, "Light Axe");
		LanguageRegistry.addName(softLightHoe, "Light Hoe");
		LanguageRegistry.addName(hardLightSword, "Hardlight Sword");
		LanguageRegistry.addName(hardLightPick, "Hardlight Pickaxe");
		LanguageRegistry.addName(hardLightSpade, "Hardlight Shovel");
		LanguageRegistry.addName(hardLightAxe, "Hardlight Axe");
		LanguageRegistry.addName(hardLightHoe, "Hardlight Hoe");
		
		GameRegistry.addRecipe(new ItemStack(hilt), "i ", "w ", 'i', Item.ingotIron, 'w', Block.cloth);
		GameRegistry.addShapelessRecipe(new ItemStack(powCrystalite), refCrystalite, Item.redstone);
		GameRegistry.addRecipe(new ItemStack(hardCrystalite), " i ", "ici", " i ", 'i', Item.ingotIron, 'c', refCrystalite);
		GameRegistry.addShapelessRecipe(new ItemStack(hardLightCrystal), hardCrystalite, Item.lightStoneDust);
		GameRegistry.addShapelessRecipe(new ItemStack(lightCrystal), refCrystalite, Item.lightStoneDust);
		GameRegistry.addRecipe(new ItemStack(lightHilt), "h", "p", 'p', powCrystalite, 'h', hilt);
		GameRegistry.addRecipe(new ItemStack(softLightSword), " f ", " l ", " h ", 'f', focus, 'l', lightCrystal, 'h', lightHilt);
		GameRegistry.addShapelessRecipe(new ItemStack(focus), refCrystalite, Block.glass);
		GameRegistry.addRecipe(new ItemStack(softLightPick), "flf", " h ", 'f', focus, 'l', lightCrystal, 'h', lightHilt);
		GameRegistry.addRecipe(new ItemStack(softLightSpade), "f f", " l ", " h ", 'f', focus, 'l', lightCrystal, 'h', lightHilt);
		GameRegistry.addRecipe(new ItemStack(softLightAxe), "fl ", "fh ", 'f', focus, 'l', lightCrystal, 'h', lightHilt);
		GameRegistry.addRecipe(new ItemStack(softLightHoe), "fl ", " h ", 'f', focus, 'l', lightCrystal, 'h', lightHilt);
		GameRegistry.addRecipe(new ItemStack(hardLightSword), " f ", " l ", " h ", 'f', focus, 'l', hardLightCrystal, 'h', lightHilt);
		GameRegistry.addRecipe(new ItemStack(hardLightPick), "flf", " h ", 'f', focus, 'l', hardLightCrystal, 'h', lightHilt);
		GameRegistry.addRecipe(new ItemStack(hardLightAxe), "fl ", "fh ", 'f', focus, 'l', hardLightCrystal, 'h', lightHilt);
		GameRegistry.addRecipe(new ItemStack(hardLightHoe), "fl ", " h ", 'f', focus, 'l', hardLightCrystal, 'h', lightHilt);
		
		
		GameRegistry.addSmelting(rawCrystalite.itemID, new ItemStack(refCrystalite), 0.7f);
	}

	public static EnumToolMaterial SoftLight = EnumHelper.addToolMaterial("SoftLight", 1, 262, 4.0F, 3, 0);
	public static EnumToolMaterial HardLight = EnumHelper.addToolMaterial("HardLight", 2, 500, 6.0F, 4, 0);
	public static EnumToolMaterial MythicLight = EnumHelper.addToolMaterial("MythicLight", 3, 1500, 8.0F, 5, 0);
	public static EnumToolMaterial AdamantLight = EnumHelper.addToolMaterial("AdamantLight", 3, 3000, 10.0F, 6, 0);

}
