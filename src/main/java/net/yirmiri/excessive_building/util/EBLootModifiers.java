package net.yirmiri.excessive_building.util;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.yirmiri.excessive_building.EBConfig;
import net.yirmiri.excessive_building.registry.EBBlocks;
import net.yirmiri.excessive_building.registry.EBItems;

import java.util.List;

public class EBLootModifiers {
    //MINECRAFT
    public static final Identifier SNIFFER_DIGGING = Identifier.ofVanilla("gameplay/sniffer_digging");
    public static final Identifier TRAIL_RUINS_RARE = Identifier.ofVanilla("archaeology/trail_ruins_rare");
    public static final Identifier DESERT_PYRAMID = Identifier.ofVanilla("archaeology/desert_pyramid");
    public static final Identifier DESERT_WELL = Identifier.ofVanilla("archaeology/desert_well");
    public static final Identifier OCEAN_RUIN_COLD = Identifier.ofVanilla("archaeology/ocean_ruin_cold");
    public static final Identifier OCEAN_RUIN_WARM = Identifier.ofVanilla("archaeology/ocean_ruin_warm");

    public static void replaceLoot() {
        LootTableEvents.REPLACE.register((key, original, source, registries) -> {
            if (SNIFFER_DIGGING.equals(key.getValue()) && EBConfig.ENABLE_ANCIENT_SAPLINGS.get()) {
                LootPool.Builder lootPool = LootPool.builder()
                        .with(ItemEntry.builder(EBBlocks.ANCIENT_SAPLING)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1))).build());
                return mergePools(original, lootPool.build());
            }

