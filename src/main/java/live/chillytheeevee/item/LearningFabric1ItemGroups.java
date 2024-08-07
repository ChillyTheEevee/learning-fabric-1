package live.chillytheeevee.item;

import live.chillytheeevee.LearningFabric1;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

/**
 * A Class containing all of the {@link ItemGroup}s contained within LearningFabric1
 */
public class LearningFabric1ItemGroups {

    public static final ItemGroup EXAMPLE_ITEM_GROUP;

    /**
     * Registers LearningFabric1's {@link ItemGroup}s with Minecraft
     */
    public static void registerItemGroups() {
        // Invokes the static block below to ensure all ItemGroups are registered
    }

    static {
        Text EXAMPLE_GROUP_TITLE = Text.translatable("itemGroup." + LearningFabric1.MOD_ID + ".example_group");
        EXAMPLE_ITEM_GROUP = register("example_item_group", FabricItemGroup.builder()
                .displayName(EXAMPLE_GROUP_TITLE)
                .icon(LearningFabric1Items.EXAMPLE_ITEM::getDefaultStack)
                .entries(((displayContext, entries) -> {
                    entries.add(LearningFabric1Items.EXAMPLE_ITEM);
                    entries.add(LearningFabric1Items.EXAMPLE_RAW_ITEM);
                    entries.add(LearningFabric1Items.EXAMPLE_BLOCK);
                    entries.add(LearningFabric1Items.EXAMPLE_OVERWORLD_ORE);
                    entries.add(LearningFabric1Items.EXAMPLE_DEEPSLATE_ORE);
                    entries.add(LearningFabric1Items.EXAMPLE_NETHER_ORE);
                    entries.add(LearningFabric1Items.EXAMPLE_END_ORE);
                    entries.add(LearningFabric1Items.EXAMPLE_FOOD);
                    entries.add(LearningFabric1Items.EXAMPLE_SHOVEL);
                    entries.add(LearningFabric1Items.EXAMPLE_PICKAXE);
                    entries.add(LearningFabric1Items.EXAMPLE_AXE);
                    entries.add(LearningFabric1Items.EXAMPLE_HOE);
                    entries.add(LearningFabric1Items.EXAMPLE_SWORD);
                    entries.add(LearningFabric1Items.EXAMPLE_HELMET);
                    entries.add(LearningFabric1Items.EXAMPLE_CHESTPLATE);
                    entries.add(LearningFabric1Items.EXAMPLE_LEGGINGS);
                    entries.add(LearningFabric1Items.EXAMPLE_BOOTS);
                    entries.add(LearningFabric1Items.EXAMPLE_FLOWER);
                }))
                .build());
    }

    /**
     * Registers the given {@link ItemGroup} with Minecraft
     *
     * @param name      The internal name to give this ItemGroup during registration
     * @param itemGroup The ItemGroup to be registered with Minecraft
     * @param <T>       A Class that extends ItemGroup
     * @return The ItemGroup registered with Minecraft
     */
    private static <T extends ItemGroup> T register(String name, T itemGroup) {
        return Registry.register(Registries.ITEM_GROUP, LearningFabric1.id(name), itemGroup);
    }

}
