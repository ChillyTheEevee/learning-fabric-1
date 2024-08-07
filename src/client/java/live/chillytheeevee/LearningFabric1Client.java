package live.chillytheeevee;

import live.chillytheeevee.block.LearningFabric1Blocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class LearningFabric1Client implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), LearningFabric1Blocks.EXAMPLE_FLOWER,
				LearningFabric1Blocks.EXAMPLE_FLOWER_POT);
	}
}