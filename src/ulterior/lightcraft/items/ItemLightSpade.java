package ulterior.lightcraft.items;

import ulterior.lightcraft.Lightcraft;
import ulterior.lightcraft.core.CommonProxy;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;

public class ItemLightSpade extends ItemSpade {

	public ItemLightSpade(int id, EnumToolMaterial mat, int x, int y) {
		super(id, mat);
		this.setIconCoord(x, y);
		this.setCreativeTab(Lightcraft.lightTab);
		this.setTextureFile(CommonProxy.ITEMS_PNG);
	}
	
	public String getTextureFile() {
        return CommonProxy.ITEMS_PNG;
	}

}
