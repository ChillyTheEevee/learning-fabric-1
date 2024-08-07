package live.chillytheeevee.data.provider;

import live.chillytheeevee.item.LearningFabric1Items;
import live.chillytheeevee.registry.tag.LearningFabric1ItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class LearningFabric1ItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public LearningFabric1ItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        configureVanillaTags();
        configureCustomTags();
    }

    private void configureVanillaTags() {
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(LearningFabric1Items.EXAMPLE_SWORD);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(LearningFabric1Items.EXAMPLE_PICKAXE);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(LearningFabric1Items.EXAMPLE_AXE);

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(LearningFabric1Items.EXAMPLE_SHOVEL);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(LearningFabric1Items.EXAMPLE_HOE);

        getOrCreateTagBuilder(ItemTags.BEACON_PAYMENT_ITEMS)
                .add(LearningFabric1Items.EXAMPLE_ITEM);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(LearningFabric1Items.EXAMPLE_HELMET)
                .add(LearningFabric1Items.EXAMPLE_CHESTPLATE)
                .add(LearningFabric1Items.EXAMPLE_LEGGINGS)
                .add(LearningFabric1Items.EXAMPLE_BOOTS);

        getOrCreateTagBuilder(ItemTags.SMALL_FLOWERS)
                .add(LearningFabric1Items.EXAMPLE_FLOWER);

        getOrCreateTagBuilder(LearningFabric1ItemTags.EXAMPLE_LOGS)
                .add(LearningFabric1Items.EXAMPLE_LOG)
                .add(LearningFabric1Items.EXAMPLE_STRIPPED_LOG)
                .add(LearningFabric1Items.EXAMPLE_WOOD)
                .add(LearningFabric1Items.EXAMPLE_STRIPPED_WOOD);

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .addTag(LearningFabric1ItemTags.EXAMPLE_LOGS);

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(LearningFabric1Items.EXAMPLE_PLANKS);

        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(LearningFabric1Items.EXAMPLE_LEAVES);

        getOrCreateTagBuilder(ItemTags.SAPLINGS)
                .add(LearningFabric1Items.EXAMPLE_SAPLING);

        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                .add(LearningFabric1Items.EXAMPLE_BUTTON);

        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS)
                .add(LearningFabric1Items.EXAMPLE_DOOR);

        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(LearningFabric1Items.EXAMPLE_TRAPDOOR);

        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
                .add(LearningFabric1Items.EXAMPLE_FENCE);

        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(LearningFabric1Items.EXAMPLE_PRESSURE_PLATE);

        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(LearningFabric1Items.EXAMPLE_SLAB);

        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(LearningFabric1Items.EXAMPLE_STAIRS);

        getOrCreateTagBuilder(ItemTags.SIGNS)
                .add(LearningFabric1Items.EXAMPLE_SIGN);

        getOrCreateTagBuilder(ItemTags.HANGING_SIGNS)
                .add(LearningFabric1Items.EXAMPLE_HANGING_SIGN);

        getOrCreateTagBuilder(ItemTags.BOATS)
                .add(LearningFabric1Items.EXAMPLE_BOAT);

        getOrCreateTagBuilder(ItemTags.CHEST_BOATS)
                .add(LearningFabric1Items.EXAMPLE_CHEST_BOAT);
    }

    private void configureCustomTags() {

    }
}
