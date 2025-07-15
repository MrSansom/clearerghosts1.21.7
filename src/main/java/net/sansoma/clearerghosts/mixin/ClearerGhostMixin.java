package net.sansoma.clearerghosts.mixin;

import net.minecraft.client.render.entity.LivingEntityRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(LivingEntityRenderer.class)
public class ClearerGhostMixin {

    @ModifyConstant(method = "render", constant = @Constant(intValue = 654311423))
    private int injected(int value) {
        return 267155712;
    }
}
