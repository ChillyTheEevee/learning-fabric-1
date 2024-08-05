package live.chillytheeevee.item;

import live.chillytheeevee.LearningFabric1;
import live.chillytheeevee.block.LearningFabric1Blocks;
import live.chillytheeevee.component.type.LearningFabric1FoodComponents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

/**
 * A Class containing all of the {@link Item}s within LearningFabric1
 */
public class LearningFabric1Items {

    public static final Item EXAMPLE_ITEM;
    public static final Item EXAMPLE_RAW_ITEM;
    public static final Item EXAMPLE_FOOD;
    public static final Item EXAMPLE_BLOCK;
    public static final Item EXAMPLE_OVERWORLD_ORE;
    public static final Item EXAMPLE_DEEPSLATE_ORE;
    public static final Item EXAMPLE_NETHER_ORE;
    public static final Item EXAMPLE_END_ORE;

    /**
     * Registers LearningFabric1's Items with Minecraft
     */
    public static void registerItems() {
        // Invokes the static block below to ensure all Items are registered
    }

    static {
        EXAMPLE_ITEM = register("example_item", new Item(new Item.Settings()));
        EXAMPLE_RAW_ITEM = register("example_raw_item", new Item(new Item.Settings()));
        EXAMPLE_FOOD = register("example_food", new Item(new Item.Settings()
                .food(LearningFabric1FoodComponents.EXAMPLE_FOOD)
                .fireproof()));
        EXAMPLE_BLOCK = register("example_block",
                new BlockItem(LearningFabric1Blocks.EXAMPLE_BLOCK, new Item.Settings()));
        EXAMPLE_OVERWORLD_ORE = register("example_overworld_ore",
                new BlockItem(LearningFabric1Blocks.EXAMPLE_OVERWORLD_ORE, new Item.Settings()));
        EXAMPLE_DEEPSLATE_ORE = register("example_deepslate_ore",
                new BlockItem(LearningFabric1Blocks.EXAMPLE_DEEPSLATE_ORE, new Item.Settings()));
        EXAMPLE_NETHER_ORE = register("example_nether_ore",
                new BlockItem(LearningFabric1Blocks.EXAMPLE_NETHER_ORE, new Item.Settings()));
        EXAMPLE_END_ORE = register("example_end_ore",
                new BlockItem(LearningFabric1Blocks.EXAMPLE_END_ORE, new Item.Settings()));
    }

    /**
     * Registers the given {@link Item} with Minecraft
     *
     * @param name The internal name to give this Item during registration
     * @param item The Item to be registered with Minecraft
     * @param <T>  A Class that extends Item
     * @return The Item registered with Minecraft
     */
    private static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, LearningFabric1.id(name), item);
    }

}
