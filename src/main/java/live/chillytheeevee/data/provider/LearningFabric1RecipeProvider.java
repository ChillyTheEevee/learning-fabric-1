package live.chillytheeevee.data.provider;

import live.chillytheeevee.block.LearningFabric1Blocks;
import live.chillytheeevee.item.LearningFabric1Items;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class LearningFabric1RecipeProvider extends FabricRecipeProvider {

    public LearningFabric1RecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, LearningFabric1Blocks.EXAMPLE_BLOCK)
                .input('E', LearningFabric1Items.EXAMPLE_ITEM)
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .criterion(hasItem(LearningFabric1Items.EXAMPLE_ITEM), conditionsFromItem(LearningFabric1Items.EXAMPLE_ITEM))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, LearningFabric1Items.EXAMPLE_ITEM, 9)
                .input(LearningFabric1Blocks.EXAMPLE_BLOCK)
                .criterion(hasItem(LearningFabric1Blocks.EXAMPLE_BLOCK), conditionsFromItem(LearningFabric1Blocks.EXAMPLE_BLOCK))
                .offerTo(exporter);

        List<ItemConvertible> exampleOres = List.of(LearningFabric1Blocks.EXAMPLE_OVERWORLD_ORE,
                LearningFabric1Blocks.EXAMPLE_DEEPSLATE_ORE, LearningFabric1Blocks.EXAMPLE_NETHER_ORE,
                LearningFabric1Blocks.EXAMPLE_END_ORE);

        offerBlasting(exporter,
                exampleOres,
                RecipeCategory.MISC,
                LearningFabric1Items.EXAMPLE_ITEM,
                0.2f,
                100,
                "example");

        offerSmelting(exporter,
                exampleOres,
                RecipeCategory.MISC,
                LearningFabric1Items.EXAMPLE_ITEM,
                0.2f,
                200,
                "example");
    }
}
