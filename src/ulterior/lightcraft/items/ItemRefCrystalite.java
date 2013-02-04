package ulterior.lightcraft.items;

import ulterior.lightcraft.Lightcraft;
import net.minecraft.creativetab.CreativeTabs;

public class ItemRefCrystalite extends ItemLight {
	
	public ItemRefCrystalite(int id, int y) {
		super(id);
		this.setItemName("refCrystalite");
		this.setIconCoord(1, y);
		this.setCreativeTab(Lightcraft.lightTab);
	}
	
}
