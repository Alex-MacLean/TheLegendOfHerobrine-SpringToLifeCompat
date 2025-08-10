package com.herobrinemod.herobrinespringcompat.client.entities.renderers;

import com.herobrinemod.herobrinespringcompat.HerobrineSpringCompatMod;
import com.herobrinemod.herobrinespringcompat.client.entities.models.HerobrineSpringCompatModelLayers;
import com.herobrinemod.herobrinespringcompat.client.entities.models.WarmInfectedChickenEntityModel;
import com.herobrinemod.herobrinespringcompat.entities.WarmInfectedChickenEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.NotNull;

@Environment(EnvType.CLIENT)
public class WarmInfectedChickenEntityRenderer extends MobEntityRenderer<WarmInfectedChickenEntity, WarmInfectedChickenEntityModel> {
    public WarmInfectedChickenEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new WarmInfectedChickenEntityModel(context.getPart(HerobrineSpringCompatModelLayers.WARM_INFECTED_CHICKEN_MODEL_LAYER)), 0.3f);
        this.addFeature(new WarmInfectedChickenEyesFeatureRenderer(this));
    }

    @Override
    protected float getAnimationProgress(@NotNull WarmInfectedChickenEntity entity, float f) {
        return (MathHelper.sin(MathHelper.lerp(f, entity.prevFlapProgress, entity.flapProgress)) + 1.0f) * MathHelper.lerp(f, entity.prevMaxWingDeviation, entity.maxWingDeviation);
    }

    @Override
    public Identifier getTexture(WarmInfectedChickenEntity entity) {
        return Identifier.of(HerobrineSpringCompatMod.MODID, "textures/entity/warm_infected_chicken.png");
    }
}
