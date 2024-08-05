package live.chillytheeevee.item;

import live.chillytheeevee.LearningFabric1;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

public class LearningFabric1ItemGroups {

    public static final ItemGroup EXAMPLE_ITEM_GROUP;

    public static void registerItemGroups() {

    }

    static {
        Text EXAMPLE_GROUP_TITLE = Text.translatable("itemGroup." + LearningFabric1.MOD_ID + ".example_group");
        EXAMPLE_ITEM_GROUP = register("example_item_group", FabricItemGroup.builder()
                .displayName(EXAMPLE_GROUP_TITLE)
                .icon(LearningFabric1Items.EXAMPLE_ITEM::getDefaultStack)
                .entries(((displayContext, entries) -> {
                    entries.add(LearningFabric1Items.EXAMPLE_ITEM);
                    entries.add(LearningFabric1Items.EXAMPLE_FOOD);
                    entries.add(LearningFabric1Items.EXAMPLE_BLOCK);
                    entries.add(LearningFabric1Items.EXAMPLE_OVERWORLD_ORE);
                    entries.add(LearningFabric1Items.EXAMPLE_DEEPSLATE_ORE);
                    entries.add(LearningFabric1Items.EXAMPLE_NETHER_ORE);
                    entries.add(LearningFabric1Items.EXAMPLE_END_ORE);
                }))
                .build());
    }

    private static <T extends ItemGroup> T register(String name, T itemGroup) {
        return Registry.register(Registries.ITEM_GROUP, LearningFabric1.id(name), itemGroup);
    }

}
