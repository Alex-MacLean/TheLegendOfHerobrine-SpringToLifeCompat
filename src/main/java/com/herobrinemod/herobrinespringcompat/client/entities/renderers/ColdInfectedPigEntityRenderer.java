package com.herobrinemod.herobrinespringcompat.client.entities.renderers;

import com.herobrinemod.herobrinespringcompat.HerobrineSpringCompatMod;
import com.herobrinemod.herobrinespringcompat.client.entities.models.ColdInfectedPigEntityModel;
import com.herobrinemod.herobrinespringcompat.client.entities.models.HerobrineSpringCompatModelLayers;
import com.herobrinemod.herobrinespringcompat.entities.ColdInfectedPigEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class ColdInfectedPigEntityRenderer extends MobEntityRenderer<ColdInfectedPigEntity, ColdInfectedPigEntityModel> {
    public ColdInfectedPigEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new ColdInfectedPigEntityModel(context.getPart(HerobrineSpringCompatModelLayers.COLD_INFECTED_PIG_MODEL_LAYER)), 0.7f);
        this.addFeature(new ColdInfectedPigEyesFeatureRenderer(this));
    }

    @Override
    public Identifier getTexture(ColdInfectedPigEntity entity) {
        return Identifier.of(HerobrineSpringCompatMod.MODID, "textures/entity/cold_infected_pig.png");
    }
}
