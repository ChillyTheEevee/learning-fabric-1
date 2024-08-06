package live.chillytheeevee.data.provider;

import live.chillytheeevee.LearningFabric1;
import live.chillytheeevee.block.LearningFabric1Blocks;
import live.chillytheeevee.item.LearningFabric1ItemGroups;
import live.chillytheeevee.item.LearningFabric1Items;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.text.TextContent;
import net.minecraft.text.TranslatableTextContent;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class LearningFabric1EnglishLanguageProvider extends FabricLanguageProvider {

    public LearningFabric1EnglishLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    private static void addText(@NotNull TranslationBuilder builder, @NotNull Text text, @NotNull String value) {
        TextContent textContent = text.getContent();
        if (textContent instanceof TranslatableTextContent translatableTextContent) {
            builder.add(translatableTextContent.getKey(), value);
        } else {
            LearningFabric1.LOGGER.warn("Failed to add translation for text: {}", text.getString());
        }
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(LearningFabric1Items.EXAMPLE_ITEM, "Example Item");
        translationBuilder.add(LearningFabric1Items.EXAMPLE_RAW_ITEM, "Example Raw Item");
        translationBuilder.add(LearningFabric1Items.EXAMPLE_FOOD, "Example Food");
        translationBuilder.add(LearningFabric1Items.EXAMPLE_SWORD, "Example Sword");
        translationBuilder.add(LearningFabric1Items.EXAMPLE_PICKAXE, "Example Pickaxe");
        translationBuilder.add(LearningFabric1Items.EXAMPLE_AXE, "Example Axe");
        translationBuilder.add(LearningFabric1Items.EXAMPLE_SHOVEL, "Example Shovel");
        translationBuilder.add(LearningFabric1Items.EXAMPLE_HOE, "Example Hoe");
        translationBuilder.add(LearningFabric1Blocks.EXAMPLE_BLOCK, "Example Block");
        translationBuilder.add(LearningFabric1Blocks.EXAMPLE_OVERWORLD_ORE, "Example Overworld Ore");
        translationBuilder.add(LearningFabric1Blocks.EXAMPLE_DEEPSLATE_ORE, "Example Deepslate Ore");
        translationBuilder.add(LearningFabric1Blocks.EXAMPLE_NETHER_ORE, "Example Nether Ore");
        translationBuilder.add(LearningFabric1Blocks.EXAMPLE_END_ORE, "Example End Ore");
        addText(translationBuilder, LearningFabric1ItemGroups.EXAMPLE_ITEM_GROUP.getDisplayName(), "Learning Fabric 1");
    }

}
