package live.chillytheeevee.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class FireStaffItem extends Item {

    private static final Float FIRE_STAFF_FIREBALL_SPEED = 3.0f;
    private static final int FIRE_STAFF_FIREBALL_EXPLOSION_POWER = 50;
    public FireStaffItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (world.isClient()) {
            return TypedActionResult.pass(user.getStackInHand(hand));
        }

        Vec3d fireballSpawnLocation = user.getEyePos();
        Vec3d fireballVelocityVector = user.getRotationVecClient().normalize().multiply(FIRE_STAFF_FIREBALL_SPEED);
        FireballEntity fireballEntity = new FireballEntity(world, user,
                fireballVelocityVector, FIRE_STAFF_FIREBALL_EXPLOSION_POWER);
        fireballEntity.setPosition(fireballSpawnLocation);
        world.spawnEntity(fireballEntity);

        ItemStack fireStaffItemStack = user.getStackInHand(hand);
        fireStaffItemStack.damage(1, user, LivingEntity.getSlotForHand(hand));

        return TypedActionResult.success(user.getStackInHand(hand));
    }

}
