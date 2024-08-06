package live.chillytheeevee.item;

import live.chillytheeevee.LearningFabric1;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

/**
 * A class containing all of the {@link ArmorMaterials} within LearningFabric1
 */
public class LearningFabric1ArmorMaterials {

    public static final RegistryEntry<ArmorMaterial> EXAMPLE;

    /**
     * Registers LearningFabric1's ArmorMaterials with Minecraft
     */
    public static void registerArmorMaterials() {

    }

    static {
        EXAMPLE = register("example", Map.of(
                        ArmorItem.Type.HELMET, 3,
                        ArmorItem.Type.CHESTPLATE, 8,
                        ArmorItem.Type.LEGGINGS, 6,
                        ArmorItem.Type.BOOTS, 3
                ), 50,
                SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
                () -> Ingredient.ofItems(LearningFabric1Items.EXAMPLE_ITEM),
                0.5f,
                0.1f,
                false);
    }


    private static RegistryEntry<ArmorMaterial> register(String name, Map<ArmorItem.Type, Integer> defensePoints,
                                                         int enchantibility, RegistryEntry<SoundEvent> equipSound,
                                                         Supplier<Ingredient> repairIngredient, float toughness,
                                                         float knockbackResisance, boolean dyeable) {
        List<ArmorMaterial.Layer> layers = List.of(
                new ArmorMaterial.Layer(LearningFabric1.id(name), "", dyeable)
        );

        var material = new ArmorMaterial(defensePoints, enchantibility, equipSound, repairIngredient, layers,
                toughness, knockbackResisance);
        material = Registry.register(Registries.ARMOR_MATERIAL, LearningFabric1.id(name), material);

        return RegistryEntry.of(material);
    }

}