package live.chillytheeevee.data.provider;

import live.chillytheeevee.block.LearningFabric1Blocks;
import live.chillytheeevee.item.LearningFabric1Items;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class LearningFabric1RecipeProvider extends FabricRecipeProvider {

    public LearningFabric1RecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        generateShapelessRecipes(exporter);
        generateShapedRecipes(exporter);
        generateFurnaceRecipes(exporter);
        generateBlaseFurnaceRecipes(exporter);
    }

    private void generateShapedRecipes(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, LearningFabric1Items.EXAMPLE_SWORD)
                .input('E', LearningFabric1Items.EXAMPLE_ITEM)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("E")
                .pattern("E")
                .pattern("S")
                .criterion(hasItem(LearningFabric1Items.EXAMPLE_ITEM), conditionsFromItem(LearningFabric1Items.EXAMPLE_ITEM))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, LearningFabric1Items.EXAMPLE_PICKAXE)
                .input('E', LearningFabric1Items.EXAMPLE_ITEM)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("EEE")
                .pattern(" S ")
                .pattern(" S ")
                .criterion(hasItem(LearningFabric1Items.EXAMPLE_ITEM), conditionsFromItem(LearningFabric1Items.EXAMPLE_ITEM))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, LearningFabric1Items.EXAMPLE_AXE)
                .input('E', LearningFabric1Items.EXAMPLE_ITEM)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("EE")
                .pattern("ES")
                .pattern(" S")
                .criterion(hasItem(LearningFabric1Items.EXAMPLE_ITEM), conditionsFromItem(LearningFabric1Items.EXAMPLE_ITEM))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, LearningFabric1Items.EXAMPLE_SHOVEL)
                .input('E', LearningFabric1Items.EXAMPLE_ITEM)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("E")
                .pattern("S")
                .pattern("S")
                .criterion(hasItem(LearningFabric1Items.EXAMPLE_ITEM), conditionsFromItem(LearningFabric1Items.EXAMPLE_ITEM))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, LearningFabric1Items.EXAMPLE_HOE)
                .input('E', LearningFabric1Items.EXAMPLE_ITEM)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("EE")
                .pattern(" S")
                .pattern(" S")
                .criterion(hasItem(LearningFabric1Items.EXAMPLE_ITEM), conditionsFromItem(LearningFabric1Items.EXAMPLE_ITEM))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);
    }

    private void generateShapelessRecipes(RecipeExporter exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, LearningFabric1Items.EXAMPLE_ITEM, 9)
                .input(LearningFabric1Blocks.EXAMPLE_BLOCK)
                .criterion(hasItem(LearningFabric1Blocks.EXAMPLE_BLOCK), conditionsFromItem(LearningFabric1Blocks.EXAMPLE_BLOCK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, LearningFabric1Blocks.EXAMPLE_BLOCK, 1)
                .input(LearningFabric1Items.EXAMPLE_ITEM, 9)
                .criterion(hasItem(LearningFabric1Items.EXAMPLE_ITEM), conditionsFromItem(LearningFabric1Items.EXAMPLE_ITEM))
                .offerTo(exporter);
    }

    private void generateFurnaceRecipes(RecipeExporter exporter) {
        List<ItemConvertible> smeltableIntoExampleItemList = List.of(LearningFabric1Items.EXAMPLE_RAW_ITEM,
                LearningFabric1Blocks.EXAMPLE_OVERWORLD_ORE, LearningFabric1Blocks.EXAMPLE_DEEPSLATE_ORE,
                LearningFabric1Blocks.EXAMPLE_NETHER_ORE, LearningFabric1Blocks.EXAMPLE_END_ORE);
        offerSmelting(exporter,
                smeltableIntoExampleItemList,
                RecipeCategory.MISC,
                LearningFabric1Items.EXAMPLE_ITEM,
                0.2f,
                200,
                "example");
    }

    private void generateBlaseFurnaceRecipes(RecipeExporter exporter) {
        List<ItemConvertible> smeltableIntoExampleItemList = List.of(LearningFabric1Items.EXAMPLE_RAW_ITEM,
                LearningFabric1Blocks.EXAMPLE_OVERWORLD_ORE, LearningFabric1Blocks.EXAMPLE_DEEPSLATE_ORE,
                LearningFabric1Blocks.EXAMPLE_NETHER_ORE, LearningFabric1Blocks.EXAMPLE_END_ORE);
        offerBlasting(exporter,
                smeltableIntoExampleItemList,
                RecipeCategory.MISC,
                LearningFabric1Items.EXAMPLE_ITEM,
                0.2f,
                100,
                "example");
    }

    private static String hasTag(TagKey<?> tag) {
        return "has_" + tag.id().toString();
    }
}
