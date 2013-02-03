package ulterior.lightcraft.items;

import ulterior.lightcraft.Lightcraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemPowCrytsalite extends ItemLight {

	public ItemPowCrytsalite(int id) {
		super(id);
		this.setItemName("powCrystalite");
		this.setIconCoord(3, 0);
		this.setCreativeTab(Lightcraft.lightTab);
	}

}
