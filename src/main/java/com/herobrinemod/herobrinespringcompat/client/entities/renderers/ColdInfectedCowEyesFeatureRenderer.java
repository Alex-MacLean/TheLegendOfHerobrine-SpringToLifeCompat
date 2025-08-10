package com.herobrinemod.herobrinespringcompat.client.entities.renderers;

import com.herobrinemod.herobrinespringcompat.HerobrineSpringCompatMod;
import com.herobrinemod.herobrinespringcompat.client.entities.models.ColdInfectedCowEntityModel;
import com.herobrinemod.herobrinespringcompat.entities.ColdInfectedCowEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.feature.EyesFeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class ColdInfectedCowEyesFeatureRenderer extends EyesFeatureRenderer<ColdInfectedCowEntity, ColdInfectedCowEntityModel> {
    public ColdInfectedCowEyesFeatureRenderer(FeatureRendererContext<ColdInfectedCowEntity, ColdInfectedCowEntityModel> featureRendererContext) {
        super(featureRendererContext);
    }

    @Override
    public RenderLayer getEyesTexture() {
        return RenderLayer.getEyes(Identifier.of(HerobrineSpringCompatMod.MODID, "textures/entity/eyes/cold_infected_cow.png"));
    }
}
