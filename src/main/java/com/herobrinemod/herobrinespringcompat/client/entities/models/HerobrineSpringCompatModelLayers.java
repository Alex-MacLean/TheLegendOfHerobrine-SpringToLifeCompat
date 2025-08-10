package com.herobrinemod.herobrinespringcompat.client.entities.models;

import com.herobrinemod.herobrinespringcompat.HerobrineSpringCompatMod;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class HerobrineSpringCompatModelLayers {
    public static final EntityModelLayer COLD_INFECTED_PIG_MODEL_LAYER = new EntityModelLayer(Identifier.of(HerobrineSpringCompatMod.MODID, "cold_infected_pig"), "main");
    public static final EntityModelLayer COLD_INFECTED_COW_MODEL_LAYER = new EntityModelLayer(Identifier.of(HerobrineSpringCompatMod.MODID, "cold_infected_cow"), "main");
    public static final EntityModelLayer COLD_INFECTED_CHICKEN_MODEL_LAYER = new EntityModelLayer(Identifier.of(HerobrineSpringCompatMod.MODID, "cold_infected_chicken"), "main");
    public static final EntityModelLayer WARM_INFECTED_PIG_MODEL_LAYER = new EntityModelLayer(Identifier.of(HerobrineSpringCompatMod.MODID, "warm_infected_pig"), "main");
    public static final EntityModelLayer WARM_INFECTED_COW_MODEL_LAYER = new EntityModelLayer(Identifier.of(HerobrineSpringCompatMod.MODID, "warm_infected_cow"), "main");
    public static final EntityModelLayer WARM_INFECTED_CHICKEN_MODEL_LAYER = new EntityModelLayer(Identifier.of(HerobrineSpringCompatMod.MODID, "warm_infected_chicken"), "main");
}
