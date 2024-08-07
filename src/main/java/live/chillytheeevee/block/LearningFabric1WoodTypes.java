package live.chillytheeevee.block;

import live.chillytheeevee.LearningFabric1;
import net.minecraft.block.WoodType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;

public class LearningFabric1WoodTypes {

    public static final WoodType EXAMPLE = new WoodType(
            LearningFabric1.id("example").toString(),
            LearningFabric1BlockSetTypes.EXAMPLE,
            BlockSoundGroup.WOOD,
            BlockSoundGroup.HANGING_SIGN,
            SoundEvents.BLOCK_FENCE_GATE_CLOSE,
            SoundEvents.BLOCK_FENCE_GATE_OPEN
    );

}
