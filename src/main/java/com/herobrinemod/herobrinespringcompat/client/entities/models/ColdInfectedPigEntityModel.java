package com.herobrinemod.herobrinespringcompat.client.entities.models;

import com.herobrinemod.herobrinespringcompat.entities.ColdInfectedPigEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.PigEntityModel;
import org.jetbrains.annotations.NotNull;

public class ColdInfectedPigEntityModel extends PigEntityModel<ColdInfectedPigEntity> {
    public ColdInfectedPigEntityModel(ModelPart root) {
        super(root);
    }

    public static @NotNull TexturedModelData getTexturedModelData() {
        ModelData meshDefinition = new ModelData();
        ModelPartData partDefinition = meshDefinition.getRoot();
        partDefinition.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F).uv(16, 16).cuboid(-2.0F, 0.0F, -9.0F, 4.0F, 3.0F, 1.0F), ModelTransform.pivot(0.0F, 12.0F, -6.0F));
        partDefinition.addChild("body", ModelPartBuilder.create().uv(28, 8).cuboid(-5.0F, -10.0F, -7.0F, 10.0F, 16.0F, 8.0F).uv(28, 32).cuboid(-5.0F, -10.0F, -7.0F, 10.0F, 16.0F, 8.0F, new Dilation(0.5F)), ModelTransform.of(0.0F, 11.0F, 2.0F, ((float)Math.PI / 2F), 0.0F, 0.0F));
        ModelPartBuilder cubeListBuilder = ModelPartBuilder.create().uv(0, 16).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F);
        partDefinition.addChild("right_hind_leg", cubeListBuilder, ModelTransform.pivot(-3.0F, 18.0F, 7.0F));
        partDefinition.addChild("left_hind_leg", cubeListBuilder, ModelTransform.pivot(3.0F, 18.0F, 7.0F));
        partDefinition.addChild("right_front_leg", cubeListBuilder, ModelTransform.pivot(-3.0F, 18.0F, -5.0F));
        partDefinition.addChild("left_front_leg", cubeListBuilder, ModelTransform.pivot(3.0F, 18.0F, -5.0F));
        return TexturedModelData.of(meshDefinition, 64, 64);
    }
}
