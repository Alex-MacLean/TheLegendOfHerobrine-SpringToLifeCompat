package com.herobrinemod.herobrinespringcompat.entities;

import com.herobrinemod.herobrine.entities.InfectedPigEntity;
import de.larsensmods.stl_backport.entity.STLEntityTypes;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.World;

public class WarmInfectedPigEntity extends InfectedPigEntity {
    public WarmInfectedPigEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
        this.setConversionEntity(STLEntityTypes.WARM_PIG.get());
    }
}
