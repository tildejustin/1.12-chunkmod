package com.kingcontaria.chunkmod.mixin;

import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(MinecraftServer.class)
public class MinecraftServerMixin {

    @ModifyConstant(method = "prepareWorlds", constant = @Constant(intValue = 192))
    private int chunkModOne(int constant) {
        return 0;
    }

    @ModifyConstant(method = "prepareWorlds", constant = @Constant(intValue = -192))
    private int chunkModTwo(int constant) {
        return 0;
    }
}
