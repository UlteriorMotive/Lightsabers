package ulterior.lightcraft.core;

import net.minecraftforge.client.MinecraftForgeClient;
import ulterior.lightcraft.core.CommonProxy;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenderers() {
		MinecraftForgeClient.preloadTexture(ITEMS_PNG);
        MinecraftForgeClient.preloadTexture(BLOCK_PNG);
	}
	
}
