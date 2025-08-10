package com.herobrinemod.herobrinespringcompat.client.entities.models;

import com.herobrinemod.herobrinespringcompat.entities.WarmInfectedChickenEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.ChickenEntityModel;

@Environment(EnvType.CLIENT)
public class WarmInfectedChickenEntityModel extends ChickenEntityModel<WarmInfectedChickenEntity> {
    public WarmInfectedChickenEntityModel(ModelPart root) {
        super(root);
    }
}
