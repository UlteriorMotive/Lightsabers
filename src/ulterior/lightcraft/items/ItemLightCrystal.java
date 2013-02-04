package ulterior.lightcraft.items;

import ulterior.lightcraft.Lightcraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemLightCrystal extends ItemLight {

	public ItemLightCrystal(int id, int y) {
		super(id);
		this.setItemName("lightCrystal");
		this.setIconCoord(4, y);
		this.setCreativeTab(Lightcraft.lightTab);
	}

}
