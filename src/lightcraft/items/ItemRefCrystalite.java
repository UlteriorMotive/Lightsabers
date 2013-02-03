package ulterior.lightcraft.items;

import ulterior.lightcraft.Lightcraft;
import net.minecraft.creativetab.CreativeTabs;

public class ItemRefCrystalite extends ItemLight {
	
	public ItemRefCrystalite(int id) {
		super(id);
		this.setItemName("refCrystalite");
		this.setIconCoord(1, 0);
		this.setCreativeTab(Lightcraft.lightTab);
	}
	
}
