package com.herobrinemod.herobrinespringcompat.entities;

import com.herobrinemod.herobrine.entities.InfectedCowEntity;
import de.larsensmods.stl_backport.entity.STLEntityTypes;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.World;

public class WarmInfectedCowEntity extends InfectedCowEntity {
    public WarmInfectedCowEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
        this.setConversionEntity(STLEntityTypes.WARM_COW.get());
    }
}
