package com.herobrinemod.herobrinespringcompat.client.entities.renderers;

import com.herobrinemod.herobrinespringcompat.HerobrineSpringCompatMod;
import com.herobrinemod.herobrinespringcompat.client.entities.models.ColdInfectedCowEntityModel;
import com.herobrinemod.herobrinespringcompat.client.entities.models.HerobrineSpringCompatModelLayers;
import com.herobrinemod.herobrinespringcompat.entities.ColdInfectedCowEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class ColdInfectedCowEntityRenderer extends MobEntityRenderer<ColdInfectedCowEntity, ColdInfectedCowEntityModel> {
    public ColdInfectedCowEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new ColdInfectedCowEntityModel(context.getPart(HerobrineSpringCompatModelLayers.COLD_INFECTED_COW_MODEL_LAYER)), 0.7f);
        this.addFeature(new ColdInfectedCowEyesFeatureRenderer(this));
    }

    @Override
    public Identifier getTexture(ColdInfectedCowEntity entity) {
        return Identifier.of(HerobrineSpringCompatMod.MODID, "textures/entity/cold_infected_cow.png");
    }
}
