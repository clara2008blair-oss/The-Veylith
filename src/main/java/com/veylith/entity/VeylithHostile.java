package com.veylith.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class VeylithHostile extends Monster {
    public VeylithHostile(EntityType<? extends Monster> type, Level level) {
        super(type, level);
    }
}
