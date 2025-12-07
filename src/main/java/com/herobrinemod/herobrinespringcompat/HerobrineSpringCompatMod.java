package com.herobrinemod.herobrinespringcompat;

import com.herobrinemod.herobrine.entities.InfectedEntity;
import com.herobrinemod.herobrine.savedata.ConfigHandler;
import com.herobrinemod.herobrinespringcompat.entities.*;
import com.herobrinemod.herobrinespringcompat.items.ItemList;
import de.larsensmods.stl_backport.entity.STLEntityTypes;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.SpawnSettings;

import static net.minecraft.registry.Registries.ITEM;

public class HerobrineSpringCompatMod implements ModInitializer {
    public static final String MODID = "herobrinespringcompat";

    @Override
    public void onInitialize() {
        registerItems();
        registerItemGroups();
        registerEntityAttributes();
        registerEntitySpawns();
    }

    private void registerItems() {
        Registry.register(ITEM, Identifier.of(MODID, "cold_infected_pig_spawn_egg"), ItemList.COLD_INFECTED_PIG_SPAWN_EGG);
        Registry.register(ITEM, Identifier.of(MODID, "warm_infected_pig_spawn_egg"), ItemList.WARM_INFECTED_PIG_SPAWN_EGG);
        Registry.register(ITEM, Identifier.of(MODID, "cold_infected_cow_spawn_egg"), ItemList.COLD_INFECTED_COW_SPAWN_EGG);
        Registry.register(ITEM, Identifier.of(MODID, "warm_infected_cow_spawn_egg"), ItemList.WARM_INFECTED_COW_SPAWN_EGG);
        Registry.register(ITEM, Identifier.of(MODID, "cold_infected_chicken_spawn_egg"), ItemList.COLD_INFECTED_CHICKEN_SPAWN_EGG);
        Registry.register(ITEM, Identifier.of(MODID, "warm_infected_chicken_spawn_egg"), ItemList.WARM_INFECTED_CHICKEN_SPAWN_EGG);
    }

