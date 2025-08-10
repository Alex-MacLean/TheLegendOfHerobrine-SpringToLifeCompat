package com.herobrinemod.herobrinespringcompat.client.entities.renderers;

import com.herobrinemod.herobrinespringcompat.HerobrineSpringCompatMod;
import com.herobrinemod.herobrinespringcompat.client.entities.models.WarmInfectedPigEntityModel;
import com.herobrinemod.herobrinespringcompat.entities.WarmInfectedPigEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.feature.EyesFeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class WarmInfectedPigEyesFeatureRenderer extends EyesFeatureRenderer<WarmInfectedPigEntity, WarmInfectedPigEntityModel> {
    public WarmInfectedPigEyesFeatureRenderer(FeatureRendererContext<WarmInfectedPigEntity, WarmInfectedPigEntityModel> featureRendererContext) {
        super(featureRendererContext);
    }

    @Override
    public RenderLayer getEyesTexture() {
        return RenderLayer.getEyes(Identifier.of(HerobrineSpringCompatMod.MODID, "textures/entity/eyes/warm_infected_pig.png"));
    }
}

