package live.chillytheeevee.item;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import live.chillytheeevee.LearningFabric1;
import live.chillytheeevee.block.LearningFabric1Blocks;
import live.chillytheeevee.component.type.LearningFabric1FoodComponents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

/**
 * A Class containing all the {@link Item}s within LearningFabric1
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
    public static final Item EXAMPLE_HELMET;
    public static final Item EXAMPLE_CHESTPLATE;
    public static final Item EXAMPLE_LEGGINGS;
    public static final Item EXAMPLE_BOOTS;
    public static final Item EXAMPLE_FLOWER;
    public static final Item EXAMPLE_LOG;
    public static final Item EXAMPLE_STRIPPED_LOG;
    public static final Item EXAMPLE_WOOD;
    public static final Item EXAMPLE_STRIPPED_WOOD;
    public static final Item EXAMPLE_LEAVES;
    public static final Item EXAMPLE_SAPLING;
    public static final Item EXAMPLE_PLANKS;
    public static final Item EXAMPLE_DOOR;
    public static final Item EXAMPLE_FENCE;
    public static final Item EXAMPLE_FENCE_GATE;
    public static final Item EXAMPLE_STAIRS;
    public static final Item EXAMPLE_SLAB;
    public static final Item EXAMPLE_PRESSURE_PLATE;
    public static final Item EXAMPLE_BUTTON;
    public static final Item EXAMPLE_TRAPDOOR;
    public static final Item EXAMPLE_SIGN;
    public static final Item EXAMPLE_HANGING_SIGN;
    public static final Item EXAMPLE_BOAT;
    public static final Item EXAMPLE_CHEST_BOAT;

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
        EXAMPLE_HELMET = register("example_helmet",
                new ArmorItem(LearningFabric1ArmorMaterials.EXAMPLE,
                        ArmorItem.Type.HELMET, new Item.Settings().maxCount(1)));
        EXAMPLE_CHESTPLATE = register("example_chestplate",
                new ArmorItem(LearningFabric1ArmorMaterials.EXAMPLE,
                        ArmorItem.Type.CHESTPLATE, new Item.Settings().maxCount(1)));
        EXAMPLE_LEGGINGS = register("example_leggings",
                new ArmorItem(LearningFabric1ArmorMaterials.EXAMPLE,
                        ArmorItem.Type.LEGGINGS, new Item.Settings().maxCount(1)));
        EXAMPLE_BOOTS = register("example_boots",
                new ArmorItem(LearningFabric1ArmorMaterials.EXAMPLE,
                        ArmorItem.Type.BOOTS, new Item.Settings().maxCount(1)));

        // Register BlockItems
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
        EXAMPLE_FLOWER = register("example_flower",
                new BlockItem(LearningFabric1Blocks.EXAMPLE_FLOWER, new Item.Settings()));
        EXAMPLE_LOG = register("example_log",
                new BlockItem(LearningFabric1Blocks.EXAMPLE_LOG, new Item.Settings()));
        EXAMPLE_STRIPPED_LOG = register("example_stripped_log",
                new BlockItem(LearningFabric1Blocks.EXAMPLE_STRIPPED_LOG, new Item.Settings()));
        EXAMPLE_WOOD = register("example_wood",
                new BlockItem(LearningFabric1Blocks.EXAMPLE_WOOD, new Item.Settings()));
        EXAMPLE_STRIPPED_WOOD = register("example_stripped_wood",
                new BlockItem(LearningFabric1Blocks.EXAMPLE_STRIPPED_WOOD, new Item.Settings()));
        EXAMPLE_LEAVES = register("example_leaves",
                new BlockItem(LearningFabric1Blocks.EXAMPLE_LEAVES, new Item.Settings()));
        EXAMPLE_SAPLING = register("example_sapling",
                new BlockItem(LearningFabric1Blocks.EXAMPLE_SAPLING, new Item.Settings()));
        EXAMPLE_PLANKS = register("example_planks",
                new BlockItem(LearningFabric1Blocks.EXAMPLE_PLANKS, new Item.Settings()));
        EXAMPLE_DOOR = register("example_door",
                new BlockItem(LearningFabric1Blocks.EXAMPLE_DOOR, new Item.Settings()));
        EXAMPLE_FENCE = register("example_fence",
                new BlockItem(LearningFabric1Blocks.EXAMPLE_FENCE, new Item.Settings()));
        EXAMPLE_FENCE_GATE = register("example_fence_gate",
                new BlockItem(LearningFabric1Blocks.EXAMPLE_FENCE_GATE, new Item.Settings()));
        EXAMPLE_STAIRS = register("example_stairs",
                new BlockItem(LearningFabric1Blocks.EXAMPLE_STAIRS, new Item.Settings()));
        EXAMPLE_SLAB = register("example_slab",
                new BlockItem(LearningFabric1Blocks.EXAMPLE_SLAB, new Item.Settings()));
        EXAMPLE_PRESSURE_PLATE = register("example_pressure_plate",
                new BlockItem(LearningFabric1Blocks.EXAMPLE_PRESSURE_PLATE, new Item.Settings()));
        EXAMPLE_BUTTON = register("example_button",
                new BlockItem(LearningFabric1Blocks.EXAMPLE_BUTTON, new Item.Settings()));
        EXAMPLE_TRAPDOOR = register("example_trapdoor",
                new BlockItem(LearningFabric1Blocks.EXAMPLE_TRAPDOOR, new Item.Settings()));
        EXAMPLE_SIGN = register("example_sign",
                new SignItem(new Item.Settings().maxCount(16), LearningFabric1Blocks.EXAMPLE_SIGN,
                        LearningFabric1Blocks.EXAMPLE_WALL_SIGN));
        EXAMPLE_HANGING_SIGN = register("example_hanging_sign",
                new HangingSignItem(LearningFabric1Blocks.EXAMPLE_HANGING_SIGN,
                        LearningFabric1Blocks.EXAMPLE_WALL_HANGING_SIGN,
                        new Item.Settings().maxCount(16)));
        EXAMPLE_BOAT = TerraformBoatItemHelper.registerBoatItem(LearningFabric1.id("example_boat"),
                LearningFabric1Boats.EXAMPLE_BOAT_KEY, false);
        EXAMPLE_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(LearningFabric1.id("example_chest_boat"),
                LearningFabric1Boats.EXAMPLE_BOAT_KEY, true);
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
