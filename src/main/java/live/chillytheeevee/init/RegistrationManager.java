package live.chillytheeevee.init;

import live.chillytheeevee.block.LearningFabric1Blocks;
import live.chillytheeevee.item.LearningFabric1ArmorMaterials;
import live.chillytheeevee.item.LearningFabric1ItemGroups;
import live.chillytheeevee.item.LearningFabric1Items;

public class RegistrationManager {

    public RegistrationManager() {

    }

    public void manageRegistration() {
        LearningFabric1Blocks.registerBlocks();
        LearningFabric1Items.registerItems();
        LearningFabric1ArmorMaterials.registerArmorMaterials();
        LearningFabric1ItemGroups.registerItemGroups();
    }
}
