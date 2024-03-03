package com.kingcontaria.chunkmod.mixin;

import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(MinecraftServer.class)
public class MinecraftServerMixin {
    @ModifyConstant(method = "method_3774", constant = @Constant(intValue = 192))
    private int chunkModOne(int constant) {
        return 48;
    }

    @ModifyConstant(method = "method_3774", constant = @Constant(intValue = -192))
    private int chunkModTwo(int constant) {
        return -48;
    }
}
