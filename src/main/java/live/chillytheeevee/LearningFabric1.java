package live.chillytheeevee;

import live.chillytheeevee.init.RegistrationManager;
import live.chillytheeevee.init.worldgen.BiomeModificationsInit;
import live.chillytheeevee.item.LearningFabric1Items;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LearningFabric1 implements ModInitializer {
    public static final String MOD_ID = "learning-fabric-1";

    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        LOGGER.info("Loading...");

        // Registration
        RegistrationManager registrationManager = new RegistrationManager();
        registrationManager.manageRegistration();

        BiomeModificationsInit.load();
        // Register Events
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries ->
                entries.addAfter(Items.PUMPKIN_PIE, LearningFabric1Items.EXAMPLE_FOOD));


    }

    public static Identifier id(String path) {
        return Identifier.of(MOD_ID, path);
    }
}