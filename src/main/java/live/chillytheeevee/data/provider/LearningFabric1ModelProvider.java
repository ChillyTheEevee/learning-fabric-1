package live.chillytheeevee.data.provider;

import live.chillytheeevee.block.LearningFabric1Blocks;
import live.chillytheeevee.item.LearningFabric1Items;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class LearningFabric1ModelProvider extends FabricModelProvider {

    public LearningFabric1ModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(LearningFabric1Blocks.EXAMPLE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(LearningFabric1Blocks.EXAMPLE_OVERWORLD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(LearningFabric1Blocks.EXAMPLE_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(LearningFabric1Blocks.EXAMPLE_NETHER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(LearningFabric1Blocks.EXAMPLE_END_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(LearningFabric1Items.EXAMPLE_ITEM, Models.GENERATED);
        itemModelGenerator.register(LearningFabric1Items.EXAMPLE_RAW_ITEM, Models.GENERATED);
        itemModelGenerator.register(LearningFabric1Items.EXAMPLE_FOOD, Models.GENERATED);
        itemModelGenerator.register(LearningFabric1Items.EXAMPLE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(LearningFabric1Items.EXAMPLE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(LearningFabric1Items.EXAMPLE_AXE, Models.HANDHELD);
        itemModelGenerator.register(LearningFabric1Items.EXAMPLE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(LearningFabric1Items.EXAMPLE_HOE, Models.HANDHELD);
    }
}
