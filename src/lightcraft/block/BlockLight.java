package ulterior.lightcraft.block;

import ulterior.lightcraft.core.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLight extends Block {

	public BlockLight(int id, int texture, Material material) {
		super(id, texture, material);
	}
	
	@Override
    public String getTextureFile () {
            return CommonProxy.BLOCK_PNG;
    }
	

}
