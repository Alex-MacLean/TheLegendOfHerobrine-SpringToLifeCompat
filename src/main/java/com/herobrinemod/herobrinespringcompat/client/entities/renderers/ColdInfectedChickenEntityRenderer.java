package com.herobrinemod.herobrinespringcompat.client.entities.renderers;

import com.herobrinemod.herobrinespringcompat.HerobrineSpringCompatMod;
import com.herobrinemod.herobrinespringcompat.client.entities.models.ColdInfectedChickenEntityModel;
import com.herobrinemod.herobrinespringcompat.client.entities.models.HerobrineSpringCompatModelLayers;
import com.herobrinemod.herobrinespringcompat.entities.ColdInfectedChickenEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.NotNull;

@Environment(EnvType.CLIENT)
public class ColdInfectedChickenEntityRenderer extends MobEntityRenderer<ColdInfectedChickenEntity, ColdInfectedChickenEntityModel> {
    public ColdInfectedChickenEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new ColdInfectedChickenEntityModel(context.getPart(HerobrineSpringCompatModelLayers.COLD_INFECTED_CHICKEN_MODEL_LAYER)), 0.3f);
        this.addFeature(new ColdInfectedChickenEyesFeatureRenderer(this));
    }

    @Override
    protected float getAnimationProgress(@NotNull ColdInfectedChickenEntity entity, float f) {
        return (MathHelper.sin(MathHelper.lerp(f, entity.prevFlapProgress, entity.flapProgress)) + 1.0f) * MathHelper.lerp(f, entity.prevMaxWingDeviation, entity.maxWingDeviation);
    }

    @Override
    public Identifier getTexture(ColdInfectedChickenEntity entity) {
        return Identifier.of(HerobrineSpringCompatMod.MODID, "textures/entity/cold_infected_chicken.png");
    }
}
