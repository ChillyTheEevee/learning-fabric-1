package live.chillytheeevee.registry.tag;

import live.chillytheeevee.LearningFabric1;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public class LearningFabric1ItemTags {

    public static final TagKey<Item> EXAMPLE_LOGS = TagKey.of(RegistryKeys.ITEM,
            LearningFabric1.id("example_logs"));

}
