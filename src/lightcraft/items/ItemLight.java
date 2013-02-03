package ulterior.lightcraft.items;

import net.minecraft.item.Item;
import ulterior.lightcraft.core.CommonProxy;

public class ItemLight extends Item {

	public ItemLight(int id) {
		super(id);
		maxStackSize = 64;
		setTextureFile(CommonProxy.ITEMS_PNG);
	}
	
	public String getTextureFile() {
        return CommonProxy.ITEMS_PNG;
	}
	
}
