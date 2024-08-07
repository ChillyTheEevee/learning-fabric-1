package live.chillytheeevee.data.provider;

import live.chillytheeevee.block.LearningFabric1Blocks;
import live.chillytheeevee.item.LearningFabric1Items;
import live.chillytheeevee.registry.tag.LearningFabric1ItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.resource.featuretoggle.FeatureSet;

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
        generateFamilies(exporter);
    }

    private void generateShapedRecipes(RecipeExporter exporter) {
        generateExampleItemFamilyShapedRecipes(exporter);
        generateExampleWoodFamilyShapedRecipes(exporter);
    }

    private void generateExampleItemFamilyShapedRecipes(RecipeExporter exporter) {
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
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, LearningFabric1Items.EXAMPLE_HELMET)
                .input('E', LearningFabric1Items.EXAMPLE_ITEM)
                .pattern("EEE")
                .pattern("E E")
                .criterion(hasItem(LearningFabric1Items.EXAMPLE_ITEM), conditionsFromItem(LearningFabric1Items.EXAMPLE_ITEM))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, LearningFabric1Items.EXAMPLE_CHESTPLATE)
                .input('E', LearningFabric1Items.EXAMPLE_ITEM)
                .pattern("E E")
                .pattern("EEE")
                .pattern("EEE")
                .criterion(hasItem(LearningFabric1Items.EXAMPLE_ITEM), conditionsFromItem(LearningFabric1Items.EXAMPLE_ITEM))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, LearningFabric1Items.EXAMPLE_LEGGINGS)
                .input('E', LearningFabric1Items.EXAMPLE_ITEM)
                .pattern("EEE")
                .pattern("E E")
                .pattern("E E")
                .criterion(hasItem(LearningFabric1Items.EXAMPLE_ITEM), conditionsFromItem(LearningFabric1Items.EXAMPLE_ITEM))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, LearningFabric1Items.EXAMPLE_BOOTS)
                .input('E', LearningFabric1Items.EXAMPLE_ITEM)
                .pattern("E E")
                .pattern("E E")
                .criterion(hasItem(LearningFabric1Items.EXAMPLE_ITEM), conditionsFromItem(LearningFabric1Items.EXAMPLE_ITEM))
                .offerTo(exporter);
    }

    private void generateExampleWoodFamilyShapedRecipes(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, LearningFabric1Items.EXAMPLE_SLAB, 6)
                .input('P', LearningFabric1Items.EXAMPLE_PLANKS)
                .pattern("PPP")
                .criterion(hasItem(LearningFabric1Items.EXAMPLE_PLANKS),
                        conditionsFromItem(LearningFabric1Items.EXAMPLE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, LearningFabric1Items.EXAMPLE_STAIRS, 4)
                .input('P', LearningFabric1Items.EXAMPLE_PLANKS)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .criterion(hasItem(LearningFabric1Items.EXAMPLE_PLANKS),
                        conditionsFromItem(LearningFabric1Items.EXAMPLE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, LearningFabric1Items.EXAMPLE_FENCE, 3)
                .input('P', LearningFabric1Items.EXAMPLE_PLANKS)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("PSP")
                .pattern("PSP")
                .criterion(hasItem(LearningFabric1Items.EXAMPLE_PLANKS),
                        conditionsFromItem(LearningFabric1Items.EXAMPLE_PLANKS))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS),
                        conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, LearningFabric1Items.EXAMPLE_FENCE_GATE)
                .input('P', LearningFabric1Items.EXAMPLE_PLANKS)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("SPS")
                .pattern("SPS")
                .criterion(hasItem(LearningFabric1Items.EXAMPLE_PLANKS),
                        conditionsFromItem(LearningFabric1Items.EXAMPLE_PLANKS))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS),
                        conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, LearningFabric1Items.EXAMPLE_DOOR, 3)
                .input('P', LearningFabric1Items.EXAMPLE_PLANKS)
                .pattern("PP")
                .pattern("PP")
                .pattern("PP")
                .criterion(hasItem(LearningFabric1Items.EXAMPLE_PLANKS),
                        conditionsFromItem(LearningFabric1Items.EXAMPLE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, LearningFabric1Items.EXAMPLE_TRAPDOOR, 2)
                .input('P', LearningFabric1Items.EXAMPLE_PLANKS)
                .pattern("PPP")
                .pattern("PPP")
                .criterion(hasItem(LearningFabric1Items.EXAMPLE_PLANKS),
                        conditionsFromItem(LearningFabric1Items.EXAMPLE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, LearningFabric1Items.EXAMPLE_PRESSURE_PLATE)
                .input('P', LearningFabric1Items.EXAMPLE_PLANKS)
                .pattern("PP")
                .criterion(hasItem(LearningFabric1Items.EXAMPLE_PLANKS),
                        conditionsFromItem(LearningFabric1Items.EXAMPLE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, LearningFabric1Items.EXAMPLE_SIGN, 3)
                .input('P', LearningFabric1Items.EXAMPLE_PLANKS)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("PPP")
                .pattern("PPP")
                .pattern(" S ")
                .criterion(hasItem(LearningFabric1Items.EXAMPLE_PLANKS),
                        conditionsFromItem(LearningFabric1Items.EXAMPLE_PLANKS))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS),
                        conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, LearningFabric1Items.EXAMPLE_HANGING_SIGN, 6)
                .input('L', LearningFabric1Items.EXAMPLE_STRIPPED_LOG)
                .input('C', ConventionalItemTags.CHAINS)
                .pattern("C C")
                .pattern("LLL")
                .pattern("LLL")
                .criterion(hasItem(LearningFabric1Items.EXAMPLE_STRIPPED_LOG),
                        conditionsFromItem(LearningFabric1Items.EXAMPLE_PLANKS))
                .criterion(hasTag(ConventionalItemTags.CHAINS),
                        conditionsFromTag(ConventionalItemTags.CHAINS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, LearningFabric1Items.EXAMPLE_BOAT)
                .input('P', LearningFabric1Items.EXAMPLE_PLANKS)
                .pattern("P P")
                .pattern("PPP")
                .criterion(hasItem(LearningFabric1Items.EXAMPLE_PLANKS),
                        conditionsFromItem(LearningFabric1Items.EXAMPLE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, LearningFabric1Items.EXAMPLE_CHEST_BOAT)
                .input('P', LearningFabric1Items.EXAMPLE_PLANKS)
                .input('C', ConventionalItemTags.WOODEN_CHESTS)
                .pattern("PCP")
                .pattern("PPP")
                .criterion(hasItem(LearningFabric1Items.EXAMPLE_PLANKS),
                        conditionsFromItem(LearningFabric1Items.EXAMPLE_PLANKS))
                .criterion(hasTag(ConventionalItemTags.WOODEN_CHESTS),
                        conditionsFromTag(ConventionalItemTags.WOODEN_CHESTS))
                .offerTo(exporter);
    }

    private void generateShapelessRecipes(RecipeExporter exporter) {
        generateExampleItemFamilyShapelessRecipes(exporter);
        generateExampleWoodFamilyShapelessRecipes(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PURPLE_DYE)
                .input(LearningFabric1Blocks.EXAMPLE_FLOWER)
                .criterion(hasItem(LearningFabric1Items.EXAMPLE_FLOWER), conditionsFromItem(LearningFabric1Items.EXAMPLE_FLOWER))
                .offerTo(exporter);
    }

    private void generateExampleItemFamilyShapelessRecipes(RecipeExporter exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, LearningFabric1Items.EXAMPLE_ITEM, 9)
                .input(LearningFabric1Blocks.EXAMPLE_BLOCK)
                .criterion(hasItem(LearningFabric1Blocks.EXAMPLE_BLOCK), conditionsFromItem(LearningFabric1Blocks.EXAMPLE_BLOCK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, LearningFabric1Blocks.EXAMPLE_BLOCK, 1)
                .input(LearningFabric1Items.EXAMPLE_ITEM, 9)
                .criterion(hasItem(LearningFabric1Items.EXAMPLE_ITEM), conditionsFromItem(LearningFabric1Items.EXAMPLE_ITEM))
                .offerTo(exporter);
    }

    private void generateExampleWoodFamilyShapelessRecipes(RecipeExporter exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, LearningFabric1Items.EXAMPLE_PLANKS, 4)
                .input(Ingredient.fromTag(LearningFabric1ItemTags.EXAMPLE_LOGS))
                .criterion(hasTag(LearningFabric1ItemTags.EXAMPLE_LOGS), conditionsFromTag(LearningFabric1ItemTags.EXAMPLE_LOGS))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, LearningFabric1Items.EXAMPLE_BUTTON)
                .input(LearningFabric1Items.EXAMPLE_PLANKS)
                .criterion(hasItem(LearningFabric1Items.EXAMPLE_PLANKS),
                        conditionsFromItem(LearningFabric1Items.EXAMPLE_PLANKS))
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

    private void generateFamilies(RecipeExporter exporter) {
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

        generateFamily(exporter, exampleFamily, FeatureSet.empty());
    }

    private static String hasTag(TagKey<?> tag) {
        return "has_" + tag.id().toString();
    }
}
