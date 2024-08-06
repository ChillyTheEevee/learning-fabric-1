package live.chillytheeevee.item;

import live.chillytheeevee.LearningFabric1;
import live.chillytheeevee.block.LearningFabric1Blocks;
import live.chillytheeevee.component.type.LearningFabric1FoodComponents;
import net.minecraft.item.*;
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
    public static final Item EXAMPLE_SWORD;
    public static final Item EXAMPLE_PICKAXE;
    public static final Item EXAMPLE_AXE;
    public static final Item EXAMPLE_SHOVEL;
    public static final Item EXAMPLE_HOE;

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
        EXAMPLE_SWORD = register("example_sword",
                new SwordItem(LearningFabric1ToolMaterials.EXAMPLE, new Item.Settings()
                        .attributeModifiers(SwordItem.createAttributeModifiers(LearningFabric1ToolMaterials.EXAMPLE,
                                3, -2.4f))));
        EXAMPLE_PICKAXE = register("example_pickaxe",
                new PickaxeItem(LearningFabric1ToolMaterials.EXAMPLE, new Item.Settings()
                        .attributeModifiers(PickaxeItem.createAttributeModifiers(LearningFabric1ToolMaterials.EXAMPLE,
                                1, -2.8f))));
        EXAMPLE_AXE = register("example_axe",
                new AxeItem(LearningFabric1ToolMaterials.EXAMPLE, new Item.Settings()
                        .attributeModifiers(AxeItem.createAttributeModifiers(LearningFabric1ToolMaterials.EXAMPLE,
                                6, -3.0f))));
        EXAMPLE_SHOVEL = register("example_shovel",
                new ShovelItem(LearningFabric1ToolMaterials.EXAMPLE, new Item.Settings()
                        .attributeModifiers(ShovelItem.createAttributeModifiers(LearningFabric1ToolMaterials.EXAMPLE,
                                1.5f, -3.0f))));
        EXAMPLE_HOE = register("example_hoe",
                new HoeItem(LearningFabric1ToolMaterials.EXAMPLE, new Item.Settings()
                        .attributeModifiers(HoeItem.createAttributeModifiers(LearningFabric1ToolMaterials.EXAMPLE,
                                1, 0.0f))));
    }

    /**
     * Registers the given {@link Item} with Minecraft
     *
     * @param name The internal name to give this Item during registration
     * @param item The Item to be registered with Minecraft
     * @return The Item registered with Minecraft
     */
    private static Item register(String name, Item item) {
        return Registry.register(Registries.ITEM, LearningFabric1.id(name), item);
    }

}
