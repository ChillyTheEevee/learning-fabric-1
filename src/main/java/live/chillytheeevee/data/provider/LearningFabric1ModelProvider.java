package live.chillytheeevee.data.provider;

import live.chillytheeevee.block.LearningFabric1Blocks;
import live.chillytheeevee.item.LearningFabric1Items;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.family.BlockFamily;

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
        blockStateModelGenerator.registerFlowerPotPlant(LearningFabric1Blocks.EXAMPLE_FLOWER,
                LearningFabric1Blocks.EXAMPLE_FLOWER_POT, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerLog(LearningFabric1Blocks.EXAMPLE_LOG)
                .log(LearningFabric1Blocks.EXAMPLE_LOG)
                .wood(LearningFabric1Blocks.EXAMPLE_WOOD);

        blockStateModelGenerator.registerLog(LearningFabric1Blocks.EXAMPLE_STRIPPED_LOG)
                .log(LearningFabric1Blocks.EXAMPLE_STRIPPED_LOG)
                .wood(LearningFabric1Blocks.EXAMPLE_STRIPPED_WOOD);

        blockStateModelGenerator.registerSimpleCubeAll(LearningFabric1Blocks.EXAMPLE_LEAVES);
        blockStateModelGenerator.registerTintableCross(LearningFabric1Blocks.EXAMPLE_SAPLING,
                BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerHangingSign(LearningFabric1Blocks.EXAMPLE_STRIPPED_LOG,
                LearningFabric1Blocks.EXAMPLE_HANGING_SIGN,
                LearningFabric1Blocks.EXAMPLE_WALL_HANGING_SIGN);
        var exampleFamily = new BlockFamily.Builder(LearningFabric1Blocks.EXAMPLE_PLANKS)
                .button(LearningFabric1Blocks.EXAMPLE_BUTTON)
                .fence(LearningFabric1Blocks.EXAMPLE_FENCE)
                .fenceGate(LearningFabric1Blocks.EXAMPLE_FENCE_GATE)
                .pressurePlate(LearningFabric1Blocks.EXAMPLE_PRESSURE_PLATE)
                .sign(LearningFabric1Blocks.EXAMPLE_SIGN, LearningFabric1Blocks.EXAMPLE_WALL_SIGN)
                .slab(LearningFabric1Blocks.EXAMPLE_SLAB)
                .stairs(LearningFabric1Blocks.EXAMPLE_STAIRS)
                .door(LearningFabric1Blocks.EXAMPLE_DOOR)
                .trapdoor(LearningFabric1Blocks.EXAMPLE_TRAPDOOR)
                .group("wooden")
                .unlockCriterionName("has_planks")
                .build();
        blockStateModelGenerator.registerCubeAllModelTexturePool(exampleFamily.getBaseBlock())
                .family(exampleFamily);
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
        itemModelGenerator.register(LearningFabric1Items.EXAMPLE_HELMET, Models.GENERATED);
        itemModelGenerator.register(LearningFabric1Items.EXAMPLE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(LearningFabric1Items.EXAMPLE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(LearningFabric1Items.EXAMPLE_BOOTS, Models.GENERATED);
        itemModelGenerator.register(LearningFabric1Items.EXAMPLE_BOAT, Models.GENERATED);
        itemModelGenerator.register(LearningFabric1Items.EXAMPLE_CHEST_BOAT, Models.GENERATED);
    }
}
