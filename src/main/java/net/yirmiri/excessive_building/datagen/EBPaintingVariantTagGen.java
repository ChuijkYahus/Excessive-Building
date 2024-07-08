package net.yirmiri.excessive_building.datagen;

import net.minecraft.data.DataOutput;
import net.minecraft.data.server.tag.TagProvider;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.PaintingVariantTags;

import java.util.concurrent.CompletableFuture;

public class EBPaintingVariantTagGen extends TagProvider<PaintingVariant> {
    public EBPaintingVariantTagGen(DataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookupFuture) {
        super(output, RegistryKeys.PAINTING_VARIANT, registryLookupFuture);
    }


    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        getOrCreateTagBuilder(PaintingVariantTags.PLACEABLE);
//                .add(EBPaintingVariants.FORGOTTEN_KINGDOM)
//                .add(EBPaintingVariants.BEACON_OF_THE_DESERT_TRIMMED)
//                .add(EBPaintingVariants.BEACON_OF_THE_DESERT)
//                .add(EBPaintingVariants.BURRITO)
//                .add(EBPaintingVariants.COURBET_ORIGINAL)
//                .add(EBPaintingVariants.CRASH_LANDING)
//                .add(EBPaintingVariants.FIT_FOR_A_QUEEN)
//                .add(EBPaintingVariants.KOLOS_BUG)
//                .add(EBPaintingVariants.FLOORS)
//                .add(EBPaintingVariants.HORIZON)
//                .add(EBPaintingVariants.IMMINENT_DETONATION)
//                .add(EBPaintingVariants.LONG_TRIPS)
//                .add(EBPaintingVariants.LONE_BRIDGE)
//                .add(EBPaintingVariants.PALEOBOTANY)
//                .add(EBPaintingVariants.PUFFERLIGHT)
//                .add(EBPaintingVariants.SCOURGE_BRINGER)
//                .add(EBPaintingVariants.SNIFFING_IN_THE_PINE_FOREST)
//                .add(EBPaintingVariants.STAGE_ORIGINAL)
//                .add(EBPaintingVariants.THE_END)
//                .add(EBPaintingVariants.THINE_HOLY_PEANUT)
//                .add(EBPaintingVariants.THE_LONE_TREE)
//                .add(EBPaintingVariants.EVIL_EYE)
//                .add(EBPaintingVariants.WHY_DO_MY_EYES_HURT)
//                .add(EBPaintingVariants.CATASTROPHES_BEFORE_THE_CALAMITY);
    }
}