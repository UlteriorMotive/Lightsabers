package ulterior.lightcraft.items;

import ulterior.lightcraft.Lightcraft;
import net.minecraft.creativetab.CreativeTabs;

public class ItemHilt extends ItemLight {
	
	public ItemHilt(int id) {
		super(id);
		this.setItemName("hilt");
		this.setIconCoord(2, 0);
		this.setCreativeTab(Lightcraft.lightTab);
	}
	
}
