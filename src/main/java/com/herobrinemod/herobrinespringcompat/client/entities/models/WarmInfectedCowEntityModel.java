package com.herobrinemod.herobrinespringcompat.client.entities.models;

import com.herobrinemod.herobrinespringcompat.entities.WarmInfectedCowEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.CowEntityModel;
import org.jetbrains.annotations.NotNull;

@Environment(EnvType.CLIENT)
public class WarmInfectedCowEntityModel extends CowEntityModel<WarmInfectedCowEntity> {
    public WarmInfectedCowEntityModel(ModelPart root) {
        super(root);
    }

    public static @NotNull TexturedModelData getTexturedModelData() {
        ModelData meshDefinition = new ModelData();
        ModelPartData partDefinition = meshDefinition.getRoot();
        partDefinition.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -4.0F, -6.0F, 8.0F, 8.0F, 6.0F).uv(1, 33).cuboid(-3.0F, 1.0F, -7.0F, 6.0F, 3.0F, 1.0F).uv(27, 0).cuboid(-8.0F, -3.0F, -5.0F, 4.0F, 2.0F, 2.0F).uv(39, 0).cuboid(-8.0F, -5.0F, -5.0F, 2.0F, 2.0F, 2.0F).uv(27, 0).mirrored().cuboid(4.0F, -3.0F, -5.0F, 4.0F, 2.0F, 2.0F).mirrored(false).uv(39, 0).mirrored().cuboid(6.0F, -5.0F, -5.0F, 2.0F, 2.0F, 2.0F).mirrored(false), ModelTransform.pivot(0.0F, 4.0F, -8.0F));
        partDefinition.addChild("body", ModelPartBuilder.create().uv(18, 4).cuboid(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F).uv(52, 0).cuboid(-2.0F, 2.0F, -8.0F, 4.0F, 6.0F, 1.0F), ModelTransform.of(0.0F, 5.0F, 2.0F, ((float)Math.PI / 2F), 0.0F, 0.0F));
        ModelPartBuilder var2 = ModelPartBuilder.create().mirrored().uv(0, 16).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F);
        ModelPartBuilder var3 = ModelPartBuilder.create().uv(0, 16).cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F);
        partDefinition.addChild("right_hind_leg", var3, ModelTransform.pivot(-4.0F, 12.0F, 7.0F));
        partDefinition.addChild("left_hind_leg", var2, ModelTransform.pivot(4.0F, 12.0F, 7.0F));
        partDefinition.addChild("right_front_leg", var3, ModelTransform.pivot(-4.0F, 12.0F, -5.0F));
        partDefinition.addChild("left_front_leg", var2, ModelTransform.pivot(4.0F, 12.0F, -5.0F));
        return TexturedModelData.of(meshDefinition, 64, 64);
    }
}
