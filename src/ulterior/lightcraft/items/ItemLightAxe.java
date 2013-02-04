package ulterior.lightcraft.items;

import ulterior.lightcraft.Lightcraft;
import ulterior.lightcraft.core.CommonProxy;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;

public class ItemLightAxe extends ItemAxe {

	public ItemLightAxe(int id, EnumToolMaterial mat, int x, int y) {
		super(id, mat);
		this.setIconCoord(x, y);
		this.setCreativeTab(Lightcraft.lightTab);
		this.setTextureFile(CommonProxy.ITEMS_PNG);
	}
	
	public String getTextureFile() {
        return CommonProxy.ITEMS_PNG;
	}

}
