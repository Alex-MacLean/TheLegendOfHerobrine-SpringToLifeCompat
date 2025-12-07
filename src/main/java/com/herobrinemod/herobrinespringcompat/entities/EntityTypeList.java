package com.herobrinemod.herobrinespringcompat.entities;

import com.herobrinemod.herobrinespringcompat.HerobrineSpringCompatMod;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.minecraft.registry.Registries.ENTITY_TYPE;

public class EntityTypeList {
    public static final EntityType<ColdInfectedPigEntity> COLD_INFECTED_PIG = Registry.register(ENTITY_TYPE, Identifier.of(HerobrineSpringCompatMod.MODID, "cold_infected_pig"), FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, ColdInfectedPigEntity::new).dimensions(EntityDimensions.fixed(0.9f, 0.9f)).build());
    public static final EntityType<ColdInfectedCowEntity> COLD_INFECTED_COW = Registry.register(ENTITY_TYPE, Identifier.of(HerobrineSpringCompatMod.MODID, "cold_infected_cow"), FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, ColdInfectedCowEntity::new).dimensions(EntityDimensions.fixed(0.9f, 1.4f)).build());
    public static final EntityType<ColdInfectedChickenEntity> COLD_INFECTED_CHICKEN = Registry.register(ENTITY_TYPE, Identifier.of(HerobrineSpringCompatMod.MODID, "cold_infected_chicken"), FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, ColdInfectedChickenEntity::new).dimensions(EntityDimensions.fixed(0.4f, 0.7f)).build());
    public static final EntityType<WarmInfectedPigEntity> WARM_INFECTED_PIG = Registry.register(ENTITY_TYPE, Identifier.of(HerobrineSpringCompatMod.MODID, "warm_infected_pig"), FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, WarmInfectedPigEntity::new).dimensions(EntityDimensions.fixed(0.9f, 0.9f)).build());
    public static final EntityType<WarmInfectedCowEntity>WARM_INFECTED_COW = Registry.register(ENTITY_TYPE, Identifier.of(HerobrineSpringCompatMod.MODID, "warm_infected_cow"), FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, WarmInfectedCowEntity::new).dimensions(EntityDimensions.fixed(0.9f, 1.4f)).build());
    public static final EntityType<WarmInfectedChickenEntity> WARM_INFECTED_CHICKEN = Registry.register(ENTITY_TYPE, Identifier.of(HerobrineSpringCompatMod.MODID, "warm_infected_chicken"), FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, WarmInfectedChickenEntity::new).dimensions(EntityDimensions.fixed(0.4f, 0.7f)).build());
}
