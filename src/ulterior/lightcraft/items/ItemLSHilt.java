package ulterior.lightcraft.items;

import ulterior.lightcraft.Lightcraft;
import ulterior.lightcraft.core.LightToolMaterial;

public class ItemLSHilt extends ItemLight {

	public ItemLSHilt(int id) {
		super(id);
		this.setItemName("lightSwordHilt");
		this.setIconCoord(6, 0);
		this.setCreativeTab(Lightcraft.lightTab);
	}

}
