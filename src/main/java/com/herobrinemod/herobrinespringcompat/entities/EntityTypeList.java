package com.herobrinemod.herobrinespringcompat.entities;

import com.herobrinemod.herobrinespringcompat.HerobrineSpringCompatMod;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;

import static net.minecraft.registry.Registries.ENTITY_TYPE;

public class EntityTypeList {
    public static final EntityType<ColdInfectedPigEntity> COLD_INFECTED_PIG = Registry.register(ENTITY_TYPE, Identifier.of(HerobrineSpringCompatMod.MODID, "cold_infected_pig"), EntityType.Builder.create(ColdInfectedPigEntity::new, SpawnGroup.MONSTER).dimensions(0.9f, 0.9f).eyeHeight(1.79f).passengerAttachments(0.86875f).build());
    public static final EntityType<ColdInfectedCowEntity> COLD_INFECTED_COW = Registry.register(ENTITY_TYPE, Identifier.of(HerobrineSpringCompatMod.MODID, "cold_infected_cow"), EntityType.Builder.create(ColdInfectedCowEntity::new, SpawnGroup.MONSTER).dimensions(0.9f, 1.4f).eyeHeight(1.3f).passengerAttachments(1.36875f).build());
    public static final EntityType<ColdInfectedChickenEntity> COLD_INFECTED_CHICKEN = Registry.register(ENTITY_TYPE, Identifier.of(HerobrineSpringCompatMod.MODID, "cold_infected_chicken"), EntityType.Builder.create(ColdInfectedChickenEntity::new, SpawnGroup.MONSTER).dimensions(0.4f, 0.7f).eyeHeight(0.644f).passengerAttachments(new Vec3d(0.0, 0.7, -0.1)).build());
    public static final EntityType<WarmInfectedPigEntity> WARM_INFECTED_PIG = Registry.register(ENTITY_TYPE, Identifier.of(HerobrineSpringCompatMod.MODID, "warm_infected_pig"), EntityType.Builder.create(WarmInfectedPigEntity::new, SpawnGroup.MONSTER).dimensions(0.9f, 0.9f).eyeHeight(1.79f).passengerAttachments(0.86875f).build());
    public static final EntityType<WarmInfectedCowEntity> WARM_INFECTED_COW = Registry.register(ENTITY_TYPE, Identifier.of(HerobrineSpringCompatMod.MODID, "warm_infected_cow"), EntityType.Builder.create(WarmInfectedCowEntity::new, SpawnGroup.MONSTER).dimensions(0.9f, 1.4f).eyeHeight(1.3f).passengerAttachments(1.36875f).build());
    public static final EntityType<WarmInfectedChickenEntity> WARM_INFECTED_CHICKEN = Registry.register(ENTITY_TYPE, Identifier.of(HerobrineSpringCompatMod.MODID, "warm_infected_chicken"), EntityType.Builder.create(WarmInfectedChickenEntity::new, SpawnGroup.MONSTER).dimensions(0.4f, 0.7f).eyeHeight(0.644f).passengerAttachments(new Vec3d(0.0, 0.7, -0.1)).build());
}
