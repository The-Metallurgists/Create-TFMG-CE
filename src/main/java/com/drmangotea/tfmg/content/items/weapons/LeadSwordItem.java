/*
 * Copyright (c) 2026 Metallurgists of Create
 *
 * Code is licensed under the MIT NON-AI License. Assets under src/main/resources/assets/ are All Rights Reserved.
 * Full license: https://github.com/The-Metallurgists/Create-TFMG-CE/blob/1.21.1/LICENCE.md
 */

package com.drmangotea.tfmg.content.items.weapons;

import com.drmangotea.tfmg.base.annotation.NothingNullByDefault;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

@NothingNullByDefault
public class LeadSwordItem extends SwordItem {
    public LeadSwordItem(Tier pTier, Properties pProperties) {
        super(pTier,pProperties);
    }

    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        pStack.hurtAndBreak(2, pAttacker, LivingEntity.getSlotForHand(pTarget.getUsedItemHand()));
        MobEffectInstance poison = pTarget.getEffect(MobEffects.POISON);
		int duration = poison == null ? 100 : 100 + poison.getDuration();
        pTarget.addEffect(new MobEffectInstance(MobEffects.POISON, duration));
        return true;
    }
}
