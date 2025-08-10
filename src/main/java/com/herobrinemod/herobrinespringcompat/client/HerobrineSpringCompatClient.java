package com.herobrinemod.herobrinespringcompat.client;

import com.herobrinemod.herobrinespringcompat.client.entities.models.*;
import com.herobrinemod.herobrinespringcompat.client.entities.renderers.*;
import com.herobrinemod.herobrinespringcompat.entities.EntityTypeList;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class HerobrineSpringCompatClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(HerobrineSpringCompatModelLayers.COLD_INFECTED_PIG_MODEL_LAYER, ColdInfectedPigEntityModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(HerobrineSpringCompatModelLayers.COLD_INFECTED_COW_MODEL_LAYER, ColdInfectedCowEntityModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(HerobrineSpringCompatModelLayers.COLD_INFECTED_CHICKEN_MODEL_LAYER, ColdInfectedChickenEntityModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(HerobrineSpringCompatModelLayers.WARM_INFECTED_PIG_MODEL_LAYER, WarmInfectedPigEntityModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(HerobrineSpringCompatModelLayers.WARM_INFECTED_COW_MODEL_LAYER, WarmInfectedCowEntityModel::getTexturedModelData);
        EntityModelLayerRegistry.registerModelLayer(HerobrineSpringCompatModelLayers.WARM_INFECTED_CHICKEN_MODEL_LAYER, WarmInfectedChickenEntityModel::getTexturedModelData);
        EntityRendererRegistry.register(EntityTypeList.COLD_INFECTED_PIG, ColdInfectedPigEntityRenderer::new);
        EntityRendererRegistry.register(EntityTypeList.COLD_INFECTED_COW, ColdInfectedCowEntityRenderer::new);
        EntityRendererRegistry.register(EntityTypeList.COLD_INFECTED_CHICKEN, ColdInfectedChickenEntityRenderer::new);
        EntityRendererRegistry.register(EntityTypeList.WARM_INFECTED_PIG, WarmInfectedPigEntityRenderer::new);
        EntityRendererRegistry.register(EntityTypeList.WARM_INFECTED_COW, WarmInfectedCowEntityRenderer::new);
        EntityRendererRegistry.register(EntityTypeList.WARM_INFECTED_CHICKEN, WarmInfectedChickenEntityRenderer::new);
    }
}