            if (TRAIL_RUINS_RARE.equals(key.getValue()) && EBConfig.ENABLE_GLOOM_SEEDS.get()) {
                LootPool.Builder lootPool = LootPool.builder()
                        .with(ItemEntry.builder(EBBlocks.GLOOM_SEEDS)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1))).build());
                return mergePools(original, lootPool.build());
            }

            if (TRAIL_RUINS_RARE.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                LootPool.Builder lootPool = LootPool.builder()
                        .with(ItemEntry.builder(EBItems.POTTERY_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1))).build());
                return mergePools(original, lootPool.build());
            }

            if (TRAIL_RUINS_RARE.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                LootPool.Builder lootPool = LootPool.builder()
                        .with(ItemEntry.builder(EBItems.TWINS_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1))).build());
                return mergePools(original, lootPool.build());
            }

            if (TRAIL_RUINS_RARE.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                LootPool.Builder lootPool = LootPool.builder()
                        .with(ItemEntry.builder(EBItems.IS_THAT_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1))).build());
                return mergePools(original, lootPool.build());
            }

            if (TRAIL_RUINS_RARE.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                LootPool.Builder lootPool = LootPool.builder()
                        .with(ItemEntry.builder(EBItems.SPRITE_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1))).build());
                return mergePools(original, lootPool.build());
            }

            if (TRAIL_RUINS_RARE.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                LootPool.Builder lootPool = LootPool.builder()
                        .with(ItemEntry.builder(EBItems.RING_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1))).build());
                return mergePools(original, lootPool.build());
            }

            if (TRAIL_RUINS_RARE.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                LootPool.Builder lootPool = LootPool.builder()
                        .with(ItemEntry.builder(EBItems.ANCIENT_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1))).build());
                return mergePools(original, lootPool.build());
            }

            if (TRAIL_RUINS_RARE.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                LootPool.Builder lootPool = LootPool.builder()
                        .with(ItemEntry.builder(EBItems.KITTEH_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1))).build());
                return mergePools(original, lootPool.build());
            }

            if (OCEAN_RUIN_COLD.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                LootPool.Builder lootPool = LootPool.builder()
                        .with(ItemEntry.builder(EBItems.FORWARDS_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1))).build());
                return mergePools(original, lootPool.build());
            }

            if (OCEAN_RUIN_COLD.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                LootPool.Builder lootPool = LootPool.builder()
                        .with(ItemEntry.builder(EBItems.IS_THAT_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1))).build());
                return mergePools(original, lootPool.build());
            }

            if (OCEAN_RUIN_COLD.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                LootPool.Builder lootPool = LootPool.builder()
                        .with(ItemEntry.builder(EBItems.KOKOS_BUG_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1))).build());
                return mergePools(original, lootPool.build());
            }

            if (OCEAN_RUIN_COLD.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                LootPool.Builder lootPool = LootPool.builder()
                        .with(ItemEntry.builder(EBItems.KITTEH_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1))).build());
                return mergePools(original, lootPool.build());
            }

            if (OCEAN_RUIN_COLD.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                LootPool.Builder lootPool = LootPool.builder()
                        .with(ItemEntry.builder(EBItems.PORTAL_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1))).build());
                return mergePools(original, lootPool.build());
            }

            if (OCEAN_RUIN_COLD.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                LootPool.Builder lootPool = LootPool.builder()
                        .with(ItemEntry.builder(EBItems.POTTERY_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1))).build());
                return mergePools(original, lootPool.build());
            }

            if (OCEAN_RUIN_WARM.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                LootPool.Builder lootPool = LootPool.builder()
                        .with(ItemEntry.builder(EBItems.POTTERY_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1))).build());
                return mergePools(original, lootPool.build());
            }

            if (OCEAN_RUIN_WARM.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                LootPool.Builder lootPool = LootPool.builder()
                        .with(ItemEntry.builder(EBItems.IS_THAT_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1))).build());
                return mergePools(original, lootPool.build());
            }

            if (OCEAN_RUIN_WARM.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                LootPool.Builder lootPool = LootPool.builder()
                        .with(ItemEntry.builder(EBItems.BUSTLING_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1))).build());
                return mergePools(original, lootPool.build());
            }

            if (OCEAN_RUIN_WARM.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                LootPool.Builder lootPool = LootPool.builder()
                        .with(ItemEntry.builder(EBItems.SNOUT_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1))).build());
                return mergePools(original, lootPool.build());
            }

            if (OCEAN_RUIN_WARM.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                LootPool.Builder lootPool = LootPool.builder()
                        .with(ItemEntry.builder(EBItems.KOKOS_BUG_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1))).build());
                return mergePools(original, lootPool.build());
            }

            if (OCEAN_RUIN_WARM.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                LootPool.Builder lootPool = LootPool.builder()
                        .with(ItemEntry.builder(EBItems.KITTEH_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1))).build());
                return mergePools(original, lootPool.build());
            }

            if (DESERT_PYRAMID.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                LootPool.Builder lootPool = LootPool.builder()
                        .with(ItemEntry.builder(EBItems.DESTRUCTION_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1))).build());
                return mergePools(original, lootPool.build());
            }

            if (DESERT_PYRAMID.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                LootPool.Builder lootPool = LootPool.builder()
                        .with(ItemEntry.builder(EBItems.WRATHFUL_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1))).build());
                return mergePools(original, lootPool.build());
            }

            if (DESERT_PYRAMID.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                LootPool.Builder lootPool = LootPool.builder()
                        .with(ItemEntry.builder(EBItems.ROYALTY_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1))).build());
                return mergePools(original, lootPool.build());
            }

            if (DESERT_PYRAMID.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                LootPool.Builder lootPool = LootPool.builder()
                        .with(ItemEntry.builder(EBItems.MESMERIZE_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1))).build());
                return mergePools(original, lootPool.build());
            }

            if (DESERT_PYRAMID.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                LootPool.Builder lootPool = LootPool.builder()
                        .with(ItemEntry.builder(EBItems.DECAY_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1))).build());
                return mergePools(original, lootPool.build());
            }

            if (DESERT_PYRAMID.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                LootPool.Builder lootPool = LootPool.builder()
                        .with(ItemEntry.builder(EBItems.LIFE_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1))).build());
                return mergePools(original, lootPool.build());
            }

            if (DESERT_PYRAMID.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                LootPool.Builder lootPool = LootPool.builder()
                        .with(ItemEntry.builder(EBItems.KITTEH_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1))).build());
                return mergePools(original, lootPool.build());
            }

            if (DESERT_PYRAMID.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                LootPool.Builder lootPool = LootPool.builder()
                        .with(ItemEntry.builder(EBItems.THIEF_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1))).build());
                return mergePools(original, lootPool.build());
            }

            if (DESERT_WELL.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                LootPool.Builder lootPool = LootPool.builder()
                        .with(ItemEntry.builder(EBItems.MESMERIZE_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1))).build());
                return mergePools(original, lootPool.build());
            }

            if (DESERT_WELL.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                LootPool.Builder lootPool = LootPool.builder()
                        .with(ItemEntry.builder(EBItems.BITTER_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1))).build());
                return mergePools(original, lootPool.build());
            }

            if (DESERT_WELL.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                LootPool.Builder lootPool = LootPool.builder()
                        .with(ItemEntry.builder(EBItems.TWINS_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1))).build());
                return mergePools(original, lootPool.build());
            }

            if (DESERT_WELL.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                LootPool.Builder lootPool = LootPool.builder()
                        .with(ItemEntry.builder(EBItems.CHECKERED_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1))).build());
                return mergePools(original, lootPool.build());
            }

            if (DESERT_WELL.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                LootPool.Builder lootPool = LootPool.builder()
                        .with(ItemEntry.builder(EBItems.BOIN_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1))).build());
                return mergePools(original, lootPool.build());
            }

            if (DESERT_WELL.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                LootPool.Builder lootPool = LootPool.builder()
                        .with(ItemEntry.builder(EBItems.KITTEH_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1))).build());
                return mergePools(original, lootPool.build());
            }

            if (DESERT_WELL.equals(key.getValue()) && EBConfig.ENABLE_EB_POTTERY_SHERDS.get()) {
                LootPool.Builder lootPool = LootPool.builder()
                        .with(ItemEntry.builder(EBItems.HEXXED_POTTERY_SHERD)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 1))).build());
                return mergePools(original, lootPool.build());
            }
            return null;
        });
    }

    private static LootTable mergePools(LootTable lootTable, LootPool lootPool) {
        lootPool = LootPool.builder().with(lootTable.pools.getFirst().entries).with(lootPool.entries).build();
        return LootTable.builder().pools(List.of(lootPool)).build();
    }
}
