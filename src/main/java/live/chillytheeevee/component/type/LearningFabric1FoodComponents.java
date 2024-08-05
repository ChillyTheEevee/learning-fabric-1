package live.chillytheeevee.component.type;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

/**
 * Contains the FoodComponent data of all food Items within LearningFabric1.
 */
public class LearningFabric1FoodComponents {
    public static final FoodComponent EXAMPLE_FOOD;

    static {
        EXAMPLE_FOOD = new FoodComponent.Builder()
                .nutrition(4)
                .saturationModifier(0.5f)
                .alwaysEdible()
                .statusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 20 * 30, 0), 0.2f)
                .build();
    }
}
