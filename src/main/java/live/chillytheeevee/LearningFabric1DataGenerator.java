package live.chillytheeevee;

import live.chillytheeevee.data.generator.LearningFabric1WorldGenerator;
import live.chillytheeevee.data.provider.*;
import live.chillytheeevee.init.worldgen.ConfiguredFeatureInit;
import live.chillytheeevee.init.worldgen.PlacedFeatureInit;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class LearningFabric1DataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(LearningFabric1ModelProvider::new);
        pack.addProvider(LearningFabric1EnglishLanguageProvider::new);
        pack.addProvider(LearningFabric1BlockLootTableProvider::new);
        pack.addProvider(LearningFabric1BlockTagProvider::new);
        pack.addProvider(LearningFabric1WorldGenerator::new);
        pack.addProvider(LearningFabric1RecipeProvider::new);
    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ConfiguredFeatureInit::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, PlacedFeatureInit::bootstrap);
    }
}