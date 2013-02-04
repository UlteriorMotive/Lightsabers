package ulterior.lightcraft.items;

import ulterior.lightcraft.Lightcraft;
import ulterior.lightcraft.core.CommonProxy;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemLightSword extends ItemSword {
	
	public ItemLightSword(int id, EnumToolMaterial mat, int x, int y) {
		super(id, mat);
		this.setIconCoord(x, y);
		this.setCreativeTab(Lightcraft.lightTab);
		this.setTextureFile(CommonProxy.ITEMS_PNG);
	}
	
	public String getTextureFile() {
        return CommonProxy.ITEMS_PNG;
	}
}
