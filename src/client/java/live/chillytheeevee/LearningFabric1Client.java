package live.chillytheeevee;

import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import live.chillytheeevee.block.LearningFabric1Blocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class LearningFabric1Client implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.

		// Block Render Layers
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
				LearningFabric1Blocks.EXAMPLE_FLOWER,
				LearningFabric1Blocks.EXAMPLE_FLOWER_POT,
				LearningFabric1Blocks.EXAMPLE_DOOR,
				LearningFabric1Blocks.EXAMPLE_SAPLING,
				LearningFabric1Blocks.EXAMPLE_LEAVES,
				LearningFabric1Blocks.EXAMPLE_TRAPDOOR);

		// Model Layers
		TerraformBoatClientHelper.registerModelLayers(LearningFabric1.id("example_boat"), false);
	}
}