package live.chillytheeevee.data.provider;

import live.chillytheeevee.item.LearningFabric1Items;
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
    }
}
