package com.herobrinemod.herobrinespringcompat.client.entities.renderers;

import com.herobrinemod.herobrinespringcompat.HerobrineSpringCompatMod;
import com.herobrinemod.herobrinespringcompat.client.entities.models.HerobrineSpringCompatModelLayers;
import com.herobrinemod.herobrinespringcompat.client.entities.models.WarmInfectedCowEntityModel;
import com.herobrinemod.herobrinespringcompat.entities.WarmInfectedCowEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class WarmInfectedCowEntityRenderer extends MobEntityRenderer<WarmInfectedCowEntity, WarmInfectedCowEntityModel> {
    public WarmInfectedCowEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new WarmInfectedCowEntityModel(context.getPart(HerobrineSpringCompatModelLayers.WARM_INFECTED_COW_MODEL_LAYER)), 0.7f);
        this.addFeature(new WarmInfectedCowEyesFeatureRenderer(this));
    }

    @Override
    public Identifier getTexture(WarmInfectedCowEntity entity) {
        return Identifier.of(HerobrineSpringCompatMod.MODID, "textures/entity/warm_infected_cow.png");
    }
}