    private void registerItemGroups() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(content -> content.addAfter(com.herobrinemod.herobrine.items.ItemList.INFECTED_PIG_SPAWN_EGG, ItemList.WARM_INFECTED_PIG_SPAWN_EGG));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(content -> content.addAfter(ItemList.WARM_INFECTED_PIG_SPAWN_EGG, ItemList.COLD_INFECTED_PIG_SPAWN_EGG));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(content -> content.addAfter(com.herobrinemod.herobrine.items.ItemList.INFECTED_COW_SPAWN_EGG, ItemList.WARM_INFECTED_COW_SPAWN_EGG));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(content -> content.addAfter(ItemList.WARM_INFECTED_COW_SPAWN_EGG, ItemList.COLD_INFECTED_COW_SPAWN_EGG));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(content -> content.addAfter(com.herobrinemod.herobrine.items.ItemList.INFECTED_CHICKEN_SPAWN_EGG, ItemList.WARM_INFECTED_CHICKEN_SPAWN_EGG));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(content -> content.addAfter(ItemList.WARM_INFECTED_CHICKEN_SPAWN_EGG, ItemList.COLD_INFECTED_CHICKEN_SPAWN_EGG));
    }

    private void registerEntityAttributes() {
        FabricDefaultAttributeRegistry.register(EntityTypeList.COLD_INFECTED_PIG, ColdInfectedPigEntity.registerAttributes());
        FabricDefaultAttributeRegistry.register(EntityTypeList.WARM_INFECTED_PIG, WarmInfectedPigEntity.registerAttributes());
        FabricDefaultAttributeRegistry.register(EntityTypeList.COLD_INFECTED_COW, ColdInfectedCowEntity.registerAttributes());
        FabricDefaultAttributeRegistry.register(EntityTypeList.WARM_INFECTED_COW, WarmInfectedCowEntity.registerAttributes());
        FabricDefaultAttributeRegistry.register(EntityTypeList.COLD_INFECTED_CHICKEN, ColdInfectedChickenEntity.registerAttributes());
        FabricDefaultAttributeRegistry.register(EntityTypeList.WARM_INFECTED_CHICKEN, WarmInfectedChickenEntity.registerAttributes());
    }

    private void registerEntitySpawns() {
        BiomeModifications.create(Identifier.of(MODID, "replace_warm_infected_animals")).add(ModificationPhase.ADDITIONS, BiomeSelectors.tag(TagKey.of(RegistryKeys.BIOME, Identifier.of("spring_to_life", "warm_animal_biomes"))), (context) -> {
            context.getSpawnSettings().removeSpawnsOfEntityType(com.herobrinemod.herobrine.entities.EntityTypeList.INFECTED_COW);
            context.getSpawnSettings().removeSpawnsOfEntityType(com.herobrinemod.herobrine.entities.EntityTypeList.INFECTED_PIG);
            context.getSpawnSettings().removeSpawnsOfEntityType(com.herobrinemod.herobrine.entities.EntityTypeList.INFECTED_CHICKEN);
            context.getSpawnSettings().addSpawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityTypeList.WARM_INFECTED_PIG, ConfigHandler.getHerobrineConfig().readInt("InfectedMobWeight"), 3, 6));
            context.getSpawnSettings().addSpawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityTypeList.WARM_INFECTED_CHICKEN, ConfigHandler.getHerobrineConfig().readInt("InfectedMobWeight"), 4, 8));
            context.getSpawnSettings().addSpawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityTypeList.WARM_INFECTED_COW, ConfigHandler.getHerobrineConfig().readInt("InfectedMobWeight"), 2, 4));
        }).add(ModificationPhase.ADDITIONS, BiomeSelectors.includeByKey(BiomeKeys.JUNGLE, BiomeKeys.BAMBOO_JUNGLE, BiomeKeys.SPARSE_JUNGLE), (context) -> context.getSpawnSettings().addSpawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(STLEntityTypes.WARM_CHICKEN.get(), 10, 4, 4)));
        BiomeModifications.create(Identifier.of(MODID, "replace_cold_infected_animals")).add(ModificationPhase.ADDITIONS, BiomeSelectors.tag(TagKey.of(RegistryKeys.BIOME, Identifier.of("spring_to_life", "cold_animal_biomes"))), (context) -> {
            context.getSpawnSettings().removeSpawnsOfEntityType(com.herobrinemod.herobrine.entities.EntityTypeList.INFECTED_COW);
            context.getSpawnSettings().removeSpawnsOfEntityType(com.herobrinemod.herobrine.entities.EntityTypeList.INFECTED_PIG);
            context.getSpawnSettings().removeSpawnsOfEntityType(com.herobrinemod.herobrine.entities.EntityTypeList.INFECTED_CHICKEN);
            context.getSpawnSettings().addSpawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityTypeList.COLD_INFECTED_PIG, ConfigHandler.getHerobrineConfig().readInt("InfectedMobWeight"), 3, 6));
            context.getSpawnSettings().addSpawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityTypeList.COLD_INFECTED_CHICKEN, ConfigHandler.getHerobrineConfig().readInt("InfectedMobWeight"), 4, 8));
            context.getSpawnSettings().addSpawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityTypeList.COLD_INFECTED_COW, ConfigHandler.getHerobrineConfig().readInt("InfectedMobWeight"), 2, 4));
        });

        SpawnRestriction.register(EntityTypeList.COLD_INFECTED_PIG, SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, InfectedEntity::canSpawn);
        SpawnRestriction.register(EntityTypeList.WARM_INFECTED_PIG, SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, InfectedEntity::canSpawn);
        SpawnRestriction.register(EntityTypeList.COLD_INFECTED_COW, SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, InfectedEntity::canSpawn);
        SpawnRestriction.register(EntityTypeList.WARM_INFECTED_COW, SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, InfectedEntity::canSpawn);
        SpawnRestriction.register(EntityTypeList.COLD_INFECTED_CHICKEN, SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, InfectedEntity::canSpawn);
        SpawnRestriction.register(EntityTypeList.WARM_INFECTED_CHICKEN, SpawnRestriction.Location.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, InfectedEntity::canSpawn);
    }
}
