package ulterior.lightcraft.core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import ulterior.lightcraft.items.ModItems;

public class LightCreativeTab extends CreativeTabs {

	public LightCreativeTab(String label) {
		super(label);
	}
	
	@Override
	public ItemStack getIconItemStack() {
		return new ItemStack(ModItems.hilt);
	}
	
}
