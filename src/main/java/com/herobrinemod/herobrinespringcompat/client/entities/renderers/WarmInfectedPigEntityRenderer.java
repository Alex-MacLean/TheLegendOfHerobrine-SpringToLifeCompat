package com.herobrinemod.herobrinespringcompat.client.entities.renderers;

import com.herobrinemod.herobrinespringcompat.HerobrineSpringCompatMod;
import com.herobrinemod.herobrinespringcompat.client.entities.models.HerobrineSpringCompatModelLayers;
import com.herobrinemod.herobrinespringcompat.client.entities.models.WarmInfectedPigEntityModel;
import com.herobrinemod.herobrinespringcompat.entities.WarmInfectedPigEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class WarmInfectedPigEntityRenderer extends MobEntityRenderer<WarmInfectedPigEntity, WarmInfectedPigEntityModel> {
    public WarmInfectedPigEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new WarmInfectedPigEntityModel(context.getPart(HerobrineSpringCompatModelLayers.WARM_INFECTED_PIG_MODEL_LAYER)), 0.7f);
        this.addFeature(new WarmInfectedPigEyesFeatureRenderer(this));
    }

    @Override
    public Identifier getTexture(WarmInfectedPigEntity entity) {
        return Identifier.of(HerobrineSpringCompatMod.MODID, "textures/entity/warm_infected_pig.png");
    }
}