package ulterior.lightcraft.items;

import ulterior.lightcraft.Lightcraft;

public class ItemFocus extends ItemLight {

	public ItemFocus(int id) {
		super(id);
		this.setItemName("focus");
		this.setIconCoord(7, 0);
		this.setCreativeTab(Lightcraft.lightTab);
	}

}
