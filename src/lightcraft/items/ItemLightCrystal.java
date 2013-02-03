package ulterior.lightcraft.items;

import ulterior.lightcraft.Lightcraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemLightCrystal extends ItemLight {

	public ItemLightCrystal(int id) {
		super(id);
		this.setItemName("lightCrystal");
		this.setIconCoord(4, 0);
		this.setCreativeTab(Lightcraft.lightTab);
	}

}
